package threadspractise;

public class Threads1 {
	public static void main(String[] args) 
	{
		System.out.println("Main Started"); 
		Thread th=Thread.currentThread(); 
		System.out.println("Th: "+th);
		ThreadGroup tg=th.getThreadGroup();
		System.out.println("Tg: "+tg);
		System.out.println("Before for loop: "+th.getId()+"\t"+th.getName()+"\t"+tg.getName());
		System.out.println("ArrayLength: "+args.length);
		for (int i = 0; i < args.length; i++)
		{		
			String st=args[i]; 
		System.out.println("Inside for loop: "+th.getId()+"\t"+th.getName()+"\t"+tg.getName()+"\t"+st); 
		}
	System.out.println("Main Completed");
	}
}
