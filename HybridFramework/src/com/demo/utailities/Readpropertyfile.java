package com.demo.utailities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfile {
	
	Properties prop=new Properties();
	String filepath="D:\\javac\\HybridFramework\\src\\com\\demo\\proporties\\config.proporties";
	
	
	public String readpropertyFile(String Key) throws IOException{
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		return prop.getProperty(Key);
	}


}
