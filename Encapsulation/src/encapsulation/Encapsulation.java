/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

import java.util.Scanner;

/**
 *
 * @author MelihDemirtel
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Student's FirstName : ");
        String firstName = input.nextLine();
        
        System.out.print("Student's LastName : ");
        String lastName = input.nextLine();
                
        System.out.print("Student's Number : ");
        int studentNumber = input.nextInt();
                
        System.out.print("Student's Birthday : ");
        int birthday = input.nextInt();
                
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setStudentNumber(studentNumber);
        student.setBirthday(birthday);
        
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getStudentNumber());
        System.out.println(student.getBirthday());
    }
    
}
