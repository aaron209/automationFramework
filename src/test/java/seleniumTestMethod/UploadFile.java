package seleniumTestMethod;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.google.common.io.Files;

public class UploadFile {

	public WebDriver driver;
	public String pathAfterUpdate;

	public void uploadFileWithRename(String path) {
		try {
			pathAfterUpdate = renameFile(path);
			File file = new File(pathAfterUpdate);
			WebElement upload = driver.findElement(By.xpath(""));
			upload.sendKeys(file.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			revertFileName(pathAfterUpdate);

		}
	}

	public String renameFile(String path) throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("MMddyyHHmmss");
		Date date = new Date();
		String currentDate = dateFormat.format(date);
		String destFile = path.concat(currentDate);
		File oldFile = new File(path);
		File newFile = new File(destFile);
		Files.copy(oldFile, newFile);
		return destFile;

	}

	public void revertFileName(String path) {
		File oldFile = new File(path);
		oldFile.delete();
	}

	public String currentDateMinusSeven() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		LocalDate localDate = LocalDate.now().minusDays(7);
		String date = formatter.format(localDate);
		return date;
	}
}
