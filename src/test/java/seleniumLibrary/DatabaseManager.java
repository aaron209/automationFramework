package seleniumLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManager {

	private String databaseServerName = "localhost";
	private String databasePort = "1521";
	private String databaseName = "xe";
	private String userName = "hr";
	private String password = "hr";
	private String connectionURL = "jdbc:oracle:thin:" + userName + "//" + databaseServerName + ":" + databasePort + "/"
			+ databaseName;
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
}
