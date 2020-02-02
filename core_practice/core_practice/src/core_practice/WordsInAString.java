package core_practice;

import java.util.HashMap;

public class WordsInAString {
	
	public static void main(String[] args) {
		
		String str ="Hello Visala Hello Sanju 000000 Deepu 000000 000000";
		String str1[] = str.split(" ");
		//System.out.println(str1);
		for(String aaa:str1) {
			System.out.println(aaa);
		}
		
		HashMap<String, Integer> obj = new HashMap<>();
		for(int i=0; i<=str1.length-1; i++)
		{
			System.out.println(str1[i]);
			int	count =0;
			if(obj.containsKey(str1[i])) {
				count = obj.get(str1[i]);
				obj.put(str1[i], count+1);
			}else {
				obj.put(str1[i], 1);
			}
				
		}
		System.out.println(obj);
	}

}
