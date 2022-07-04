package com.hh.spring.learning;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void talk() {
		System.out.println(name + " said: hello world");
	}
}
