package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class Dataset {
	
	public static String ExcelData(WebDriver driver, String name,int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream input=new FileInputStream("C:\\Users\\ChetanK\\eclipse-workspace\\Amazon\\src\\test\\resources\\DataSet.xlsx");
		String value=WorkbookFactory.create(input).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}

}
