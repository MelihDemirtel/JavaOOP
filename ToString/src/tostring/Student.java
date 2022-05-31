/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tostring;

/**
 *
 * @author MelihDemirtel
 */
public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private int birthday;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    
    public void showInfo(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.studentNumber);
        System.out.println(this.birthday);
        
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", studentNumber=" + studentNumber + ", birthday=" + birthday + '}';
    }
    
    
    
}
