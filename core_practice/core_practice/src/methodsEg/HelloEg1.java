package methodsEg;

public class HelloEg1 {

	void m1(HaiEg2 hai){
		System.out.println("m1 begin :"+hai.a);
		hai=new HaiEg2();
		System.out.println("***** :"+hai.a);
		hai.a = hai.a+10;
		System.out.println("m1 ends :"+hai.a);
		}
	
}
