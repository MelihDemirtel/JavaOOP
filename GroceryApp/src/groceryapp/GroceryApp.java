/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groceryapp;

import java.util.Scanner;

/**
 *
 * @author MelihDemirtel
 */
public class GroceryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
    public static void info(){
        Scanner input = new Scanner(System.in);
        Stock stock = new Stock();
                
        System.out.println("How many Apple KG = ");
        double kilogramApple = input.nextDouble();
        
        System.out.println("How many Pear KG = ");
        double kilogramPear = input.nextDouble();
        
        System.out.println("How many Orange KG = ");
        double kilogramOrange = input.nextDouble();
        
        
    }
    
}
