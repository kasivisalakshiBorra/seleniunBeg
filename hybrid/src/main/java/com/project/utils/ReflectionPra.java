package com.project.utils;
import java.lang.reflect.*	;

import org.openqa.selenium.WebDriver;

public class ReflectionPra {
	
	public void Sampletext()
	{
		System.out.println("i am in sample text");
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		String x="Sampletext";
		//create a object for reflection API
		ReflectionPra api=new ReflectionPra();
		try {
			Method Method = api.getClass().getMethod(x);
			//invoke the method.
			Method.invoke(api);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		
	}

}
