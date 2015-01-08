package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.content.Context;
import android.widget.Toast;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Deck.tempdeck = Deck.shuffleArray(Deck.temparray);
        Deck.tarotdeck = Deck.addFlip(Deck.deck);
        Deck.count = 0;

        ImageView img = (ImageView) findViewById(R.id.mainlogoImage);
        //ImageView myImageView= (ImageView)findViewById(R.id.myImageView);
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        img.startAnimation(myFadeInAnimation); //Set animation to your ImageView

        img.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, SelectGame.class));
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        switch(item.getItemId()) {
            case R.id.action_shuffle:
                Intent intent_shuffle = new Intent(this, ShuffleDeck.class);
                this.startActivity(intent_shuffle);
                break;
//            case R.id.action_shuff:
//                Intent intent_shuff = new Intent(this, ShuffleDeck.class);
//                this.startActivity(intent_shuff);
//                break;
            case R.id.action_randshuff:
                Intent intent_randshuff = new Intent(this, ShuffleDeck.class);
                this.startActivity(intent_randshuff);
                break;
//            case R.id.action_pick:
//                Intent intent_pick = new Intent(this, PickCard.class);
//                this.startActivity(intent_pick);
//                break;
//            case R.id.action_pic:
//                Intent intent_pic = new Intent(this, PickCard.class);
//                this.startActivity(intent_pic);
//                break;
            case R.id.action_info:
                Intent intent_info = new Intent(this, Info.class);
                this.startActivity(intent_info);
                break;
            case R.id.action_ppf:
                Intent intent_ppf = new Intent(this, ShufflePpf.class);
                this.startActivity(intent_ppf);
                break;
            case R.id.action_ccr:
                Intent intent_ccr = new Intent(this, ShuffleCcr.class);
                finish();
                this.startActivity(intent_ccr);
                break;
            case R.id.action_sound:
                if(Deck.soundon){
                    Deck.soundon = false;
                    Toast toast = Toast.makeText(context, "Sound OFF", duration);
                    toast.show();
                } else {
                    Deck.soundon = true;
                    MediaPlayer mp2 = MediaPlayer.create(MainActivity.this, R.raw.place);
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
