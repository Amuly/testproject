package com.demo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.utailities.Basetest;

public class Loginpage{

		public static String emailtextbox="Email";
		public static String passwordtextbox="Password";
		
		public static String Loginbutton="//input[@value='Log in']";
		
		
		public static WebElement emailfieldwebelement(WebDriver d){
			return d.findElement(By.id(emailtextbox));
		}
					public static WebElement passwordfieldwebelement(WebDriver d){
				return d.findElement(By.id(passwordtextbox));
		

	}
					public static WebElement loginfieldwebelement(WebDriver d){
						return d.findElement(By.xpath(Loginbutton));
				

}
}