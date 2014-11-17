package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by davidcahill on 11/12/14.
 */
public class ShuffleDeck extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuffle);

        Deck.tempdeck = Deck.shuffleArray(Deck.temparray);
        Deck.count = 0;

    }

    /*public static int[] makeArray() {
        int[] sample = new int[Deck.tempdeck.length];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = i;
        }
        return sample;
    }

    public static int[] shuffleArray(int[] numbers) {

        for (int i = numbers.length - 1; i > 0; i--) {
            int select = (int) (Math.random() * (i + 1)); // 0 <= select <= i

            // swap current value with selected value
            int temp = numbers[i];
            numbers[i] = numbers[select];
            numbers[select] = temp;
        }
        return numbers;
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_shuffle:
                Intent intent_shuffle = new Intent(this, ShuffleDeck.class);
                this.startActivity(intent_shuffle);
                break;
            case R.id.action_pick:
                Intent intent_pick = new Intent(this, PickCard.class);
                this.startActivity(intent_pick);
                break;
            case R.id.action_home:
                Intent intent_home = new Intent(this, MainActivity.class);
                this.startActivity(intent_home);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }


}
