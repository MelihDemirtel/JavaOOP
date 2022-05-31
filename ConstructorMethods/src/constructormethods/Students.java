/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructormethods;

/**
 *
 * @author MelihDemirtel
 */
public class Students {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private int studentBirthyear;
    
    //Constructor Block -- Name To Be same class' name
    /*public Students(int number){
        System.out.println("New Number = " + (number+10));
        
    }*/
    
    public Students(String firstName, String lastName, int studentNumber, int studentBirthyear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.studentBirthyear = studentBirthyear;
        System.out.println("Complete1");
    }
    
    public Students(){
        this.firstName = "GR";
        this.lastName = "GR";
        this.studentNumber = 000;
        this.studentBirthyear = 0000;
        System.out.println("Complete2");
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
