package crunchypencil.com.tarot1;

        import android.content.Context;
        import android.graphics.drawable.Drawable;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.ImageView;
        import android.widget.TextView;

public class ImageFragment extends Fragment {

    int fragVal;
    public static final String PACKAGE_NAME = "crunchypencil.com.tarot1";
    boolean carddown = false;

    static ImageFragment init(int val) {
        ImageFragment imgFrag = new ImageFragment();
        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        imgFrag.setArguments(args);
        return imgFrag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
        final MediaPlayer mp2 = MediaPlayer.create(getActivity(), R.raw.turnover);
        if(Deck.soundon) {
            mp2.start();
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutView = inflater.inflate(R.layout.image_fragment, container, false);

        Deck.hasBeenPicked[fragVal] = true;
        final MediaPlayer mp1 = MediaPlayer.create(getActivity(), R.raw.place);
        final Context context1 = getActivity().getApplicationContext();



        CardGenerate current = new CardGenerate(Deck.tempdeck[fragVal], true);
        String uri = "@drawable/"+current.cardImage;
        int imageResource = getResources().getIdentifier(uri, null, PACKAGE_NAME);
        final ImageView cardimg = (ImageView) layoutView.findViewById(R.id.pickacardView);
        Drawable res = getResources().getDrawable(imageResource);
        cardimg.setImageDrawable(res);

        if(current.cardFlip.equals("false")) {  // turn image upside down if !cardUp
            cardimg.setScaleX(-1);
            cardimg.setScaleY(-1);
        }

        TextView cardNameValue = (TextView) layoutView.findViewById(R.id.pickCard1);
        cardNameValue.setText(current.cardName);
        TextView cardDescribeValue = (TextView) layoutView.findViewById(R.id.pickCard3);
        cardDescribeValue.setText(current.cardDescribe);
        TextView cardMeaningValue = (TextView) layoutView.findViewById(R.id.pickCard5);
        cardMeaningValue.setText(current.cardMeaning);

        if(Deck.hasContext) {
            TextView cardContextValue = (TextView) layoutView.findViewById(R.id.pickCard7);
            cardContextValue.setText(Deck.cardContext[fragVal]);
        } else {
            TextView cardContextTitleValue = (TextView) layoutView.findViewById(R.id.pickCard6);
            cardContextTitleValue.setText("");
            TextView cardContextValue = (TextView) layoutView.findViewById(R.id.pickCard7);
            cardContextValue.setText("");
        }

        cardimg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                Animation cardSlideAnimation1 = AnimationUtils.loadAnimation(context1, R.anim.move_down);
                Animation cardSlideAnimation2 = AnimationUtils.loadAnimation(context1, R.anim.move_up);
                if(carddown){
                    if (Deck.soundon) {
                        mp1.start();
                    }
                    cardimg.startAnimation(cardSlideAnimation2);
                    cardSlideAnimation2.setFillAfter(true);
                    carddown = false;

                } else {
                    if (Deck.soundon) {
                        mp1.start();
                    }
                    cardimg.startAnimation(cardSlideAnimation1);
                    cardSlideAnimation1.setFillAfter(true);
                    carddown = true;
                }
            }
        });




        Deck.count = fragVal;





        View tv = layoutView.findViewById(R.id.text);
        ((TextView) tv).setText("Card #" + fragVal);
        return layoutView;
    }


}