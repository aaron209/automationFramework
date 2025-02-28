package seleniumTestMethod;


import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v125.network.Network;
import org.openqa.selenium.devtools.v125.network.model.AuthChallengeResponse.Response;
import org.testng.annotations.Test;



public class GetNetworkDetails {
	
	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.addListener(Network.responseReceived(), response ->{
			org.openqa.selenium.devtools.v125.network.model.Response res = response.getResponse();
		if(res.getUrl().equals("https://www.google.com/complete/search?q&cp=0&client=gws-wiz&xssi=t&gs_pcrt=2&hl=en&authuser=0&psi=GQ9eZr3QLJyf5NoP5bOimA4.1717440281912&dpr=2&pq=how%20to%20get%20correlation&ofp=GP3mjrHbkregNhiEgcPlrZDP18EBGNGyv8bj_NO_DhjFgp-P4Ivj7ScYv4iLjK3pjaAN&nolsbt=1")) {
			System.out.println(res.getStatusText());
			System.out.println(res.getUrl());
			System.out.println(res.getHeaders());
		}
		});
		driver.get("https://google.com");
		driver.quit();
		
		
	}

}
