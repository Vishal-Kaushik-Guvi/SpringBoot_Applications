package com.example.SpringJMS.Sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsSender {
	
    @Autowired
	private JmsTemplate template;
    
  
    public void sendMessage(String mess) {
    	template.convertAndSend("test-mess", mess);
    }
}
