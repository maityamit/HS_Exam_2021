package hsexamduniabyamit2021.example.hsexam2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private RelativeLayout r1,r2,r3,r4;
    private ImageView noti;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        r1=view.findViewById(R.id.class_12_home_button);
        r2=view.findViewById(R.id.entrance_home_button);
        r3=view.findViewById(R.id.quiz_home_button);
        r4=view.findViewById(R.id.about_us_home_button);
        noti=view.findViewById(R.id.notifications);



        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getContext(),Class12Activity.class);
                startActivity(intent1);
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getContext(),EntranceExamActivity.class);
                startActivity(intent2);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getContext(), BoardsResultActivity.class);
                startActivity(intent3);
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getContext(),AboutActivity.class);
                startActivity(intent6);
            }
        });

        noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getContext(),NotificationsActivity.class);
                startActivity(intent5);
            }
        });




        return view;
    }
}