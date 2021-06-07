package hsexamduniabyamit2022.example.hsexam2022;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.leo.simplearcloader.SimpleArcLoader;

public class NotificationsActivity extends AppCompatActivity {
    private TextView txt1,txt2,txt3,txt4,txt5;
    private SimpleArcLoader simpleArcLoader;
    private ScrollView scrollView;

    private DatabaseReference RootRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        simpleArcLoader = findViewById(R.id.loader);
        scrollView  = findViewById(R.id.scrollview1);
        RootRef= FirebaseDatabase.getInstance ().getReference ();
        txt1 = findViewById ( R.id.noti1 );
        txt2 = findViewById ( R.id.noti2 );
        txt3 = findViewById ( R.id.noti3 );
        txt4 = findViewById ( R.id.noti4 );
        txt5 = findViewById ( R.id.noti5 );





        RetriveYouserInfo();

    }

    private void RetriveYouserInfo() {



        RootRef.child ( "Notifications" )
                .addValueEventListener ( new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        String retrievenot1 = dataSnapshot.child ( "Not1" ).getValue ().toString ();
                        String retrievenot2 = dataSnapshot.child ( "Not2" ).getValue ().toString ();
                        String retrievenot3 = dataSnapshot.child ( "Not3" ).getValue ().toString ();
                        String retrievenot4 = dataSnapshot.child ( "Not4" ).getValue ().toString ();
                        String retrievenot5 = dataSnapshot.child ( "Not5" ).getValue ().toString ();

                        simpleArcLoader.setVisibility(View.GONE);
                        scrollView.setVisibility(View.VISIBLE);

                        txt1.setText ( retrievenot1 );
                        txt2.setText ( retrievenot2 );
                        txt3.setText ( retrievenot3 );
                        txt4.setText ( retrievenot4 );
                        txt5.setText ( retrievenot5 );

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                } );
    }
}