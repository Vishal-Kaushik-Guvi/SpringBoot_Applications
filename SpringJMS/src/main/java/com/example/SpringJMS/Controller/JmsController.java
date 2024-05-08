package com.example.SpringJMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJMS.Sender.JmsSender;

@RestController
public class JmsController {

@Autowired
private JmsSender sender;

@PostMapping("/send")
public void sendingInfo(@RequestBody String mess) {
	 sender.sendMessage(mess);
}
}
