package hsexamduniabyamit2021.example.hsexam2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PhysicsClass12ImportantQn extends AppCompatActivity {


    private String As01 = "https://drive.google.com/file/d/15N-MiqVsVUJricb1Ee0czXflZQ5JqMn3/view?usp=drivesdk",
            As02 = "https://drive.google.com/file/d/15N3Abp-ow1jmG2Zt35T1-gPYKGFzWmhd/view?usp=drivesdk",
            As03 = "https://drive.google.com/file/d/15QKR5t19E66ApgPqsG4cqVHb2Jni274g/view?usp=drivesdk",
            As04 = "https://drive.google.com/file/d/15Zl9ML_3XsSZp0_AiJWVSIuErZ2wX4mP/view?usp=drivesdk",
            As05 = "https://drive.google.com/file/d/15ZzrWgEgIik25pHPMjNGaHeGb5VIc6F1/view?usp=drivesdk",
            As06 = "https://drive.google.com/file/d/15_tL4OQ_BW0eIu29x5sg5QGYCY0Xf0Rl/view?usp=drivesdk",
            As07 = "https://drive.google.com/file/d/15KPPE6mX_uR6VVVaeXZ2ZQ6-MMWL_Squ/view?usp=drivesdk",
            As08 = "https://drive.google.com/file/d/15CF-bwTX5oL6ujohZsDRZijmv5xRNZs2/view?usp=drivesdk",
            As09 = "https://drive.google.com/file/d/15B46ep5oYFA0jwhlaAGPOBjlsr6DcvdW/view?usp=drivesdk",
            As10 = "https://drive.google.com/file/d/153zYlsxv_0Jpi4_-e0_Bo_33PFTiROhN/view?usp=drivesdk";




    private CardView im1,im2,im3,im4,im5,im6,im7,im8,im9,im10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_class12_important_qn);

        im1 = findViewById ( R.id. pan1);
        im2 = findViewById ( R.id.pan2 );
        im3 = findViewById ( R.id. pan3);
        im4 = findViewById ( R.id.pan4 );
        im5 = findViewById ( R.id.pan5 );
        im6 = findViewById ( R.id.pan6 );
        im7 = findViewById ( R.id. pan7);
        im8 = findViewById ( R.id. pan8);
        im9 = findViewById ( R.id.pan9 );
        im10 = findViewById ( R.id. pan10);

        im1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As01 );
                startActivity ( intent );
            }
        } );
        im2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As02 );
                startActivity ( intent );
            }
        } );
        im3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As03 );
                startActivity ( intent );
            }
        } );
        im4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As04 );
                startActivity ( intent );
            }
        } );
        im5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As05 );
                startActivity ( intent );
            }
        } );
        im6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As06 );
                startActivity ( intent );
            }
        } );
        im7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As07 );
                startActivity ( intent );
            }
        } );
        im8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As08 );
                startActivity ( intent );
            }
        } );
        im9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As09 );
                startActivity ( intent );
            }
        } );
        im10.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent ( PhysicsClass12ImportantQn.this,pdfviewerActivity.class );
                intent.putExtra ( "KOR1",As10 );
                startActivity ( intent );
            }
        } );


    }


}