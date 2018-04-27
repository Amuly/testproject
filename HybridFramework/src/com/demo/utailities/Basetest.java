package com.demo.utailities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class Basetest {
	
	Selectbrowser sel=new Selectbrowser();
	Readpropertyfile rp=new Readpropertyfile();
	
	
	protected WebDriver d=null;
	
	//@BeforeClass
	
	@BeforeTest
	public void launchbrowser() throws IOException{
		
		
		
		
		
		
		
		
		
		
		String url=rp.readpropertyFile("URL");
		d=sel.selectBrowser();
		d.get(url);

		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.manage().window().maximize();
		
		
		
	}
/*@AfterClass
public void closeBrowser(){
	d.close();*/
//}

}
