package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;


public class Info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView img = (ImageView) findViewById(R.id.mainInfoImage);
        img.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
//                startActivity(new Intent(Info.this, CelticCross.class));
                finish();
                onBackPressed();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_celtic, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        switch(item.getItemId()) {
            case R.id.action_shuffle:
                Intent intent_reshuffle = new Intent(this, ShuffleCcr.class);
                finish();
                this.startActivity(intent_reshuffle);
                break;
//            case R.id.action_shuff:
//                Intent intent_shuff = new Intent(this, ShuffleCcr.class);
//                finish();
//                this.startActivity(intent_shuff);
//                break;
            case R.id.action_main:
                Intent intent_main = new Intent(this, SelectGame.class);
                Intent intent3 = new Intent(getApplicationContext(), SelectGame.class);
                intent3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent3); // dump everything on top of SelectGame to remove back access
                finish();
                this.startActivity(intent_main);
                break;
//            case R.id.action_randshuff:
//                Intent intent_randshuff = new Intent(this, ShuffleDeck.class);
//                finish();
//                this.startActivity(intent_randshuff);
//                break;
            case R.id.action_info:
                Intent intent_info = new Intent(this, Info.class);
//                finish();
//                this.startActivity(intent_info);
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
                    MediaPlayer mp2 = MediaPlayer.create(Info.this, R.raw.place);
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

