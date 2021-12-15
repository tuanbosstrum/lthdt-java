package DEMO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookControl {
	public static ArrayList<SACH> getAllBook() {
		ArrayList<SACH> list = new ArrayList<>();

		try {
			Connection conn = ConnecDB.getConnection();
			Statement st = conn.createStatement();
			String sql = "select * from SACH";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				SACH book = new SACH(rs.getInt("ID"), rs.getString("Title"), rs.getFloat("Price"));
				list.add(book);
			}
			rs.close();
			st.close();
			conn.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
}
