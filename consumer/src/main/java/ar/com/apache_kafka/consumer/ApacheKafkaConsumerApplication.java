package ar.com.apache_kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ApacheKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaConsumerApplication.class, args);
	}

}
