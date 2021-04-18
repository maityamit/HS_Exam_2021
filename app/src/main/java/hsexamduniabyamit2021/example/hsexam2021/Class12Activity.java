package hsexamduniabyamit2021.example.hsexam2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Class12Activity extends AppCompatActivity {


    private LinearLayout english,physics,math,chem,beng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class12);

        english = findViewById(R.id.english_home_button);
        physics = findViewById(R.id.physics_home_button);
        math = findViewById(R.id.math_home_button);
        chem = findViewById(R.id.chemistry_home_button);
        beng = findViewById(R.id.bengali_home_button);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(Class12Activity.this,EnglishHomeActivity.class);
                startActivity(intent1);
            }
        });
        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Class12Activity.this,PhysicsHomeActivity.class);
                startActivity(intent2);
            }
        });
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(Class12Activity.this,MathHomeActivity.class);
                startActivity(intent3);
            }
        });
        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Class12Activity.this,ChemistryHomeActivity.class);
                startActivity(intent2);
            }
        });
        beng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(Class12Activity.this,BengaliHomeActivity.class);
                startActivity(intent3);
            }
        });


    }
}