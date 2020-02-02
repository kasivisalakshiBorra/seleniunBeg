package equals;

public class Student {

	int sid;
	String name;
	Student(int sid, String name) {
	this.sid = sid;
	this.name = name;
	}
	public boolean equals(Object obj)
	{
		if (obj instanceof Student)
		{
		Student st = (Student) obj;
		return this.sid == st.sid && this.name.equals(st.name);
		}
		return false;
		}
	
}

