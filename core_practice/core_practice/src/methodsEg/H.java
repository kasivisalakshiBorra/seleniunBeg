package methodsEg;

public class H {
	
	int add(long a,int b)
	{
		System.out.println("int type(int int)");
		return (int)a+b;
				
	}
	int c;
	void add(int a,long b)
	{
		c=a+(int)b;
		System.out.println("Long type(int long)  " +c);
		
				
	}
	void add1(int a,byte b)
	{
		System.out.println("int-byte");
	}
	
	void add1(byte a,int b)
	{
		System.out.println("byte-byte");
	}
	void add2(char a,int b) //Char changed to int(add2('A','B').
	{
		System.out.println("char-int  "+(a+b));
	}
	void add2(long b,char a)
	{
		System.out.println("char-long");
	}
	void add3(long b,long a)
	{
		System.out.println("long-long");//between int and long then the 1st priority goes long.
	}
	void add3(int b,int a)
	{
		System.out.println("//int-int");
	}
	
	void add4(long b,int a)
	{
		System.out.println("long-int");
	}
	void add4(int b,long a)
	{
		System.out.println("//int-long");
	}
	void show(String str)
	{
		System.out.println("String type");
		
	}
	void show(Object obj)
	{
		System.out.println("Object type");
	}
	void show(H obj)
	{
		System.out.println("///H type");
	}
	
	
	
	
	
	
	
}
