package seleniumTestMethod;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import seleniumLibrary.BasePage;
import seleniumPageObjects.AddToCartHomePage;

public class LinksHandle extends BasePage {

	public LinksHandle(WebDriver driver) {
		super(driver);
	}

	AddToCartHomePage page = new AddToCartHomePage(driver);

	// this will open links in new tab and switch to each window
	public void handleLinksAndWindows() {
		List<WebElement> links = page.firstColLinks.findElements(By.tagName("a"));
		int size = links.size();
		for (int i = 1; i < size; i++) {
			String newTab = Keys.chord(Keys.COMMAND, Keys.RETURN);
			links.get(i).sendKeys(newTab);
		}
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			String title = driver.getTitle();
			System.out.println(title);
		}
	}
}
