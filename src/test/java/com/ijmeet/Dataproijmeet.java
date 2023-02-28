package com.ijmeet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dataproijmeet {
public String datapro() throws EncryptedDocumentException, IOException {
	FileInputStream excel= new FileInputStream("C://Users/Cchiparikar/Desktop/abc.xlsx");
	Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
		
			String b="";
			String b1="";
			for(int rowno=0; rowno<a.getLastRowNum();rowno++) {
				b=a.getRow(rowno).getCell(0).getStringCellValue();
				b1=a.getRow(rowno).getCell(1).getStringCellValue();
				
			}
			return b;
}
}
