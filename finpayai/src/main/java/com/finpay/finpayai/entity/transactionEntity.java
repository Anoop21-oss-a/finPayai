package com.finpay.finpayai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
@Entity
public class transactionEntity{
    @Id
    Integer id;
    String fromUserid;
    String toUserId;
    Integer trnxId;
    String  trnxType;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private userEntity user;
    public transactionEntity(Integer id,String fromUserid,String toUserid,String trnxType){
        this.id=id;
        this.fromUserid=fromUserid;
        this.toUserId=toUserid;
        this.trnxType=trnxType;
    }
    public void setFromUserid(String fromUserid) {
        this.fromUserid = fromUserid;
    }
    public void setToUserid(String toUserid) {
        this.toUserId = toUserid;
    }
    public void setTrnxType(String trnxType) {
        this.trnxType = trnxType;
    }
}