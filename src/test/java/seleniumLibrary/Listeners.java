package seleniumLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseTest implements ITestListener {

	ExtentReports extent = ExtentReporter.extentReporter();
	ThreadLocal<ExtentTest> thread = new ThreadLocal<ExtentTest>();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		thread.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		thread.get().log(Status.PASS, "Test Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		thread.get().fail(result.getThrowable());
		/*
		 * WebDriver driver = null; String testMethodName =
		 * result.getMethod().getMethodName();
		 * 
		 * try { driver = (WebDriver)
		 * result.getTestClass().getRealClass().getDeclaredField("driver")
		 * .get(result.getInstance()); } catch (Exception e) { e.printStackTrace(); }
		 * try { thread.get().addScreenCaptureFromPath(getScreenshot(testMethodName,
		 * driver), result.getMethod().getMethodName());
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */

	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
