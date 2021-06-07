package hsexamduniabyamit2021.example.hsexam2021;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class pdfviewerActivity extends AppCompatActivity {

    private WebView webView;
    private ProgressBar progressBar;
    private String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);


        Intent intent = getIntent ();
        String string = intent.getExtras ().getString ( "KOR1" );


        webView = findViewById ( R.id.web_view );
        progressBar = (ProgressBar) findViewById ( R.id.progressBar );
        webView.setWebViewClient ( new myWebClient () );
        webView.getSettings ().setJavaScriptEnabled ( true );
        webView.loadUrl ( string );
    }
    public class myWebClient extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted ( view, url, favicon );
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl ( url );
            return true;

        }

        @Override
        public void onReceivedError(WebView view, int errorcode,String description,String failingUrl) {
            Toast.makeText ( pdfviewerActivity.this, "Oh ! No " + description , Toast.LENGTH_SHORT ).show ();
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished ( view, url );
            progressBar.setVisibility ( View.GONE );
        }
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack ()){
            webView.goBack ();
            return true;
        }
        else {
            finish ();
            return true;
        }
    }
}