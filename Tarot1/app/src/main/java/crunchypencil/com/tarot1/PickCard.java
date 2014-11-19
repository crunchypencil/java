package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.text.method.ScrollingMovementMethod;


/**
 * Created by davidcahill on 11/12/14.
 */
public class PickCard extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        int orient = getResources().getConfiguration().orientation;
        if (orient==2){
            getActionBar().hide();  //hide if orientation is horizontal
        }

        setContentView(R.layout.activity_pick);

        if(Deck.count==Deck.tempdeck.length){

            TextView cardNameValue = (TextView) findViewById(R.id.pickCard1);
            cardNameValue.setText("empty");

        } else {

            CardGenerate current = new CardGenerate(Deck.tempdeck[Deck.count]);

            ImageView cardimg = (ImageView) findViewById(R.id.pickacardView);

            String imageName = "back";
            int resID = getResources().getIdentifier(imageName, "drawable", "package.name");
            cardimg.setImageResource(resID);


            if(!CardGenerate.cardUp) { // turn image upside down if !cardUp
                cardimg.setScaleX(-1);
                cardimg.setScaleY(-1);
            }

            TextView cardNameValue = (TextView) findViewById(R.id.pickCard1);
            cardNameValue.setText(current.cardName);
            TextView cardDescribeValue = (TextView) findViewById(R.id.pickCard3);
            cardDescribeValue.setText(current.cardDescribe);
            TextView cardMeaningValue = (TextView) findViewById(R.id.pickCard5);
            cardMeaningValue.setText(current.cardMeaning);

            Deck.count++;

            final ImageView pickView1 = (ImageView) findViewById(R.id.pickacardView);

            pickView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    pickView1.setVisibility(View.INVISIBLE);
                    MediaPlayer mp1 = MediaPlayer.create(PickCard.this, R.raw.place);
                    mp1.start();
                    getActionBar().show();
                }
            });

            TextView tv1 = (TextView) findViewById(R.id.pickCard3);
            tv1.setMovementMethod(new ScrollingMovementMethod());

            TextView tv2 = (TextView) findViewById(R.id.pickCard5);
            tv2.setMovementMethod(new ScrollingMovementMethod());

            MediaPlayer mp2 = MediaPlayer.create(PickCard.this, R.raw.turnover);
            mp2.start();

        }

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
