/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Write a description of class DriverLab08 here.
 * 
 * @author Chris
 * @version (a version number or a date)
 */
public class DriverLab08 {

    /**
     * Constructor for objects of class DriverLab08
     */
    public DriverLab08() {
    }

    /**
     * main method, application starts here.
     * 
     * @param args execution arguments
     */
    public static void main(String[] args) {
        Die roll = new Die();
        Die roll2 = new Die(20);

        System.out.println(roll);
        System.out.println(roll2);
    }
}
