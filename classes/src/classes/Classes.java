/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author MelihDemirtel
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maths maths = new Maths();
        
        System.out.println(maths.summing1(1, 1));
        maths.summing2(1, 1);
        
        System.out.println(maths.extraction1(2, 1));
        maths.extraction2(2, 1);
        
        System.out.println(maths.multiplication1(2, 2));
        maths.multiplication2(2, 2);
        
        System.out.println(maths.division1(10, 2));
        maths.division2(10, 2);
    }
    
}
