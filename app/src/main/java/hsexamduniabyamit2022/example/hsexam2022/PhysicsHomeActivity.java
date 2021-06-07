package hsexamduniabyamit2022.example.hsexam2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PhysicsHomeActivity extends AppCompatActivity {

    private LinearLayout soulutions,learning,important,practical,testpaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_home);


        soulutions = findViewById ( R.id.class12solutions );
        learning = findViewById ( R.id.class12learning);
        important= findViewById ( R.id.class12importantqn );
        practical= findViewById ( R.id.class12practical );
        testpaper= findViewById ( R.id.class12physics_test_paper );



        soulutions.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Intent intentrrt = new Intent ( PhysicsHomeActivity.this,PhysicsClass12SolutionsActivity.class );
                startActivity ( intentrrt);
            }
        } );
        learning.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentr = new Intent ( PhysicsHomeActivity.this,PhysicsClass12ChapterActivity.class );
                startActivity ( intentr);

            }
        } );
        important.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentry = new Intent ( PhysicsHomeActivity.this,PhysicsClass12ImportantQn.class );
                startActivity ( intentry);

            }
        } );
        practical.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentry4 = new Intent ( PhysicsHomeActivity.this,PhysicsPracticalActivity.class );
                startActivity ( intentry4);

            }
        } );
        testpaper.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentry5 = new Intent ( PhysicsHomeActivity.this,TestPaperActivity.class );
                intentry5.putExtra("SUBJECTNODE","Physics");
                startActivity ( intentry5);

            }
        } );
    }

}