package com.qa.readdata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream(new File("datadriventest1.xlsx"));
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	int row_count=sheet.getLastRowNum();
	System.out.println("Total No of Rows present in the sheet :"+row_count);
	for(int i=1;i<=row_count;i++)
	{
		for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
		{
		System.out.print(sheet.getRow(i).getCell(j)+"   ");
		}
		System.out.println();
	}
	wb.close();
}
}
