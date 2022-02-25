package com.utility.timer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.WiniumDriver;

import com.utility.logger.LoggerClass;

/**
 * 
 * This thread class is created for waiting in between code.
 * 
 * @author reazur.rahman
 *
 */

public class ThreadClass {

	private WebElement webElement;
	private LoggerClass log;
	private WiniumDriver winiumDriver;

	/**
	 * 
	 * 
	 * @param miliSecond
	 *            Milisecond to wait before executing the next line of code
	 */

	public void waitTime(int miliSecond) {

		log = new LoggerClass();
		try {
			Thread.sleep(miliSecond);
			log.info(ThreadClass.class.getName(), "Waited " + miliSecond + " mili second before continuing.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void waitMinute(int minute) {
		log = new LoggerClass();
		try {
			TimeUnit.MINUTES.sleep(minute);
			log.info(ThreadClass.class.getName(), "Waited " + minute + " minute before continuing.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * Explicit Wait by ID Presence of Element
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator Id
	 */
	public void explicitWaitsByIdPresenceOfElementLocated(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));

	}

	/**
	 * Explicit Wait by ID Element to be clickable
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator Id
	 */

	public void explicitWaitsByIdElementToBeClickable(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.id(locator)));

	}

	/**
	 * Explicit Wait by CSS Selector Presence of Element
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator CSS Selector
	 */
	public void explicitWaitsByCssSelectorPresenceOfElementLocated(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));

	}

	/**
	 * Explicit Wait by Class Name Presence of Element
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator Class Name
	 */

	public void explicitWaitsByClassNamePresenceOfElementLocated(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));

	}

	/**
	 * Explicit Wait by Name Presence of Element
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator Name
	 */
	public void explicitWaitsByNamePresenceOfElementLocated(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.name(locator)));

	}

	/**
	 * Explicit Wait by Link Text Presence of Element
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator Link Text
	 */
	public void explicitWaitsByPartialLinkTextPresenceOfElementLocated(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(locator)));

	}

	/**
	 * Explicit Wait by Tag name Presence of Element
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator Tag Name
	 */
	public void explicitWaitsByTagNamePresenceOfElementLocated(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.tagName(locator)));

	}

	/**
	 * Explicit Wait by XPath Selector Element to Clickable
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator XPath
	 */
	public void explicitWaitsByXpathElementToBeClickable(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));

	}

	/**
	 * Explicit Wait by XPath Presence of Element
	 * 
	 * @param driver
	 *            WebDriver
	 * @param locator
	 *            WebElement Locator XPath
	 */
	public void explicitWaitsByXpathPresenceOfElementLocated(WebDriver driver, String locator) {

		webElement = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

	}

	/**
	 * Implicit Wait method by Second
	 * 
	 * @param driver
	 *            WebDriver
	 * @param seconds
	 *            Seconds to wait
	 */
	public void implicitWaitBySecond(WebDriver driver, int seconds) {

		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	/**
	 * Implicit wait by MilliSeconds
	 * 
	 * @param driver
	 *            WebDriver
	 * @param milliSeconds
	 *            MilliSeconds to wait
	 */
	public void implicitWaitByMILLISECONDS(WebDriver driver, int milliSeconds) {

		driver.manage().timeouts().implicitlyWait(milliSeconds, TimeUnit.MILLISECONDS);
	}

	public void winiumClick(String elementName) {

		WebElement element = null;

		for (int i = 1; i <= 10; i++) {

			try {

				element = winiumDriver.findElementByName(elementName);

				
			} catch (Exception e) {

				waitTime(1000);
			}

		}
		for (int i = 1; i <= 10; i++) {

			Exception exc = null;

			try {

				if (element.isEnabled() == true) {

					element.click();
					break;
				}
			} catch (Exception e) {

				waitTime(1000);
				exc = e;
			}

		}

	}
	
	public void winiumClickByMinute(String elementName) {

		WebElement element = null;

		for (int i = 1; i <= 15; i++) {

			try {

				element = winiumDriver.findElementByName(elementName);

				
			} catch (Exception e) {

				waitMinute(1);
			}

		}
		for (int i = 1; i <= 15; i++) {

			Exception exc = null;

			try {

				if (element.isEnabled() == true) {

					element.click();
					break;
				}
			} catch (Exception e) {

				waitMinute(1);
				exc = e;
			}

		}

	}

}