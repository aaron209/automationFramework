package javaProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatternUse {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
		Pattern pattern1 = Pattern.compile("\\b\\d{10}\\b");
	}
	

	//get all email addresses from the page
	public static List<String> getEmailAddresses(){
		List<WebElement> elems = driver.findElements(By.xpath("//*[text()]"));
		Set<String> emailAddresses = new HashSet<>();
		Pattern pattern = Pattern.compile("\\\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Z|a-z]{2,}\\\\b");
		for(WebElement elm : elems) {
			String text = elm.getText();
			Matcher matcher = pattern.matcher(text);
			while(matcher.find()) {
				emailAddresses.add(matcher.group());
			}
			
		}
		return new ArrayList<>(emailAddresses);
		
	}
	

}
