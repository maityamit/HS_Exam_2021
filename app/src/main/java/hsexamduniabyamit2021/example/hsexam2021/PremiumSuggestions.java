package hsexamduniabyamit2021.example.hsexam2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.anjlab.android.iab.v3.BillingProcessor;
import com.anjlab.android.iab.v3.TransactionDetails;

public class PremiumSuggestions extends AppCompatActivity implements BillingProcessor.IBillingHandler{

    private RelativeLayout combo,beng,engb,phy,chem,mat,cs,bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium_suggestions);


        combo = findViewById(R.id.combo_pack_premium_suggestion);
        beng  = findViewById(R.id.bengali_premium_suggesions);
        engb = findViewById(R.id.english_premium_suggesions);
        mat=findViewById(R.id.mathematics_premium_suggesions);
        phy=findViewById(R.id.physics_premium_suggesions);
        chem=findViewById(R.id.chemistry_premium_suggesions);
        cs=findViewById(R.id.cs_premium_suggesions);
        bio = findViewById(R.id.biology_premium_suggesions);





    }

    @Override
    public void onProductPurchased(String productId, TransactionDetails details) {

    }

    @Override
    public void onPurchaseHistoryRestored() {

    }

    @Override
    public void onBillingError(int errorCode, Throwable error) {

    }

    @Override
    public void onBillingInitialized() {

    }
}