package utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\testData\\testData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
//		XSSFSheet mySheet = workbook.getSheet("sample");
		XSSFSheet mySheet = workbook.getSheetAt(0);
		
		
		
		int rowCount = mySheet.getLastRowNum();
		int columnCount = mySheet.getRow(0).getLastCellNum();
		
		
		System.out.println("RowCount: " + rowCount);
		System.out.println("columnCount: " + columnCount);
		
		
		
		//fetch specific data from sheet
		
//		 String name = mySheet.getRow(3).getCell(0).toString();
//		 String phone = mySheet.getRow(3).getCell(2).toString();
//		 
//		 System.out.println("name and phone details are: " + name + " : " +phone);

		
		
		for (int i = 1; i <= rowCount; i++) {
			
			String name = mySheet.getRow(i).getCell(0).toString();
			String addresss = mySheet.getRow(i).getCell(1).toString();
			String phone = mySheet.getRow(i).getCell(2).toString();
			System.out.println("name and phone details are: " + name + " : " +addresss+ " : " +phone);
			System.out.println("----------------------------------------------------------------");
		}
		
		

	}

}
