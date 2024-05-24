import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void showHand() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public int getHighestCardValue() {
        int highest = 0;
        for (Card card : hand) {
            if (card.getValue() > highest) {
                highest = card.getValue();
            }
        }
        return highest;
    }
}

