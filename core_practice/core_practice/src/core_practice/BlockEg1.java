package core_practice;

public class BlockEg1 extends BlockEg{

	//Instance
	//Static
	static int aa=20;
	int bb=50;
	public BlockEg1() {
		// TODO Auto-generated constructor stub
		aa=22;
		//bb=52;
		System.out.println("In Class BlockEg1...Constructor" +aa+" printing BB "+bb );
	}
	
	{
		aa=100;
		//bb=51;
	System.out.println("In Class BlockEg1.. Instance block" +aa +" printing BB "+bb);
	}
	
	static {
		aa=30;
		//bb=51;
		System.out.println("In Class BlockEg1...Static Block  "+aa);
	}
}
