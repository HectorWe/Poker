package us.mattgreen.poker;

import java.util.ArrayList;
import java.util.List;

import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;

public class Main {

    public static void main(String[] args) {

        Card[] hand = new Card[]{
                new Card(JACK,CLUBS, 11),
                new Card(FIVE,CLUBS, 5),
                new Card(JACK,SPADES, 11),
                new Card(FOUR,SPADES, 4),
                new Card(SEVEN,DIAMONDS, 7)};

        if (Game.twoOfAKind(hand) == true) {
            System.out.println("You have two of kinds!");
        } else if (Game.threeOfAKind(hand) == true) {
            System.out.println("You have three of kinds!");
        }else if (Game.fourOfAKind(hand) == true) {
            System.out.println("You have four of kinds!");
        }else if (Game.flush(hand) == true) {
            System.out.println("You have flushed!");
        }else if (Game.fullHouse(hand) == true) {
            System.out.println("You have full house!");
        }


    }
}
