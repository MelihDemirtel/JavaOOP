/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructormethods;

/**
 *
 * @author MelihDemirtel
 */
public class ConstructorMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getFirstName());
        student.setFirstName("Jack");
        System.out.println(student.getFirstName());
        
        //Students students = new Students(10);
        //Students students = new Students("Jack", "Potter", 555, 1994);
        Students students = new Students();
        
        System.out.println(students.getFirstName());
    }
    
}
