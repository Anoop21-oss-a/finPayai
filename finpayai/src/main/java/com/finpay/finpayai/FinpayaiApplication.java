package com.finpay.finpayai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinpayaiApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FinpayaiApplication.class, args);
	}
	@Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
