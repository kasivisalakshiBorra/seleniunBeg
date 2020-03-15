package com.project.keywords;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
//import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.driver.DriverScript;

public class GenericKeywords {
	
	//to avoid repetition keywords()type,click we use this class and methods.
	
	//###Here load the .properties file and load the objects and give to this keyword method###.
	public static Properties env;
	public static Properties envProp;
	public String Objectkey;
	public String datakey;
	public Hashtable<String, String> data;
	public WebDriver driver;//initiating the webdriver to pass all locater into this.
	public static String projectPath= System.getProperty("user.dir");
	public  ExtentTest test;
	public  ExtentReports rep;
	public SoftAssert softAssert=new SoftAssert();
	public String ProceedOnFail;
	public static  String screenshotPath;
	

	
	//--------------Setter and getters-------------
	public static void setEnv(Properties env) {
		GenericKeywords.env = env;
	}
	public static void setEnvProp(Properties envProp) {
		GenericKeywords.envProp = envProp;
	}
	public void setObjectkey(String objectkey) {
		Objectkey = objectkey;
	}
	public void setDatakey(String datakey) {
		this.datakey = datakey;
	}
	public void setData(Hashtable<String, String> data) {
		this.data = data;
	}

	public  void setTest(ExtentTest test) {
		this.test = test;
	}
	public void setRep(ExtentReports rep) {
		this.rep = rep;
	}

	public void setProceedOnFail(String ProceedOnFail) {
		this.ProceedOnFail = ProceedOnFail;
	}
	
	public static void setScreenshotPath(String screenshotPath) {
		GenericKeywords.screenshotPath = screenshotPath;
	}
	
	//---------------------------------------------

	public void openBrowser()
	{
		//initiating the wedriver
		String browser=data.get(datakey);
		
		System.out.println("Open Browser: "+browser);
		//test.log(Status.INFO, "Open Browser: "+browser);
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",projectPath +"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
					
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",projectPath +"\\drivers\\geckodriver.exe");
			//invoke profile
			//invoke options
			driver=new FirefoxDriver();
		}
		
		//set the implicit time
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Maximize the window
		driver.manage().window().maximize();
	
		
	}
	public void navigate()
	{
		System.out.println("Navigate URL: "+envProp.getProperty(Objectkey));
		driver.get(envProp.getProperty(Objectkey));
		test.log(Status.INFO, "Navigate URL: "+envProp.getProperty(Objectkey));
	}
	public void click()
	{
		System.out.println("Clicking on button: "+env.getProperty(Objectkey));
		//driver.findElement(By.xpath(env.getProperty(Objectkey))).click();
		getObject(Objectkey).click();
		test.log(Status.INFO, "Clicking on button: "+env.getProperty(Objectkey));
	}
	public void type()
	{
//		System.out.println("ObjecTypeKey: "+Objectkey);
//		System.out.println("check: "+data);
		System.out.println("Type the value: "+env.getProperty(Objectkey)+"--------->"+data.get(datakey));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath(env.getProperty(Objectkey))).sendKeys(data.get(Objectkey));
		
		getObject(Objectkey).sendKeys(data.get(datakey));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		test.log(Status.INFO, "\"Type the value: \"+env.getProperty(Objectkey)+\"--------->\"+data.get(datakey)");
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	//#################################    Utility functions     #########################################################################
	
	public WebElement getObject(String Objectkey )
	{
		WebElement element=null;
		
		try {
			if(Objectkey.endsWith("_id"))
			{
				element=driver.findElement(By.id(env.getProperty(Objectkey)));
			}
			else if(Objectkey.endsWith("_name"))
			{
				element=driver.findElement(By.name(env.getProperty(Objectkey)));
			}
			else if(Objectkey.endsWith("_xpath"))
			{
				element=driver.findElement(By.xpath(env.getProperty(Objectkey)));
			}
			else if(Objectkey.endsWith("_css"))
			{
				element=driver.findElement(By.cssSelector(env.getProperty(Objectkey)));
			}
			
			WebDriverWait wait=new WebDriverWait(driver, 30);
			//check visibility of Object
			wait.until(ExpectedConditions.visibilityOf(element));
			
			//checkstate of object--whether it is clickable or not
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
			
		} 
		catch (Exception e) {
			//Failure ---report that failure.
			reportFailure("Object not found:- "+Objectkey);
			e.printStackTrace();
		}
		return element;
	}
	

	
