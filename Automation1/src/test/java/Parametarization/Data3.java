package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//to fetch // String Password
		
		String Path = "C:\\Users\\samit\\eclipse-workspace\\Automation1\\Test12.xlsx";
		FileInputStream F1 = new FileInputStream(Path); // Nahi solve horai to IOException bhi dal sakte hai main method ,me.
         // yaha tak humne file ka path diya hai
		
		String Data=WorkbookFactory.create(F1).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		//To open the file in backend , we have to use create method which we have to use in WorkbookFactory Interface 
        // file store hai F1 variable me,file k andar
		//enter karne k liye method .getSheet(Path), getRow(1)RowDatafetch,.getCell(1)ColumnDatafetch,
		// for fetching password have to use getStringCellValue
		
		System.out.println(Data);
		//Data Print karna hai 
		
		//2 type \\ Boolean Result
		String Path1 = "C:\\Users\\samit\\eclipse-workspace\\Automation1\\Test12.xlsx";
		FileInputStream F2 = new FileInputStream(Path1);
		boolean Data1=WorkbookFactory.create(F2).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
		System.out.println(Data1);
		
		////2 type \\ Boolean Result
		//String Path2 = "C:\\Users\\samit\\eclipse-workspace\\Automation1\\Test12.xlsx";
		//FileInputStream F3 = new FileInputStream(Path2);
		//boolean Data2=WorkbookFactory.create(F3).getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
		//
		//System.out.println(Data2);
		
		//3 Or ek another way to fetch Data Username
		
		String Path3 = "C:\\Users\\samit\\eclipse-workspace\\Automation1\\Test12.xlsx";
		FileInputStream F4 = new FileInputStream(Path3);
		XSSFWorkbook work = new XSSFWorkbook(F4);//to create object, its like create method in type1// XSSFWorkbook is a constructor
		String t1=work.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(t1);
		
	}

}
