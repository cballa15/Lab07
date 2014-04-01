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

        Die[] dieArray = new Die[6];

        for(int i = 0; i < dieArray.length; i++) {
            dieArray[i] = new Die();
            System.out.println("Die#: " + (i +1));
            System.out.println(dieArray[i]);
        }

        System.out.println("///////////////////////////////////////////////\n");

        PlayingCard p1 = new PlayingCard();
        PlayingCard p2 = new PlayingCard();

        System.out.println(p1);
        System.out.println(p2);

        if(p1.equals(p2))
                System.out.println("They are Equal");
        else
                System.out.println("They are not equal");

        if(p1.compareTo(p2) == 0)
            System.out.println("They are Equal");
        else if(p1.compareTo(p2) > 0)
            System.out.println("p1 is greater");
        else if(p1.compareTo(p2) < 0)
            System.out.println("p1 is lesser");

        System.out.println("///////////////////////////////////////////////\n");

        Deck d1 = new Deck();

        System.out.println(d1);

        System.out.println("///////////////////////////////////////////////\n");

        for(int i =0; i < 100000; i++)
        d1.shuffle();
        System.out.println(d1);




        


    }
}
