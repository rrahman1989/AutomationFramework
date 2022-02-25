package com.google.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	
	public WebDriver driver;
	
	public GooglePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "q")
	public WebElement searchBox;
	
	@FindBy(name = "btnK")
	public WebElement searchButton;
	


}
