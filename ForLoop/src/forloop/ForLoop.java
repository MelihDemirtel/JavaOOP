/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MelihDemirtel
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? : ");
        int enterOfNumber = input.nextInt();
        int[] numbers = new int[enterOfNumber];
        for(int i = 1; i <= enterOfNumber; i++ ){
            System.out.print("Entry "+i+" Number : ");
            numbers[i-1]=input.nextInt();
        }
        
        int total = 0;
        for(int number:numbers){
            total = total + number;
        }
        System.out.print("Total of Numbers = "+total);
   
    }
    
}
