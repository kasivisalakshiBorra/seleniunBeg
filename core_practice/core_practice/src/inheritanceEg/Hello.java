package inheritanceEg;

import java.io.IOException;

public class Hello extends Hai {
static int a=400;
	  static
	  {
		  System.out.println("Inside Hello static block");
	  }
//	  static void visu()
//	  {
//		 // super.visu();
//		  System.out.println("I am in visu two......");
//	  }
//	   void visu() throws ArithmeticException
//	  {
//		 // super.visu();
//		  System.out.println("I am in visu two......");
//		  throw new ArithmeticException("Arth exception");
//	  }
//	  public void visu()
//	  {
//		 // super.visu();
//		  System.out.println("I am in visu two......");
//	  }
//	  protected void visu()
//	  {
//		 // super.visu();
//		  System.out.println("I am in visu two......");
//	  }
	  public void visu()
 {
//		 // super.visu();
		  System.out.println("I am in visu two......");
	  }
	  
	  // Access modifiers hirarchey//Always higher hirarchy should be present in super class and lower preference should be in sub class.
	  // Private
	  // Default
	  // protected
	  // public
	  
	  
	  void g()
	  {
		  visu();
		  
	  }
	  
	  {
		 // System.out.println("Inside Hello instance block"+a);
		  //System.out.println("Inside Hello instance block"+b);
		  System.out.println("Inside Hello instance block");
		  
	  }
//	  public Hello() {
//		// TODO Auto-generated constructor stub
//		  System.out.println("inside Hello constructor");
//	}
		 
}
