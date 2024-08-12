package Utilities;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class Asserts {

	public static boolean isDisplayed(WebElement element) {
		boolean elementState = false;
		if (element.isDisplayed()) {
			elementState = true;
		}
		return elementState;
	}

	public static boolean containsText(String actual, String expected) {
		boolean booleanValue = false;
		if (actual.contains(expected)) {
			booleanValue = true;
		}
		return booleanValue;
	}

	public static boolean equalsText(String actual, String expected) {
		boolean booleanValue = false;
		if (actual.equals(expected)) {
			booleanValue = true;
		}
		return booleanValue;
	}

	public static void assertEqualsText(String actual, String expected) {
		Assertions.assertEquals(expected, actual);
	}

	public static boolean assertFalse(boolean actual) {
		Assertions.assertFalse(actual);
		return actual;
	}

	public static boolean assertTrue(boolean actual) {
		Assertions.assertTrue(actual);
		return actual;
	}

	public static boolean assertTrue(boolean actual, String errorMessage) {
		String coloredErrorMessage = "\033[0;31m" + errorMessage + "\033[0m";
		Assertions.assertTrue(actual, coloredErrorMessage != null ? coloredErrorMessage : "");
		return actual;
	}

	public static boolean assertListofTextFromExcel(List<WebElement> options, String sheetName, int rowNum)
			throws IOException {
		boolean value = false;
		String optionsText = null;
		for (int i = 0; i < options.size(); i++) {
			value = false;
			for (int j = 1; j <= options.size(); j++) {
				optionsText = options.get(i).getText();
				String listText = CommonUtils.excelGetdata(sheetName, rowNum, j);
//	            System.out.println(optionsText + " " + listText + " " + optionsText.equals(listText));
				if (optionsText.trim().contains(listText.trim())) {
					value = true;
					break;
				}
			}
//	        System.out.println("---"+value);
			Assertions.assertTrue(value);

		}
//	    System.out.println(value);
		return value;
	}

	public static void assertListContains(List<String> actualList, String expectedString) {
		Assertions.assertTrue(actualList.contains(expectedString),
				"Expected string '" + expectedString + "' not found in the list");
	}

	public static void assertListNotContains(List<String> actualList, String expectedString) {
		Assertions.assertFalse(actualList.contains(expectedString),
				"Expected string '" + expectedString + "' found in the list");
	}

	public static boolean assertFalse(boolean actual, String errorMessage) {
		Assertions.assertFalse(actual, errorMessage);
		return actual;
	}
	
	public static void assertContainsText(String actual, String expected, String errorMessage) {
		String coloredErrorMessage = "\033[0;31m" + errorMessage + "\033[0m";
		Assertions.assertTrue(actual.contains(expected),  coloredErrorMessage != null ? coloredErrorMessage : "");
	}
	
	public static void assertNotEqualsText(String actual, String expected) {
	    Assertions.assertNotEquals(expected, actual);
	}

}
