package com.project.SuiteA;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.Baseclass.BaseTest;

public class TC00_1 extends BaseTest {

	@BeforeMethod
	public void startProcess() throws IOException
	{
		System.out.println(projectPath);
		init();
	}
	@Test
	public void amazone()
	{
		System.out.println("Hi i am in test");
	}
	
}
