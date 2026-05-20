package com.finpay.finpayai.service;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.finpay.finpayai.repo.UserRepo;
import com.finpay.finpayai.repo.CreateCardRepo;
import com.finpay.finpayai.repo.TransactionRepo;
import com.finpay.finpayai.entity.CreateCardEntity;
import com.finpay.finpayai.entity.transactionEntity;
import com.finpay.finpayai.model.TransactionHistory;
import org.modelmapper.ModelMapper;
@Service
public class FinpayService {
    @Autowired
    private UserRepo userRepo;
    
    
    public String getBalance(Integer id){
        //business ops
        String k= userRepo.findById(id)
        .map(user -> "The balance for " + user.getUserName() + " is: " + user.getUserTotalBalance())
        .orElse("User not found!");
        return k;
    };


    @Autowired
    private CreateCardRepo createCardRepo;
    public String createCards(CreateCardEntity cardData){
        System.out.println(cardData.getUser().getId());
        createCardRepo.save(cardData);
        return "Success";
    };
    public String userTransaction(){
        return "Success";
    
    };
    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private TransactionRepo transactionRepo;
    public TransactionHistory getUserTransactionHistory(Integer id){
        transactionEntity transaction = this.transactionRepo.findById(id).get();
        TransactionHistory res = this.modelMapper.map(transaction, TransactionHistory.class);
        return res;
    }
}