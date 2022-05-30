/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forcecalculation;

/**
 *
 * @author MelihDemirtel
 */
public class Force {
    
    int mass;
    int acceleration;
    int force;
    
    public int getForce() {
        return force = mass * acceleration;
    }
    
    public void setMass(int mass) {
        this.mass = mass;
    }
    
    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }
    
}
