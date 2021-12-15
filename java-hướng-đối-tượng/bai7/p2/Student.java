/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author Redmibook 14
 */
public class Student {
    int no;
    String FullName,Gender,Age,Email,PhoneNumber;

    public Student( String FullName, String Gender, String Age, String Email, String PhoneNumber) {
       
        this.FullName = FullName;
        this.Gender = Gender;
        this.Age = Age;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public Student() {
    }

    public int getNo() {
        return no;
    }

    public String getFullName() {
        return FullName;
    }

    public String getGender() {
        return Gender;
    }

    public String getAge() {
        return Age;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
}
