package com.Practise.P1SpringBoot1;

import org.springframework.stereotype.Service;

@Service
public class DHL implements DeliverService {
	
	public DHL() {
		System.out.println("DHL Bean created.");
	}

	@Override
	public Boolean deliverProduct(Double amount) {
		System.out.println("Delivering through DHL : "+amount);
		return true;
	}

}
