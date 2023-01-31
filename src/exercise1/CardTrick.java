package exercise1;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Ramneek Singh Aneja Jan 31 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            int value = (int) (Math.random() * 13) + 1;
            int suit = (int) (Math.random() * 4);
            card.setValue(value);
            card.setSuit(Card.SUITS[suit]);
            hand[i] = card;

            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        System.out.println("Pick a card: any card.");
        System.out.println("Tell the value of the card (Enter 1-13)");
        int userValue = input.nextInt();
        System.out.println("Tell the Suit of the Card (Enter 1-4)");
        int userSuit = input.nextInt();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]);

        // Search the hand for the user's card
        boolean found = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report whether the user's card is in the hand and invoke printInfo() if it is
        if (found) {
            System.out.println("Your card is in the hand!");
            printInfo();
        } else {
            System.out.println("Your card is not in the hand.");
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here.
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        //
        // Then loop through the cards in the array to see if there's a match.

        // If the guess is successful, invoke the printInfo() method below.

    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
