package threadspractise;

public class Lab1298 {
	public static void main(String[] args) throws InterruptedException 
	{
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread(); 
		//lab1299
//		MyThreadImp t1 = new MyThreadImp();
//		MyThreadImp t2 = new MyThreadImp();
		//1300
//		MyThread t1 = new MyThread("Visu");
//		MyThread t2 = new MyThread("JCL");
		//lab-1301
//		MyThreadImp t1 = new MyThreadImp("one");
//		MyThreadImp t2 = new MyThreadImp("Two");
		//lab-1302
		
//		ThreadGroup tg=new ThreadGroup("group1");
//		MyThread t1 = new MyThread(tg,"Visu");
//		ThreadGroup tg2=new ThreadGroup("group2");
//		MyThread t2 = new MyThread(tg2,"JCL");
		
//		ThreadGroup tg=new ThreadGroup("group1");
//		MyThreadImp t1 = new MyThreadImp(tg,"Visu");
//	//	ThreadGroup tg2=new ThreadGroup("group2");
//		MyThreadImp t2 = new MyThreadImp(tg,"JCL");
		//MyThread t1 = new MyThread(); 
		//t1.setPriority(0);
		//t1.setPriority(11); 
		//t1.setPriority(10);
//		System.out.println(t1);
//		t1.setName("HELLO");
//		System.out.println(t1);
//		ThreadGroup tg=new ThreadGroup("JLC");
//		MyThread t1 = new MyThread(tg,"HELLO");
//		t1.setPriority(9);
//		System.out.println(t1); 
		
		MyThread th = new MyThread();
		Thread t1= new Thread(th);//one process
		System.out.println(t1.getState()); 
		t1.start();
		Thread.sleep(500); 
		System.out.println(t1.getState()); 
		Thread.sleep(5000);
		System.out.println(t1.getState());
		}
}
