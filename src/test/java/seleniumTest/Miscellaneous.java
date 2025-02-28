package seleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Miscellaneous {

	public WebDriver driver;

	public void miscellaneousInSelenium() {
		// some locators examples which is possible in only xpath
		// input[text()='Book']
		// input[contains(text(),'Book')]
		// div[@id='myid']/following-sibling::li
		// div[@id='myid']/parent::ul -- from child to parent
		// div[@id='table']//li[@id='list'] -- parent child relationship

		// static dropdown
		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByValue(null);
		select.getOptions();

		// handle alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys(null);

		// handle frame
		driver.switchTo().frame("iframe-name/id/index");
		driver.switchTo().defaultContent();

	}

}
