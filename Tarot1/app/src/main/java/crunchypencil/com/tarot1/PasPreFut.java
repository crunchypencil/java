package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.Toast;


/**
 * Created by davidcahill on 11/12/14.
 */
public class PasPreFut extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasprefut);

        if(Deck.soundon) {
            MediaPlayer mp = MediaPlayer.create(PasPreFut.this, R.raw.shuffling);
            mp.start();
        }

        final ImageView img0 = (ImageView) findViewById(R.id.paspresfutImage1);
        final ImageView img1 = (ImageView) findViewById(R.id.paspresfutImage2);
        final ImageView img2 = (ImageView) findViewById(R.id.paspresfutImage3);

        final String img0pick = Deck.tarotdeck[Deck.tempdeck[0]][2];
        final String img1pick = Deck.tarotdeck[Deck.tempdeck[1]][2];
        final String img2pick = Deck.tarotdeck[Deck.tempdeck[2]][2];

        img0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Deck.count = 0;
                String uri = "@drawable/"+img0pick;
                int imageResource0 = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res0 = getResources().getDrawable(imageResource0);
                img0.setImageDrawable(res0);
                if(Deck.tarotdeck[Deck.tempdeck[0]][1].equals("false")) {  // turn image upside down if !cardUp
                    img0.setScaleX(-1);
                    img0.setScaleY(-1);
                }
                startActivity(new Intent(PasPreFut.this, PickCard.class));
            }
        });


        //img1.setImageResource(R.drawable.fatebrowser_deck);
        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Deck.count = 1;
                String uri = "@drawable/"+img1pick;
                int imageResource1 = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res1 = getResources().getDrawable(imageResource1);
                img1.setImageDrawable(res1);
                if(Deck.tarotdeck[Deck.tempdeck[1]][1].equals("false")) {  // turn image upside down if !cardUp
                    img1.setScaleX(-1);
                    img1.setScaleY(-1);
                }
                startActivity(new Intent(PasPreFut.this, PickCard.class));
            }
        });


        //img1.setImageResource(R.drawable.fatebrowser_deck);
        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Deck.count = 2;
                String uri = "@drawable/"+img2pick;
                int imageResource2 = getResources().getIdentifier(uri, null, getPackageName());
                Drawable res2 = getResources().getDrawable(imageResource2);
                img2.setImageDrawable(res2);
                if(Deck.tarotdeck[Deck.tempdeck[2]][1].equals("false")) {  // turn image upside down if !cardUp
                    img2.setScaleX(-1);
                    img2.setScaleY(-1);
                }
                startActivity(new Intent(PasPreFut.this, PickCard.class));
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
            case R.id.action_shuff:
                Intent intent_shuff = new Intent(this, ShuffleDeck.class);
                this.startActivity(intent_shuff);
                break;
            case R.id.action_pick:
                Intent intent_pick = new Intent(this, PickCard.class);
                this.startActivity(intent_pick);
                break;
            case R.id.action_pic:
                Intent intent_pic = new Intent(this, PickCard.class);
                this.startActivity(intent_pic);
                break;
            case R.id.action_info:
                Intent intent_info = new Intent(this, Info.class);
                this.startActivity(intent_info);
                break;
            case R.id.action_ppf:
                Intent intent_ppf = new Intent(this, PasPreFut.class);
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
                    MediaPlayer mp2 = MediaPlayer.create(PasPreFut.this, R.raw.place);
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
