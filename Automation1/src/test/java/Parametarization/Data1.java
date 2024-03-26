package Parametarization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		//To fetch string type data from excelsheet
		
		String Path = "C:\\Users\\samit\\eclipse-workspace\\Automation1\\TestData\\28th_Oct_Test.xlsx";
		FileInputStream file = new FileInputStream(Path);
       String Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
       
       System.out.println(Data);
       
  //2     
       
       FileInputStream file1 = new FileInputStream(Path);
       String Data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
       
       System.out.println(Data1);
       
       //3
       FileInputStream file2 = new FileInputStream(Path);
       String Data2 = WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
       
       System.out.println(Data2);
       
     //3
       FileInputStream file3 = new FileInputStream(Path);
       String Data3 = WorkbookFactory.create(file3).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
       
       System.out.println(Data3);
	}

}
