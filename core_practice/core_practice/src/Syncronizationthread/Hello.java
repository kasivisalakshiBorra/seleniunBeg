package Syncronizationthread;

import java.util.ArrayList;
import java.util.Vector;

public class Hello {

//	synchronized void show()
//	{
//		Thread th=Thread.currentThread();
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(th.getName()+" - SHOW :"+i+"\t"+this);
//			try
//			{
//				Thread.sleep(500);
//				}catch(Exception e)
//			{ e.printStackTrace(); 
//			}
//			}
//		}
	
	//blocklevel synchronization.
//	void show()
//	{
//		Thread th=Thread.currentThread(); 
//		
//		synchronized(this)
//		{
//			for(int i=0;i<5;i++)
//			{
//				System.out.println(th.getName()+" - SHOW :"+i+"\t"+this);
//				try
//				{
//					Thread.sleep(500); 
//					}
//				catch(Exception e)
//				{
//					e.printStackTrace();
//					}
//				}
//			}
//		}
	 /*void m2()
	// void m2() throws InterruptedException
	{Thread th=Thread.currentThread();
		 System.out.println(th.getName());
		System.out.println("I am in m2");
		//wait();If you call wait() method on unlocked object then java.lang.IllegalMonitorStateException will be thrown at runtime.
	}*/
	//synchronized static void show()
	static synchronized void m2()
	{
		Thread th=Thread.currentThread();
		 System.out.println(th.getName());
		System.out.println("I am in m2");
	}
	static synchronized  void show()
	{   //here arraylist is not synchronized so
		//If you call wait() method on unlocked
		//object then java.lang.IllegalMonitorStateException will be thrown at runtime.
	//
		// ArrayList al=new ArrayList();
//		Vector al=new Vector();
		Thread th=Thread.currentThread();
		for(int i=0;i<5;i++)
		{
			System.out.println(th.getName()+" - SHOW :"+i+"\t"+Hello.class);
			try
			{
				
				//Thread.sleep(500);
				//When you call wait() method on any locked object then lock of that object will be released immediately and current thread will be moved to WAIT state.
				//wait(1000);
			//	al.wait(1000);
				
				}catch(Exception e)
			{ e.printStackTrace(); 
			}
			}
		}
	}

