package seleniumTest;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class RunFailedTest {

	@Test
	public void runFailedTest() {
		TestNG runner = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("test-output/testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}
}
