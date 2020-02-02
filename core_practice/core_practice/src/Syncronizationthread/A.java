package Syncronizationthread;

public class A implements Runnable{

	Stack st=null;
	A(Stack st,String name)
	{
		this.st=st;
		Thread t1=new Thread(this,name);
		t1.start(); 
	}
	public void run()
	{
		int a=1; 
		for(int i=0;i<7;i++) 
		{
			st.push(a++);
			}
		}
	
}
