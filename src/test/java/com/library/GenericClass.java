package com.library;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericClass {

	static String sdirpath=System.getProperty("user.dir");
	static String ConfigProp=sdirpath+"\\Config.Properties";
	static String excelfile=sdirpath+"\\Framework.xlsx";
	
public static String getproperties(String skey){
		
		String svalue=null;
		Properties properties=new Properties();
		try{
		
		FileInputStream file=new FileInputStream(ConfigProp);
		properties.load(file);
		svalue=properties.getProperty(skey);
		}catch(Exception e){
			
		}
		return svalue;
	}

//handle the select class with index

	public static void selecybyindex(WebElement element,int index){
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	//handle the select class with value
	public static void selectbyvalue(WebElement element,String value){
		Select select=new Select(element);
		select.selectByValue(value);
	}
	//handle the select class with text
	public static void selectbytext(WebElement element,String text){
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	//handle the action class
	public static void Actions(WebElement element){
		Actions action=new Actions(BaseClass.driver);
		action.moveToElement(element).perform();
	}

	//handle the doubleClick class in actions
	public static void doubleclick(WebElement element) {
		Actions action=new Actions(BaseClass.driver);
		action.doubleClick(element).perform();		
	}
	
	//handle the rightClick class in Actions
	public static void rightclick(WebElement element) {
		Actions action=new Actions(BaseClass.driver);
		action.contextClick(element).perform();		
	
	}
	
	//to handle the Data from Excel sheet
	public static String getExcelData(String sheetname, int row, int col) {
		
		String sData=null;
		try
		{
		FileInputStream file=new FileInputStream(excelfile);
		Workbook wb=(Workbook)WorkbookFactory.create(file);
		Sheet sh= wb.getSheet(sheetname);
		sData=sh.getRow(row).getCell(col).getStringCellValue();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
				
		
		return sData;
		
			
	}
	
}

