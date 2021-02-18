package seleniumLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesManager {

	private Properties pro;
	private FileInputStream file;
	private String filePath;
	private String value = null;

	public PropertiesManager() {
		pro = new Properties();
		filePath = "src/test/resources/application.properties";
	}

	public String readProperty(String key) {
		try {
			file = new FileInputStream(filePath);
			pro.load(file);
			value = pro.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
