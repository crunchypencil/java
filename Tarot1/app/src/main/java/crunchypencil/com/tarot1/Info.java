package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
