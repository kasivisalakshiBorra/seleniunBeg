package core_practice;

public class InstVarTest {
public static void main(String[] args) {
	InstanceVariableEg e1=new InstanceVariableEg();
	System.out.println("Before Assingment  " +e1.a);
	e1.a=10;
	System.out.println("After Assingment  " +e1.a);
	
	new InstanceVariableEg().a=10;
	System.out.println("directAssinmnet  " +new InstanceVariableEg().a);
	
	InstanceVariableEg h=new InstanceVariableEg();//null;//
	System.out.println(h.a);
	
	//System.out.println(InstanceVariableEg);
	
}
}
