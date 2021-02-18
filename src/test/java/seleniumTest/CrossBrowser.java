package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	public WebDriver driver;

	@Test
	@Parameters("browser")
	public void handle_crossbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
			driver = new ChromeDriver();
			// System.setProperty("webdriver.ie.driver",
			// "src/test/resoures/IEDriverServer");
			// driver = new InternetExplorerDriver();
			// System.setProperty("webdriver.gecko.drive",
			// "src/test/resources/geckodriver");
			// driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}

	}
}
