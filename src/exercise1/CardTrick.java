package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author kamal
 * @author Kamaljeet Kaur Jan 25, 2023
 modifier kamal
 fetch+merge branch code
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            //card.setValue(insert call to random number generator here)
            card.setValue((int)(1+(Math.random()*13)));
            
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here]) 
             card.setSuit(Card.SUITS[(int)(1+(Math.random()*3))]);
             hand[i]=card;
             /*System.out.println("Values for card by computer were ="+hand[i].getValue());
             System.out.println("Values for suit by computer were="+hand[i].getSuit());
             System.out.println();*/
             

           
             // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        System.out.println("Guess the value of card from 1 to 13 = ");
        int value=sc.nextInt();
        
        System.out.println("Guess the suit of the card from 1 to 4 = ");
        int suit=sc.nextInt();
        
        // and search the hand here.
        Card guess=new Card();
        guess.setValue(value);
        guess.setSuit(Card.SUITS[suit-1]);
        

        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        boolean win=false;
        for(int i=0; i<hand.length; i++)
        {
            if((hand[i].getValue()== guess.getValue()) && (hand[i].getSuit()== guess.getSuit())){
                win=true;
              // If the guess is successful, invoke the printInfo() method below.
                printInfo();
                break;
            }
        }
        if(!win){
            System.out.println("Sorry, You lost! Card not found, TRY AGAIN!!!!!");
        }
        
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Kamaljeet Kaur Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Kamaljeet Kaur, but you can call me Kamal");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more studious this semester and attain good GPA [ i.e. 4 :) ]");
        System.out.println("-- Have a lot of fun this semester");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Cooking");
        System.out.println("-- Watching T.V.");
        System.out.println("-- Playing");
        System.out.println("-- Sleeping");

        System.out.println();
        
    
    }

}
