package ar.com.apache_kafka.consumer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	private static final Logger log = LogManager.getLogger(Consumer.class);
	
	@KafkaListener(topics = "test-topic", groupId = "my-group")
	public void listener(String message) {
		log.info("Mensaje escuchado {}", message);
	}
}
