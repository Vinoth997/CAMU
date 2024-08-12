package Driver;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Utilities.CommonUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private static WebDriver driver = null;
	private static Logger log = LogManager.getLogger(DriverManager.class);

	public static void launchBrowser() {
		try {
			boolean headless = true;
			String browserName = CommonUtils.excelGetdata("Browser", 1, 1).toLowerCase();
			switch (browserName) {
		    case "chrome":
		        log.info("Launching " + browserName + " browser");
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--incognito", "--disable-gpu", "--ignore-certificate-errors",
		                             "--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage",
		                             "--disable-popup-blocking");
		        
		        if (headless) {
		            options.addArguments("--headless", "--window-size=1920,1080");
		        } else {
		            options.addArguments("--start-maximized");
		        }
		        
		        WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver(options);
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		        break;
			case "firefox":
				log.info("Launching " + browserName + " browser");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "ie":
				log.info("Launching " + browserName + " browser");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			case "edge":
				log.info("Launching " + browserName + " browser");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				log.info("Invalid browser name");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

}



