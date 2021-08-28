package com.example.mavendockerdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MavenDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenDockerDemoApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "hello world!" + " my-prop: " + myProp;
	}

	@Value("${demo.my-prop}")
	private String myProp;
}
