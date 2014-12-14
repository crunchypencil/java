package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.media.MediaPlayer;
import android.widget.Toast;
import android.content.Context;


/**
 * Created by davidcahill on 11/12/14.
 */
public class ShuffleDeck extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuffle);

        Deck.tempdeck = Deck.shuffleArray(Deck.temparray);
        Deck.tarotdeck = Deck.addFlip(Deck.deck);
        Deck.count = 0;

        ImageView shufimg = (ImageView) findViewById(R.id.shuffledeckView);

        shufimg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
                startActivity(new Intent(ShuffleDeck.this, PickCard.class));
            }
        });

        if(Deck.soundon) {
            MediaPlayer mp = MediaPlayer.create(ShuffleDeck.this, R.raw.shuffling);
            mp.start();
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "Shuffle", duration);
        toast.show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rand, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        switch(item.getItemId()) {
            case R.id.action_shuffle:
                Intent intent_shuffle = new Intent(this, ShuffleDeck.class);
                finish();
                this.startActivity(intent_shuffle);
                break;
            case R.id.action_shuff:
                Intent intent_shuff = new Intent(this, ShuffleDeck.class);
                finish();
                this.startActivity(intent_shuff);
                break;
            case R.id.action_randshuff:
                Intent intent_randshuff = new Intent(this, ShuffleDeck.class);
                finish();
                this.startActivity(intent_randshuff);
                break;
            case R.id.action_pick:
                Intent intent_pick = new Intent(this, PickCard.class);
                finish();
                this.startActivity(intent_pick);
                break;
            case R.id.action_pic:
                Intent intent_pic = new Intent(this, PickCard.class);
                finish();
                this.startActivity(intent_pic);
                break;
            case R.id.action_info:
                Intent intent_info = new Intent(this, Info.class);
                finish();
                this.startActivity(intent_info);
                break;
            case R.id.action_ppf:
                Intent intent_ppf = new Intent(this, PasPreFut.class);
                finish();
                Deck.tempdeck = Deck.shuffleArray(Deck.temparray);
                Deck.tarotdeck = Deck.addFlip(Deck.deck);
                Deck.count = 0;
                this.startActivity(intent_ppf);
                break;
            case R.id.action_sound:
                if(Deck.soundon){
                    Deck.soundon = false;
                    Toast toast = Toast.makeText(context, "Sound OFF", duration);
                    toast.show();
                } else {
                    Deck.soundon = true;
                    MediaPlayer mp2 = MediaPlayer.create(ShuffleDeck.this, R.raw.place);
                    mp2.start();
                    Toast toast = Toast.makeText(context, "Sound ON", duration);
                    toast.show();
                }
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }


}
