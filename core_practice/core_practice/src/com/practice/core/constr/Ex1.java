package com.practice.core.constr;

public class Ex1 {
	public Ex1() {
		System.out.println("Parent Class Constructor");
	}
	
	int total;
	
	public Ex1(int total) {
		this.total =total;
	}
	
	public void ex1method() {
		System.out.println("Parent Class Method");

	}
	private void expmethod() {
		System.out.println("Parent Class private Method");

	}

}
