package Syncronizationthread;

public class Lab1312 {

	public static void main(String[] args)
	{
		Hello h1=new Hello();
		Hello h2=new Hello();
	MyThread th1=new MyThread(h1);
	//MyThread th2=new MyThread(h1);
	MyThread th2=new MyThread(h2); 
	//MyThread th2=new MyThread(Hello.class); 
	th1.start();
	th2.start();
	}
}
