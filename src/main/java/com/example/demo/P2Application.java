package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class P2Application {
	
	@GetMapping("/message")
	public String welcome(){
		return "Congratulation you successfully deployed your application to kubernetes !!";
	}

	
	
    public static void main(String[] args) {
        SpringApplication.run(P2Application.class, args);
    }
}
