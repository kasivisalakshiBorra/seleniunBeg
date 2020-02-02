package equals;

public class Test {

	public static void main(String[] args) {
//		String st1= new String("Srinivas");
//		String st2= new String("Srinivas");
//		String st3= new String("Dande");
//		System.out.println(" using == op");
//		System.out.println(st1 == st2);
//		System.out.println(st1 == st3);
//		System.out.println(" using equals() ");
//		System.out.println(st1.equals(st2));
//		System.out.println(st1.equals(st3));
		Student st1 = new Student(99, "Sri");
		Student st2 = new Student(99, "Sri");
		Student st3 = new Student(88, "Nivas");
		Student st4 = st1;
		System.out.println(" using == op");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st3);
		System.out.println(" using equals() ");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));
		
	}
}
