package com.euler.spring.kafka.springkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.fibonacci.spring.kafka.MessageProducer;

@ComponentScan({"com.fibonacci.spring.kafka"})
@SpringBootApplication
public class SpringKafkaApplication implements CommandLineRunner {

	@Autowired
	MessageProducer messageProducer;

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messageProducer.send("This is random message with random value = " + (Math.random() * 100));
	}
}
