package seleniumLibrary;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	private WebDriver driver;
	PropertiesManager pro;
	String baseUrl;
	String browser;
	String driverName;
	String driverPath;

	@BeforeMethod
	public void beforeEachTest() {
		pro = new PropertiesManager();
		driver = initializeDriver();
		baseUrl = pro.readProperty("base.url");
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterEachMethod() {
		if (driver != null) {
			// driver.close();
			driver.quit();
			Reporter.log("the browser is closed successfully!");
		}
	}

	public WebDriver initializeDriver() {
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
		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
