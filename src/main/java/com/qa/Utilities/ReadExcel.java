package com.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qa.testBase.TestBase;

public class ReadExcel extends TestBase {
	
	
	private String path = "D:\\TestData.xlsx";
	
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public String readData (String sheet_name,int row_num,int cell_num)
	{
		try {
		
			file = new File (path);
		    fis = new FileInputStream(file);
	        wb = new XSSFWorkbook(fis);
	        sheet = wb.getSheet(sheet_name);
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(sheet.getRow(row_num).getCell(cell_num));
		
		return data ;
		
	}

}
