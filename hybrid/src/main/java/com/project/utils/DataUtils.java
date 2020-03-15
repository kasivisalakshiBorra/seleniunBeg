package com.project.utils;

import java.util.Hashtable;

import com.project.Baseclass.BaseTest;

public class DataUtils extends BaseTest{
	
	public static Object[][] getdata(ExcelAPI xls,String sheetname,String TestName) {

		System.out.println("Inside DataUTIl class");
		int testRowStartNum=0;
		while( !xls.getCellData(sheetname, testRowStartNum, 0).equals(TestName))
		{
			testRowStartNum++;	
		}
		System.out.println("Test starts from row: "+testRowStartNum);
		
		int colStartRowNum=testRowStartNum+1;
		int dataStartRowNum=testRowStartNum+2;
		
		//get row count
		int rows=0;
		while(!xls.getCellData(sheetname, dataStartRowNum+rows, 0).equals("B"))
		{
			rows++;
		}
		System.out.println("Total rows are: "+rows);
		
		//get col count
		int col=0;
		while(!xls.getCellData(sheetname, colStartRowNum, col).equals("B"))
		{
			col++;
		}
		System.out.println("Total cols are: "+col);
		
		//read the data.
		int dataRow=0;
		Object[][] data=new Object[rows][1];
		
		Hashtable<String , String> table=null;
		 
		for(int rNum=dataStartRowNum; rNum<dataStartRowNum+rows; rNum++)
		{
			table=new Hashtable<String, String>();
			  for(int colsNum=0; colsNum<col ;colsNum++)
			  {
				  String Key=xls.getCellData(sheetname, colStartRowNum, colsNum);
				  String Value=xls.getCellData(sheetname, rNum, colsNum);
				//  System.out.print("K: "+Key+" V: "+Value);
				
				
				  table.put(Key,Value);
				 
				 
			  }
			  System.out.println("Hi: "+table);
			  data[dataRow][0]=table;
			
			  dataRow++;
		}
		
		System.out.println("Hi");
		return data;
		// TODO Auto-generated method stub

	}
	
	public static Boolean isSkip(String testName,ExcelAPI xls)
	{
		System.out.println("skip");
		int rows=xls.getRowCount(Constants.TESTCASE_SHEET);
		for(int rNum=1;rNum<rows;rNum++)
		{
			String tcid = xls.getCellData(Constants.TESTCASE_SHEET,rNum , Constants.TCID_COL);
//			System.out.println(tcid);
//			System.out.println(testName);
			if(tcid.equals(testName))
			{
				String runMode=xls.getCellData(Constants.TESTCASE_SHEET, rNum, Constants.RUNMODE_COL);
				System.out.println(runMode);
				if(runMode.equals(Constants.RUNMODE_NO))
				{
					//System.out.println("N");
					return true;
				}
				else
				{
					//System.out.println("Y");
					return false;
				}
			}
		}
		
		return null;
		
		
	}

}
