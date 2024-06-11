import java.util.Scanner;

public class PokerGame {
    private Deck deck;
    private Player[] players;

    public PokerGame(int numberOfPlayers) {
        deck = new Deck();
        players = new Player[numberOfPlayers];

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter name for player " + (i + 1) + ": ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            players[i] = new Player(name);
        }
    }

    public void dealCards() {
        for (int i = 0; i < players.length; i++) {
            for (Player player : players) {
                player.addCardToHand(deck.dealCard());
            }
        }
    }

    public void showHands() {
        for (Player player : players) {
            player.showHand();
        }
    }
    //Determine winner by high card
    public void determineWinner() {
        Player winner = players[0];
        for (Player player : players) {
            if (player.getHighestCardValue() > winner.getHighestCardValue()) {
                winner = player;
            }
        }
        System.out.println("The winner is " + winner.getName() + " with the highest card value of " + winner.getHighestCardValue());
    }

    public static void main(String[] args) {
        PokerGame game = new PokerGame(2); // Change the number of players as needed
        game.dealCards();
        game.showHands();
        game.determineWinner();
    }
}



