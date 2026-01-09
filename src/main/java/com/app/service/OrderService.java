package com.app.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	 private Logger log = LoggerFactory.getLogger(OrderService.class);

	    public void processOrder(int orderId) {
	        log.info("Processing order with ID: {}", orderId);

	        if (orderId <= 0) {
	            log.error("Invalid order ID: {}", orderId);
	            return;
	        }

	        log.debug("Checking inventory for order ID: {}", orderId);
	        
	        try {
	            // Simulating some order processing logic
	            Thread.sleep(2000);
	            log.info("Order {} processed successfully!", orderId);
	        } catch (InterruptedException e) {
	            log.error("Error processing order: {}", orderId, e);
	        }
	    }
	}	   		   
