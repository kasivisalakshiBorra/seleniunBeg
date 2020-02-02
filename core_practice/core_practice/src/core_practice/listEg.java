package core_practice;

import java.util.*;

public class listEg {
public static void main(String[] args) {
	List data = new ArrayList();
	data.add("hi");
	data.add("Ama");
	data.add("hello");
	System.out.println(data);
	ListIterator it =data.listIterator();
	while(it.hasNext())
	{	
	
		int index = it.nextIndex();
		Object obj= it.next();
		
		System.out.println(index +"\t" +obj);
	}
	while(it.hasPrevious())
	{	
	    int index = it.previousIndex();
		Object obj= it.previous();
		
		System.out.println(index +"\t" +obj);
	}
	
}
}
