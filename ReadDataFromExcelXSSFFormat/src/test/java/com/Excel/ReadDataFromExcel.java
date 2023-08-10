package com.Excel;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	FileInputStream fs;

	public void readExcel() throws Exception {
		String path = "E:\\mrunumi\\Readdataxssf.xlsx";
		fs = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(fs);
		// which sheet I need to refer

		XSSFSheet sh = wb.getSheetAt(0);

		// Get Iterator to all the rows in the current sheet

		Iterator<Row> rowIterator = sh.rowIterator();

		// Traversing over each row of xlsx file

		while (rowIterator.hasNext()) {

			Row singleRow = rowIterator.next();

			// for each row iterate through each columns

			Iterator<Cell> cellIterator = singleRow.cellIterator();
			while (cellIterator.hasNext()) {

				Cell cellvalue = cellIterator.next();

				switch (cellvalue.getCellType()) {
				case STRING:
					System.out.print(cellvalue.getStringCellValue() + " \t");

					break;

				case BOOLEAN:
					System.out.print(cellvalue.getBooleanCellValue() + " \t");

					break;

				case NUMERIC:
					System.out.print(cellvalue.getNumericCellValue() + " \t");
					break;

				default:
					System.out.print(cellvalue.getStringCellValue() + " \t");
					break;
				}

			}
			
			System.out.println("\n");

		}
		
	}

}
