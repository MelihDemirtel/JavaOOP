/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forcecalculation;

import java.util.Scanner;

/**
 *
 * @author MelihDemirtel
 */
public class ForceCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputForce();
    }
    public static void inputForce(){
        Force force = new Force();
        Scanner input = new Scanner(System.in);
        System.out.print("Please Entry Mass Value : ");
        int mass = input.nextInt();
        System.out.print("Please Entry Acceleration Value : ");
        int acceleration = input.nextInt();
        force.setAcceleration(acceleration);
        force.setMass(mass);

        
        System.out.println("Force = "+force.getForce());
    }
    
}
