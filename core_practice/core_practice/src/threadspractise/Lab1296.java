package threadspractise;

public class Lab1296 {
	public static void main(String[] args)
	{ 
		MyThread t1 = new MyThread(); 
		MyThread t2 = new MyThread();
		System.out.println("check-1 t1andt2 threads : "+t1+t2);
		t1.start(); 
		//System.out.println("check-3");
		t2.start();
		//System.out.println("check-4");
		/*Thread t = Thread.currentThread();
		for (int i = 100; i <= 110; i++)
		{ System.out.println(t.getName()+" - value is :" + i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e){ e.printStackTrace(); } } */}
}
