package seleniumTestMethod;

import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import seleniumLibrary.BasePage;
import seleniumPageObjects.AddToCartHomePage;

public class BrokenLinks extends BasePage {

	public BrokenLinks(WebDriver driver) {
		super(driver);

	}

	AddToCartHomePage page = new AddToCartHomePage(driver);

	public void handleBrokenLinks() {
		String url;
		int responseCode;
		SoftAssert softAssert = new SoftAssert();
		for (WebElement links : page.allLinks) {
			url = links.getAttribute("href");
			try {
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();
				responseCode = conn.getResponseCode();
				Reporter.log("Response Code for " + links.getText() + " is: " + responseCode);
				softAssert.assertTrue(responseCode < 400, "The broken links are " + links.getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		softAssert.assertAll();
	}
}