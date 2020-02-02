package core_practice;

public class ClassAB {
public static void main(String[] args) {
	
	ClassB obj = new ClassB();
	
	System.out.println("In ClassAB one"+obj);
	
	ClassB obj1 = new ClassB(10,20);
	//System.out.println("In ClassAB two"+obj1);
	//obj1.show();
	obj1.add();
	System.out.println("Prin d "+ClassB.d);
}	
}
