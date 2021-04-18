package hsexamduniabyamit2021.example.hsexam2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.shreyaspatil.MaterialDialog.MaterialDialog;

public class MainActivity extends AppCompatActivity {

    private LinearLayout fragc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragc = findViewById(R.id.fragment_container);
        Fragment fr = new  HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fr).commit();



        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);

// Create items
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.home, R.drawable.bottom_blog_img,R.color.teal_200);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.blog, R.drawable.bottom_home_img, R.color.teal_200);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.setting, R.drawable.bottom_settings_img, R.color.teal_200);

// Add items
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);

// Set background color
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));

// Disable the translation inside the CoordinatorLayout
        bottomNavigation.setBehaviorTranslationEnabled(false);


// Change colors
        bottomNavigation.setAccentColor(Color.parseColor("#F63D2B"));
        bottomNavigation.setInactiveColor(Color.parseColor("#747474"));

// Force to tint the drawable (useful for font with icon for example)
        bottomNavigation.setForceTint(true);

// Display color under navigation bar (API 21+)
// Don't forget these lines in your style-v21
// <item name="android:windowTranslucentNavigation">true</item>
// <item name="android:fitsSystemWindows">true</item>
        bottomNavigation.setTranslucentNavigationEnabled(true);

// Manage titles
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);

// Use colored navigation with circle reveal effect
        bottomNavigation.setColored(true);

// Set current item programmatically
        Fragment fragmentr = null;
        bottomNavigation.setCurrentItem(1);




// Enable / disable item & set disable color
        bottomNavigation.enableItemAtPosition(2);
        bottomNavigation.enableItemAtPosition(0);


// Set listeners
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                Fragment fragment = null;
                switch (position) {
                    case 0:
                        fragment = new StudyFragment();
                        break;
                    case 1:
                        fragment = new HomeFragment();
                        break;
                    case 2:
                        fragment = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                return true;
            }
        });
        bottomNavigation.setOnNavigationPositionListener(new AHBottomNavigation.OnNavigationPositionListener() {
            @Override public void onPositionChange(int y) {
                Fragment fragment = null;
                switch (y) {
                    case 0:
                        fragment = new StudyFragment();
                        break;
                    case 1:
                        fragment = new HomeFragment();
                        break;
                    case 2:
                        fragment = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            }

        });
    }
    @Override
    public void onBackPressed() {


        MaterialDialog mDialog = new MaterialDialog.Builder ( this )
                .setTitle ( "Are you sure you want to exit ?" )
                .setCancelable ( false )
                .setPositiveButton ( "Exit",R.drawable.ic_baseline_cancel_24, new MaterialDialog.OnClickListener () {
                    @Override
                    public void onClick(com.shreyaspatil.MaterialDialog.interfaces.DialogInterface dialogInterface, int which) {
                        MainActivity.super.onBackPressed ();
                    }


                } )
                .setNegativeButton ( "No", new MaterialDialog.OnClickListener () {
                    @Override
                    public void onClick(com.shreyaspatil.MaterialDialog.interfaces.DialogInterface dialogInterface, int which) {
                        dialogInterface.cancel ();
                    }

                } )
                .build ();

        // Show Dialog
        mDialog.show ();


    }
}