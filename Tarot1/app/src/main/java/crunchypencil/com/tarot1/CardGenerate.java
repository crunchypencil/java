package crunchypencil.com.tarot1;

/**
 * Created by davidcahill on 11/15/14.
 */
public class CardGenerate {

    String cardName;
    String cardImage;
    String cardDescribe;
    String cardMeaning;
    String cardFlip;
    static boolean cardUp;

    public CardGenerate (int index, boolean flip) {

        cardDescribe = Deck.tarotdeck[index][4];
        cardImage = Deck.tarotdeck[index][2];
        cardFlip = Deck.tarotdeck[index][1];

        if (cardFlip.equals("false")) {
                cardName = Deck.tarotdeck[index][0] + ", inverted";
                cardMeaning = Deck.tarotdeck[index][6];
                cardUp = false;
        } else {
            cardName = Deck.tarotdeck[index][0];
            cardMeaning = Deck.tarotdeck[index][5];
            cardUp = true;
        }
    }
}