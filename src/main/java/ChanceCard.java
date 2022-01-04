import java.util.*;
import java.lang.Math;
public abstract class ChanceCard {
    private String description;
    private String name;
    private int card;
    private ChanceCard[] deck;

    public ChanceCard(String description, String name, int card) {
        this.description = description;
        this.name = name;
        this.card = card;
    }
    public abstract int getCard();
    public void shuffleCard() {
        //Method that shuffles cards.
        Random r = new Random();

        //Shuffles cards.
        for (int i = 0; i < deck.length; i++) {
            int indexSwap = r.nextInt(deck.length);

            ChanceCard temp = deck[indexSwap];
            deck[indexSwap] = deck[i];
            deck[i] = temp;
        }
    }
    public ChanceCard drawCard() {
        // Method that draws and returns the top card in the deck and afterwards places the card in the bottom of the deck
        ChanceCard card;
        card = deck[0];

        for(int i = 0; i < deck.length; i++) {
            if(i > 0) {
                deck[i - 1] = deck[i];
            }
            deck[i] = card;
        }
        return card;
    }
}
