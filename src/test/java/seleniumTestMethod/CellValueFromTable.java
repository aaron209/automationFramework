package seleniumTestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import seleniumLibrary.BasePage;
import seleniumPageObjects.HomePageObjects;

public class CellValueFromTable extends BasePage {

	public CellValueFromTable(WebDriver driver) {
		super(driver);
	}

	public static Map<Long, List<String>> idThread = new HashMap<Long, List<String>>();

	HomePageObjects homePage = new HomePageObjects(driver);

	public void getData(String header) {

		int headerSize = homePage.header.size();
		List<String> list = new ArrayList<String>();
		int colNum = 0;
		for (int i = 0; i < headerSize; i++) {
			String headerText = homePage.header.get(i).getText();
			if (headerText.equals(header)) {
				colNum = i + 1;
				break;
			}
		}
		int rowSize = homePage.row.size();
		for (int i = 0; i < rowSize; i++) {
			String cellValue = homePage.cell(i + 1, colNum).getText();
			if (cellValue.contains("+")) {
				list.add(cellValue);

			}
		}
		System.out.println(list);
		idThread.put(Thread.currentThread().getId(), list);
	}

	// this method enters the value after getting list from getData
	public void searchWithValue() {
		for (int i = 0; i < idThread.get(Thread.currentThread().getId()).size(); i++) {
			driver.findElement(By.xpath("")).sendKeys(idThread.get(Thread.currentThread().getId()).get(i));
		}
	}
}
