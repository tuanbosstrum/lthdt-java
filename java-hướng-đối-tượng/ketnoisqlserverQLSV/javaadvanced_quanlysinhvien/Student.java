package javaadvanced_quanlysinhvien;

public class Student {
	int no;
    String fullname,gender,age,phone,email;

    public Student( String fullname, String gender, String age, String phone, String email) {
       
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public Student() {
    }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
