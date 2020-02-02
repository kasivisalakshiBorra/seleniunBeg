package UserThreads;

public class Lab {
	public static void main(String str[])
	{
//		CThread th1=new CThread("nivas","jlcindia");
//		CThread th2=new CThread("dande","javasree");
//		th1.start(); 
//		th2.start(); 
		
		//create user thread with runnable.
		//
Runnable r = new Runnable()
{
	public void run()
	{
		Thread th = Thread.currentThread();
		for(int i=0;i<10;i++) 
	System.out.println(th.getName()+"\t"+i);
		}
	};
	Thread t1=new Thread(r);
	Thread t2=new Thread(r);
	t1.start();
	t2.start(); 
	}
	}

