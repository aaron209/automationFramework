package seleniumLibrary;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Base {

	PropertiesManager pro;
	private WebDriver driver;
	String browser;
	String driverName;
	String driverPath;
	String baseUrl;

	public WebDriver initializeDriver() {
		pro = new PropertiesManager();
		browser = pro.readProperty("browserType");
		driverName = pro.readProperty("driver.name");
		driverPath = pro.readProperty("webdriver.chrome.driver");
		if (browser.equals("Chrome")) {
			System.setProperty(driverName, driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("Safari")) {
			driver = new SafariDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("Headless")) {
			System.setProperty(driverName, driverPath);
			ChromeOptions option = new ChromeOptions();
			option.addArguments("headless");
			driver = new ChromeDriver(option);
			driver.manage().window().maximize();
		}
		baseUrl = pro.readProperty("base.url");
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getScreenshot(String testName, WebDriver driver) throws Exception {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/reports/" + testName + ".png";
		FileUtils.copyFile(src, new File(destination));
		return destination;

	}

}
