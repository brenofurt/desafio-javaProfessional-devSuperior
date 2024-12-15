package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {
	double shippment;
	public double shippment(Order order) {
		if(order.getBasic() < 100) {
			shippment = 20.0;
		}
		else if(order.getBasic() > 100 && order.getBasic() < 200) {
			shippment = 12.0;
		}
		else {
			shippment = 0;
		}
		return shippment;	
	}
	
}
