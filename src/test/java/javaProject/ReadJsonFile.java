package javaProject;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJsonFile {

	String filePath = "src/test/resources/data.json";

	// this will return object if json file is with array list[]
	public JSONArray readFile() {
		JSONArray list = null;
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(filePath);
			Object obj = parser.parse(reader);
			list = (JSONArray) obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// this will return object if json file is without array list[]
	public JSONObject readJson() {
		JSONObject list = null;
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(filePath);
			Object obj = parser.parse(reader);
			list = (JSONObject) obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) {
		ReadJsonFile read = new ReadJsonFile();
		System.out.println(read.readFile());
	}
}
