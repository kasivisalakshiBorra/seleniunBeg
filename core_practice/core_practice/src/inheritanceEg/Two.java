package inheritanceEg;

public class Two extends One{
	int a=121;
	protected int b=122;
	public int c=123;
	public Two() {
		// TODO Auto-generated constructor stub
		System.out.println("Two..ccccc");
	}
	

	void m1()
	{
		System.out.println("Inside the m2()  " +a);
		System.out.println("Inside the m2()   " +b);
		System.out.println("Inside the m2()   " +c);
	}
}
