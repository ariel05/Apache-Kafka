package ar.com.apache_kafka.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.apache_kafka.producer.service.Producer;

@RestController
@RequestMapping("v1/api")
public class MessageController {

	private Producer kafkaProducer;
	
	@PostMapping("/messages")
	public ResponseEntity<String> sendMessage(@RequestParam String message){
		kafkaProducer.sendMessage("test-topic", message);
		
		return ResponseEntity.ok("Mensaje Enviado: "+ message);
	}
}
