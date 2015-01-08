package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.Toast;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


/**
 * Created by davidcahill on 11/12/14.
 */
public class CelticCross extends Activity {

    static CelticCross2.MyAdapter mAdapter;
    static ViewPager mPager;
    public static final String PACKAGE_NAME = "crunchypencil.com.tarot1";



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celtic);

        final ImageView img0 = (ImageView) findViewById(R.id.celtic0);
        final ImageView img1 = (ImageView) findViewById(R.id.celtic1);
        final ImageView img2 = (ImageView) findViewById(R.id.celtic2);
        final ImageView img3 = (ImageView) findViewById(R.id.celtic3);
        final ImageView img4 = (ImageView) findViewById(R.id.celtic4);
        final ImageView img5 = (ImageView) findViewById(R.id.celtic5);
        final ImageView img6 = (ImageView) findViewById(R.id.celtic6);
        final ImageView img7 = (ImageView) findViewById(R.id.celtic7);
        final ImageView img8 = (ImageView) findViewById(R.id.celtic8);
        final ImageView img9 = (ImageView) findViewById(R.id.celtic9);



        if(Deck.soundon) {
            MediaPlayer mp2 = MediaPlayer.create(CelticCross.this, R.raw.turnover);
            mp2.start();
        }

        

//        img1.setPivotX(50);
//        img1.setPivotY(50);
        img0.bringToFront();
        Animation cardSlideAnimation2 = AnimationUtils.loadAnimation(this, R.anim.turn_side);
        img0.startAnimation(cardSlideAnimation2);



        img0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_0 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[0] = true;
                intent_0.putExtra("posit", 0);
                startActivity(intent_0);
            }
        });

        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_1 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[1] = true;
                intent_1.putExtra("posit", 1);
                startActivity(intent_1);
            }
        });

        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_2 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[2] = true;
                intent_2.putExtra("posit", 2);
                startActivity(intent_2);
            }
        });

        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_3 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[3] = true;
                intent_3.putExtra("posit", 3);
                startActivity(intent_3);
            }
        });

        img4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_4 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[4] = true;
                intent_4.putExtra("posit", 4);
                startActivity(intent_4);
            }
        });

        img5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_5 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[5] = true;
                intent_5.putExtra("posit", 5);
                startActivity(intent_5);
            }
        });

        img6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_6 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[6] = true;
                intent_6.putExtra("posit", 6);
                startActivity(intent_6);
            }
        });

        img7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_7 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[7] = true;
                intent_7.putExtra("posit", 7);
                startActivity(intent_7);
            }
        });

        img8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_8 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[8] = true;
                intent_8.putExtra("posit", 8);
                startActivity(intent_8);
            }
        });

        img9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showAllCards();
                Intent intent_9 = new Intent(CelticCross.this, CelticCross2.class);
                Deck.hasBeenPicked[9] = true;
                intent_9.putExtra("posit", 9);
                startActivity(intent_9);
            }
        });






    }

    public void showAllCards(){
        final ImageView img0 = (ImageView) findViewById(R.id.celtic0);
        final ImageView img1 = (ImageView) findViewById(R.id.celtic1);
        final ImageView img2 = (ImageView) findViewById(R.id.celtic2);
        final ImageView img3 = (ImageView) findViewById(R.id.celtic3);
        final ImageView img4 = (ImageView) findViewById(R.id.celtic4);
        final ImageView img5 = (ImageView) findViewById(R.id.celtic5);
        final ImageView img6 = (ImageView) findViewById(R.id.celtic6);
        final ImageView img7 = (ImageView) findViewById(R.id.celtic7);
        final ImageView img8 = (ImageView) findViewById(R.id.celtic8);
        final ImageView img9 = (ImageView) findViewById(R.id.celtic9);

        final String img0pick = Deck.tarotdeck[Deck.tempdeck[0]][2];
        final String img1pick = Deck.tarotdeck[Deck.tempdeck[1]][2];
        final String img2pick = Deck.tarotdeck[Deck.tempdeck[2]][2];
        final String img3pick = Deck.tarotdeck[Deck.tempdeck[3]][2];
        final String img4pick = Deck.tarotdeck[Deck.tempdeck[4]][2];
        final String img5pick = Deck.tarotdeck[Deck.tempdeck[5]][2];
        final String img6pick = Deck.tarotdeck[Deck.tempdeck[6]][2];
        final String img7pick = Deck.tarotdeck[Deck.tempdeck[7]][2];
        final String img8pick = Deck.tarotdeck[Deck.tempdeck[8]][2];
        final String img9pick = Deck.tarotdeck[Deck.tempdeck[9]][2];
        String uri0 = "@drawable/"+img0pick;
        String uri1 = "@drawable/"+img1pick;
        String uri2 = "@drawable/"+img2pick;
        String uri3 = "@drawable/"+img3pick;
        String uri4 = "@drawable/"+img4pick;
        String uri5 = "@drawable/"+img5pick;
        String uri6 = "@drawable/"+img6pick;
        String uri7 = "@drawable/"+img7pick;
        String uri8 = "@drawable/"+img8pick;
        String uri9 = "@drawable/"+img9pick;
        int imageResource0 = getResources().getIdentifier(uri0, null, getPackageName());
        int imageResource1 = getResources().getIdentifier(uri1, null, getPackageName());
        int imageResource2 = getResources().getIdentifier(uri2, null, getPackageName());
        int imageResource3 = getResources().getIdentifier(uri3, null, getPackageName());
        int imageResource4 = getResources().getIdentifier(uri4, null, getPackageName());
        int imageResource5 = getResources().getIdentifier(uri5, null, getPackageName());
        int imageResource6 = getResources().getIdentifier(uri6, null, getPackageName());
        int imageResource7 = getResources().getIdentifier(uri7, null, getPackageName());
        int imageResource8 = getResources().getIdentifier(uri8, null, getPackageName());
        int imageResource9 = getResources().getIdentifier(uri9, null, getPackageName());
        Drawable res0 = getResources().getDrawable(imageResource0);
        Drawable res1 = getResources().getDrawable(imageResource1);
        Drawable res2 = getResources().getDrawable(imageResource2);
        Drawable res3 = getResources().getDrawable(imageResource3);
        Drawable res4 = getResources().getDrawable(imageResource4);
        Drawable res5 = getResources().getDrawable(imageResource5);
        Drawable res6 = getResources().getDrawable(imageResource6);
        Drawable res7 = getResources().getDrawable(imageResource7);
        Drawable res8 = getResources().getDrawable(imageResource8);
        Drawable res9 = getResources().getDrawable(imageResource9);
        img0.setImageDrawable(res0);
        img1.setImageDrawable(res1);
        img2.setImageDrawable(res2);
        img3.setImageDrawable(res3);
        img4.setImageDrawable(res4);
        img5.setImageDrawable(res5);
        img6.setImageDrawable(res6);
        img7.setImageDrawable(res7);
        img8.setImageDrawable(res8);
        img9.setImageDrawable(res9);
        if (Deck.tarotdeck[Deck.tempdeck[0]][1].equals("false")) {  // turn image upside down if !cardUp
            img0.setScaleX(-1);
            img0.setScaleY(-1);
        }
        if (Deck.tarotdeck[Deck.tempdeck[1]][1].equals("false")) {  // turn image upside down if !cardUp
            img1.setScaleX(-1);
            img1.setScaleY(-1);
        }
        if (Deck.tarotdeck[Deck.tempdeck[3]][1].equals("false")) {  // turn image upside down if !cardUp
            img3.setScaleX(-1);
            img3.setScaleY(-1);
        }
        if (Deck.tarotdeck[Deck.tempdeck[4]][1].equals("false")) {  // turn image upside down if !cardUp
            img4.setScaleX(-1);
            img4.setScaleY(-1);
        }
        if (Deck.tarotdeck[Deck.tempdeck[5]][1].equals("false")) {  // turn image upside down if !cardUp
            img5.setScaleX(-1);
            img5.setScaleY(-1);
        }
        if (Deck.tarotdeck[Deck.tempdeck[6]][1].equals("false")) {  // turn image upside down if !cardUp
            img6.setScaleX(-1);
            img6.setScaleY(-1);
        }
        if (Deck.tarotdeck[Deck.tempdeck[7]][1].equals("false")) {  // turn image upside down if !cardUp
            img7.setScaleX(-1);
            img7.setScaleY(-1);
        }
        if (Deck.tarotdeck[Deck.tempdeck[8]][1].equals("false")) {  // turn image upside down if !cardUp
            img8.setScaleX(-1);
            img8.setScaleY(-1);
        }
        if (Deck.tarotdeck[Deck.tempdeck[9]][1].equals("false")) {  // turn image upside down if !cardUp
            img9.setScaleX(-1);
            img9.setScaleY(-1);
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
            case R.id.action_info:
                Intent intent_info = new Intent(this, Info.class);
                finish();
                this.startActivity(intent_info);
                break;
            case R.id.action_ppf:
                Intent intent_ppf = new Intent(this, ShufflePpf.class);
                finish();
                this.startActivity(intent_ppf);
                break;
            case R.id.action_sound:
                if(Deck.soundon){
                    Deck.soundon = false;
                    Toast toast = Toast.makeText(context, "Sound OFF", duration);
                    toast.show();
                } else {
                    Deck.soundon = true;
                    MediaPlayer mp2 = MediaPlayer.create(CelticCross.this, R.raw.place);
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
