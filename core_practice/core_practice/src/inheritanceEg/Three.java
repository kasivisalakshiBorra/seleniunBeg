package inheritanceEg;

public class Three extends Two{
	int a=131;
	protected int b=132;
	public int c=133;
	public Three() {
		// TODO Auto-generated constructor stub
		System.out.println("Three cccccccccccccccccc");
	}
  void m1()
  {
	  System.out.println("Inside the m3()");
	  System.out.println("Inside the m2()  " +super.a);
		System.out.println("Inside the m2()   " +b);
		System.out.println("Inside the m2()   " +c);
		System.out.println("Inside the m2()  " +geta());
		System.out.println("Inside the m2()   " +getb());
		System.out.println("Inside the m2()   " +getc());
  }
}
