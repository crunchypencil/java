package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * Created by davidcahill on 11/12/14.
 */
public class CelticCross extends Activity {

//    static PasPreFut2.MyAdapter mAdapter;
//    static ViewPager mPager;
    public static final String PACKAGE_NAME = "crunchypencil.com.tarot1";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celtic2);

        if(Deck.soundon) {
            MediaPlayer mp2 = MediaPlayer.create(CelticCross.this, R.raw.turnover);
            mp2.start();
        }

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

//        img1.setPivotX(50);
//        img1.setPivotY(50);
        img0.bringToFront();
        Animation cardSlideAnimation2 = AnimationUtils.loadAnimation(this, R.anim.turn_side);
        img0.startAnimation(cardSlideAnimation2);


//        if(Deck.hasBeenPicked[0]){
//            String uri = "@drawable/"+img0pick;
//            int imageResource0 = getResources().getIdentifier(uri, null, getPackageName());
//            Drawable res0 = getResources().getDrawable(imageResource0);
//            img0.setImageDrawable(res0);
//            if(Deck.tarotdeck[Deck.tempdeck[0]][1].equals("false")) {  // turn image upside down if !cardUp
//                img0.setScaleX(-1);
//                img0.setScaleY(-1);
//            }
//        }
//        if(Deck.hasBeenPicked[0]){
//            String uri = "@drawable/"+img1pick;
//            int imageResource1 = getResources().getIdentifier(uri, null, getPackageName());
//            Drawable res1 = getResources().getDrawable(imageResource1);
//            img0.setImageDrawable(res1);
//            if(Deck.tarotdeck[Deck.tempdeck[1]][1].equals("false")) {  // turn image upside down if !cardUp
//                img0.setScaleX(-1);
//                img0.setScaleY(-1);
//            }
//        }
//        if(Deck.hasBeenPicked[0]){
//            String uri = "@drawable/"+img2pick;
//            int imageResource2 = getResources().getIdentifier(uri, null, getPackageName());
//            Drawable res2 = getResources().getDrawable(imageResource2);
//            img0.setImageDrawable(res2);
//            if(Deck.tarotdeck[Deck.tempdeck[2]][1].equals("false")) {  // turn image upside down if !cardUp
//                img0.setScaleX(-1);
//                img0.setScaleY(-1);
//            }
//        }
//
//        img0.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                String uri = "@drawable/"+img0pick;
//                int imageResource0 = getResources().getIdentifier(uri, null, getPackageName());
//                Drawable res0 = getResources().getDrawable(imageResource0);
//                img0.setImageDrawable(res0);
//
//                if(Deck.tarotdeck[Deck.tempdeck[0]][1].equals("false")) {  // turn image upside down if !cardUp
//                    img0.setScaleX(-1);
//                    img0.setScaleY(-1);
//                }
//                Intent intent_1 = new Intent(CelticCross.this, PasPreFut2.class);
//                Deck.hasBeenPicked[0] = true;
//                intent_1.putExtra("posit", 0);
//                startActivity(intent_1);
//            }
//        });
//
//        img1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                String uri = "@drawable/"+img1pick;
//                int imageResource1 = getResources().getIdentifier(uri, null, getPackageName());
//                Drawable res1 = getResources().getDrawable(imageResource1);
//                img1.setImageDrawable(res1);
//
//                if(Deck.tarotdeck[Deck.tempdeck[1]][1].equals("false")) {  // turn image upside down if !cardUp
//                    img1.setScaleX(-1);
//                    img1.setScaleY(-1);
//                }
//                Intent intent_2 = new Intent(CelticCross.this, PasPreFut2.class);
//                Deck.hasBeenPicked[1] = true;
//                intent_2.putExtra("posit", 1);
//                startActivity(intent_2);
//            }
//        });
//
//        img2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                String uri = "@drawable/"+img2pick;
//                int imageResource2 = getResources().getIdentifier(uri, null, getPackageName());
//                Drawable res2 = getResources().getDrawable(imageResource2);
//                img2.setImageDrawable(res2);
//
//                if(Deck.tarotdeck[Deck.tempdeck[2]][1].equals("false")) {  // turn image upside down if !cardUp
//                    img2.setScaleX(-1);
//                    img2.setScaleY(-1);
//                }
//                Intent intent_3 = new Intent(CelticCross.this, PasPreFut2.class);
//                Deck.hasBeenPicked[2] = true;
//                intent_3.putExtra("posit", 2);
//                startActivity(intent_3);
//            }
//        });






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
