package com.example.SpringJMS.Reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsReciever {

	@JmsListener(destination = "test-mess")
	public void reviceMess(String mess) {
		System.out.println("Message " + mess + " Recieved");
	}
}
