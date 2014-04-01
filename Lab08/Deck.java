/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Write a description of class Deck here.
 * 
 * @author Chris
 * @version (a version number or a date)
 */
public class Deck {

    /**
     * Constructor for objects of class Deck
     */
    PlayingCard[] cards;

    public Deck() {

        cards = new PlayingCard[52];

        int i = 0;
        int counter = 1;
        //Hearts
        for (; i < 13; i++, counter++) {
            cards[i] = new PlayingCard("Hearts", counter);
        //System.out.println(cards[i]);
        }
        counter = 1;
        //Diamonds
        for (; i < 26; i++, counter++) {
            cards[i] = new PlayingCard("Diamonds", counter);
        //System.out.println(cards[i]);
        }
        counter = 1;
        //Clubs
        for (; i < 39; i++, counter++) {
            cards[i] = new PlayingCard("Clubs", counter);
        //System.out.println(cards[i]);
        }
        counter = 1;
        //Spades
        for (; i < 52; i++, counter++) {
            cards[i] = new PlayingCard("Spades", counter);
        //System.out.println(cards[i]);
        }
    } // end constructor
    int randVal;
    int randSuit;

    public void shuffle() {
        
        PlayingCard holder;
        
        int rand1 = (int)(Math.random() * cards.length -1);
        int rand2 = (int)(Math.random() * cards.length -1);
        
        holder = cards[rand1];
        cards[rand1] = cards[rand2];
        cards[rand2] = holder;


    } // end shuffle

    public String toString() {
        String result = "";

        for (int i = 0; i < cards.length; i++) {
            result += cards[i].toString() + "\n";
        }
        return result;
    }

    public void reRoll() {
        randVal = (int) (Math.random() * 13) + 1;
        randSuit = (int) (Math.random() * 4) + 1;
    }
} // end Deck
