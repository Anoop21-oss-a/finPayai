package com.finpay.finpayai.service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.finpay.finpayai.repo.UserRepo;
@Service
public class FinpayService {
    @Autowired
    UserRepo userRepo;
    public String getBalance(Integer id){
        //business ops
        String k= userRepo.findById(id)
        .map(user -> "The balance for " + user.getUserName() + " is: " + user.getUserTotalBalance())
        .orElse("User not found!");
        return k;
    }
    
    public String userTransaction(){
    return "Success";

    }
}
