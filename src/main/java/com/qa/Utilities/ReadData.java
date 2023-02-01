package com.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qa.testBase.TestBase;



public class ReadData extends TestBase{

	String path = "D:\\TestData.xlsx";
	
	File file;
	FileInputStream fis;
	XSSFWorkbook wb ;
	XSSFSheet sheet;
	
	public String readData (int sheet_index,int rownum,int cellnum)
	{
		try {
			
			file = new File (path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheet_index);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		String data;
		
		try
		{
			data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		}
		catch(java.lang.IllegalStateException e)
		{
			double numericdata = sheet.getRow(rownum).getCell(cellnum).getNumericCellValue();
			int nint = (int)numericdata;
			data = Integer.toString(nint);
		}
		
		return data;
		
	}
	
	public int getRowCount (int sheet_index)
	{
		try {
			
			file = new File (path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheet_index);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		int row_count = sheet.getLastRowNum();
		return row_count;
		
	}
		
	public int getCellCount (int sheet_index,int r)
	{
		try {
			
			file = new File (path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheet_index);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		int Cell_count = sheet.getRow(r).getLastCellNum();
		return Cell_count;
		
	}
	
	public void writeData (int sheet_index,int rownum,int cellnum,String status)
	{
		try {
			
			file = new File (path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheetAt(sheet_index);
			sheet.getRow(rownum).createCell(cellnum).setCellValue(status);
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			wb.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	
	
}
