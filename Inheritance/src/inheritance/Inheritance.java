/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author MelihDemirtel
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Students students = new Students(2, "admin", "123456");
        Teachers teachers = new Teachers(101, 95, 5000, "admin", "123456");
       
        System.out.println(teachers.getAmount());
        System.out.println(teachers.getUserName());
    }
    
}
