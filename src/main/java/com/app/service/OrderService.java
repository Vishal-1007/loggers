package com.app.service;

import lombok.extern.slf4j.Slf4j;  //Perform import from slf4J
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  private Logger log = LoggerFactory.getLogger(OrderService.class);

  public void processOrder(int orderId) {
      log.info("Processing order with ID: {}", orderId);

      if (orderId <= 0) {
        
          return;
      }

      log.debug("Checking inventory for order ID: {}", orderId);
      
      try {
          // Simulating some order processing logic
          Thread.sleep(2000);
          log.info("Order {} processed successfully!", orderId);
      } catch (InterruptedException e) {
         
      }
  }
}	

