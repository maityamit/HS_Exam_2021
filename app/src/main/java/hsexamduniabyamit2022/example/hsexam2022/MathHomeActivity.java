package hsexamduniabyamit2022.example.hsexam2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MathHomeActivity extends AppCompatActivity {
    private LinearLayout testpaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_home);
        testpaper= findViewById ( R.id.class12math_test_paper );
        testpaper.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentry5 = new Intent ( MathHomeActivity.this,TestPaperActivity.class );
                intentry5.putExtra("SUBJECTNODE","Math");
                startActivity ( intentry5);

            }
        } );
    }

}