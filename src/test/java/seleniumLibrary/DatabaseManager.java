package seleniumLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManager {

	
	private String userName = "hr";
	private String password = "hr";
	private String connectionURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private void connectToDB() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection(connectionURL, userName, password);
			statement = connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet runSQLQuery(String query) {
		try {
			connectToDB();
			ResultSet result = statement.executeQuery(query);
			resultSet = result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public static void main(String [] args) {
		DatabaseManager databaseManager = new DatabaseManager();
		ResultSet  result = databaseManager.runSQLQuery("select * from Employee");
		System.out.println(result);
	}
}
