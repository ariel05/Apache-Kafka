package ar.com.apache_kafka.producer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import ar.com.apache_kafka.producer.modelo.Pedido;

@Service
public class Producer {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	private static final Logger log = LogManager.getLogger(Producer.class);

	public void sendMessage(String topic, String message) {
		kafkaTemplate.send(topic, message);
		log.info("Mensaje enviado: {} en el topico {}", message, topic);
	}
	
	public void sendOrder(String topic, Pedido pedido) {
		kafkaTemplate.send(topic, pedido);
		log.info("Mensaje enviado: {} en el topico {}", pedido, topic);
	}
}
