package com.project.driver;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.keywords.AppKeywords;
import com.project.utils.Constants;
import com.project.utils.ExcelAPI;

public class DriverScript {
	
	public static Properties env;
	public static Properties envProp;
	public AppKeywords app;
	public static ExtentReports rep;
	public static ExtentTest test;
	

	public static void setRep(ExtentReports rep) {
		DriverScript.rep = rep;
	}
	public static void setTest(ExtentTest test) {
		DriverScript.test = test;
	}

	public Properties getEnv() 
	{
		return env;
	}

	public void setEnv(Properties env) {
		this.env = env;
	}

	public Properties getEnvProp() {
		return envProp;
	}

	public  void setEnvProp(Properties envProp) {
		this.envProp = envProp;
	}
	
	public void quit()
	{
		if(app!=null)
			app.quit();
	}
	
	public void executeKeywords(String testName,ExcelAPI xls,Hashtable<String, String> testdata) throws Exception, Exception, InvocationTargetException
	{	
		app=new AppKeywords();
		
		app.setEnv(env);
		app.setEnvProp(envProp);
		app.setData(testdata);
		
		int rows=xls.getRowCount(Constants.KEYWORD_SHEET);
		System.out.println("Total rows: "+rows);
		
		//reading keywords,for that we want only the matching testcase only.
		
		for(int rNum=1; rNum<rows; rNum++)
		{
			String TCID = xls.getCellData(Constants.KEYWORD_SHEET, rNum, Constants.TCID_COL);
			if(TCID.equals(testName))
			{
				String keywordsKey = xls.getCellData(Constants.KEYWORD_SHEET, rNum, Constants.KEYWORD_COL);
				String objectKey = xls.getCellData(Constants.KEYWORD_SHEET, rNum, Constants.OBJECT_COL);
				String dataKey = xls.getCellData(Constants.KEYWORD_SHEET, rNum, Constants.DATA_COL);
				String data = testdata.get(dataKey);
				String ProceedOnFail=xls.getCellData(Constants.KEYWORD_SHEET, rNum, Constants.PROCEED_COL);
				
				app.setObjectkey(objectKey);
				app.setDatakey(dataKey);
				app.setRep(rep);
				app.setTest(test);
				app.setProceedOnFail(ProceedOnFail);
//				System.out.println(TCID+"........"+keywordsKey+"........."+env.getProperty(objectKey)+"....."+data);
				
				test.log(Status.INFO, TCID+"........"+keywordsKey+"........."+env.getProperty(objectKey)+"....."+data);
				//------------------------------------------------------------------------------------------------
				// Every time when we want to add a row in excel sheet then we need create a method 
				// for that particular row in GenericOrApp classes.And have call that method here in driverscript.
				// Every time adding elseif condition for calling new method is not a good practise.
				// To avoid this we have to use Reflection API classes in java.
				//------------------------------------------------------------------------------------------------
				
			    /*if(keywordsKey.equals("OpenBrowser"))
			    	app.openBrowser();
			    else if(keywordsKey.equals("navigate"))
			    	app.navigate();
			    else if(keywordsKey.equals("click"))
			    	app.click();
			    else if(keywordsKey.equals("type"))
			    	app.type();
			    else if(keywordsKey.equals("validateLogin"))
			    	app.validateLogin();
			    else if(keywordsKey.equals("validateTitle"))
			    	app.validateTitle();*/
			    
				//----ReflectionAPI code starts here------//
				
					Method method = app.getClass().getMethod(keywordsKey);
					method.invoke(app);
				
				
			
			}
			
			
		}
		app.assertAll();
	}

}
