package crunchypencil.com.tarot1;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * Created by davidcahill on 11/12/14.
 */
public class PasPreFut extends Activity {

    boolean isGo0,isGo1,isGo2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        isGo0 = false;
        isGo1 = false;
        isGo2 = false;

        setContentView(R.layout.activity_pasprefut);

        final ImageView img0 = (ImageView) findViewById(R.id.paspresfutImage1);
        final ImageView img1 = (ImageView) findViewById(R.id.paspresfutImage2);
        final ImageView img2 = (ImageView) findViewById(R.id.paspresfutImage3);

        final String img0pick = Deck.tarotdeck[Deck.tempdeck[0]][2];
        final String img1pick = Deck.tarotdeck[Deck.tempdeck[1]][2];
        final String img2pick = Deck.tarotdeck[Deck.tempdeck[2]][2];

        final AnimatorSet setRightOut = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),
                R.animator.flight_right_out);
        final AnimatorSet setLeftIn = (AnimatorSet) AnimatorInflater.loadAnimator(getApplicationContext(),
                R.animator.flight_left_in);

        final MediaPlayer mp = MediaPlayer.create(PasPreFut.this, R.raw.turnover);

        img0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!isGo0) {
                    if (Deck.tarotdeck[Deck.tempdeck[0]][1].equals("false")) {  // turn image upside down if !cardUp
                        img0.setScaleX(-1);
                        img0.setScaleY(-1);
                    }
                    if (Deck.soundon) { mp.start(); }
                    setRightOut.setTarget(img0);

                    String uri0 = "@drawable/" + img0pick;
                    int imageResource0 = getResources().getIdentifier(uri0, null, getPackageName());
                    Drawable res0 = getResources().getDrawable(imageResource0);
                    img0.setImageDrawable(res0);

                    setLeftIn.setTarget(img0);
                    setRightOut.start();
                    setLeftIn.start();

                    isGo0 = true;
                } else {
                    Intent intent_0 = new Intent(PasPreFut.this, PasPreFut2.class);
                    Deck.hasBeenPicked[0] = true;
                    intent_0.putExtra("posit", 0);
                    startActivity(intent_0);
                    showAllCards();
                }
            }
        });

        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!isGo1) {
                    if (Deck.tarotdeck[Deck.tempdeck[1]][1].equals("false")) {  // turn image upside down if !cardUp
                        img1.setScaleX(-1);
                        img1.setScaleY(-1);
                    }
                    if (Deck.soundon) { mp.start(); }
                    setRightOut.setTarget(img1);

                    String uri1 = "@drawable/" + img1pick;
                    int imageResource1 = getResources().getIdentifier(uri1, null, getPackageName());
                    Drawable res1 = getResources().getDrawable(imageResource1);
                    img1.setImageDrawable(res1);

                    setLeftIn.setTarget(img1);
                    setRightOut.start();
                    setLeftIn.start();

                    isGo1 = true;
                } else {
                    Intent intent_1 = new Intent(PasPreFut.this, PasPreFut2.class);
                    Deck.hasBeenPicked[1] = true;
                    intent_1.putExtra("posit", 1);
                    startActivity(intent_1);
                    showAllCards();
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (!isGo2) {
                    if (Deck.tarotdeck[Deck.tempdeck[2]][1].equals("false")) {  // turn image upside down if !cardUp
                        img2.setScaleX(-1);
                        img2.setScaleY(-1);
                    }
                    if (Deck.soundon) { mp.start(); }
                    setRightOut.setTarget(img2);

                    String uri2 = "@drawable/" + img2pick;
                    int imageResource2 = getResources().getIdentifier(uri2, null, getPackageName());
                    Drawable res2 = getResources().getDrawable(imageResource2);
                    img2.setImageDrawable(res2);

                    setLeftIn.setTarget(img2);
                    setRightOut.start();
                    setLeftIn.start();

                    isGo2 = true;
                } else {
                    Intent intent_2 = new Intent(PasPreFut.this, PasPreFut2.class);
                    Deck.hasBeenPicked[2] = true;
                    intent_2.putExtra("posit", 2);
                    startActivity(intent_2);
                    showAllCards();
                }
            }
        });
    }

    public void showAllCards(){

        isGo0 = true;
        isGo1 = true;
        isGo2 = true;

        final ImageView img0 = (ImageView) findViewById(R.id.paspresfutImage1);
        final ImageView img1 = (ImageView) findViewById(R.id.paspresfutImage2);
        final ImageView img2 = (ImageView) findViewById(R.id.paspresfutImage3);

        final String img0pick = Deck.tarotdeck[Deck.tempdeck[0]][2];
        final String img1pick = Deck.tarotdeck[Deck.tempdeck[1]][2];
        final String img2pick = Deck.tarotdeck[Deck.tempdeck[2]][2];

        String uri0 = "@drawable/"+img0pick;
        int imageResource0 = getResources().getIdentifier(uri0, null, getPackageName());
        Drawable res0 = getResources().getDrawable(imageResource0);
        img0.setImageDrawable(res0);
        if(Deck.tarotdeck[Deck.tempdeck[0]][1].equals("false")) {
            img0.setScaleX(-1);
            img0.setScaleY(-1);
        }

        String uri1 = "@drawable/"+img1pick;
        int imageResource1 = getResources().getIdentifier(uri1, null, getPackageName());
        Drawable res1 = getResources().getDrawable(imageResource1);
        img1.setImageDrawable(res1);
        if(Deck.tarotdeck[Deck.tempdeck[1]][1].equals("false")) {
            img1.setScaleX(-1);
            img1.setScaleY(-1);
        }

        String uri2 = "@drawable/"+img2pick;
        int imageResource2 = getResources().getIdentifier(uri2, null, getPackageName());
        Drawable res2 = getResources().getDrawable(imageResource2);
        img2.setImageDrawable(res2);
        if(Deck.tarotdeck[Deck.tempdeck[2]][1].equals("false")) {
            img2.setScaleX(-1);
            img2.setScaleY(-1);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pasprefut, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        switch(item.getItemId()) {
            case R.id.action_shuffle:
                Intent intent_reshuffle = new Intent(this, ShufflePpf.class);
                finish();
                this.startActivity(intent_reshuffle);
                break;
            case R.id.action_shuff:
                Intent intent_shuff = new Intent(this, ShufflePpf.class);
                finish();
                this.startActivity(intent_shuff);
                break;
            case R.id.action_main:
                Intent intent_main = new Intent(this, SelectGame.class);
                Intent intent3 = new Intent(getApplicationContext(), SelectGame.class);
                intent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent3); // dump everything on top of SelectGame to remove back access
                finish();
                this.startActivity(intent_main);
                break;
            case R.id.action_randshuff:
                Intent intent_randshuff = new Intent(this, ShuffleDeck.class);
                finish();
                this.startActivity(intent_randshuff);
                break;
//            case R.id.action_info:
//                Intent intent_info = new Intent(this, Info.class);
//                finish();
//                this.startActivity(intent_info);
//                break;
            case R.id.action_ppf:
                Intent intent_ppf = new Intent(this, ShufflePpf.class);
                finish();
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