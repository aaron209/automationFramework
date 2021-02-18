package seleniumTestMethod;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import seleniumLibrary.BasePage;
import seleniumPageObjects.AddToCartHomePage;

public class AddItemsToCart extends BasePage {

	public AddItemsToCart(WebDriver driver) {
		super(driver);

	}

	AddToCartHomePage page = new AddToCartHomePage(driver);

	public void addToCart(List<String> items) throws Exception {
		int size = page.productName.size();
		List<String> list = new ArrayList<String>(items);
		int count = 0;
		for (int i = 0; i < size; i++) {
			String[] productNames = page.productName.get(i).getText().split("-");
			String productAfterUpdate = productNames[0].trim();
			if (list.contains(productAfterUpdate)) {
				count++;
				page.addToCartBtn.get(i).click();
				if (count == list.size()) {
					break;
				}

			}
		}
		String NumOfItems = page.NoOfAddedItems.getText();
		int NoItems = Integer.parseInt(NumOfItems);
		if (list.size() == NoItems) {
			Reporter.log("The number of items are added to the cart successfully! " + list.size());

		} else {
			Reporter.log("The number of items are not added to the cart successfully! ");
			Assert.assertTrue(false);
		}

		List<String> cartItems = new ArrayList<String>();
		page.cartIcon.click();
		for (int i = 0; i < page.cartItems.size(); i++) {
			String[] addedItem = page.cartItems.get(i).getText().split("-");
			String addedItemAfterUpdate = addedItem[0].trim();
			cartItems.add(addedItemAfterUpdate);
		}

		if (cartItems.containsAll(list)) {
			Reporter.log("Items are added to the cart " + list);
		} else {
			Reporter.log("Items are not added to the cart" + list + ":" + cartItems);
			Assert.assertTrue(false);
		}
	}
}
