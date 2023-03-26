package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/my-api")
	public ResponseEntity<?> handlePostRequest(@RequestBody MyRequestModel request) {
		String message = "Hello, " + request.getName() + "! Your age is " + request.getAge() + " and you live in " + request.getCity() + ".";
		Map<String, Object> response = new HashMap<>();
		response.put("message", message);
		return ResponseEntity.ok(response);
	}

	public static class MyRequestModel {
		private String name;
		private int age;
		private String city;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
	}
}




