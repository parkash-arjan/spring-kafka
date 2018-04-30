package com.fibonacci.spring.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	String topic = "first-kafka-topic";

	public void send(String message) {
		kafkaTemplate.send(topic, message);
	}
}
