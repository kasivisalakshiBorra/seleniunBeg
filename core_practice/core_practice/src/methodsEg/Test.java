package methodsEg;

public class Test {
public static void main(String[] args) {
	
	HaiEg2 hai = new HaiEg2();
	hai.a=99;
	HelloEg1 H1 = new HelloEg1();
	System.out.println("main begin :"+hai.a);
	H1.m1(hai);
	System.out.println("main ends  :"+hai.a);
	
	
}
}
