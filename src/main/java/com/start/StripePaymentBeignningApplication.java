package com.start;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stripe.Stripe;

@SpringBootApplication
public class StripePaymentBeignningApplication {
	
	@PostConstruct
	public void setup()
	{
		 Stripe.apiKey = "sk_test_51IuYrkSBMZn0qlUjMkz7ioKKtb3HHnuxDT3g9gmeuRtDMsmCDWG6RqDTkPZncT2FioF0EeDnSIfyUomRptEVFkx6000BpPMi5g";
	}

	public static void main(String[] args) {
		SpringApplication.run(StripePaymentBeignningApplication.class, args);
	}

}
