package core_practice;

public class ClassB {
int a=0;
static int b;int c;

static int d;

static {
	String d="sanju";
	System.out.println(d);
	//System.out.println(thi);
	
}
void visu()
{
	//this=null;
	//this=new ClassB();
	ClassB obj= this;
	//XXXXX xxx.send(obj);x;
	
	
}
{
	String e="sanju";
	System.out.println(e);
	//System.out.println(this.e);
}
  public ClassB() {
	  this(10,10);
	// TODO Auto-generated constructor stub
	  System.out.println("Default Constructor ");
}
  public ClassB(int a,int c) {
	  //this();
	  this.a=a;
	  this.c=c;
		// TODO Auto-generated constructor stub
		  System.out.println(" Constructor with parameter" +a);
		  
		 
	}
	  
  void add()
  {
	  int c =a+this.c ;
	  System.out.println("Adding  " +c);
  }
  void show()
  {
	  String a="visu";
	  System.out.println(a);
	  System.out.println(this.a);
	  System.out.println(this.b);
  }
  


}
