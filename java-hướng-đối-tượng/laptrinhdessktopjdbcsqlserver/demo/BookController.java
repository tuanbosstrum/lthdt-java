package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class BookController {
	public static ArrayList<Books> getAllBook(){
		Connection cons = Testconnect.getConnection();
		String sql = "SELECT ID, Title, Price FROM SACH";
		ArrayList<Books> list= new ArrayList<>();
		try {
			Statement ps = cons.createStatement();
			ResultSet rs = ps.executeQuery(sql);
			while (rs.next()) {
				Books book= new Books(rs.getInt("ID"),rs.getString("Title"),rs.getFloat("Price"));
				list.add(book);
			}cons.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;	
	}
	public int createOrUpdate(Books book) {
		try {
			Connection cons = Testconnect.getConnection();
			String sql ="INSERT INTO SACH(ID, Title, Price) VALUES (?,?,?)";
			Statement ps = cons.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			((PreparedStatement) ps).setInt(1, book.getID());
			((PreparedStatement) ps).setString(2, book.getTitle());
			((PreparedStatement) ps).setFloat(3, book.getPrice());
			ps.executeQuery(sql);
			ResultSet rs = ps.getGeneratedKeys();
			int generatedKeys = 0;
			if(rs.next()) {
				generatedKeys = rs.getInt(1);
			}ps.close();
			cons.close();
			return generatedKeys;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
}
