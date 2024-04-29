package data_reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File abstractPath = new File("./resources/data.xlsx");
		FileInputStream fis = new FileInputStream(abstractPath);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String data1 = workbook.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		boolean data2 = workbook.getSheet("sheet2").getRow(16).getCell(5).getBooleanCellValue();
		LocalDateTime data3 = workbook.getSheet("sheet3").getRow(8).getCell(10).getLocalDateTimeCellValue();
		Date normalDate = workbook.getSheet("sheet3").getRow(8).getCell(10).getDateCellValue();
		double data4 = workbook.getSheet("sheet4").getRow(9).getCell(14).getNumericCellValue();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(normalDate);
		System.out.println(data4);
	}

}
