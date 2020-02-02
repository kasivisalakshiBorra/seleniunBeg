package core_practice;

public class StaticVarTest {

	 public static void main(String[] args) {
		 
		StaticVarEg obj =new StaticVarEg();
		StaticVarEg obj1 =new StaticVarEg();
		System.out.println(obj.b+" "+obj1.b);
		obj1.b=100;
		System.out.println(obj.b+ " " +obj1.b);
		System.out.println(StaticVarEg.b);
		
		StaticVarEg h=null;
		System.out.println(h.b);
		new StaticVarEg().b=90;
		System.out.println(new StaticVarEg().b);
	}
}
