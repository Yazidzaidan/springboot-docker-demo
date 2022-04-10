package com.yazidproject.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

	@GetMapping("/welcome") //Alamat website localhost
	public String welcome(){
		return "Spring Boot Docker Demo, created by Yazid. Bismillah sukses guys";
	}

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8081);
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

}
