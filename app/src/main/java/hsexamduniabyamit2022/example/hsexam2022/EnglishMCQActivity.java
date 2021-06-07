package hsexamduniabyamit2022.example.hsexam2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class EnglishMCQActivity extends AppCompatActivity {
    private ImageView btn1,btn2,btn3,btn4,btn6,btn7,btn8,btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_m_c_q);
        btn1= findViewById ( R.id.kar1 );
        btn2=findViewById ( R.id.kar2 );
        btn3=findViewById ( R.id.kar3 );
        btn4=findViewById ( R.id.kar4 );
        btn6=findViewById ( R.id.kar6 );
        btn7=findViewById ( R.id.kar7 );
        btn8=findViewById ( R.id.kar8 );
        btn9=findViewById ( R.id.kar9 );
        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishMCQActivity.this,EnglishMCQShowActivity.class );
                intent.putExtra ( "KOR1","Ch1" );
                startActivity ( intent );
            }
        } );
        btn2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishMCQActivity.this,EnglishMCQShowActivity.class );
                intent.putExtra ( "KOR1","Ch2" );
                startActivity ( intent );
            }
        } );
        btn3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishMCQActivity.this,EnglishMCQShowActivity.class );
                intent.putExtra ( "KOR1","Ch3" );
                startActivity ( intent );
            }
        } );
        btn4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishMCQActivity.this,EnglishMCQShowActivity.class );
                intent.putExtra ( "KOR1","Ch4" );
                startActivity ( intent );
            }
        } );
        btn6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishMCQActivity.this,EnglishMCQShowActivity.class );
                intent.putExtra ( "KOR1","Ch6" );
                startActivity ( intent );
            }
        } );
        btn7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishMCQActivity.this,EnglishMCQShowActivity.class );
                intent.putExtra ( "KOR1","Ch7" );
                startActivity ( intent );
            }
        } );
        btn8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishMCQActivity.this,EnglishMCQShowActivity.class );
                intent.putExtra ( "KOR1","Ch8" );
                startActivity ( intent );
            }
        } );
        btn9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( EnglishMCQActivity.this,EnglishMCQShowActivity.class );
                intent.putExtra ( "KOR1","Ch9" );
                startActivity ( intent );
            }
        } );


    }
}