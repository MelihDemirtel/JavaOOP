/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author MelihDemirtel
 */
public class Students extends User{
    private int numberOfCourse;

    public Students(int numberOfCourse, String userName, String password) {
        super(userName, password);
        this.numberOfCourse = numberOfCourse;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }
  
}
