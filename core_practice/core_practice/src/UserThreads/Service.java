package UserThreads;

public class Service {
	void verifyUser(String unm,String pwd)
	{
		Thread th=Thread.currentThread();
		for(int i=0;i<=10;i++)
		{
			System.out.println(th.getName()+"\tverifying :"+unm+"\t"+pwd);
			try
			{
				Thread.sleep(300);
				}
			catch(Exception e){ e.printStackTrace(); } } }

}
