/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tostring;

/**
 *
 * @author MelihDemirtel
 */
public class ToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        
        student.setFirstName("Jack");
        student.setLastName("Potter");
        student.setStudentNumber(555);
        student.setBirthday(1994);
        
        student.showInfo();
        
        System.out.println(student);
    }
    
}
