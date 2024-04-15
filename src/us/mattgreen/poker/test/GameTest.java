package us.mattgreen.poker.test;

import org.junit.Before;
import org.junit.Test;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Game;

import static org.junit.Assert.assertTrue;
import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;

public class GameTest {
    private Card[] hand;
    private Card[] hand2;
    private Card[] hand3;
    private Card[] hand4;
    private Card[] hand5;

    @Before
    public void setUp() {
        hand = new Card[]{new Card(JACK,CLUBS, 11), new Card(FIVE,CLUBS, 5), new Card(JACK,SPADES, 11), new Card(FOUR,SPADES, 4), new Card(SEVEN,DIAMONDS, 7)};

        hand2 = new Card[]{new Card(JACK,CLUBS, 11), new Card(FIVE,CLUBS, 5), new Card(JACK,SPADES, 11), new Card(FOUR,SPADES, 4), new Card(JACK,DIAMONDS, 11)};

        hand3 = new Card[]{new Card(EIGHT,CLUBS, 8), new Card(EIGHT,DIAMONDS, 8), new Card(EIGHT,SPADES, 8), new Card(EIGHT,HEARTS, 8), new Card(KING,CLUBS, 13)};

        hand4 = new Card[]{new Card(JACK,CLUBS, 11), new Card(FIVE,CLUBS, 5), new Card(TWO,CLUBS, 2), new Card(FOUR,CLUBS, 4), new Card(KING,CLUBS, 13)};

        hand5 = new Card[]{new Card(JACK,CLUBS, 11), new Card(JACK,HEARTS, 11), new Card(THREE,DIAMONDS, 3), new Card(THREE,CLUBS, 3), new Card(THREE,SPADES, 3)};
    }

    @Test
    public void twoOfAKindTest() {
        assertTrue("Two of a kind should have matched",Game.twoOfAKind(hand));
    }

    @Test
    public void threeOfAKindTest() {
        assertTrue("Three of a kind should have matched",Game.threeOfAKind(hand2));
    }

    @Test
    public void fourOfAKind() {
        assertTrue("Four of a kind should have matched",Game.fourOfAKind(hand3));
    }

    @Test
    public void flush() {
        assertTrue("Flush of suit should have matched",Game.flush(hand4));
    }

    @Test
    public void fullHouse() {
        assertTrue("FullHouse you have to have a pair matched and three matched",Game.fullHouse(hand5));
    }

}
