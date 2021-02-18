package seleniumLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	PropertiesManager pro = new PropertiesManager();
	String retryCount = pro.readProperty("retry");
	int countRetry = Integer.parseInt(retryCount);
	int count = 0;

	@Override
	public boolean retry(ITestResult result) {
		if (count < countRetry) {
			count++;
			return true;
		}
		return false;
	}

}
