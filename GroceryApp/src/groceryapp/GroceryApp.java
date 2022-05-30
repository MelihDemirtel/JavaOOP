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
        grocery();
        
    }
    
    public static void grocery(){
        Scanner input = new Scanner(System.in);
        Stock stock = new Stock();
                
        System.out.print("How many Apple KG = ");
        double kilogramApple = input.nextDouble();
        stock.setKilogramApple(kilogramApple);
        System.out.println("Apple = "+stock.getApplePrice()+"TL");
        
        System.out.print("How many Pear KG = ");
        double kilogramPear = input.nextDouble();
        stock.setKilogramPear(kilogramPear);
        System.out.println("Pear = "+stock.getPearPrice()+"TL");
        
        System.out.print("How many Orange KG = ");
        double kilogramOrange = input.nextDouble();
        stock.setKilogramOrange(kilogramOrange);
        System.out.println("Orange = "+stock.getOrangePrice()+"TL");
        
        System.out.print("Total Amount = "+stock.getTotal()+"TL"); 
        
    }
    
}
