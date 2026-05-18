package com.finpay.finpayai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import com.finpay.finpayai.entity.userEntity;
@Entity
public class CreateCardEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer cardId;
    String cardName;
    String cardType;
    String cardBrand;
    Integer cardFee;
    Integer totalDebited;
    Integer totalAmount;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private userEntity user;
    
    public userEntity getUser() {
        return user;
    }
    
    public void setUser(userEntity user) {
        this.user = user;
    }
    public Integer getCardId()
    {
        return this.cardId;
    }
    public void setCardName(String name)
    {
        this.cardName=name;
    }
    public String getCardName(){
        return this.cardName;
    }
    public void setCardType(String name)
    {
        this.cardType=name;
    }
    public String getCardType(){
        return this.cardType;
    }
    public void setCardBrand(String name)
    {
        this.cardBrand=name;
    }
    public String getCardBrand(){
        return this.cardBrand;
    }
    public Integer getCardFee()
    {
        return this.cardFee;
    }
    public void setCardFee(Integer fee)
    {
         this.cardFee=fee;
    }
    public Integer getTotalDebited()
    {
        return this.totalDebited;
    }
    public void setTotalDebited(Integer debitAmount)
    {
        this.totalDebited=debitAmount;
    }
    public Integer getTotalAmount()
    {
        return this.totalAmount;
    }
    public void setTotalAmount(Integer amount)
    {
         this.totalAmount=amount;
    }
}