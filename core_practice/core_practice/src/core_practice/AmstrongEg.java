package core_practice;

public class AmstrongEg {
public static void main(String[] args) {
  
	 //n=153 n=temp
	//temp%10=3
	//sum=sum+rem*3
	//temp=temp/10=15
	
	int n=153;
	int temp;
	int sum=0;
	int rem;
	temp=n;
	System.out.println("hello");
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		sum=sum+(rem*rem*rem);
		
	}
	
	if(temp==sum)
	{
	System.out.println(" helloAmstrong :"+sum);
	}
	else
	{
		System.out.println("Not Amstrong ");
	}
	
 }


}
