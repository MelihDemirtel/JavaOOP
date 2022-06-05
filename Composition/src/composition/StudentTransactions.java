/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composition;

/**
 *
 * @author MelihDemirtel
 */
public class StudentTransactions {
    public Student student;

    public StudentTransactions(Student student) {
        this.student = student;
    }
    
    public void add(){
         System.out.println("Student Added : "+student.firstName);
    }
    
    
}
