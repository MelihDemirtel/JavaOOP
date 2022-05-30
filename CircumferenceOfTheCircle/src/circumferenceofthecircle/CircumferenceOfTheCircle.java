/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circumferenceofthecircle;

import java.util.Scanner;

/**
 *
 * @author MelihDemirtel
 */
public class CircumferenceOfTheCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputDiameter();
    }
    
    public static void inputDiameter(){
        Circle circle = new Circle();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Entry Diameter : ");
        double circumference = input.nextDouble();
        circle.setD(circumference);
        
        System.out.println("Circumference of the Circle = "+circle.getC());
    }
    
}
