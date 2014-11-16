package crunchypencil.com.tarot1;

/**
 * Created by davidcahill on 11/15/14.
 */
public class CardGenerate {

    String cardName;
    String cardImage;
    String cardDescribe;
    String cardMeaning;
    //boolean cardUp;

    public CardGenerate (int index/*, boolean up*/) {

        cardDescribe = Deck.tarotdeck[index][4];

        double invran = Math.random();
        if (invran <= .5) {
            cardName = Deck.tarotdeck[index][0];
            cardImage = Deck.tarotdeck[index][2];
            cardMeaning = Deck.tarotdeck[index][5];
        } else {
            cardName = Deck.tarotdeck[index][0] + ", inverted";
            cardImage = Deck.tarotdeck[index][3];
            cardMeaning = Deck.tarotdeck[index][6];
        }
    }
}