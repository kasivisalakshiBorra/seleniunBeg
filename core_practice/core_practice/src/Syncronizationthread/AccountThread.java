package Syncronizationthread;

public class AccountThread implements Runnable{

	Account acc=null;
	AccountThread(Account acc)
	{
		this.acc=acc;
		Thread t1=new Thread(this,"A");
		Thread t2=new Thread(this,"B");
		t1.start(); 
		t2.start(); 
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			acc.withdraw(225);
			if(acc.getBal()<0)
			{
				System.out.println("Amount is Overdrawn......");
			}
		}
	}
	}

