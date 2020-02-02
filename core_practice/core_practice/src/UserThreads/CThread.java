package UserThreads;

public class CThread extends Thread{
	static Service serv=new Service();
	String unm; 
	String pwd;
	CThread(String unm,String pwd)
	{
		this.unm=unm; this.pwd=pwd;
		}
	public void run()
	{ 
		serv.verifyUser(unm,pwd); }
}
