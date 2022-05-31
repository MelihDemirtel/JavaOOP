/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author MelihDemirtel
 */
public class Teachers extends User{
    private int teacherNumber;
    private double score;
    private int amount;

    public Teachers(int teacherNumber, double score, int amount, String userName, String password) {
        super(userName, password);
        this.teacherNumber = teacherNumber;
        this.score = score;
        this.amount = amount;
    }

    public int getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(int teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
         
    
     public void listStudents(){
         System.out.println("Students Listed");
     }
     
     public void takeMoney(int amount){
         this.amount = this.amount - amount;
         System.out.println("Money Received " + amount);
     }
     
     public void giveScore(){
         System.out.println("Score Given");
     }
    
}
