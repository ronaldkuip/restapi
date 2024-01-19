package com.rkuip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.rkuip.services.OrdersBusinessService;
import com.rkuip.services.OrdersBusinessServiceInterface;

@Configuration
public class SpringConfig {

	@Bean(name="ordersBusinessService" , initMethod = "init", destroyMethod = "destroy"     ) 
	@RequestScope
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService();
	}
}
