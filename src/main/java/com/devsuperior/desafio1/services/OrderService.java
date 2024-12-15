package com.devsuperior.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	


	public double total(Order order) {
		double discountAmount = (order.getBasic() * order.getDiscount()) / 100;
		return (order.getBasic() - discountAmount) + shippingService.shippment(order);
	}

}
