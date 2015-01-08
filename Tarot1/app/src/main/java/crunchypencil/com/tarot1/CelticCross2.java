package crunchypencil.com.tarot1;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class CelticCross2 extends FragmentActivity {
    static final int ITEMS = 10;
    static MyAdapter mAdapter;
    static ViewPager mPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pager);
        mAdapter = new MyAdapter(getSupportFragmentManager());
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
        int pos = 0;
        pos = getIntent().getExtras().getInt("posit");
        mPager.setCurrentItem(pos);
        Deck.hasContext = true;
        Deck.cardContext[0] = "The Immediate Challenge";
        Deck.cardContext[1] = "The Distant Past";
        Deck.cardContext[2] = "The Recent Past";
        Deck.cardContext[3] = "The Immediate Future";
        Deck.cardContext[4] = "The Outcome";
        Deck.cardContext[5] = "The Potential";
        Deck.cardContext[6] = "Factors Affecting The Situation";
        Deck.cardContext[7] = "External Influences";
        Deck.cardContext[8] = "Hopes and Fears";
        Deck.cardContext[9] = "The Final Outcome";
        if(Deck.soundon) {
            MediaPlayer mp2 = MediaPlayer.create(CelticCross2.this, R.raw.turnover);
            mp2.start();
        }
    }

    public static class MyAdapter extends FragmentStatePagerAdapter {
        public MyAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }


        @Override
        public int getCount() {
            return ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return ImageFragment.init(position);
                case 1:
                    return ImageFragment.init(position);
                case 2:
                    return ImageFragment.init(position);
                case 3:
                    return ImageFragment.init(position);
                case 4:
                    return ImageFragment.init(position);
                case 5:
                    return ImageFragment.init(position);
                case 6:
                    return ImageFragment.init(position);
                case 7:
                    return ImageFragment.init(position);
                case 8:
                    return ImageFragment.init(position);
                case 9:
                    return ImageFragment.init(position);
//                case 3:
//                    return PpfFragment.init(position);
                default:
                    return ImageFragment.init(position);
            }
        }
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

        switch (item.getItemId()) {
            case R.id.action_shuffle:
                Intent intent_shuffle = new Intent(this, ShuffleCcr.class);
                finish();
                this.startActivity(intent_shuffle);
                break;
            case R.id.action_shuff:
                Intent intent_shuff = new Intent(this, ShuffleCcr.class);
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
//            case R.id.action_pick:
//                Intent intent_pick = new Intent(this, PickCard.class);
//                finish();
//                this.startActivity(intent_pick);
//                break;
//            case R.id.action_pic:
//                Intent intent_pic = new Intent(this, PickCard.class);
//                finish();
//                this.startActivity(intent_pic);
//                break;
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
                if (Deck.soundon) {
                    Deck.soundon = false;
                    Toast toast = Toast.makeText(context, "Sound OFF", duration);
                    toast.show();
                } else {
                    Deck.soundon = true;
                    MediaPlayer mp2 = MediaPlayer.create(CelticCross2.this, R.raw.place);
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