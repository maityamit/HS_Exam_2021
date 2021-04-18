package hsexamduniabyamit2021.example.hsexam2021;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class ProfileFragment extends Fragment {


    private LinearLayout linearLayoutshare,linearLayoutratings,linearLayoutabout,linearLayoutsupport;
    private CardView wa,yt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        linearLayoutshare = view.findViewById(R.id.share_in_settings_lay);
        linearLayoutratings = view.findViewById(R.id.review_in_settings_lay);
        linearLayoutabout = view.findViewById(R.id.aboutus_in_settings_lay);
        linearLayoutsupport = view.findViewById(R.id.account_in_support_lay);
        wa= view.findViewById(R.id.settings_whatsapp);
        yt = view.findViewById(R.id.settings_youtube);



        linearLayoutshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent (  Intent.ACTION_SEND);
                sendIntent.putExtra ( Intent.EXTRA_TEXT,
                        "\n\nPlease Download HS Exam Dunia 2021 From Google PlayStore:-\n" +
                                "\n\nhttps://play.google.com/store/apps/details?id=hsexamduniabyamit2021.example.hsexam2021");
                sendIntent.putExtra ( Intent.EXTRA_SUBJECT,R.string.app_name );
                sendIntent.setType ( "text/plain" );
                Intent shareIntent = Intent.createChooser ( sendIntent,"HS Exam Dunia 2021" );
                startActivity ( shareIntent );
            }
        });
        linearLayoutratings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/details?id=hsexamduniabyamit2021.example.hsexam2021";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        linearLayoutabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getContext(),AboutActivity.class);
                startActivity(intent6);

            }
        });
        linearLayoutsupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urle = "https://chat.whatsapp.com/HFr3qNsWYgLC9vKM261wnZ";
                Intent ie = new Intent(Intent.ACTION_VIEW);
                ie.setData(Uri.parse(urle));
                startActivity(ie);

            }
        });
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urle = "https://chat.whatsapp.com/HFr3qNsWYgLC9vKM261wnZ";
                Intent ie = new Intent(Intent.ACTION_VIEW);
                ie.setData(Uri.parse(urle));
                startActivity(ie);

            }
        });
        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urle = "https://www.youtube.com/channel/UCU_XMVSa6bkGKk06EuBm4NA";
                Intent ie = new Intent(Intent.ACTION_VIEW);
                ie.setData(Uri.parse(urle));
                startActivity(ie);

            }
        });

        return view;
    }
}