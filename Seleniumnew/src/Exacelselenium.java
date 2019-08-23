import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exacelselenium {
	public static void main(String[] args ) throws Exception{
		FileInputStream exl =new FileInputStream("/D:\\java\\Seleniumnew\\excellfile\\sheet1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(exl);
		XSSFSheet sheet=workbook.getSheet("test");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating cell Data"+sheet.getRow(2).getCell(1));
		XSSFCell cell=sheet.getRow(2).getCell(1);
		/*cell.setCellValue("Test123");
		exl.close();*/
		
		
		
		 
	}
		
	}


