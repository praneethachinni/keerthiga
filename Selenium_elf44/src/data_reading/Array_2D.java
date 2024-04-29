package data_reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Array_2D {//symmentric array

	public static void main(String[] args) throws FileNotFoundException,EncryptedDocumentException, IOException {
		File absPath = new File("./resources1/Array_2D.xlsx");
		FileInputStream fis = new FileInputStream(absPath);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		int rowCount = workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cellCount = workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		String[][] arr = new String[rowCount][cellCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				arr[i][j]=workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
		}
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				System.out.print(arr[i][j]);//=workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
			System.out.println();
		}

	}

}
