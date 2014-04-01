/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Write a description of class PlayingCard here.
 * 
 * @author Chris
 * @version (a version number or a date)
 */
public class PlayingCard {

    /**
     * Constructor for objects of class PlayingCard
     */

    private String face;
    private String suit;
    private int value;
    


    public PlayingCard() {
        value = (int)(Math.random()* 13) + 1;

        if(value == 11)
            face = "Jack";
        else
        if(value == 12)
            face = "Queen";
        else
        if(value == 13)
            face = "King";
        else
            face = "" + value;

        int suitVal = (int)(Math.random()* 4) + 1;
        if(suitVal == 1)
            suit = "Hearts";
        if(suitVal == 2)
            suit = "Diamonds";
        if(suitVal == 3)
            suit = "Clubs";
        if(suitVal == 4)
            suit = "Spades";
    }

    public PlayingCard(String inFace, String inSuit, int inValue) {
        face = inFace;
        suit = inSuit;
        value = inValue;
    }

    public PlayingCard(String inSuit, int inValue) {

        suit = inSuit;
        value = inValue;
        this.setFace(inValue);
    }

    public PlayingCard(PlayingCard inCard) {
        face = inCard.face;
        suit = inCard.suit;
        value = inCard.value;
    }

    public boolean equals(PlayingCard inCard) {
        if(value == inCard.value)
            return true;
        else
            return false;
    } // end equals

    public int compareTo(PlayingCard inCard) {
        if(this.equals(inCard))
            return 0;
        else if(this.value < inCard.value)
            return -1;
        else
            return 1;
    }

    public String toString() {
        return face + " of " + suit;
    }

    public void setFace(int inValue) {
        if(value == 11)
            face = "Jack";
        else
        if(value == 12)
            face = "Queen";
        else
        if(value == 13)
            face = "King";
        else
            face = "" + value;
    }
}
