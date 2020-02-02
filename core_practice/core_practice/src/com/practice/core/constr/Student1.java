package com.practice.core.constr;

public class Student1 {

	int sid;
	String name;//instance variables
	//memory allocates when object creates
	 public Student1() {
		System.out.println("Default Const");
	}
	 void show()
	 {    
		 System.out.println(sid+"\t"+name);
	 }
	
}

