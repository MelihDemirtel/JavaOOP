/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compositionexample;

/**
 *
 * @author MelihDemirtel
 */
public class CompositionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product = new Product("Asus", "Laptop", 5000, 001, 5);
        
        ProductManager productManager = new ProductManager(product);
        
        productManager.add();
        productManager.update();     
        productManager.remove();
                
    }
    
}
