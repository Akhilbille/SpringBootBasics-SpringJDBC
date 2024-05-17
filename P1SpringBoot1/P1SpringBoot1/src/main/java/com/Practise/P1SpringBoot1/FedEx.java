package com.Practise.P1SpringBoot1;

import org.springframework.stereotype.Service;

@Service
public class FedEx implements DeliverService {
	
	public FedEx() {
		System.out.println("FedEx bean is created.");
	}

	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Delivering through Fedex : "+amount);
		return true;
	}

}
