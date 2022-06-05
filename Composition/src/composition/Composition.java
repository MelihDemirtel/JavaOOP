/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

/**
 *
 * @author MelihDemirtel
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student student = new Student("Jack", "Potter", 555, "Adam", "Mary", 1994);
        
        StudentTransactions studentTransactions = new StudentTransactions(student);
        
        studentTransactions.add();
    }
    
}
