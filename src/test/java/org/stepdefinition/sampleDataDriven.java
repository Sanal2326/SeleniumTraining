package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;

public class sampleDataDriven extends BaseClass {
	public static void main(String[] args) throws IOException {
		createNewExcelFile(0, 0, "Sample.xlsx");
		createCell(0, 1, "selenium");
		createCell(0, 2, "java");
		createCell(0, 3, "datadriven");
		createCell(0, 4, "pom");
		
	}
	

}