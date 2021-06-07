package hsexamduniabyamit2022.example.hsexam2022;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EnglishHomeActivity extends AppCompatActivity {

    private LinearLayout l1,l2;

    private String As01 = "",
            As02 = "",
            As03 = "",
            As04 = "",
            As05 = "";
    private ProgressDialog progressDialog;
    private DatabaseReference RootRef;

    private AppCompatButton im1,im2,im3,im4,im5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_home);

        l1=findViewById(R.id.class11learning);
        l2=findViewById(R.id.class11solutions);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(EnglishHomeActivity.this,EnglishMCQActivity.class);
                startActivity(intent1);
            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(EnglishHomeActivity.this,EnglishLAQChapterActivity.class);
                startActivity(intent2);
            }
        });




        RootRef= FirebaseDatabase.getInstance ().getReference ();


        im1 = findViewById ( R.id. arp1);
        im2 = findViewById ( R.id.arp2 );
        im3 = findViewById ( R.id. arp3);
        im4 = findViewById ( R.id.arp4 );
        im5 = findViewById ( R.id.arp5 );


        progressDialog = new ProgressDialog ( EnglishHomeActivity.this );

        progressDialog.setContentView ( R.layout.loading );
        progressDialog.setTitle ( "Please Wait" );
        progressDialog.setCanceledOnTouchOutside ( false );
        progressDialog.setMessage ( "Tips: Please Cheak your Internet or Wi-fi Connection" );

        RetriveYouserInfo();

        im1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishHomeActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As01 );
                startActivity ( intent );
            }
        } );
        im2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishHomeActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As02 );
                startActivity ( intent );
            }
        } );
        im3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishHomeActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As03 );
                startActivity ( intent );
            }
        } );
        im4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishHomeActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As04 );
                startActivity ( intent );
            }
        } );
        im5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (EnglishHomeActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As05 );
                startActivity ( intent );
            }
        } );




    }

    private void RetriveYouserInfo() {

        progressDialog.show ();
        RootRef.child("Class12").child("English").child ( "PYQ" )
                .addValueEventListener ( new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        String kas1 = dataSnapshot.child ( "2016" ).getValue ().toString ();
                        String kas2 = dataSnapshot.child ( "2017" ).getValue ().toString ();
                        String kas3 = dataSnapshot.child ( "2018" ).getValue ().toString ();
                        String kas4 = dataSnapshot.child ( "2019" ).getValue ().toString ();
                        String kas5 = dataSnapshot.child ( "2020" ).getValue ().toString ();




                        As01 = kas1;
                        As02 = kas2;
                        As03 = kas3;
                        As04 = kas4;
                        As05 = kas5;




                        progressDialog.dismiss ();


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                        Toast.makeText ( EnglishHomeActivity.this, "Error.", Toast.LENGTH_SHORT ).show ();
                        progressDialog.dismiss ();
                    }
                } );
    }

}