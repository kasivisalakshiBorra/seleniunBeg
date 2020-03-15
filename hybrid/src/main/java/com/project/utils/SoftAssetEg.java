package com.project.utils;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssetEg {

	@Test
	public void softAssert()
	{
		SoftAssert s= new SoftAssert();
		s.fail("one err");
		System.out.println("one ");
		s.fail("two err");
		System.out.println("two ");
		s.fail("three");
		s.assertAll();
		
	}
	
}
