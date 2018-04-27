package com.demo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.demo.utailities.Basetest;

public class Homepage {

	//	public static String Loginlink="Log in";
		//public static String Loginlink="html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a";
		//a[@class='ico-login']
	
	public static String Loginlink="//a[@class='ico-login']";
	//
		/* static By Loginlink=By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
		
		
		
		public static WebElement loginLinkwebelement(WebDriver d){
			return d.findElement(Loginlink);
		*/	
			
		
		public static WebElement loginLinkwebelement(WebDriver d){
			return d.findElement(By.xpath(Loginlink));
			
			
			

}


}

		

	


