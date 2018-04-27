package com.demo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.utailities.Basetest;

public class Books {

public static String BooksXpath="html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a";

public static String addtocardxpath="html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input";
public static String shoppingcardvaluexpath=".//*[@id='topcartlink']/a/span[1]";
public static String shoppingcardtextxpath=".//*[@id='topcartlink']/a/span[2]";

public static WebElement Booksxpath(WebDriver d){
	return d.findElement(By.xpath(BooksXpath));
}

public static WebElement addtocardxpath(WebDriver d){
	return d.findElement(By.xpath(addtocardxpath));

	}
	public static WebElement shoppingcardvaluexpath(WebDriver d){
		return d.findElement(By.xpath(shoppingcardvaluexpath));
	}

	public static WebElement shoppingcardtextxpath(WebDriver d){
		return d.findElement(By.xpath(shoppingcardtextxpath));
	}
}
