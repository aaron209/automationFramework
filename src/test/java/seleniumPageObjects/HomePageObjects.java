package seleniumPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import seleniumLibrary.BasePage;

public class HomePageObjects extends BasePage {

	public HomePageObjects(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='closeBtn']")
	public WebElement closeAd;

	@FindBy(xpath = "//table/thead/tr/th")
	public List<WebElement> header;

	@FindBy(xpath = "//table/tbody/tr")
	public List<WebElement> row;

	public WebElement cell(int row, int col) {
		return driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
	}
}
