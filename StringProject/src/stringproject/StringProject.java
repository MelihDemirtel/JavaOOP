/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringproject;

import java.util.Scanner;

/**
 *
 * @author MelihDemirtel
 */
public class StringProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter Your T.C. Number : ");
        String tc = input.nextLine();
        char lastNumber = tc.charAt(10);
             
        switch(lastNumber){
            case '0':
              System.out.println("You will receive your money on the 1st day of the month.");
              break;
            case '2':
              System.out.println("You will receive your money on the 2st day of the month.");
              break;
            case '4':
              System.out.println("You will receive your money on the 3st day of the month.");
              break;
            case '6':
              System.out.println("You will receive your money on the 4st day of the month.");
              break;
            case '8':
              System.out.println("You will receive your money on the 5st day of the month.");
              break;
            default:
               System.out.println("Error");
        }
        
        
    
}
}
