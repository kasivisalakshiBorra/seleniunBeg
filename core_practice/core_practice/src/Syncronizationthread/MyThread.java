package Syncronizationthread;

public class MyThread extends Thread {
	
	Hello h=null;
	MyThread(Hello h)
	{ 
		this.h = h;
	}
	public void run() 
	{
		h.show();
		//Hello.show();
//Hello.m2();
		h.m2();
				}
	}
	
//	Thread main;
//	MyThread(Thread main)
//	{
//		this.main = main; 
//	}
//	public void run() 
//	{
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(getName()+"\t"+i+"\t"+isDaemon());
//			
////				try {
////					if(i==5)
////					main.join();
////				} catch (InterruptedException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////			{
////				int x=10/0;
////				}
//		
//			
//			try{ Thread.sleep(500); }catch(Exception e){ e.printStackTrace();
//		}
//	}
//}
//}