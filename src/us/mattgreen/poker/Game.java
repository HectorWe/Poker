package us.mattgreen.poker;

import java.util.*;

import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Face.SEVEN;
import static us.mattgreen.poker.Suit.*;

/**
 * This is a utility class consisting of static methods to determine if a hand matches a specific
 * @author  Dr. Green
 * @version 1.0
 */
public class Game {
    /**
     *
     * @param hand An Array of Cards
     * @return True if there are two of a kind and false if not
     */

    List<Card> hand = new ArrayList<>();

    public Game() {
        hand.add(new Card(JACK,CLUBS, 11));
        hand.add(new Card(FIVE,CLUBS, 5));
        hand.add(new Card(JACK,SPADES, 11));
        hand.add(new Card(FOUR,SPADES, 4));
        hand.add(new Card(SEVEN,DIAMONDS, 7));
    }

    public static void sortByNumber(Card[] T) {
        Arrays.sort( T , (a, b) -> a.getFace().compareTo(b.getFace()));
    }

    public static boolean twoOfAKind(Card[] hand) {
        sortByNumber(hand);
        //Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        for(int i=0;i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) {
                return true;
            }
        }
        return false;
    }

    public static boolean threeOfAKind(Card[] hand2) {
        sortByNumber(hand2);
        for(int i=0;i < hand2.length-1; i++) {
            if ( (hand2[0].getFace().equals(hand2[1].getFace()) && hand2[1].getFace().equals(hand2[2].getFace())) ||
                    (hand2[2].getFace().equals(hand2[3].getFace()) && hand2[3].getFace().equals(hand2[4].getFace()))
            ) {
                return true;
            }
        }
        return false;
    }

    public static boolean fourOfAKind(Card[] hand3) {
        sortByNumber(hand3);
        for(int i=0;i < hand3.length-1; i++) {
            if ( (hand3[0].getFace().equals(hand3[1].getFace()) && hand3[1].getFace().equals(hand3[2].getFace()) && hand3[2].getFace().equals(hand3[3].getFace()) ||  hand3[1].getFace().equals(hand3[2].getFace()) && hand3[2].getFace().equals(hand3[3].getFace()) && hand3[3].getFace().equals(hand3[4].getFace()))
            ) {
                return true;
            }
        }
        return false;
    }

    public static boolean flush(Card[] hand4) {
        sortByNumber(hand4);
        for(int i=0;i < hand4.length-1; i++) {
            if (!hand4[i].getSuit().equals(hand4[i+1].getSuit())) {
                return false;
            }
        }
        return true;
    }

    public static boolean fullHouse(Card[] hand5) {
        if ( twoOfAKind(hand5)&&threeOfAKind(hand5) ) {
            return true;
        }
        return false;
    }

    public String getHand() {
        String hands = "";
        for (Card card : hand) {
            hands += card.toString() + "\n";
        }
        return hands;
    }

}
