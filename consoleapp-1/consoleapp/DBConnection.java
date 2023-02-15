package consoleapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String url="jdbc:mysql://localhost/plasmadonour";
	private static final String user="root";
	private static final String password="Aspire@123";
	public static Connection getConnect() throws SQLException{
		
		return DriverManager.getConnection(url,user,password);
		
	}

}

