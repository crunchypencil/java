package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.view.View;

/**
 * Created by davidcahill on 11/12/14.
 */
public class PickCard extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);

        if(Deck.count==Deck.tempdeck.length){

            TextView cardNameValue = (TextView) findViewById(R.id.pickCard1);
            cardNameValue.setText("empty");

        } else {

            CardGenerate current = new CardGenerate(Deck.tempdeck[Deck.count]);

            TextView cardNameValue = (TextView) findViewById(R.id.pickCard1);
            cardNameValue.setText(current.cardName);
            TextView cardImageValue = (TextView) findViewById(R.id.pickCard2);
            cardImageValue.setText(current.cardImage);
            TextView cardDescribeValue = (TextView) findViewById(R.id.pickCard3);
            cardDescribeValue.setText(current.cardDescribe);
            TextView cardMeaningValue = (TextView) findViewById(R.id.pickCard4);
            cardMeaningValue.setText(current.cardMeaning);
            cardMeaningValue.setMovementMethod(new ScrollingMovementMethod());

            Deck.count++;

        }

        /*Button shuffler = (Button) findViewById(R.id.shufflebutton);
        shuffler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(this, ShuffleDeck.class);
                startActivity(intent);
            }
        });*/

    }


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
