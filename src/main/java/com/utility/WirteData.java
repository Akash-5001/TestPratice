package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WirteData {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\AKASH\\3D Objects\\Downloads\\Book1.xlsx");
		FileInputStream fileInput = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fileInput);
		
		book.getSheet("Student1").createRow(0).createCell(0).setCellValue("akash");
		book.getSheet("Student1").createRow(0).createCell(1).setCellValue("akash");
		
		FileOutputStream fileOutput = new FileOutputStream(file);
		book.write(fileOutput);
		book.close();
		System.out.println("--Sucess--");
	}

}
