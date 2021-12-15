package DEMO;

public class Student {
	private int id,age;
	private String fullname,gender,email;
	public Student() {
		super();
	}
	public Student( String fullname, String gender, String email,int age) {
		super();
		this.age = age;
		this.fullname = fullname;
		this.gender = gender;
		this.email = email;
	}
	public Student(int id, String fullname, String gender, String email, int age) {
		super();
		this.id = id;
		this.age = age;
		this.fullname = fullname;
		this.gender = gender;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
