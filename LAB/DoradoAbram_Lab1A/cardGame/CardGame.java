package ph.edu.upm.students.DoradoAbram_Lab1A.cardGame;

import ph.edu.upm.students.DoradoAbram_Lab1A.Menu;
import ph.edu.upm.students.DoradoAbram_Lab1A.vehicleApp.IActivity;

import java.util.Scanner;
import java.util.Random;

public class CardGame implements IActivity {

    public void showDescription() {

        System.out.println("PROGRAM DESCRIPTION:");
        System.out.println("This program that simulates the simple card game of 21.");
        System.out.println("A single player draws a card from a standard deck of 52 cards. An ace is worth 1 and a face card (J, Q, K) is worth 10.");
        System.out.println("Once a card is drawn, it cannot be drawn again. player should be able to get as close to 21 without going over.");
        System.out.println("The program should output the cards drawn and the score after each draw, and it should allow the player to quit at any time. ");
        System.out.println();
    }

    public void execute() {
        Menu menu = new Menu();

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME PLAYER!");
        System.out.println("Deck of 52 cards");

        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"}; //initialising the suits of the deck in a String array named 'SUITS'
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; //initialising the ranks of the deck in a String array named 'RANKS'

        // initialize deck
        int n = SUITS.length * RANKS.length; // a deck consists of 4*13 cards
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }
        // shuffle the dek
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i)); //using random function
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp; //swapping and shuffling
        }

        int i = 0;
        int score = 0;
        do {
            System.out.println("Would you like to draw? y or n");
            String ans = input.next();

            if (ans.equals("y")) {

                if (i == 52) {
                    System.out.println("empty");
                    System.exit(0);
                }
                System.out.println(deck[i]); //displaying a random card

                //Make a score for each draw
                if (deck[i].equals("Ace of Hearts") || deck[i].equals("Ace of Spades") || deck[i].equals("Ace of Diamonds") || deck[i].equals("Ace of Clubs")) {
                    score += 1;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("2 of Hearts") || deck[i].equals("2 of Spades") || deck[i].equals("2 of Diamonds") || deck[i].equals("2 of Clubs")) {
                    score += 2;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("3 of Hearts") || deck[i].equals("3 of Spades") || deck[i].equals("3 of Diamonds") || deck[i].equals("3 of Clubs")) {
                    score += 3;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("4 of Hearts") || deck[i].equals("4 of Spades") || deck[i].equals("4 of Diamonds") || deck[i].equals("4 of Clubs")) {
                    score += 4;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("5 of Hearts") || deck[i].equals("5 of Spades") || deck[i].equals("5 of Diamonds") || deck[i].equals("5 of Clubs")) {
                    score += 5;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("6 of Hearts") || deck[i].equals("6 of Spades") || deck[i].equals("6 of Diamonds") || deck[i].equals("6 of Clubs")) {
                    score += 6;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("7 of Hearts") || deck[i].equals("7 of Spades") || deck[i].equals("7 of Diamonds") || deck[i].equals("7 of Clubs")) {
                    score += 7;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("8 of Hearts") || deck[i].equals("8 of Spades") || deck[i].equals("8 of Diamonds") || deck[i].equals("8 of Clubs")) {
                    score += 8;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("9 of Hearts") || deck[i].equals("9 of Spades") || deck[i].equals("9 of Diamonds") || deck[i].equals("9 of Clubs")) {
                    score += 9;
                    System.out.println("Score:" + score);
                }
                if (deck[i].equals("10 of Hearts") || deck[i].equals("10 of Spades") || deck[i].equals("10 of Diamonds") || deck[i].equals("10 of Clubs") ||
                        deck[i].equals("Jack of Hearts") || deck[i].equals("Jack of Spades") || deck[i].equals("Jack of Diamonds") || deck[i].equals("Jack of Clubs") ||
                        deck[i].equals("Queen of Hearts") || deck[i].equals("Queen of Spades") || deck[i].equals("Queen of Diamonds") || deck[i].equals("Queen of Clubs") ||
                        deck[i].equals("King of Hearts") || deck[i].equals("King of Spades") || deck[i].equals("King of Diamonds") || deck[i].equals("King of Clubs")) {
                    score += 10;
                    System.out.println("Score:" + score);
                }

                if (score > 21) {
                    System.out.println("YOU LOSE :(");
                    System.exit(0);
                }
                if (score == 21) {
                    System.out.println("YOU WON!");
                    System.exit(0);
                }

                deck[i] = "empty";
                i++;

            } else
                menu.startMenuProgram();
                //System.exit(0);
        } while (true);
    }
}