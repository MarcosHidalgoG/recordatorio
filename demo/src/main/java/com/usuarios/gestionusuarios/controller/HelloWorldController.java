package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@RestController
public class HelloWorldController {
	
	@Getter @Setter private int age = 0;
	@Setter(AccessLevel.PROTECTED) private String name = "Marcos";
	
	@Override public String toString() {
		return String.format("%s (age: %d)", name, age);
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello java " + toString();
	}

}
