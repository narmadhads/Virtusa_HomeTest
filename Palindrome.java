package com.hometest;

import org.openqa.selenium.WebDriver;

import com.pom.com.PomPalindrome;
import com.testBaseClass.com.BaseClass;

public class Palindrome extends BaseClass{
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver=browserLaunch("chrome");
		gets("https://xndev.com/palindrome");	
		implicitWait(10);
		PomPalindrome p=new PomPalindrome(driver);	
		implicitWait(10);
		enterValues(p.getWord(),"151");
		clickOnElement(p.getButton());
		implicitWait(15);
		enterValues(p.getContent(), "141");
		clickOnElement(p.getButton2());
		screenshot("C:\\Users\\Sony\\eclipse-workspace\\Selenium_MiniProject\\SS\\ValidIntpalind.png");
		
		implicitWait(10);
		p.getWord().clear();
		enterValues(p.getWord(),"madam");
		clickOnElement(p.getButton());
		implicitWait(15);
		p.getContent().clear();
		enterValues(p.getContent(), "anagram");
		clickOnElement(p.getButton2());
		jsScroll();
		screenshot("C:\\Users\\Sony\\eclipse-workspace\\Selenium_MiniProject\\SS\\ValidStrpalind.png");
	
		p.getWord().clear();
		enterValues(p.getWord(),"123@madam");
		clickOnElement(p.getButton());
		implicitWait(15);
		p.getContent().clear();
		enterValues(p.getContent(), "145@anagram");
		clickOnElement(p.getButton2());
		jsScroll();
		screenshot("C:\\Users\\Sony\\eclipse-workspace\\Selenium_MiniProject\\SS\\InValidStrpalind.png");
		
		implicitWait(10);
		p.getWord().clear();
		enterValues(p.getWord(),"Madam");
		clickOnElement(p.getButton());
		implicitWait(15);
		p.getContent().clear();
		enterValues(p.getContent(), "Anagram");
		clickOnElement(p.getButton2());
		jsScroll();
		screenshot("C:\\Users\\Sony\\eclipse-workspace\\Selenium_MiniProject\\SS\\ValidCasepalind.png");
		
		p.getWord().clear();
		enterValues(p.getWord(),"        ");
		clickOnElement(p.getButton());
		implicitWait(15);
		p.getContent().clear();
		enterValues(p.getContent(), "       ");
		clickOnElement(p.getButton2());
		jsScroll();
		screenshot("C:\\Users\\Sony\\eclipse-workspace\\Selenium_MiniProject\\SS\\InValidSpacepalind.png");
		
		
	}
	
}
