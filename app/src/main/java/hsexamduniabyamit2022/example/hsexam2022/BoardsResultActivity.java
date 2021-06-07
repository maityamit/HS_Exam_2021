package hsexamduniabyamit2022.example.hsexam2022;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BoardsResultActivity extends AppCompatActivity {

    private TextView nextquiz,link,winners;
    private ProgressDialog progressDialog;

    private DatabaseReference RootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardsresult);
        RootRef= FirebaseDatabase.getInstance ().getReference ();
        progressDialog = new ProgressDialog ( BoardsResultActivity.this );
        progressDialog.setContentView ( R.layout.loading );
        progressDialog.setTitle ( "Please Wait...." );
        nextquiz = findViewById(R.id.next_quiz);
        link = findViewById(R.id.next_quiz_link);
        winners=findViewById(R.id.quiz_winners);
        progressDialog.show ();


        progressDialog.setMessage ( "Tips: Please Cheak your Internet or Wi-fi Connection" );
        progressDialog.setCanceledOnTouchOutside ( false );

        RetriveYouserInfo();

    }
    private void RetriveYouserInfo() {



        RootRef.child ( "QuizEvent" )
                .addValueEventListener ( new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        String retrievenot1 = dataSnapshot.child ( "Upcoming" ).getValue ().toString ();
                        String retrievenot2 = dataSnapshot.child ( "Link" ).getValue ().toString ();
                        String retrievenot3 = dataSnapshot.child ( "Win" ).getValue ().toString ();

                        progressDialog.dismiss ();

                        nextquiz.setText ( retrievenot1 );
                        link.setText ( retrievenot2 );
                        winners.setText ( retrievenot3 );

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                } );
    }
}