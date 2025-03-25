import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class problem10 {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static int numOfCards = suits.length * ranks.length;

    static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return new String[0][0];
        }
        String[][] players = new String[x][n];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            System.out.println(Arrays.toString(players[i]));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int x = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int n = scanner.nextInt();
        
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, n, x);
        printPlayers(players);
        scanner.close();
    }
}
