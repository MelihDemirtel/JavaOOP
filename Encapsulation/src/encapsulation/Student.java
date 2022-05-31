/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

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
        if(firstName.isEmpty()){
            System.out.println("Please Enter Student's FirstName");
        }else{
            this.firstName = firstName;
            System.out.println("Correct");
        }
        
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.isEmpty()){
            System.out.println("Please Enter Student's LastName");
        }else{
            this.lastName = lastName;
            System.out.println("Correct");
        }
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if(studentNumber > 1000){
            this.studentNumber = studentNumber;
            System.out.println("Correct");
        }else{
            System.out.println("Please Enter Between 1000 and 9999 Student's Number");
         
        }
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        if(birthday < 2020 && birthday > 1900){
            this.birthday = birthday;
            System.out.println("Correct");
        }else{
            System.out.println("Please Enter Between 1900 and 2020 Student's Birthday");
            
        }
    }
    
    
}
