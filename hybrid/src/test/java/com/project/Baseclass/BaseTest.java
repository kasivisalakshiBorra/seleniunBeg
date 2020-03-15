package com.project.Baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.project.driver.DriverScript;
import com.project.report.ExtentManager;
import com.project.utils.ExcelAPI;

public class BaseTest {

	public static String projectPath= System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties env;
	public static Properties envProp;
	public static ExcelAPI xls;
	public String testName; 
	public DriverScript ds;
	public static ExtentReports rep;
	public static ExtentTest test;
	
	
	@BeforeTest
	public  void init() throws IOException {
		
		fis=new FileInputStream(projectPath +"//src//test//resources//environment.properties"); 
		env=new Properties();
		env.load(fis);
		String str = env.getProperty("env");
		System.out.println(str);
		
		
		fis=new FileInputStream(projectPath +"//src//test//resources//"+str+".properties");
		envProp=new Properties();
		envProp.load(fis);
		//String str1 = envProp.getProperty("amazonURL");
		//System.out.println(str1);
		
		
	    //inil the testName.
		testName = this.getClass().getSimpleName();
		System.out.println("Testname: "+testName);
		//how do i come to know the suite
	   String[] packName = this.getClass().getPackage().getName().split("\\.");
	   System.out.println("Printing packa name: "+packName);
	   String Suitename = packName[packName.length-1];
	   System.out.println(Suitename);
	   
	 
	  //intl the excel file
	  xls=new ExcelAPI(envProp.getProperty(Suitename +"_excel"));
		//xls=new ExcelAPI(envProp.getProperty("SuiteA_excel"));
	  
	  //setter and getter for properties files.
	  ds=new DriverScript();
	  
		ds.setEnvProp(envProp);
		ds.setEnv(env);
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","E:\\SWS\\chrome\\chromedriver.exe");
		
	}
	
	@BeforeMethod
	public void initTest()
	{
	rep=ExtentManager.getInstance(env.getProperty("reportPath"));
	test=rep.createTest(testName);
	DriverScript.setRep(rep);
	DriverScript.setTest(test);
		
	}
	
	@AfterMethod
	public void quit()
	{
		if(ds!=null)
			ds.quit();
		if(rep!=null)
			rep.flush();
	}
	


	
}
