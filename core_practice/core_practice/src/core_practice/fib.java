package core_practice;

public class fib {
			
		public static void main(String[] args) {
			//0,1,1,2,3//0,1,1,2,3//a=0,b=1,sum=1
								// a=1,b=1,sum=a+b(2)
								// a=1,b=2,sum=a+b(3)
			                    // a=2,b=3,sum=a+b(5)
								// a=3,b=5,sum=a+b(8)
			
			
			int num = 9;
			int sum=1,b=0,a=0;

			for(int i=0;i<=num; i++)
			{
			a=b;
			b=sum;
			sum = b+a;
						
			System.out.print(a + " ");
			
			}
			
		}

	}


