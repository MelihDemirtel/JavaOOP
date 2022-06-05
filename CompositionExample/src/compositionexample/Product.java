/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositionexample;

/**
 *
 * @author MelihDemirtel
 */
public class Product {
    public String name;
    public String category;
    public int price;
    public int productNo;
    public int stockAmount;

    public Product(String name, String category, int price, int productNo, int stockAmount) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.productNo = productNo;
        this.stockAmount = stockAmount;
    }
    
    
}
