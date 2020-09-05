package com.example.serverhi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServerHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerHiApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping(value = "/hi")
	public String hiContonller(@RequestParam(value = "name", defaultValue = "forezp") String name){
		return "I am"+name+"port"+port;
	}
}
