

package core_practice;
import java.util.*;

public class ReverseEg {

	 public static void main(String[] args) {
		
		 Scanner scobj = new Scanner(System.in);
		/* System.out.println("Enter a String:");
		 String obj2 = scobj.nextLine();
		  String[] Result = obj2.split("");
		  int length = Result.length;
		  String abd ="";
		  
			for (int i=length-1; i>=0; i-- )
			{
				abd = abd+Result[i];
                 System.out.println(abd);   
            }*/
		 
		 String src = "ABCDEF";

		 //Using In build functions.
		 StringBuilder sbd1 = new StringBuilder(src);
		 
		 System.out.println("Source String "+src);
		 System.out.println("Reverse using inbuild func   "+sbd1.reverse());
		 
		 //Usring Character Array
		 //char c=' ';
		 //char ch1[] = {'A','B','C','D'};//new char[5];
		 //char ch2[] = new char[]{'A','B','C','D'};
		 //char ch3[] = new char[9];
		 System.out.println("Reverse using Char sequence");
		 char ch1[] = src.toCharArray();
		 
		 String str1="";
		 
		 for(int i=ch1.length-1;i>=0;i--) {
			 //System.out.print(ch1[i]);
			 str1 = str1+ch1[i];
		 }
		 System.out.println(str1);
		 //Using String property - charAt
		 String str2 ="";
		 for(int i=src.length()-1;i>=0;i--) {
			 //System.out.print(ch1[i]);
			 str2 = str2+src.charAt(i);//ABCDEF
		 }
		 
		 System.out.println(str2);
		 
		 // Split -Deliminator - name|add1, dob,
		 
		 
		 
		 
		  
		 
	}
}
