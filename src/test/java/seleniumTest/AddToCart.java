package seleniumTest;

import java.util.List;

import org.testng.annotations.Test;

import seleniumLibrary.BaseTest;
import seleniumLibrary.ExcelReader;
import seleniumTestMethod.AddItemsToCart;

public class AddToCart extends BaseTest {

	@Test
	public void addItemsToCart() throws Exception {
		AddItemsToCart toCart = new AddItemsToCart(getDriver());
		ExcelReader reader = new ExcelReader("src/test/resources/data.xlsx");
		List<String> list = reader.getData("Sheet1", "Items To Be Added");
		toCart.addToCart(list);
	}

}
