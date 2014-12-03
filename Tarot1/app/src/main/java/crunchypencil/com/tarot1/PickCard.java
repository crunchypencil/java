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
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.Toast;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;



/**
 * Created by davidcahill on 11/12/14.
 */
public class PickCard extends Activity{
    boolean carddown = false;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        int orient = getResources().getConfiguration().orientation;
        //if (orient==2){
            //getActionBar().hide();  //hide if orientation is horizontal
        //}

        setContentView(R.layout.activity_pick);

        if(Deck.count==Deck.tempdeck.length){

            TextView cardNameValue = (TextView) findViewById(R.id.pickCard1);
            cardNameValue.setText("empty");

        } else {

            CardGenerate current = new CardGenerate(Deck.tempdeck[Deck.count], true);

            String uri = "@drawable/"+current.cardImage;

            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            final ImageView cardimg = (ImageView)findViewById(R.id.pickacardView);
            Drawable res = getResources().getDrawable(imageResource);
            cardimg.setImageDrawable(res);


            if(!CardGenerate.cardUp) {  // turn image upside down if !cardUp
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

            cardimg.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v){

                    ImageView moveitdown = (ImageView) findViewById(R.id.pickacardView);
                    Context context1 = getApplicationContext();
                    Animation cardSlideAnimation1 = AnimationUtils.loadAnimation(context1, R.anim.move_down);
                    Animation cardSlideAnimation2 = AnimationUtils.loadAnimation(context1, R.anim.move_up);
                    MediaPlayer mp1 = MediaPlayer.create(PickCard.this, R.raw.place);

                    if(carddown){
                        moveitdown.startAnimation(cardSlideAnimation2);
                        cardSlideAnimation2.setFillAfter(true);
                        carddown = false;
                        if (Deck.soundon) {
                            mp1.start();
                        }
                    } else {
                        //cardimg.setVisibility(View.INVISIBLE);
                        moveitdown.startAnimation(cardSlideAnimation1);
                        cardSlideAnimation1.setFillAfter(true);
                        carddown = true;
                        if (Deck.soundon) {
                            mp1.start();
                        }
                    }
                }
            });

            TextView tv1 = (TextView) findViewById(R.id.pickCard3);
            tv1.setMovementMethod(new ScrollingMovementMethod());

            TextView tv2 = (TextView) findViewById(R.id.pickCard5);
            tv2.setMovementMethod(new ScrollingMovementMethod());

            if(Deck.soundon) {
                MediaPlayer mp2 = MediaPlayer.create(PickCard.this, R.raw.turnover);
                mp2.start();
            }
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

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        switch(item.getItemId()) {
            case R.id.action_shuffle:
                Intent intent_shuffle = new Intent(this, ShuffleDeck.class);
                this.startActivity(intent_shuffle);
                break;
            case R.id.action_shuff:
                Intent intent_shuff = new Intent(this, ShuffleDeck.class);
                this.startActivity(intent_shuff);
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
                this.startActivity(intent_info);
                break;
            case R.id.action_ppf:
                Intent intent_ppf = new Intent(this, PasPreFut.class);
                this.startActivity(intent_ppf);
                break;
            case R.id.action_sound:
                if(Deck.soundon){
                    Deck.soundon = false;
                    Toast toast = Toast.makeText(context, "Sound OFF", duration);
                    toast.show();
                } else {
                    Deck.soundon = true;
                    MediaPlayer mp2 = MediaPlayer.create(PickCard.this, R.raw.place);
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
