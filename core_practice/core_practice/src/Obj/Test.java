package Obj;

public class Test {
	public static void main(String[] args) {
		
//		showClassInfo("JLC");
//		Student stu=new Student();
//		showClassInfo(stu);
//		Object obj = new Object();
//		showClassInfo(obj);
//		}
//	
//	static void showClassInfo(Object obj) {
//		Class cls = obj.getClass();
//		System.out.println("Class Name :" + cls.getName());
//		Class scls=cls.getSuperclass();
//		if(scls!=null)
//		System.out.println("Super Class :" + scls.getName());
//		else
//		System.out.println("No Super Class");
//		}
		
////}
//		System.out.println("\n*** With Student");
//		Student st1 = new Student(99, 31903290);
//		Student st2 = new Student(99, 31903290);
//		Student st3 = new Student(88, 65799999);
//		Student st4 = st1;
//		System.out.println(st1.hashCode());
//		System.out.println(st2.hashCode());
//		System.out.println(st3.hashCode());
//		System.out.println(st4.hashCode());
//		System.out.println(st1 == st2);
//		System.out.println(st1 == st3);
//		System.out.println(st1 == st4);
//		System.out.println(st3 == st4);
		Student st1 = null;
		System.out.println(st1);
		st1 = new Student(99, "Sri");
		System.out.println(st1);
//		String str= new String("Java Learning Center");
//		System.out.println(str);
//		Integer ref= new Integer(123);
//		System.out.println(ref);
		System.out.println("\n*** Default Iimplementation ***");
		String cname = st1.getClass().getName();
		int hc = st1.hashCode();
		String hx = Integer.toHexString(hc);
		String msg = cname + "@" + hx;
		System.out.println(msg);
		
	}
}
