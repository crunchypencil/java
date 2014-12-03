package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
public class PasPreFut extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasprefut);

        if(Deck.soundon) {
            MediaPlayer mp = MediaPlayer.create(PasPreFut.this, R.raw.shuffling);
            mp.start();
        }

        //Deck.tempdeck = Deck.shuffleArray(Deck.temparray);
        //Deck.count = 0;

        /*Object[] cardarr = new Object[3];
        cardarr[0] = new CardGenerate(Deck.tempdeck[0], true);
        cardarr[0].cardImage()
        cardarr[1] = new CardGenerate(Deck.tempdeck[1], true);
        cardarr[2] = new CardGenerate(Deck.tempdeck[2], true);



        ImageView ppfpast = (ImageView) findViewById(R.id.paspresfutImage1);
        ImageView ppfpres = (ImageView) findViewById(R.id.paspresfutImage2);
        ImageView ppffutu = (ImageView) findViewById(R.id.paspresfutImage3);

        String uri = "@drawable/"+current.cardImage;
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        final ImageView cardimg = (ImageView)findViewById(R.id.pickacardView);
        Drawable res = getResources().getDrawable(imageResource);
        cardimg.setImageDrawable(res);*/



        ImageView img1 = (ImageView) findViewById(R.id.paspresfutImage1);
        //img1.setImageResource(R.drawable.fatebrowser_deck);
        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Deck.count = 0;
                startActivity(new Intent(PasPreFut.this, PickCard.class));
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.paspresfutImage2);
        //img1.setImageResource(R.drawable.fatebrowser_deck);
        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Deck.count = 1;
                startActivity(new Intent(PasPreFut.this, PickCard.class));
            }
        });

        ImageView img3 = (ImageView) findViewById(R.id.paspresfutImage3);
        //img1.setImageResource(R.drawable.fatebrowser_deck);
        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Deck.count = 2;
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
