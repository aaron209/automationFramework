package seleniumTestMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle {

	public WebDriver driver;

	public void handleWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String childWidnow = iterator.next();
			if (!mainWindow.equals(childWidnow)) {
				driver.switchTo().window(childWidnow);
				// perform required function

				// close the child window
				driver.close();
			}
		}
		// switch to parent window
		driver.switchTo().window(mainWindow);
	}
}
