package hsexamduniabyamit2022.example.hsexam2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ChemistryHomeActivity extends AppCompatActivity {

    private LinearLayout suggestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_home);
        suggestions= findViewById ( R.id.class12chemsitry_suggestions );
        suggestions.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intentry5 = new Intent ( ChemistryHomeActivity.this,TestPaperActivity.class );
                intentry5.putExtra("SUBJECTNODE","Chemistry");
                startActivity ( intentry5);

            }
        } );
    }
}