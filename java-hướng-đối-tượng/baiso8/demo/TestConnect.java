package demo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnect {
	public static Connection getConnection() {
		Connection conn = null;  
		try {
		    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=quanly;user=sa;password=01032001asdasd";
		    conn = DriverManager.getConnection(dbURL);
		    if (conn != null) {
		      System.out.println("Connected");
		    }
		   } catch (SQLException ex) {
		     System.err.println("Cannot connect database, " + ex);
		   }
		  return conn;
	}
	
	
}
