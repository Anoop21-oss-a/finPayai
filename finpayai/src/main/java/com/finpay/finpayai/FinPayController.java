package com.finpay.finpayai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.finpay.finpayai.service.FinpayService;
import com.finpay.finpayai.entity.CreateCardEntity;
import com.finpay.finpayai.model.TransactionHistory;

@RestController
public class FinPayController {
  @Autowired
  FinpayService finpayService;
  
  // this api wil going to use to fetch the customer data
  @GetMapping("/getBalance/{id}")
  public ResponseEntity<String> getBalance(@PathVariable("id") Integer id) {
    String balance = finpayService.getBalance(id);
    return ResponseEntity.ok(balance);
  }
   
  // This api will use for creating new Transaction
  @PostMapping("/addNewInvoice")
  public ResponseEntity<String> userTransaction(@PathVariable("id") Integer id) {
    String balance = finpayService.userTransaction();
    return ResponseEntity.ok(balance);
  }

  // This api will use for creating New Card for customer
  @PostMapping("/createNewCard")
  public ResponseEntity<String>createCard(@RequestBody CreateCardEntity cardData){
    String cardMessage=finpayService.createCards(cardData);
    return ResponseEntity.ok(cardMessage);
  }
  
  @GetMapping("/transaction-History")
  public ResponseEntity<TransactionHistory>createCard(){
    TransactionHistory response=finpayService.getUserTransactionHistory();
    return ResponseEntity.ok(response);
  }

}
