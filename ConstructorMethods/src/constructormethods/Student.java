/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructormethods;

/**
 *
 * @author MelihDemirtel
 */
public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private int studentBirthyear;
    
    //Constructor Block -- Name To Be same class' name
    public Student(){
        System.out.println("Running...");
        
        this.firstName = "Empty Value";
        this.lastName = "Empty Value";
        this.studentNumber = 000;
        this.studentBirthyear = 0000;
    }

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

    public int getStudentBirthyear() {
        return studentBirthyear;
    }

    public void setStudentBirthyear(int studentBirthyear) {
        this.studentBirthyear = studentBirthyear;
    }
    
    
    
}
