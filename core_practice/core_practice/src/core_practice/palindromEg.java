package core_practice;

public class palindromEg {
		public static void main(String[] args) {
			int n=121,rem,sum=0, temp;
			System.out.println("Hello");
			temp=n;
		while(temp>0)
		{
			
			rem=temp%10;
			temp=temp/10;
			sum=(sum*10)+rem;
		}		System.out.println(sum);
		if(sum==n)
		{
			System.out.println("palindrom");
					}
		else
		{
			System.out.println("Not palindrom");
		}				
	}		
}
