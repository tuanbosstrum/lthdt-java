package DEMO;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnecDB {
	public static Connection getConnection() {
		Connection conn = null;
		String string = "jdbc:sqlserver://localhost; databaseName=quanly; user=sa; password=01032001asdasd";
		String dbURL = string;
		try {
			conn = DriverManager.getConnection(dbURL);
			System.out.println("Đã kết nối");
		} catch (SQLException ex) {
			System.err.println(" ....................... " + ex);
			}
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (Exception e) {
				e.printStackTrace();
			}
		return conn;
		}
}
