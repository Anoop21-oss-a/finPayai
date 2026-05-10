package com.finpay.finpayai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class userEntity{
    @Id
    Integer id;
    String userName;
    Integer userId;
    Integer userCountryBalance;
    String userCountryBalanceName;
    Integer userTotalBalance;
    public String getUserName() { return userName; }
    public Integer getUserTotalBalance() { return userTotalBalance; }
    public Integer getUserCountryBalance() {return userCountryBalance;}
    public String getUserCountryBalanceName() { return userCountryBalanceName; }
}
