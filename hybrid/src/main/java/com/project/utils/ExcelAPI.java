package com.project.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAPI {

	private static final String BLANK = null;
	public FileInputStream fis=null;
	public FileOutputStream fos=null;
	public XSSFWorkbook wb=null;
	public XSSFSheet sheet=null;
	public XSSFRow row=null;
	public XSSFCell cell=null;
	String filepath = null;
	
	public ExcelAPI(String filepath) throws IOException
	{
		System.out.println("Excel has initilized......");
		this.filepath=filepath;
		fis=new FileInputStream(filepath);
		wb=new XSSFWorkbook(fis);
		fis.close();
	}
	
	public int getRowCount(String sheetname )
	{
		sheet=wb.getSheet(sheetname);
		int rowCount=(sheet.getLastRowNum())+1;	
		return rowCount;	
	}
	
	public int getColumnCount(String sheetname )
	{
		sheet=wb.getSheet(sheetname);
		row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		return colCount;
	}
	
	//getStringValue by using col number
	public String getCellData(String sheetname ,int rowNum,int colNum)
	{
		try {
			sheet=wb.getSheet(sheetname);
			row=sheet.getRow(rowNum);
			cell=row.getCell(colNum);
			if(cell.getCellTypeEnum()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else if(cell.getCellTypeEnum()==CellType.NUMERIC||cell.getCellTypeEnum()==CellType.FORMULA)
			{
				String cellValue=String.valueOf(cell.getNumericCellValue());
				
				if(HSSFDateUtil.isCellDateFormatted(cell))
				{
					SimpleDateFormat dt=new SimpleDateFormat("dd/mm/yyyy");
					Date date=new Date();
					cellValue=dt.format(date);
				}
				return cellValue;
			}
			else if(cell.getCellTypeEnum()==CellType.BLANK)
			{
				System.out.println("...blank");
				return "";
			}
		
			else
			{
				return String.valueOf(cell.getBooleanCellValue());
			}
				
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "No matching value";
		}	
	}
	
	//getStringValue by using col name.
	public String getCellData(String sheetname ,int rowNum,String colName)
	{
		try {
			sheet=wb.getSheet(sheetname);
			row=sheet.getRow(0);
			int colNum=0;
			for(int i=0; i<row.getLastCellNum();i++)
			{
				if(row.getCell(i).getStringCellValue().equals(colName))
				{
					colNum=i;
				}
//				row=sheet.getRow(rowNum);//3
//				cell=row.getCell(colNum);//2		
			}
			row=sheet.getRow(rowNum);
			cell=row.getCell(colNum);
			
			if(cell.getCellTypeEnum()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else if(cell.getCellTypeEnum()==CellType.NUMERIC||cell.getCellTypeEnum()==CellType.FORMULA)
			{
				String cellValue=String.valueOf(cell.getCellTypeEnum());
				
				if(HSSFDateUtil.isCellDateFormatted(cell))
				{
					SimpleDateFormat dt=new SimpleDateFormat("dd/mm/yyyy");
					Date date=new Date();
					cellValue=dt.format(date);
				}
				return cellValue;
			}
			else if(cell.getCellTypeEnum()== CellType.BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "No matching value";
		}	
	}
	
	//write cell date by using column Num.
	public boolean setCellData(String sheetname ,int rowNum,int colNum,String value) throws IOException
	{
		try {
			sheet=wb.getSheet(sheetname);
			row=sheet.getRow(rowNum);
			cell=row.getCell(colNum);
			cell.setCellValue(value);
			fos=new  FileOutputStream(filepath);
			wb.write(fos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	//write cell date by using column Name.
		public boolean setCellData(String sheetname ,int rowNum,String colName ,String value) throws IOException
		{
			try {
				sheet=wb.getSheet(sheetname);
				row=sheet.getRow(0);
				int colNum=-1;
				for(int i=0;i<row.getLastCellNum();i++)
				{
					if(row.getCell(i).getStringCellValue().trim().equals(colName));
					colNum=i;
				}
				row=sheet.getRow(rowNum);
				cell=row.getCell(colNum);
				cell.setCellValue(value);
				fos=new  FileOutputStream(filepath);
				wb.write(fos);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			return true;
		}
		
}
