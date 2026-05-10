package com.finpay.finpayai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.finpay.finpayai.service.FinpayService;

@RestController
public class FinPayController {
  @Autowired
  FinpayService finpayService;

  @GetMapping("/getBalance/{id}")
  public ResponseEntity<String> getBalance(@PathVariable("id") Integer id) {
    String balance = finpayService.getBalance(id);
    return ResponseEntity.ok(balance);
  }

  @PostMapping("/addNewInvoice")
  public ResponseEntity<String> userTransaction(@PathVariable("id") Integer id) {
    String balance = finpayService.userTransaction();
    return ResponseEntity.ok(balance);
  }

}
