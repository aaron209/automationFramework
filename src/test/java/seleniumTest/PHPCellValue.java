package seleniumTest;

import org.testng.annotations.Test;
import seleniumLibrary.BaseTest;
import seleniumTestMethod.CellValueFromTable;

public class PHPCellValue extends BaseTest {

	@Test
	public void getCellValue() throws Exception {
		CellValueFromTable cellValue = new CellValueFromTable(getDriver());
		cellValue.getData("% Change");

	}
}
