/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositionexample;

/**
 *
 * @author MelihDemirtel
 */
public class ProductManager {
    public Product product;
  

    public ProductManager(Product product) {
        this.product = product;
       
    }
    
    public void add(){
        System.out.println("Product Added : "+product.name);
    }
    
    public void update(){
        System.out.println("Product No Updated : "+product.productNo);
    }
    
    public void remove(){
        System.out.println("Product Stock Amount Deleted : "+product.stockAmount);
    }
    
}
