package com.project.SuiteA;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.project.Baseclass.BaseTest;
import com.project.driver.DriverScript;
import com.project.utils.Constants;
import com.project.utils.DataUtils;
import com.project.utils.ExcelAPI;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class LoginTest extends BaseTest {
  
	
@Test(dataProvider = "getdataP")
 public void LoginTest(Hashtable<String , String> data) throws InvocationTargetException, Exception		 
 {
	System.out.println("I am in logintest");
	if(DataUtils.isSkip(testName, xls) || data.get(Constants.RUNMODE_COL).equals(Constants.RUNMODE_NO))
		throw new SkipException("Runmode is N");
	
		test.log(Status.INFO, "Starting Logintest");
		test.log(Status.INFO, data.toString());
		test.log(Status.INFO, "Executing keywords");
		test.log(Status.PASS, "Test Passed");
	
	 ds=new DriverScript();
	 ds.executeKeywords(testName, xls, data);	
	
 }

  @DataProvider
  public Object[][] getdataP() throws IOException 
  {
  System.out.println("i am in dataprovider");
  
  //  Object[][] data=new Object[1][1];
  //  data[0][0]="visala";
  //  return data;
  
  String sheet_name= "Data" ;
  System.out.println("Testname: "+testName);
    return DataUtils.getdata(xls, sheet_name, testName);
    
    
 }
}
