package com.Practise.P1SpringBoot1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service; 

//Target class
@Service("amz")
public class Amazon {
	
	@Autowired
	@Qualifier("bd")
	private DeliverService service;
	
	public Amazon() {
		System.out.println("Creating an Amazon bean through the Constructor. ");
	}
	
	
	public Amazon(DeliverService service) {
		System.out.println("Injecting through Constructor");
		this.service = service;
	}

	public void setService(DeliverService service) {
		System.out.println("Injecting through Setter");
		this.service = service;
	}

	public Boolean deliverTheProduct(Double amount) {
		return service.deliverProduct(amount);
	}
	
}
