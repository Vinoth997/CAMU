package Utilities;

import java.util.Set;

import Driver.DriverManager;

public class FrameUtils {

	public static void switchToWindow(String windowHandle) {
		DriverManager.getDriver().switchTo().window(windowHandle);
	}

	public static void switchToMainWindow() {
		String mainWindowHandle = DriverManager.getDriver().getWindowHandle();
		switchToWindow(mainWindowHandle);
	}

	public static void switchToNextWindow() {
		String mainWindowHandle = DriverManager.getDriver().getWindowHandle();
		Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();

		for (String handle : windowHandles) {
			if (!handle.equals(mainWindowHandle)) {
				switchToWindow(handle);
				break;
			}
		}
	}

	public static void closeCurrentWindow() {
		DriverManager.getDriver().close();
	}

	public static void closeAllWindowsExceptMainWindow() {
		String mainWindowHandle = DriverManager.getDriver().getWindowHandle();
		Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();

		for (String handle : windowHandles) {
			if (!handle.equals(mainWindowHandle)) {
				switchToWindow(handle);
				closeCurrentWindow();
			}
		}
		switchToMainWindow();
	}

	public static void printAllWindows() {
		Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		System.out.println("List of Windows:");
		for (String handle : windowHandles) {
			System.out.println("Window Handle: " + handle);
			String title = DriverManager.getDriver().switchTo().window(handle).getTitle();
			System.out.println("Title: " + title);
		}
	}

}
