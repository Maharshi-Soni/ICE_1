/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 * @author Maharshi-Soni,June 1st
 */
import java.util.*;
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
        boolean search = true;
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(new Random().nextInt(13));//use a method to generate random *13
            c1.setSuits(Card.SUITS[ new Random().nextInt(4)]);//random method suit 
            magicHand[i]=c1;
            
            System.out.println(c1.getSuits() + " : " + c1.getValue());
        }    
        //step 2:take input 
        System.out.println("Choose Suit for your Card");
        System.out.println("\n1: Diamonds\n" + "2: Clubs\n" + "3: Spades\n" + "4: Hearts\n");
        int cardSUIT = sc.nextInt();
        
        System.out.println("Enter your card number from 1-10 and 11 -> JACK, 12 -> QUEEN, 13 -> KING");
        int cardNUMBER = sc.nextInt();
        
        //step 3: match with array 
        for(int i=0; i<magicHand.length; i++) {
            if(magicHand[i].getValue()== cardNUMBER && magicHand[i].getSuits()==Card.SUITS[cardSUIT-1])
                search=true;
            else
                search=false;
        } 
        if(search==true) {
            System.out.println("\nCongratualations!, Your card is found at ");
        }
        else {
            System.out.println("\nCard not found!");

        }
    }
    
}
