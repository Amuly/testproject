package com.demo.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.demo.pageobjects.Books;
import com.demo.pageobjects.Homepage;
import com.demo.pageobjects.Loginpage;
import com.demo.utailities.Basetest;
import com.demo.utailities.Execlreader;

public class Bookstest extends Basetest {
	@Test(priority=1)

	public void loginTest() throws IOException{
	Execlreader e=new Execlreader();
	e.getfileinputSTream();
	ArrayList<String> uname=e.getExcel(0);
			ArrayList<String> pword=e.getExcel(1);
			System.out.println(uname);
			System.out.println(pword);
			
			for(int i=0;i<uname.size();i++)
			{
				Homepage.loginLinkwebelement(d).click();
				Loginpage.emailfieldwebelement(d).sendKeys(uname.get(i));
				Loginpage.passwordfieldwebelement(d).sendKeys(pword.get(i));
				Loginpage.loginfieldwebelement(d).click();
				System.out.println(d.getTitle());
			}
	}
	@Test(priority=2)
	public void NavigateBooks(){
		Books.Booksxpath(d).click();
		Books.addtocardxpath(d).click();
		Books.shoppingcardtextxpath(d).click();
		Books.shoppingcardvaluexpath(d).click();
		
	}
			
					
}
