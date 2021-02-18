package seleniumTestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImportantMethod {

	public WebDriver driver;
	public static Map<Long, List<String>> idThread = new HashMap<Long, List<String>>();

	// send keys with gap of each character
	public void search(String searchKey) {
		WebElement searchBtn = driver.findElement(By.xpath(""));
		for (int i = 0; i < searchKey.length(); i++) {
			searchBtn.sendKeys(Character.toString(searchKey.charAt(i)));
		}
	}

	// retry to click the element twice if not clicked at first
	public boolean retryClick(By by) {
		boolean result = false;
		int i = 0;
		while (i < 2) {
			try {
				driver.findElement(by).click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
			i++;
		}
		return result;
	}

	// clear or delete text field
	public void clearText() {
		WebElement input = driver.findElement(By.id(""));
		input.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
	}

	// this method enters the value after getting list from getData
	public void searchWithValue() {
		for (int i = 0; i < idThread.get(Thread.currentThread().getId()).size(); i++) {
			driver.findElement(By.xpath("")).sendKeys(idThread.get(Thread.currentThread().getId()).get(i));
		}
	}
}
