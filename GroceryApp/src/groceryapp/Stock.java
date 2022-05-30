/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groceryapp;

/**
 *
 * @author MelihDemirtel
 */
public class Stock {

    double kilogramApple;
    double kilogramPear;
    double kilogramOrange;
    double applePrice;
    double pearPrice;
    double orangePrice;
    double total;
    
    public void setKilogramApple(double kilogramApple) {
        this.kilogramApple = kilogramApple;
    }

    public void setKilogramPear(double kilogramPear) {
        this.kilogramPear = kilogramPear;
    }

    public void setKilogramOrange(double kilogramOrange) {
        this.kilogramOrange = kilogramOrange;
    }

    public double getApplePrice() {
        return applePrice = 2.0 * kilogramApple;
    }

    public double getPearPrice() {
        return pearPrice = 3.0 * kilogramPear;
    }

    public double getOrangePrice() {
        return orangePrice =  4.0 * kilogramOrange;
    }

    public double getTotal() {
        return total = applePrice+ pearPrice + orangePrice;
    }
  
}
