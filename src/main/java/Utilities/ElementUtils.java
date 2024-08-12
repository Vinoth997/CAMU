package Utilities;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Driver.DriverManager;


public class ElementUtils {
	
	private static final Logger LOGGER = LogManager.getLogger(ElementUtils.class);

	private static ElementUtils elementUtilsInstance = null;

	private ElementUtils() {

	}

	public static ElementUtils getInstance() {
		if (elementUtilsInstance == null) {
			elementUtilsInstance = new ElementUtils();
		}
		return elementUtilsInstance;
	}

	public static void scrollAndClickOnElement(List<WebElement> elements, String option) {
		boolean elementFound = false;
		while (!elementFound) {
			for (int i = 0; i < elements.size(); i++) {
				String elementText = elements.get(i).getText();
				String alteredText = StringUtils.trim(StringUtils.replaceAllBy(elementText, "\n", " "));
				if (alteredText.equals(option)) {
					Waiters.waitForElementToBeClickable(elements.get(i));
					elements.get(i).click();
					elementFound = true;
					break;
				}
			}

			if (!elementFound) {
				((JavascriptExecutor) DriverManager.getDriver()).executeScript("window.scrollBy(0, 200);");
			}
		}
	}

	public static void selectDropDownOption(WebElement dropDown, List<WebElement> dropDownOption, String option) {
		Waiters.waitForElementToBeVisible(dropDown);
		dropDown.click();
		Waiters.waitForListOfElementsToBeVisible(dropDownOption);
		for (int i = 0; i < dropDownOption.size(); i++) {
			String elementText = dropDownOption.get(i).getText();
			if (elementText.equals(option)) {
				Waiters.waitForElementToBeClickable(dropDownOption.get(i));
				dropDownOption.get(i).click();
			}
		}
	}

	public static void selectFromList(List<WebElement> optionList, String option) {
		Waiters.waitForListOfElementsToBeVisible(optionList);
		for (int i = 0; i < optionList.size(); i++) {
			String elementText = optionList.get(i).getText();
			String alteredText = StringUtils.trim(StringUtils.replaceAllBy(elementText, "\n", " "));
//			System.out.println(alteredText);
			if (alteredText.equals(option)) {
				Waiters.waitForElementToBeClickable(optionList.get(i));
				optionList.get(i).click();
			}
		}
	}
	
	public static void clickOnOptionFromList(List<WebElement> optionList, String option) {
		Waiters.waitForListOfElementsToBeVisible(optionList);
		for (int i = 0; i < optionList.size(); i++) {
			String elementText = optionList.get(i).getText();
//			System.out.println(elementText);
			if (elementText.equals(option)) {
				Waiters.waitForElementToBeClickable(optionList.get(i));
				optionList.get(i).click();
				break;
			}
		}
	}
	
	public static void clickOnOptionContainsFromList(List<WebElement> optionList, String option) {
		Waiters.waitForListOfElementsToBeVisible(optionList);
		for (int i = 0; i < optionList.size(); i++) {
			String elementText = optionList.get(i).getText();
			if (elementText.contains(option)) {
				Waiters.waitForElementToBeClickable(optionList.get(i));
				optionList.get(i).click();
				break;
			}
		}
	}

