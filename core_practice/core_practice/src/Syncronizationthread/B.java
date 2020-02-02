package Syncronizationthread;

public class B implements Runnable	 {

	Stack st=null; 
	B(Stack st,String name)
	{
		this.st=st;
		Thread t2=new Thread(this,name);
		t2.start();
		}
	public void run() 
	{
		for(int i=0;i<7;i++) 
		{
			st.pop();
			}
		}
}
