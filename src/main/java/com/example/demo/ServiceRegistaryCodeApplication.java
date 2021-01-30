package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistaryCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistaryCodeApplication.class, args);
		System.out.println(" WELCOME CHANDU VELAGAPUDI we are in service-registary ");
	}

}
