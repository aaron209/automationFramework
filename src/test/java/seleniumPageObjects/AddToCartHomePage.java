package seleniumPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import seleniumLibrary.BasePage;

public class AddToCartHomePage extends BasePage{

	public AddToCartHomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//h4[@class='product-name']")
	public List<WebElement> productName;
	
	@FindBy(xpath="//div[@class='product-action']/button")
	public List<WebElement> addToCartBtn;
	
	@FindBy(xpath="(//table/tbody/tr/td/strong)[1]")
	public WebElement NoOfAddedItems;

	@FindBy(xpath="(//ul[@class='cart-items'])[1]/li")
	public List<WebElement> cartItems;
	
	@FindBy(xpath="//a[@class='cart-icon']/img")
	public WebElement cartIcon;
	
	@FindBy(xpath="//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul")
	public WebElement firstColLinks;
	
	@FindBy(xpath="//div[@id='gf-BIG']//ul/li/a")
	public List<WebElement> allLinks;
}
