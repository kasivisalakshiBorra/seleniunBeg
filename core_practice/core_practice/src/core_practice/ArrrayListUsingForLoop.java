package core_practice;

import java.util.*;

public class ArrrayListUsingForLoop {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(34);
		obj.add(10);
		obj.add(90);
		obj.add(20);
		//System.out.print(obj);
	
//		for(int i=0; i<=obj.size()-1; i++)
//		{
//			System.out.print(obj.get(i)+ " ");
//		}
		
		//Iterator< > 
//		int j=0;
//		while(j<=obj.size()-1)
//		{
//			System.out.print(obj.get(j)+ " ");
//			j++;
//		}
		//Iterator itr = obj.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next());
//		}
		for(Iterator itr=obj.iterator();itr.hasNext();)
		{
			System.out.print(itr.next()+ " ");
		}
		
	}
}
