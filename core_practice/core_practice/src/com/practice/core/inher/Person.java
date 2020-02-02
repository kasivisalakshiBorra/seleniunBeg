package com.practice.core.inher;

public class Person {
	public String name;
	public String addr;
	
	public Person() {
	}
	
	public Person(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}



	public String details() {
		return "From Person --"+name+"  -  "+addr;

	}
	
	 
	
}

