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
    }
    
}