	public static void highLightElement(WebElement element) {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].setAttribute('style','border: 3px solid blue');", element);
	}
	 

	public static void setValueWithJavaScript(WebElement element, String value) {
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].value = arguments[1];", element, value);
	}

	public static void selectFromDropDown(WebElement dropdown, String howTo, String value) {
		Select select = new Select(dropdown);
		switch (howTo) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "text":
			select.selectByVisibleText(value);
			break;
		default:
			LOGGER.info("No Match Found");
		}
	}

	public String getListofTextFromElement(List<WebElement> options) {
        String optionsText = null;
        String text = "";
        for (int i = 0; i < options.size(); i++) {
            optionsText = options.get(i).getText();
            text = text+"\n"+optionsText;
        }
        return text;
    }
	
	public static void forceClickWithJs(WebElement element) {
		((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	public static String getAttributeValueForElement(WebElement element, String attributeName) {
		return element.getAttribute(attributeName);
	}
	
	public static void clearAndEnterText(WebElement element, String text) {
		Waiters.waitForElementToBeVisible(element);
		element.clear();
		element.sendKeys(text);
	}
	
	public static String getInputValue (WebElement element) {
        return (String) ((JavascriptExecutor) DriverManager.getDriver()).executeScript("return arguments[0].value;", element);
    }
	
	public static WebElement findElementInShadowDom(WebElement shadowHost, String shadowElement) {
	    WebElement shadowRoot = (WebElement) ((JavascriptExecutor) DriverManager.getDriver()).executeScript("return arguments[0].shadowRoot", shadowHost);
	    return shadowRoot.findElement(By.cssSelector(shadowElement));
	}
	
	public static boolean isClickable(WebElement element) {
        try {
            return element.isDisplayed() && element.isEnabled();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
    }
	
	public static void scrollToElement(WebElement element, String direction) {
	    try {
	        element.click(); // Attempt to click the element
	    } catch (ElementClickInterceptedException e) {
	        int scrollDistance = (direction.equalsIgnoreCase("up")) ? -200 : 200;
	        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	        do {
	            js.executeScript("window.scrollBy(0, " + scrollDistance + ");");
	            try {
	                Thread.sleep(1000); // Wait for the scroll to take effect
	            } catch (InterruptedException ex) {
	                ex.printStackTrace();
	            }
	        } while (!isClickable(element)); // Keep scrolling until the element becomes clickable
	    }
	}
	
	public static boolean isDisabled(WebElement element) {
        try {
            return !element.isEnabled();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
    }
	
	public static boolean isNotDisplayedAndDisabled(WebElement element) {
		try {
			return !element.isDisplayed() && !element.isEnabled();
		} catch (NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
	}
	
	public static void scrollUpToTopOfThePage() {
        ((JavascriptExecutor) DriverManager.getDriver()) .executeScript("window.scrollTo(0, 0);");
	}
	
	public static void scrollDownToBottomOfThePage() {
	    ((JavascriptExecutor) DriverManager.getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    Waiters.waitForTimeout(2000);
	}
	
	public static void scrollToElement(WebElement element) {
	    JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
	    jsExecutor.executeScript("window.scrollTo(0, arguments[0].getBoundingClientRect().top);", element);
	}
	
	public static boolean isPresentAndDisplayed(WebElement element) {
		  try {
		    return element.isDisplayed();
		  } catch (NoSuchElementException | StaleElementReferenceException e) {
		    return false;
		  }
	}
	
	public static WebElement getShadowDOMElement(WebElement hostElement, String shadowElementSelector) {
        WebElement shadowRoot = (WebElement) ((JavascriptExecutor) DriverManager.getDriver())
                .executeScript("return arguments[0].shadowRoot", hostElement);
        return shadowRoot.findElement(By.cssSelector(shadowElementSelector));
    }
	
	public static void scrollUpToElement(WebElement element) {
		int elementLocation = element.getLocation().getY();
		long viewportHeight = (long) ((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"return window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight;");

		boolean isElementInTopHalf = elementLocation < viewportHeight / 2;

		String script = "arguments[0].scrollIntoView(" + isElementInTopHalf + ");";
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(script, element);
	}
	
	public static String getSelectedOptionFromDropDown(WebElement selectDropDown) {
		Select select = new Select(selectDropDown);
		WebElement selectedOption = select.getFirstSelectedOption();
		return selectedOption.getText();
	}
	
	public static void scrollUpToElementOrBottom(WebElement element) {
	    try {
	        // Check if the element is visible and interactable
	        if (element.isDisplayed() && element.isEnabled()) {
	            int elementLocation = element.getLocation().getY();
	            long viewportHeight = (long) ((JavascriptExecutor) DriverManager.getDriver()).executeScript(
	                    "return window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight;");
	    
	            boolean isElementInTopHalf = elementLocation < viewportHeight / 2;
	    
	            String script = "arguments[0].scrollIntoView(" + isElementInTopHalf + ");";
	            ((JavascriptExecutor) DriverManager.getDriver()).executeScript(script, element);
	        } else {
	            ((JavascriptExecutor) DriverManager.getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight);");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void clickWithJS(WebElement element) {
	    ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
	    ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", element);
	}
	
	public static boolean isNotDisplayed(WebElement element) {
		try {
			return !element.isDisplayed();
		} catch (NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
	}
	
	public static List<String> getListOfAttributes(List<WebElement> element, String attributeName) {
		List<String> elementTextList = new ArrayList<>();

		for (int i = 0; i < element.size(); i++) {
			String statusText = element.get(i).getAttribute(attributeName);
			elementTextList.add(statusText);
		}

		Waiters.waitForTimeout(1000);
		return elementTextList;
	}

	public static List<String> getListOfText(List<WebElement> element) {
		List<String> elementTextList = new ArrayList<>();

		for (int i = 0; i < element.size(); i++) {
			String elementText = element.get(i).getText();
			elementTextList.add(elementText);
		}

		Waiters.waitForTimeout(1000);
		return elementTextList;
	}
	
	public static void scrollInToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("window.scrollBy(0, -200);");
        Waiters.waitForTimeout(1000);
    }
	
	public static void scrollToElements(List<WebElement> elements) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        for (WebElement element : elements) {
            js.executeScript("arguments[0].scrollIntoView(true);", element);
            js.executeScript("window.scrollBy(0, -200);");
        }
        Waiters.waitForTimeout(1000);
    }
	
	public static void searchAndSelectOptionUsingDownArrowNe(WebElement element, String option) {
		ActionsUtils.typeTextWithInterval(element, option);
		Waiters.waitForTimeout(1000);
		ActionsUtils.pressDownArrow();
		Waiters.waitForTimeout(1000);
		ActionsUtils.pressEnter();
		Waiters.waitForTimeout(2000);
	}
	
	public static void searchAndSelectOptionUsingDownArrow(WebElement element, String option) {
		element.sendKeys(option);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"arguments[0].dispatchEvent(new KeyboardEvent('keydown', {keyCode: 40, bubbles: true}));", element);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(
				"arguments[0].dispatchEvent(new KeyboardEvent('keydown', {keyCode: 13, bubbles: true}));", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> getAllOptionsFromDropdown(WebElement selectDropDown) {
        Select select = new Select(selectDropDown);
        List<String> optionTexts = new ArrayList<>();
        List<WebElement> options = select.getOptions();
        
        for (WebElement option : options) {
            optionTexts.add(option.getText());
        }
        
        return optionTexts;
    }
	
	public static void moveToElementAndClickUsingJs (WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	    js.executeScript("arguments[0].click();", element);
	}
	
	public static boolean isDisappeared(WebElement element) {
	    try {
	        return !element.isDisplayed();
	    } catch (NoSuchElementException | StaleElementReferenceException e) {
	        return true;
	    }
	}
	
	public static void typeTextValueWithIntervalUsingJs(WebElement element, String stringToType, int interval) {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		for (int i = 0; i < stringToType.length(); i++) {
			char ch = stringToType.charAt(i);
			String script = "arguments[0].value += '" + ch + "';";
			js.executeScript(script, element);
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void printChildElements(WebElement parentElement) {
		// Print the outer HTML of the parent element
		System.out.println("Element: " + parentElement.getAttribute("outerHTML"));

		// Find all child elements of the parent element
		List<WebElement> childElements = parentElement.findElements(By.xpath(".//*"));

		// Recursively print the entire HTML subtree of each child element
		for (WebElement child : childElements) {
			printElementRecursively(child);
		}
	}

	public static void printElementRecursively(WebElement element) {
		// Print the outer HTML of the current element
		System.out.println("Element: " + element.getAttribute("outerHTML"));

		// Find all child elements of the current element
		List<WebElement> childElements = element.findElements(By.xpath(".//*"));

		// Recursively print the entire HTML subtree of each child element
		for (WebElement child : childElements) {
			printElementRecursively(child);
		}
	}

	public static void pressEnterUsingJs() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("return document.dispatchEvent(new KeyboardEvent('keydown', {key: 'Enter'}))");
	}

	public static void clearInputFieldWithJs(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		jsExecutor.executeScript("arguments[0].value = '';", element);
	}

	public static void typeTextWithIntervalUsingSendKeys(WebElement element, String stringToType, int interval) {
		for (int i = 0; i < stringToType.length(); i++) {
			char ch = stringToType.charAt(i);
			String character = String.valueOf(ch);
			element.sendKeys(character);
			try {
				Thread.sleep(interval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void sendBackspaceUsingJs() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		jsExecutor.executeScript("document.activeElement.value = document.activeElement.value.slice(0, -1);");
	}

	public static void clickOnOptionFromListUsingJs(List<WebElement> optionList, String option) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		Waiters.waitForListOfElementsToBeVisible(optionList);
		for (int i = 0; i < optionList.size(); i++) {
			String elementText = optionList.get(i).getText();
			if (elementText.equals(option)) {
				Waiters.waitForElementToBeClickable(optionList.get(i));
				jsExecutor.executeScript("arguments[0].click();", optionList.get(i));
				break;
			}
		}
	}

	public static void clickOnOptionContainsFromListUsingJs(List<WebElement> optionList, String option) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
		Waiters.waitForListOfElementsToBeVisible(optionList);
		for (int i = 0; i < optionList.size(); i++) {
			String elementText = optionList.get(i).getText();
			if (elementText.contains(option)) {
				Waiters.waitForElementToBeClickable(optionList.get(i));
				jsExecutor.executeScript("arguments[0].click();", optionList.get(i));
				break;
			}
		}
	}
}
