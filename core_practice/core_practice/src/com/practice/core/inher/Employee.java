package com.practice.core.inher;

public class Employee extends Person{
	public String grade;
	public String name;
	public String addr;
	
	
	public Employee(String grade, String name, String addr) {
		super(name,addr);
		
		this.grade = grade;
		this.name = name;
		this.addr = addr;
	}

	@Override
	public String details() {
		return "From Employee (In Child Class overriden method)d --"+name+"  -  "+addr;
	}

	public String details1() {
		return "From Employee (Child Specific Method)d1 --"+name+"  -  "+addr+" -- "+grade;
	}
}