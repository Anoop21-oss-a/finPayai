package com.finpay.finpayai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import com.finpay.finpayai.entity.*;

@Repository
public interface TransactionRepo extends JpaRepository<transactionEntity, Long> {
}