package com.google.test;

import org.testng.annotations.Test;

import com.google.pom.GooglePage;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public GooglePage gp;

	
	@Test
	public void atTest() {
		
		
		System.out.println("Test()");
		
		gp = new GooglePage(driver);
		
		driver.navigate().to("http://www.google.com/");
		
		wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		gp.searchBox.sendKeys("Calculator");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		
		gp.searchButton.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("BeforTest()");
		
		System.setProperty("webdriver.gecko.driver","/Users/reazurrahman/eclipse-workspace/SeleniumProject/driver/geckodriver");

		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String appTitle=driver.getTitle();

	}

	@AfterTest
	public void afterTest() {

		System.out.println("AfterTest()");
		
		if(driver!= null) {
			
			driver.quit();
		}
	}

}
