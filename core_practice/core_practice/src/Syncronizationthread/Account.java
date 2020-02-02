package Syncronizationthread;

public class Account {

	int bal=970;
	public void withdraw(int amt)
	{ 
		if(bal>=amt)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdraw....."+bal);
			try
			{
				Thread.sleep(1200);
				}
			catch(Exception e)
			{}
			bal-=amt; 
			System.out.println(Thread.currentThread().getName()+" is completed withdraw.. : "+bal); }
		else
		{
			System.out.println("No Funds for "+Thread.currentThread().getName());
			}
		}
	public int getBal()
	{
		return bal;
		}
}
