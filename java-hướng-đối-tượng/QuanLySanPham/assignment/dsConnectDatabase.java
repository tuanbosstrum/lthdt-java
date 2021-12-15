package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dsConnectDatabase {
	String connectionString = "jdbc:sqlserver://LAPTOP-78J1C0J4\\SQLEXPRESS;" 
            + "databaseName=QLSanPham;user=sa;password=01032001asdasd;";
    Connection conn;
    public dsConnectDatabase(){
       
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionString);
            
            if(conn != null){
                System.out.println("Kết nối CSDL SQL Server thành công!");
            }
            else{
                System.out.println("Kết nối CSDL SQL Server thất bại");
            }
        }
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }   
    }
}
