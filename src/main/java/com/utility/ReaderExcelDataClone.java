package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaderExcelDataClone {
	
	
	public static Object driver;

	private static void getParticularCell() throws InvalidFormatException, IOException {
		
		File file = new File("C:\\Users\\AKASH\\3D Objects\\Downloads\\Book1.xlsx");
		Workbook book= new XSSFWorkbook(file);
		Sheet sheet =book.getSheetAt(0);
    	Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		
	    //	DataFormatter class its help form the each cell in to String
		DataFormatter dataFormatt = new DataFormatter();
		String data = dataFormatt.formatCellValue(cell);
		System.out.println(data);
		
		
		String Data= cell.getStringCellValue();
		System.out.println(Data);
	
		
		//double numData=cell.getNumericCellValue();
		//System.out.println(numData);
	}
	
	
	private static void getParticularRowMultipleCell() throws InvalidFormatException, IOException {
		
		File file = new File("C:\\Users\\AKASH\\3D Objects\\Downloads\\Book1.xlsx");
		Workbook book= new XSSFWorkbook(file);
		Sheet sheet =book.getSheet("Sheet");
		
		int noofrows =sheet.getLastRowNum();
		System.out.println("NO OF ROWS"+noofrows);
		
		
	    short noofcells =sheet.getRow(1).getLastCellNum();
		System.out.println("NO OF CELLS"+noofcells);
		
		Row row = sheet.getRow(1);
		for(int i=0;i<noofrows;i++) {  //cells
			
			Cell cell = row.getCell(i);
			DataFormatter dataFormatt = new DataFormatter();
			String data = dataFormatt.formatCellValue(cell);
			System.out.println(data);
			
		}
		}
	
	
		
	private static void getAllData() throws InvalidFormatException, IOException {
	File file = new File("C:\\Users\\AKASH\\3D Objects\\Downloads\\Book1.xlsx");
	
	Workbook book= new XSSFWorkbook(file);
	Sheet sheet =book.getSheet("Sheet");
	
	
	int noofrows =sheet.getLastRowNum();
	System.out.println("NO OF ROWS"+noofrows);
	
	short noofcells =sheet.getRow(0).getLastCellNum();
	System.out.println("NO OF CELLS"+noofcells);
	
	for(int i=1; i<= noofrows;i++) { //rows
		//1<3---> true 
	Row row = sheet.getRow(i);
	    //0<4---> true
	for(int j=0;j<noofcells;j++) {  //cells
		
		Cell cell = row.getCell(j);
		
		DataFormatter dataFormatt = new DataFormatter();
		String data = dataFormatt.formatCellValue(cell);
		System.out.println(data);
	}
	}
	}
	public static void main(String[] args) throws InvalidFormatException, IOException {
		getParticularCell();
		getParticularRowMultipleCell();
		getAllData();
	}
	
	}