/*	public void validateTitle() {
		
		//System.out.println("Validating title: "+env.getProperty(Objectkey));
		String Actual=driver.getTitle();
		String expected="Home";
				//env.getProperty(Objectkey);
		
		
		if(!expected.equals(Actual))
			System.out.println("Title not matched ..here genrate a repoer");
		//report the failure
		reportFailure("Title didi not match got title as :- "+Actual);  
		System.out.println("expected: "+expected);
		System.out.println("Actual: "+Actual);
	}*/
	
	public boolean isElementPresentOrNot(String Objectkey) {
		
		List<WebElement> list=null;
		
		if(Objectkey.endsWith("_id"))
		{
			list = driver.findElements(By.id(env.getProperty(Objectkey)));
		}
		else if(Objectkey.endsWith("_name"))
		{
			list=driver.findElements(By.name(env.getProperty(Objectkey)));
		}
		
		else if(Objectkey.endsWith("_xpath"))
		{
			System.out.println(env.getProperty(Objectkey));
			list=driver.findElements(By.xpath(env.getProperty(Objectkey)));
		}
		else if(Objectkey.endsWith("_css"))
		{
			list=driver.findElements(By.cssSelector(env.getProperty(Objectkey)));
		}
		
		if(list.size()==0)
			
			return false;
		else
			return true;
		
	}
	public void validateElementPresentOrNot() 
	{	
		System.out.println("validateElementPresentOrNot..........");
		
		if(!isElementPresentOrNot(Objectkey))
		  //Report a failure----
		reportFailure("Element not found :- "+Objectkey);	
	}
	
	//----------------------------------------------------------------------------------------------------------------------------
	//---------------------------------Reporting Functions----------------------------------------------------------------------
	 
	public void reportFailure(String failureMessage)
	{
		//fail the test
		//take the screenshot and embedded the screenshot in physical location.
		System.out.println(failureMessage);
		test.log(Status.FAIL, failureMessage);
	    screenshot();//take the screenshot and embedded screenshot in extent reports.
		//Assert.fail(failureMessage);
		if(ProceedOnFail.equals("Y"))
		{
			//when failure is critical then use Asset class.
		//	Assert.fail(failureMessage);
			// if title validation failed then this softAssert is useful
			softAssert.fail(failureMessage);
		}
		else
		{
			//After title validation is sucess but some of the locaters value is incorrect still it will proceed further.
			softAssert.fail(failureMessage);
			softAssert.assertAll();
			
		}
		
	}
	
	//screenshot
	public void screenshot()
	{
		Date dt =new Date();
		String ScreenshotFileName=dt.toString().replace(":", "_").replace(" ", "_")+".png";
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dstfile=new File(env.getProperty("ScreenshotFilePath")+ScreenshotFileName);
		//screenshotPath
		File dstfile=new File(screenshotPath+ScreenshotFileName);
		System.out.println("Screenshot path : "+screenshotPath);
		try
		{
			org.openqa.selenium.io.FileHandler.copy(srcFile, dstfile);
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		//put screenshot file in extent reports
		try
		{
			test.log(Status.INFO, "Screenshort---->"+test.addScreenCaptureFromPath(env.getProperty("ScreenshotFilePath")+ScreenshotFileName));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to take screenShot");
		}
	}
	public void assertAll()
	{
		softAssert.assertAll();
	}
	
	public void quit()
	{
		if(driver!=null)
			driver.quit();
	}
}
