package inheritanceEg;

public class One{
	//private int a=20;
	int a=90;
	protected int b=100;
	public int c=200;
	public One() {
		// TODO Auto-generated constructor stub
		System.out.println("One ccccccccc");
	}
	

	void m1()
	{
		System.out.println("Inside m1() method");
	}
	
	public int geta() {
		return a;
	}
	
	public int getb() {
		return b;
	}
	public int getc() {
		return c;
	}
	
}
