package core_practice;

import java.util.*;

public class FindingSecoundLargestNumber {

public static void main(String[] args) {
	
	
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number of elements in Array: ");
    int num=sc.nextInt();
	int Array[] = new int[num];
	System.out.println("Enter the numbers to find 2nd largest");
	
	for (int i=0; i<=Array.length-1;i++)
	{
		 Array[i]=sc.nextInt();
		}
	
	int first= Array[0];
	int Secound=Array[0];
	System.out.println("hello");
		for(int i=0;i<=Array.length-1;i++)
	   {
		if(Array[i]>first)
		{
		 Secound =first;
		 first=Array[i];
		 
		}
	} 
	System.out.println("Enter the secound :" +Secound);
	
}
	
}
