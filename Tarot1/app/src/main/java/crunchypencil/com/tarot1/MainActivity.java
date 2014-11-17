package crunchypencil.com.tarot1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Deck.tempdeck = Deck.shuffleArray(Deck.temparray);
        Deck.count = 0;

        ImageView img = (ImageView) findViewById(R.id.mainlogoImage);
        img.setImageResource(R.drawable.fatebrowser_deck);
        //img.setImageResource(R.drawable.back);
        //img.setScaleX(-1);
        //img.setScaleY(-1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_shuffle:
                Intent intent_shuffle = new Intent(this, ShuffleDeck.class);
                this.startActivity(intent_shuffle);
                break;
            case R.id.action_pick:
                Intent intent_pick = new Intent(this, PickCard.class);
                this.startActivity(intent_pick);
                break;
            case R.id.action_home:
                Intent intent_home = new Intent(this, MainActivity.class);
                this.startActivity(intent_home);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
