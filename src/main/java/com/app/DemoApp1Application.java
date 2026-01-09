package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.service.OrderService;

@SpringBootApplication
public class DemoApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApp1Application.class, args);
		
		OrderService order = ctx.getBean(OrderService.class);
		 order.processOrder(1);
	}

}
