package threadspractise;

public class MyThread extends Thread{
//lab1297
//	public void run()
//	{
//		Thread th = Thread.currentThread(); 
//		for (int i = 1; i <= 10; i++)
//		{ 
//			System.out.println(th.getName()+" - value is :" + i);
//			try{ Thread.sleep(500); 
//			//System.out.println("check-2");
//			}
//			
//			catch(Exception e){ e.printStackTrace(); } 
//			//System.out.println("check-2a");
//		} 
	//	System.out.println("check-2b");
		//}
	
	
	//-------------------------------------------------//
	
//	MyThread(ThreadGroup tg,String tname)	
//	{
//		super(tg,tname);
//		//start(); 
//	} 
//	public void run() 
//	{//lab1298
//		Thread th = Thread.currentThread();
//		ThreadGroup tg= th.getThreadGroup(); 
//		System.out.println("Thread Name :"+th.getName()); 
//		System.out.println("Thread Group Name :"+tg.getName()); 
//		}	
	
	public void run()
	{
		Thread th = Thread.currentThread();
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(th.getName()+" - value is :" + i+"\t"+th.getState()); 
			try
			{
				Thread.sleep(500);//secound process
				}
			catch(Exception e)
			{
				e.printStackTrace(); 
			}
			}
		}
}
