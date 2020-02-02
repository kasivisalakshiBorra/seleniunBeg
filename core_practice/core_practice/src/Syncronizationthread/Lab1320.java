package Syncronizationthread;

public class Lab1320 {

	public static void main(String[] args) throws InterruptedException
	{
		Thread th1=Thread.currentThread();
//		MyThread th2=new MyThread(th1);
//		th2.setDaemon(true);
//		th2.start();
		for(char ch='A';ch<'L';ch++)
		{ 
			System.out.println(th1.getName()+"\t\t"+ch+"\t"+th1.isDaemon());
			//if(ch=='F')th2.join();
//			{
//				int x=10/0;
//				}
			try
			{
				Thread.sleep(500); 
				}
			catch(Exception e){ e.printStackTrace(); } 
		}}}
