import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Poker{
    private int HandSize = 2; //smallest amount that you can play with 
    private String again = "yes";

    Scanner in = new Scanner(System.in);
    Deck deck = new Deck();
    handSize = in.nextInt();
    ArrayList hands = new ArrayList<>();

    public void play() {
        while (again.equals("yes")) {
            deck = new Deck();
            deck.shuffle();
            
            

        }
    }
}


