package seleniumLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected  WebDriver driver;
	private static final int TIMEOUT = 10;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}

	public void waitForVisible(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(by));

	}

	public Object executor(String script, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(script, element);
	}

}
