package methodsEg;

public class MethodTest {
public static void main(String[] args) {
	
//	Student s1 =new Student();
//	s1.setage(20);
//	s1.show(20);
//	System.out.println("in methodeTest");
//   System.out.println("hello"+s1.h(9));
//  System.out.println(s1.j(10)); 
   
	//System.out.println(s1.setage(20));
  
 H h=new H();
//int result= 
//h.add(10, 20);
 // System.out.println(result);
 byte b=20;//        int kanna low amo==short,byte.(
 				   //int kanna high amo==long	
                    
 short c=10;        //int=-2E31 to +2E31-1
// h.add1(b,b);      //byte= -128 to 127.
 //h.add1(b,10);
//h.add2('A', 'B');
// h.add3('A', 'B');
 //h.add4('A', 'B');
// h.show(null);
// h.show("visu");
 //h.show(h);
 
//**************************System.out.println(null);**********************************************************************************
 
// Compilation Error -This is because you can pass an Object or a String or char[]. Since null can fit in both, the compiler doesn’t know which method to use, leading to compile error.
// Method Overloading:
//
// 1.public void prinltln(String str) { }
// 2.public void prinltln(char[] ch){ }
// 3.public void prinltln(Object ch){}
//
//  It seems the call System.out.print(null) is ambiguous to compiler because print(null) here will find the two best specific matches i.e. print(String) and print(char[]) . So compiler is unable to determine which method to call here .
// Compilation Error:
// System.out.println(null)
// Compile Fine:
// System.out.println((String)null);//null
// System.out.println((char[])null);
// System.out.println((Object)null);//null
// It’s the compiler type-checking the parameters of the method call.
// But here we need to know one more thing  System.out.println((char[])null); will compile fine but at run time will throw runtime exception.
 //-------------------------------------------------------------------------------------------------------------------------
 
char v=0;
char[] aa = new char[4];

//System.out.println((char[])null);
 
 
 
 
}
}
