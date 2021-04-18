package hsexamduniabyamit2021.example.hsexam2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class BengaliHomeActivity extends AppCompatActivity {

    private LinearLayout suggestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengali_home);
        suggestions= findViewById ( R.id.class12bengali_suggestions);
        suggestions.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentry5 = new Intent ( BengaliHomeActivity.this,TestPaperActivity.class );
                intentry5.putExtra("SUBJECTNODE","Bengali");
                startActivity ( intentry5);

            }
        } );
    }
}