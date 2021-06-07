package hsexamduniabyamit2022.example.hsexam2022;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PhysicsClass12SolutionsActivity extends AppCompatActivity {


    private String As01 = "",
            As02 = "",
            As03 = "",
            As04 = "",
            As05 = "",
            As06 = "",
            As07 = "",
            As08 = "",
            As09 = "",
            As10 = "",
            As11 = "",
            As12 = "",
            As13 = "",
            As14 = "",
            As15 = "",
            As16 = "",
            As17 = "",
            As18 = "",
            As19 = "", As20 = "",
            As21 = "",
            As22= "",
            As23 = "",
            As24 = "",
            As25 = "";


    private ProgressDialog progressDialog;
    private DatabaseReference RootRef;


    private ImageView im1,im2,im3,im4,im5,im6,im7,im8,im9,im10,im11,im12,im13,im14,im15,im16,im17,im18,im19,im20,im21,im22,im23,im24,im25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_class12_solutions);


        RootRef= FirebaseDatabase.getInstance ().getReference ();




        im1 = findViewById ( R.id. kar1);
        im2 = findViewById ( R.id.kar2 );
        im3 = findViewById ( R.id. kar3);
        im4 = findViewById ( R.id.kar4 );
        im5 = findViewById ( R.id.kar5 );
        im6 = findViewById ( R.id.kar6 );
        im7 = findViewById ( R.id. kar7);
        im8 = findViewById ( R.id. kar8);
        im9 = findViewById ( R.id.kar9 );
        im10 = findViewById ( R.id. kar10);
        im11 = findViewById ( R.id.kar11 );
        im12 = findViewById ( R.id.kar12 );
        im13 = findViewById ( R.id.kar13 );
        im14 = findViewById ( R.id. kar14);
        im15 = findViewById ( R.id. kar15);
        im16 = findViewById ( R.id.kar16 );
        im17 = findViewById ( R.id. kar17);
        im18 = findViewById ( R.id.kar18 );
        im19 = findViewById ( R.id.kar19 );
        im20 = findViewById ( R.id.kar20 );
        im21 = findViewById ( R.id. kar21);
        im22 = findViewById ( R.id.kar22 );
        im23 = findViewById ( R.id.kar23 );
        im24 = findViewById ( R.id.kar24 );
        im25 = findViewById ( R.id. kar25);

        progressDialog = new ProgressDialog ( PhysicsClass12SolutionsActivity.this );

        progressDialog.setContentView ( R.layout.loading );
        progressDialog.setTitle ( "Please Wait" );
        progressDialog.setCanceledOnTouchOutside ( false );
        progressDialog.setMessage ( "Tips: Please Cheak your Internet or Wi-fi Connection" );

        RetriveYouserInfo();

        im1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As01 );
                startActivity ( intent );
            }
        } );
        im2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As02 );
                startActivity ( intent );
            }
        } );
        im3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As03 );
                startActivity ( intent );
            }
        } );
        im4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As04 );
                startActivity ( intent );
            }
        } );
        im5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As05 );
                startActivity ( intent );
            }
        } );
        im6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As06 );
                startActivity ( intent );
            }
        } );
        im7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As07 );
                startActivity ( intent );
            }
        } );
        im8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As08 );
                startActivity ( intent );
            }
        } );
        im9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As09 );
                startActivity ( intent );
            }
        } );
        im10.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As10 );
                startActivity ( intent );
            }
        } );
        im11.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As11 );
                startActivity ( intent );
            }
        } );
        im12.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As12 );
                startActivity ( intent );
            }
        } );
        im13.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As13 );
                startActivity ( intent );
            }
        } );
        im14.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As14 );
                startActivity ( intent );
            }
        } );
        im15.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As15 );
                startActivity ( intent );
            }
        } );
        im16.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As16 );
                startActivity ( intent );
            }
        } );
        im17.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As17 );
                startActivity ( intent );
            }
        } );
        im18.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As18 );
                startActivity ( intent );
            }
        } );
        im19.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As19 );
                startActivity ( intent );
            }
        } );
        im20.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As20 );
                startActivity ( intent );
            }
        } );
        im21.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As21 );
                startActivity ( intent );
            }
        } );
        im22.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As22 );
                startActivity ( intent );
            }
        } );
        im23.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As23 );
                startActivity ( intent );
            }
        } );
        im24.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent ( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As24 );
                startActivity ( intent );
            }
        } );
        im25.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent( PhysicsClass12SolutionsActivity.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As25 );
                startActivity ( intent );
            }
        } );



    }



    private void RetriveYouserInfo() {


        progressDialog.show ();
        RootRef.child ( "Class12" ).child("Physics").child ( "Problems" )
                .addValueEventListener ( new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        String kas1 = dataSnapshot.child ( "Ch1" ).getValue ().toString ();
                        String kas2 = dataSnapshot.child ( "Ch2" ).getValue ().toString ();
                        String kas3 = dataSnapshot.child ( "Ch3" ).getValue ().toString ();
                        String kas4 = dataSnapshot.child ( "Ch4" ).getValue ().toString ();
                        String kas5 = dataSnapshot.child ( "Ch5" ).getValue ().toString ();
                        String kas6 = dataSnapshot.child ( "Ch6" ).getValue ().toString ();
                        String kas7 = dataSnapshot.child ( "Ch7" ).getValue ().toString ();
                        String kas8 = dataSnapshot.child ( "Ch8" ).getValue ().toString ();
                        String kas9 = dataSnapshot.child ( "Ch9" ).getValue ().toString ();
                        String kas10 = dataSnapshot.child ( "Ch10" ).getValue ().toString ();
                        String kas11 = dataSnapshot.child ( "Ch11" ).getValue ().toString ();
                        String kas12 = dataSnapshot.child ( "Ch12" ).getValue ().toString ();
                        String kas13 = dataSnapshot.child ( "Ch13" ).getValue ().toString ();
                        String kas14 = dataSnapshot.child ( "Ch14" ).getValue ().toString ();
                        String kas15 = dataSnapshot.child ( "Ch15" ).getValue ().toString ();
                        String kas16 = dataSnapshot.child ( "Ch16" ).getValue ().toString ();
                        String kas17 = dataSnapshot.child ( "Ch17" ).getValue ().toString ();
                        String kas18 = dataSnapshot.child ( "Ch18" ).getValue ().toString ();
                        String kas19 = dataSnapshot.child ( "Ch19" ).getValue ().toString ();
                        String kas20 = dataSnapshot.child ( "Ch20" ).getValue ().toString ();
                        String kas21 = dataSnapshot.child ( "Ch21" ).getValue ().toString ();
                        String kas22 = dataSnapshot.child ( "Ch22" ).getValue ().toString ();
                        String kas23 = dataSnapshot.child ( "Ch23" ).getValue ().toString ();
                        String kas24 = dataSnapshot.child ( "Ch24" ).getValue ().toString ();
                        String kas25 = dataSnapshot.child ( "Ch25" ).getValue ().toString ();




                        As01 = kas1;
                        As02 = kas2;
                        As03 = kas3;
                        As04 = kas4;
                        As05 = kas5;
                        As06 = kas6;
                        As07 = kas7;
                        As08 = kas8;
                        As09 = kas9;
                        As10 = kas10;
                        As11 = kas11;
                        As12 = kas12;
                        As13 = kas13;
                        As14 = kas14;
                        As15 = kas15;
                        As16 = kas16;
                        As17 = kas17;
                        As18 = kas18;
                        As19 = kas19;
                        As20 = kas20;
                        As21 = kas21;
                        As22 = kas22;
                        As23 = kas23;
                        As24 = kas24;
                        As25 = kas25;

                        progressDialog.dismiss ();

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                        Toast.makeText ( PhysicsClass12SolutionsActivity.this, "Error.", Toast.LENGTH_SHORT ).show ();
                        progressDialog.dismiss ();
                    }
                } );
    }
}