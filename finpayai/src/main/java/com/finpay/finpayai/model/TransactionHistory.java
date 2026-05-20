package com.finpay.finpayai.model;

public class TransactionHistory{
   private String date;
   private String trnxType;
   private Integer amount;
   private String status;
   private String process;
   // ===== GETTERS =====

public String getDate() {
    return date;
}

public String getTrnxType() {
    return trnxType;
}

public Integer getAmount() {
    return amount;
}

public String getStatus() {
    return status;
}

public String getProcess() {
    return process;
}

// ===== SETTERS =====

public void setDate(String date) {
    this.date = date;
}

public void setTrnxType(String trnxType) {
    this.trnxType = trnxType;
}

public void setAmount(Integer amount) {
    this.amount = amount;
}

public void setStatus(String status) {
    this.status = status;
}

public void setProcess(String process) {
    this.process = process;
}
}