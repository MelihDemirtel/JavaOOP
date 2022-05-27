/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input;

import java.util.Scanner;

/**
 *
 * @author MelihDemirtel
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Summing : "+summing());       
}
    public static int summing(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number1 Entry : ");
        int number1 = input.nextInt();
        System.out.print("Number2 Entry : ");
        int number2 = input.nextInt();
        
        return number1 + number2;
    }
}
