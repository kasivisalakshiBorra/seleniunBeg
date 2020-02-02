package core_practice;

import java.util.*;

public class PrimeEg {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int str1=obj.nextInt();
		boolean isPrime =true;
		 
		for(int i=2; i<=str1; i++)
		{
			   int temp =str1%i;
			   if((temp ==0) && (i!=str1))
			   {
				   isPrime =false;
				   break;
			   }
		}
		if(isPrime)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not prime Number");
		}
			
	}
}
