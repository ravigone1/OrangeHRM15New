package Day_007_DataProvider_LAB_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ReadingDataFromExcel1 {
	WebDriver driver;
	
  @Test
  public void Datadriven() throws Exception {
	  
	  
	  FileInputStream file = new FileInputStream("C://HTML Report//TC01_Exceldata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int Rowcount = sheet.getLastRowNum();   //returns the row count
		int Colmncount = sheet.getRow(0).getLastCellNum();  //returns column count
		
		for (int i =0;i<Rowcount;i++)
		{
			XSSFRow currentRow = sheet.getRow(i);  //focussed on current row
		
		
		for(int j =0;j<Colmncount;j++)
		{
			String Value = currentRow.getCell(j).toString(); //read the value frm cell
			
			System.out.print("  "  +Value);
		}
		System.out.println();
	  }
		
  }
}
