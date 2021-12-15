package p2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testconnect {
	public static void main(String[] args) {
		  try {
		    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=quanly;user=sa;password=01032001asdasd";
		    Connection conn = DriverManager.getConnection(dbURL);
		    if (conn != null) {
		      System.out.println("Connected");
		      DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
		      System.out.println("Driver name: " + dm.getDriverName());
		      System.out.println("Driver version: " + dm.getDriverVersion());
		      System.out.println("Product name: " + dm.getDatabaseProductName());
		      System.out.println("Product version: " + dm.getDatabaseProductVersion());
		    }
		   } catch (SQLException ex) {
		     System.err.println("Cannot connect database, " + ex);
		   }
		  }
}
