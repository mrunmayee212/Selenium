package com.Excel;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataFromExcel {

	FileInputStream fs;

	public void readExcel() throws Exception {
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		// which sheet I need to refer

		HSSFSheet sh = wb.getSheet("OrangeHRM");

		int totalRows = sh.getLastRowNum();
		// Find Out Total Number of Rows

		System.out.println("Count of All Rows : " + totalRows);
		for (int i = 0; i < totalRows; i++) {
			HSSFRow singleRowElement = sh.getRow(i);
			// Giving me Single Row
			int totalColumns = singleRowElement.getLastCellNum();

			// System.out.println("Count of all columns : " + totalColumns);
			for (int j = 0; j < totalColumns; j++) {
				// To Return Single column

				HSSFCell ce = singleRowElement.getCell(j);

				if (ce != null) {
					String str = ce.getStringCellValue();

					System.out.print(str + "\t");

				}

			}
			System.out.println(" ");

		}
		wb.close();
	}

}
