package com.finpay.finpayai.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
@Entity
public class userEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String userName;

    private Integer userId;

    private Integer userCountryBalance;

    private String userCountryBalanceName;

    private Integer userTotalBalance;

    // ===== GETTERS =====

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getUserCountryBalance() {
        return userCountryBalance;
    }

    public String getUserCountryBalanceName() {
        return userCountryBalanceName;
    }

    public Integer getUserTotalBalance() {
        return userTotalBalance;
    }

    // ===== SETTERS =====

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserCountryBalance(Integer userCountryBalance) {
        this.userCountryBalance = userCountryBalance;
    }

    public void setUserCountryBalanceName(String userCountryBalanceName) {
        this.userCountryBalanceName = userCountryBalanceName;
    }

    public void setUserTotalBalance(Integer userTotalBalance) {
        this.userTotalBalance = userTotalBalance;
    }
}
