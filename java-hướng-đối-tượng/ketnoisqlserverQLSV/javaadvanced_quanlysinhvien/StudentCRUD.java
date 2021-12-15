package javaadvanced_quanlysinhvien;

public class StudentCRUD {
	public void insert(Student std) {
        Connection conn = null;
        PreparedStatement statement = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanager?serverTimezone=UTC", "root", "");
            String query = "insert into student (FullName,Gender,Age,Email,PhoneNumber) values (?,?,?,?,?) ";
            statement = conn.prepareCall(query);

            statement.setString(1, std.getFullName());
            statement.setString(2, std.getGender());
            statement.setString(3, std.getAge());
            statement.setString(4, std.getEmail());
            statement.setString(5, std.getPhoneNumber());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList listStudent() {
        ArrayList<Student> studentList = new ArrayList();
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanager?serverTimezone=UTC", "root", "");
            String query = "select * from student";
            statement = conn.prepareCall(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                Student std = new Student(result.getString("FullName"),
                        result.getString("Gender"), result.getString("Age"),
                        result.getString("Email"), result.getString("PhoneNumber"));
                std.setNo(Integer.parseInt(result.getString("no")));
                studentList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return studentList;
    }

    public void delete(int primaryKey) {
        Connection conn = null;
        PreparedStatement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanager?serverTimezone=UTC", "root", "");
            String query = "delete from student where no = ?";
            statement = conn.prepareCall(query);
            statement.setString(1, String.valueOf(primaryKey));
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<Student> search(String name, String phone) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ArrayList<Student> listStudent = new ArrayList();
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanager?serverTimezone=UTC", "root", "");
            String query = "select * from student where ('' like ? or FullName like ?) and (0 = ? or PhoneNumber = ?)";
            stmt = conn.prepareCall(query);
            stmt.setString(1, '%' + name + '%');
            stmt.setString(2, '%' + name + '%');
            stmt.setString(3, phone);
            stmt.setString(4, phone);

            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                Student std = new Student(result.getString("FullName"),
                        result.getString("Gender"), result.getString("Age"),
                        result.getString("Email"), result.getString("PhoneNumber"));
                std.setNo(Integer.parseInt(result.getString("no")));
                listStudent.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listStudent;
    }
}
