package DEMO;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
public class StudentController {
	public static List<Student> findAll() {
		List<Student> list = new ArrayList<Student>();
		String dbURL = "jdbc:sqlserver://localhost;databaseName=quanly;user=sa;password=01032001asdasd";
		Connection conn = null;
		Statement st = null;
		try {
			conn = DriverManager.getConnection(dbURL);

			String sql = "select * from SINHVIEN";
			st = conn.createStatement();

			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				Student student = new Student(rs.getInt("ID"), rs.getString("Fullname"), rs.getString("Gender"),
						rs.getString("Email"), rs.getInt("Age"));
				list.add(student);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	public static List<Student> findbyFullname(String fullname) {
		List<Student> list = new ArrayList<Student>();

		String dbURL = "jdbc:sqlserver://localhost;databaseName=quanly;user=sa;password=01032001asdasd";
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DriverManager.getConnection(dbURL);

			String sql = "select * from SINHVIEN where Fullname = ? ";
			st = conn.prepareCall(sql);
			st.setString(1, fullname);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				Student student = new Student(rs.getInt("ID"), rs.getString("Fullname"), rs.getString("Gender"),
						rs.getString("Email"), rs.getInt("Age"));
				list.add(student);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	
	
	
	public static void insert(Student student) {
		String dbURL = "jdbc:sqlserver://localhost;databaseName=quanly;user=sa;password=01032001asdasd";
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DriverManager.getConnection(dbURL);

			String sql = "insert into SINHVIEN (Fullname, Gender, Email, Age) values(?,?,?,?)";
			st = conn.prepareCall(sql);
			st.setString(1, student.getFullname());
			st.setString(2, student.getGender());
			st.setString(3, student.getEmail());
			st.setInt(4, student.getAge());
			st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void update(Student student) {
		String dbURL = "jdbc:sqlserver://localhost;databaseName=quanly;user=sa;password=01032001asdasd";
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DriverManager.getConnection(dbURL);

			String sql = "update SINHVIEN set Fullname=?, Gender=?, Email=?, Age=? where ID=?";
			st = conn.prepareCall(sql);
			st.setString(1, student.getFullname());
			st.setString(2, student.getGender());
			st.setString(3, student.getEmail());
			st.setInt(4, student.getAge());
			st.setInt(5, student.getId());
			st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void delete(int id) {
		String dbURL = "jdbc:sqlserver://localhost;databaseName=quanly;user=sa;password=01032001asdasd";
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DriverManager.getConnection(dbURL);

			String sql = "delete from Student where ID=?";
			st = conn.prepareCall(sql);

			st.setInt(1, id);
			st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
