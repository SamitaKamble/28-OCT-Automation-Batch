package Parametarization;

import java.io.FileInputStream;
import java.util.Iterator;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data4 {

	public static void main(String[] args) throws IOException {
		
		
		//.Two ways to fetch Data
		String Path = "./TestData/Untitled spreadsheet (1).xlsx";
		String Path1 = "C:\\Users\\samit\\eclipse-workspace\\Automation1\\TestData\\Untitled spreadsheet (1).xlsx";
		
		
		FileInputStream file = new FileInputStream(Path1);
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet Sheet = work.getSheet("TestingData");
		
		int Rows = Sheet.getLastRowNum(); // It should return Integer
		System.out.println(Rows); //indexing 0-9
		
		int column =Sheet.getRow(1).getLastCellNum();
		//Can't print Column directly so we have to consider Row no. here = getRow(1)
		System.out.println(column);
		
		
		//Use For loop , First For loop for Row and another for column
		
		for (int R=0; R<=Rows ; R++) {//First for loop is for Row
			
		XSSFRow	row=Sheet.getRow(0); //Return type in "int rownum"
			
		for(int C=0; C<column; C++) { //Second for loop is for Column
			
			XSSFCell cell =row.getCell(C);
			
			switch (cell.getCellType()) { // CellType means Type = String, Numeric or Boolean
			
			case STRING :
				System.out.print(cell.getStringCellValue());
			    break;
			case NUMERIC :
				double D1 = cell.getNumericCellValue();
				int Test = (int) D1;
				System.out.print(Test);
				break;
			case BOOLEAN :
				System.out.print(cell.getBooleanCellValue());
				break;
				default:
					break;
			}
			System.out.print("||");
		}
		System.out.println();	
		}
		System.out.println("Hello");
	}

}
