package crunchypencil.com.tarot1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PpfFragment extends Fragment {

    int fragVal;
    public static final String PACKAGE_NAME = "crunchypencil.com.tarot1";
    boolean carddown = false;

    static PpfFragment init(int val) {
        PpfFragment ppfFrag = new PpfFragment();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        ppfFrag.setArguments(args);
        return ppfFrag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
//        final MediaPlayer mp2 = MediaPlayer.create(getActivity(), R.raw.turnover);
//        if(Deck.soundon) {
//            mp2.start();
//        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutView = inflater.inflate(R.layout.activity_pasprefut, container, false);


        final MediaPlayer mp1 = MediaPlayer.create(getActivity(), R.raw.place);
        final Context context1 = getActivity().getApplicationContext();

        final ImageView img1 = (ImageView) layoutView.findViewById(R.id.paspresfutImage1);
        final ImageView img2 = (ImageView) layoutView.findViewById(R.id.paspresfutImage2);
        final ImageView img3 = (ImageView) layoutView.findViewById(R.id.paspresfutImage3);
        final String img1pick = Deck.tarotdeck[Deck.tempdeck[1]][2];
        final String img2pick = Deck.tarotdeck[Deck.tempdeck[2]][2];
        final String img3pick = Deck.tarotdeck[Deck.tempdeck[3]][2];

        if(Deck.hasBeenPicked[1]){
            String uri = "@drawable/"+img1pick;
            int imageResource1 = getResources().getIdentifier(uri, null, PACKAGE_NAME);
            Drawable res1 = getResources().getDrawable(imageResource1);
            img1.setImageDrawable(res1);
            if(Deck.tarotdeck[Deck.tempdeck[1]][1].equals("false")) {  // turn image upside down if !cardUp
                img1.setScaleX(-1);
                img1.setScaleY(-1);
            }
        }
        if(Deck.hasBeenPicked[2]){
            String uri = "@drawable/"+img2pick;
            int imageResource2 = getResources().getIdentifier(uri, null, PACKAGE_NAME);
            Drawable res2 = getResources().getDrawable(imageResource2);
            img2.setImageDrawable(res2);
            if(Deck.tarotdeck[Deck.tempdeck[2]][1].equals("false")) {  // turn image upside down if !cardUp
                img2.setScaleX(-1);
                img2.setScaleY(-1);
            }
        }
        if(Deck.hasBeenPicked[3]){
            String uri = "@drawable/"+img3pick;
            int imageResource3 = getResources().getIdentifier(uri, null, PACKAGE_NAME);
            Drawable res3 = getResources().getDrawable(imageResource3);
            img3.setImageDrawable(res3);
            if(Deck.tarotdeck[Deck.tempdeck[3]][1].equals("false")) {  // turn image upside down if !cardUp
                img3.setScaleX(-1);
                img3.setScaleY(-1);
            }
        }

        //Deck.count = fragVal;

        return layoutView;
    }


}