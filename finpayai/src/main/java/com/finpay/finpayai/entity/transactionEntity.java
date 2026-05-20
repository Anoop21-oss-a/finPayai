package com.finpay.finpayai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
@Entity
public class transactionEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;
    String fromUserid;
    String toUserId;
    Integer trnxId;
    String  trnxType;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private userEntity user;
    public Integer getId() {
        return id;
    }
    
    public String getFromUserid() {
        return fromUserid;
    }
    
    public String getToUserId() {
        return toUserId;
    }
    
    public Integer getTrnxId() {
        return trnxId;
    }
    
    public String getTrnxType() {
        return trnxType;
    }
    
    public userEntity getUser() {
        return user;
    }
    
    // ===== SETTERS =====
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setFromUserid(String fromUserid) {
        this.fromUserid = fromUserid;
    }
    
    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }
    
    public void setTrnxId(Integer trnxId) {
        this.trnxId = trnxId;
    }
    
    public void setTrnxType(String trnxType) {
        this.trnxType = trnxType;
    }
    
    public void setUser(userEntity user) {
        this.user = user;
    }
    @Override
public String toString() {
    return "transactionEntity{" +
            "id=" + id +
            ", trnxType='" + trnxType + '\'' +
            ", fromUserid=" + fromUserid +
            ", toUserId=" + toUserId +
            '}';
}

}