package com.helloworld.demo.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Pet {
	@Getter @Setter private int age = 0;
	@Setter(AccessLevel.PROTECTED) private String name;
	
	@Override public String toString() {
		return String.format("%s (age: %d)", name, age);
	}

}
