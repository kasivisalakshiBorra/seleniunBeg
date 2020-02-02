package com.practice.core.constr;

public class Student {

	int sid;
	String name;
	
	
	void Student(int sid, String name) {
		System.out.println("inside1 Parametrized const");
		this.sid = sid;
		this.name = name;
	}
	/*public 	Student()  {
		System.out.println("inside 2 ");
		
	}*/
	
	
	void show()
	{
		System.out.println(sid +"\t"+name);
	}
	
	
}
