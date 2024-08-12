package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Driver.DriverManager;


public class ActionsUtils{

	static Actions builder = new Actions(DriverManager.getDriver());
	static Robot keyAction;
	
	public static void typeText(WebElement element, String string) {
	    builder.moveToElement(element).click().sendKeys(element, string).perform();
	}
	
	public static void typeTextWithInterval(WebElement element, String string) {
        for (char ch : string.toCharArray()) {
            builder.moveToElement(element)
                   .click()
                   .sendKeys(String.valueOf(ch))
                   .pause(80)
                   .build()
                   .perform();
        }
    }
	
	public static void moveToElementAndClick(WebElement element) {
		builder.moveToElement(element).click().build().perform();
	}
	
	public static void pressEnterKey() throws AWTException {
		keyAction = new Robot();
		keyAction.keyPress(KeyEvent.VK_ENTER);
		keyAction.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void pressEnterKey(WebElement element) {
		builder.click(element).sendKeys(Keys.ENTER).build().perform();
	}
	
	public static void pressEnter() {
		builder.sendKeys(Keys.ENTER).build().perform();
	}
	
	public static void pressDownArrow() {
		builder.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	
	public static void doubleClickElement(WebElement element) {
		builder.doubleClick(element).build().perform();
    }
}
