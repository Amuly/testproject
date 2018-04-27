package com.demo.utailities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.helpers.Loader;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.log4testng.Logger;

public class Execlreader {
	
	
	
	static FileInputStream fis=null;
	static Readpropertyfile prop=new Readpropertyfile();
	Logger log=Logger.getLogger(Execlreader.class);
	
	
	
	
	public FileInputStream getfileinputSTream() throws IOException{
	String  filepath=prop.readpropertyFile("Filepath");
	File srcfile=new File(filepath);
	try{
		fis=new FileInputStream(srcfile);
	}
	catch(FileNotFoundException e){
		log.debug("test not found");
		
	}
	return fis;
	
	
	}
public ArrayList<String> getExcel(int colno) throws IOException{
	fis=getfileinputSTream();
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet("input");
	Iterator<Row> row=sh.iterator();
	ArrayList<String> ls=new ArrayList<>();
	while(row.hasNext()){
		ls.add(row.next().getCell(colno).getStringCellValue());
	}
	return ls;
	
	}
	
	
	
	
}
	
	
	
