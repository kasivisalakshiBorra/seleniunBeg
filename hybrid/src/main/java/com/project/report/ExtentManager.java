package com.project.report;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.project.keywords.GenericKeywords;


public class ExtentManager {

	private static ExtentReports extent;
	public static  String path;
	public static ExtentReports getInstance(String reportPath)
	{
		if(extent==null)
		{
			Date dt=new Date();
			String fileName="report.html";
			  String folderName=dt.toString().replaceAll(":", "_").replaceAll(" ", "_");
			  
			  
			//directory of the report folder
			new File(reportPath+folderName+"\\screenshot").mkdirs();
			GenericKeywords.setScreenshotPath(reportPath+folderName+"\\screenshot"+"\\");
			//screenshotPath
			
			//System.out.println(reportPath+"//extent.html");
			
			//createInstance(reportPath+"//extent.html");
			reportPath=reportPath+folderName+"\\";
			System.out.println(reportPath);
			createInstance(reportPath+fileName);
		}
		return extent;		
	}
	public static ExtentReports createInstance(String filename)
	{
	  ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(filename);
	  htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	  htmlReporter.config().setChartVisibilityOnOpen(true);
	  htmlReporter.config().setTheme(Theme.DARK);
	  htmlReporter.config().setDocumentTitle("Reports");
	  htmlReporter.config().setEncoding("utf-8");
	  htmlReporter.config().setReportName("Repots-Automation Testing");
	  extent=new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  
	return extent;
	}
}







