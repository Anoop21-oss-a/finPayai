package com.finpay.finpayai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import com.finpay.finpayai.entity.*;
import com.finpay.finpayai.entity.CreateCardEntity;
@Repository
public interface CreateCardRepo extends JpaRepository<CreateCardEntity, Long> {
}