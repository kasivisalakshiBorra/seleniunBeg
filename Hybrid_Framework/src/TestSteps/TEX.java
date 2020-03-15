package TestSteps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import ReusableFunctionality.SeleniumFunction;
import SupportLibraries.Excel;
import SupportLibraries.Report;
import SupportLibraries.pro_1;
import SupportLibraries.pro_2;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import jxl.read.biff.BiffException;

public class TEX extends TestSteps {
	
  public static pro_1 obj = new pro_1(file.show());
  public static pro_1 fb = new pro_1(file.fb());

  

  public static void TestTemplate() 
  {
	try {
				SeleniumFunction.inputbyid(fb.ReadProperty("fbFirstname"), "Enter First name", Excel.Exceldata("FBTestData", "FirstName"));
				SeleniumFunction.clickbyid(obj.ReadProperty("login"), "Login", "Nil");
	}catch(Exception e){
		Report.fail("Error: "+e, "Nil", "Nil");
	}
  }
  
  public static void demoRegistration() 
  {
	  try{
		    SeleniumFunction.clickbyxpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]", "Clcik Register Button", "NIL");
 		    
		    SeleniumFunction.ScreenShot("Tour Registration Page");
		    
		    SeleniumFunction.inputbyname("firstName", "Enter User Name", "Senthil");
		    SeleniumFunction.inputbyname("lastName", "Enter User Name", "Kumar");
		    SeleniumFunction.inputbyname("phone", "Enter User Name", "0987654321");
		    SeleniumFunction.inputbyname("userName", "Enter Email ID", "Test@Test.com");
		    SeleniumFunction.inputbyname("address1", "Enter address 1", "HCL");
		    SeleniumFunction.inputbyname("address2", "Enter address 2", "Elcot OMR");
		    SeleniumFunction.inputbyname("city", "Enter city Name", "Chennai");
		    SeleniumFunction.inputbyname("state", "Enter state Name", "Tamil Nadu");
		    SeleniumFunction.inputbyname("postalCode", "Enter postalCode", "600096");
		    
		    SeleniumFunction.DropSelectbyName("country", "Select COuntry", "INDIA");
		    
		    
		    SeleniumFunction.inputbyname("email", "Enter UserName", "UserName");
		    SeleniumFunction.inputbyname("password", "Enter Password", "Password");
		    SeleniumFunction.inputbyname("confirmPassword", "Enter ConfirmPassword", "Password");
		    
		    SeleniumFunction.ScreenShot("Tour Registration Page-After enter all the details");
		    
		   /* SeleniumFunction.inputbyid(fb.ReadProperty("fbFirstname"), "Enter First name", Excel.Exceldata("FBTestData", "FirstName"));
		    SeleniumFunction.inputbyid(fb.ReadProperty("fbLastName"), "Enter Last Name", Excel.Exceldata("FBTestData", "LastName"));
		    SeleniumFunction.inputbyid(fb.ReadProperty("fbmailId"), "Enter Mail ID", Excel.Exceldata("FBTestData", "MailID"));
		    SeleniumFunction.inputbyid(fb.ReadProperty("fbReenterMailid"), "Enter Mail OID again", Excel.Exceldata("FBTestData", "ConfirmMailID"));
		    SeleniumFunction.inputbyid(fb.ReadProperty("fbnewPassword"), "Enter Confirm Password", Excel.Exceldata("FBTestData", "Password"));
		    
		  
		    SeleniumFunction.DropSelectbyID(fb.ReadProperty("fbDaySelectid"), "Drop down select day", Excel.Exceldata("FBTestData", "DD"));
		    SeleniumFunction.DropSelectbyID(fb.ReadProperty("fbMonthSelectid"), "Drop down select Month", Excel.Exceldata("FBTestData", "MM"));
		    SeleniumFunction.DropSelectbyID(fb.ReadProperty("fbYearSelectid"), "Drop down select year", Excel.Exceldata("FBTestData", "YYYY"));
		    
		    String Gender=Excel.Exceldata("FBTestData", "Gender");
		    if(Gender.equals("Male")){
		    SeleniumFunction.clickbyid(fb.ReadProperty("male"), "Click male option", "Nil");
		    }else{
		    SeleniumFunction.clickbyid(fb.ReadProperty("female"), "Click female option", "Nil");	
		    }
		    
		    SeleniumFunction.clickbyid(fb.ReadProperty("fbsignup"), "Click signup Button", "Nil");*/
	  }catch(Exception e){
		  Report.fail("Error: "+e, "Nil", "Nil");
}
	  
}					

  
  
}
