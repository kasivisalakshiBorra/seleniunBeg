package core_practice;

import java.util.*;


public class VectorEg {

	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Visala");
		//String msg = s1.displayDetails();
		
		//System.out.println(msg);
		
		Vector<Student> obj = new Vector();
//		obj.addElement(10");
//		obj.addElement(12);
		obj.addElement(s1);
		obj.addElement(new Student(20, "Kasi"));
		
		/*Object a1 = obj.get(0);
		Student s2= (Student)a1;
		System.out.println(s2.displayDetails());*/
		Enumeration enm = Collections.enumeration(obj); 
		while (enm.hasMoreElements()) { 
			Student s11 = (Student)enm.nextElement(); 
			System.out.println(s11.displayDetails());
			} 
	
		
		//System.out.println(""+obj.get(1).displayDetails());
		
		
	}
}
