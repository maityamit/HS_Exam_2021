package hsexamduniabyamit2022.example.hsexam2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EnglishLAQChapterActivity extends AppCompatActivity {
    private ImageView btn1,btn2,btn3,btn4,btn6,btn7,btn8,btn9,btn11,btn12,btn13,btn15,btn16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_s_a_q);

        btn1= findViewById ( R.id.kar1p );
        btn2=findViewById ( R.id.kar2p );
        btn3=findViewById ( R.id.kar3p );
        btn4=findViewById ( R.id.kar4p );

        btn6=findViewById ( R.id.kar6p );
        btn7=findViewById ( R.id.kar7p );
        btn8=findViewById ( R.id.kar8p );
        btn9=findViewById ( R.id.kar9p );

        btn11=findViewById ( R.id.kar11p);
        btn12=findViewById ( R.id.kar12p );
        btn13=findViewById ( R.id.kar13p );

        btn15= findViewById ( R.id.kar15p );
        btn16=findViewById ( R.id.kar16p );

        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch1" );
                startActivity ( intent );
            }
        } );
        btn2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch2" );
                startActivity ( intent );
            }
        } );
        btn3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch3" );
                startActivity ( intent );
            }
        } );
        btn4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch4" );
                startActivity ( intent );
            }
        } );

        btn6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch6" );
                startActivity ( intent );
            }
        } );
        btn7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch7" );
                startActivity ( intent );
            }
        } );
        btn8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch8" );
                startActivity ( intent );
            }
        } );
        btn9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch9" );
                startActivity ( intent );
            }
        } );


        btn11.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch11" );
                startActivity ( intent );
            }
        } );
        btn12.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch12" );
                startActivity ( intent );
            }
        } );
        btn13.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch13" );
                startActivity ( intent );
            }
        } );

        btn15.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch15" );
                startActivity ( intent );
            }
        } );
        btn16.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishLAQChapterActivity.this,EnglishLAQShowActivity.class );
                intent.putExtra ( "KOR1","Ch16" );
                startActivity ( intent );
            }
        } );

    }
}