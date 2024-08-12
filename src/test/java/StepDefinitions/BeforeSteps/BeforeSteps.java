package StepDefinitions.BeforeSteps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Driver.DriverManager;
import Utilities.CommonUtils;
import Utilities.Waiters;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeSteps {
	
	private static final Logger LOGGER = LogManager.getLogger(BeforeSteps.class);

	private static String scenarioName = null;

	public static void beforeAll() {
		LOGGER.info("Execution Started");
		try {
//			scenarioName = scenario.getName();
			LOGGER.info("Instantiating CommonUtils");

			LOGGER.info("Loading Properties");
//			commonUtils.getInstance().loadProperties();

			LOGGER.info("Checking the driver status");
//			if (DriverManager.getDriver() == null) {
			LOGGER.info("Driver is null instantiating it!");
			DriverManager.launchBrowser();
			CommonUtils.getInstance().initElements();
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Before
	public static void beforeScenario(Scenario scenario) {
		LOGGER.info("Execution Started for scenario: {}", scenario.getName());
        try {
            scenarioName = scenario.getName();
            DriverManager.launchBrowser();
            CommonUtils.getInstance().initElements();
        } catch (Exception e) {
            LOGGER.error("Error initializing scenario: {}", scenario.getName(), e);
            throw new RuntimeException("Error initializing scenario", e);
        }
	}

//	@AfterStep
	public void attactScreenShot(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenShotTaken = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShotTaken, "image/png", scenario.getName());
		}
	}

	@After
	public static void afterScenario(Scenario scenario) {
		try {
            LOGGER.info("Execution Ended for scenario: {}", scenario.getName());
            Waiters.waitForTimeout(2000);
            WebDriver currentDriver = DriverManager.getDriver();
            if (currentDriver != null) {
                if (scenario.isFailed()) {
                    takeScreenshot(scenario, currentDriver);
                }
                currentDriver.quit();
            }
        } catch (Exception e) {
            LOGGER.error("Error executing after scenario: {}", scenario.getName(), e);
            throw new RuntimeException("Error executing after scenario", e);
        }
	}
	
	private static void takeScreenshot(Scenario scenario, WebDriver driver) {
        try {
            byte[] screenShotTaken = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShotTaken, "image/png", scenario.getName());
            LOGGER.info("Screenshot captured for failed scenario: {}", scenario.getName());
        } catch (Exception e) {
            LOGGER.error("Error taking screenshot for scenario: {}", scenario.getName(), e);
        }
    }

    public String getScenarioName() {
        return scenarioName;
    }


}
