package core_practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.*;

public class MapEg {

	public static void main(String[] args) {
		Map data = new HashMap();
		data.put("Name", "visala");
		data.put("Name", "visala");
		data.put("ColgName", "Vijaya");
		data.put("Compa","HCL");
		
		System.out.println(data);
		Set data2 = data.entrySet();
		Iterator it = data2.iterator();
		while(it.hasNext())
		{
			// obj = it.next();
			System.out.println(it.next());
		}
	
}
}
