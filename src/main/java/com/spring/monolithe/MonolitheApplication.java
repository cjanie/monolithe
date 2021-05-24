package com.spring.monolithe;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.monolithe.feignclients.OpenStreetMapClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients()
public class MonolitheApplication {

	@Autowired
	OpenStreetMapClient openStreetMapClient;

	public static void main(String[] args) {
		SpringApplication.run(MonolitheApplication.class, args);
	}
}
