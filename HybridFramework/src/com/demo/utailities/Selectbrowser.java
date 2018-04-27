package com.demo.utailities;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.log4j.jmx.LoggerDynamicMBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selectbrowser {
			org.apache.log4j.Logger log=org.apache.log4j.Logger.getLogger("Browser selection");
			
	public WebDriver selectBrowser() throws IOException{
		Readpropertyfile rd=new Readpropertyfile();
		WebDriver d=null;
		
		String browser=rd.readpropertyFile("Browser");
//String browsername=prop.getProperty("browser");
		
		if(browser.equals("Firefox")){
			log.warn("Browser  is not mentiones in config files");	
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Public\\Desktop\\Mozilla Firefox.lnk");
			d=new FirefoxDriver();
		}
		
		
		
		
		
		
		
		
			/*	while(browser==null)
				{
				log.info("Browser  is not mentiones in config files");	
				}
		
				if(browser.equalsIgnoreCase("Firefox"))
				{
					d=new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase("chrome"));
				{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Desktop\\Mozilla Firefox.lnk");
				d=new ChromeDriver();
	}		
				
				
	*/
	
return d;	
}}