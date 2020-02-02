package core_practice;

import java.util.*;

public class SwapEg {
	
	// 2,3
	public static void main(String[] args) {
		int a=2,b=3,c=0;
		System.out.println("printing a  " +a + "Printing b " +b );
		
		System.out.println(a+" "+b);
		
		c=a;
		a=b;
		b=c;
		System.out.println(a+"  "+b);
		int d=0,f=0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter value1 :");
		d=sc1.nextInt();
		System.out.println("Enter value2 :");
		f=sc1.nextInt();
	
		System.out.println(d+"  "+f);
		 
		d=d+f;//d=4,f=5-----d=9,f=5
		f=d-f;//d=9,f=4
		d=d-f;//5
		System.out.println(d+"  "+f);
		
		
		
		
		
		
	
		
		
		
	}

}
