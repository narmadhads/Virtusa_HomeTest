package com.hometest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPalindrome {
	public static WebDriver driver;

	@FindBy(xpath="//input[@id='originalWord']")
	private WebElement word;
	
	@FindBy(xpath="//input[@id='button1']")
	private WebElement button;
	
	@FindBy(xpath="//input[@id='anagramWord']")
	private WebElement content;
	
	@FindBy(xpath="//input[@id='button2']")
	private WebElement button2;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWord() {
		return word;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getContent() {
		return content;
	}

	public WebElement getButton2() {
		return button2;
	}

	public PomPalindrome(WebDriver driver2) {
		PomPalindrome.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
}
