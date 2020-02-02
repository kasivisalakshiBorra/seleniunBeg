package Syncronizationthread;

public class Stack {

	int x;
	boolean flag=false; 
	public synchronized void push(int x)
	{
		if(flag) 
		{
			try
			{
				wait();
				}
			catch(Exception e) 
			{
				System.out.println(e); 
				}
			}
		this.x=x;
		System.out.println(x+" is pushed..");
		flag=true;
		notify();
		}
	synchronized public int pop()
	{
		if(!flag)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
				}
			}
		System.out.println(x+" is poped");
		try
		{
			Thread.sleep(1000);
			}
		catch(Exception e) 
		{
			System.out.println(e);
			}
		flag=false; 
		notify();
		return x;
		}
	}

