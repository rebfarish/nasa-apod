package edu.cnm.deepdive.nasaapod;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


  private static final String DATE_FORMAT = "yyyy-MM-dd";
  private static final String CALENDAT_KEY = "calendar";
  private static final String APOD_KEY = "apod";

  private WebView webView;
  private String apiKey;
  private ProgressBar progressSpinner;
  private FloatingActionButton jumpdate;
  private Calendar calender;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setupWebView();
    //TODO setup service
    //TODO setup UI
    //TODO setup default
  }
  private void setupWebView(){
    webView = findViewById(R.id.web_view);
    webView.setWebViewClient(new WebViewClient(){
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        return false;
      }

      @Override
      public void onPageFinished(WebView view, String url) {
        progressSpinner.setVisibility(View.GONE);
        //TODO display toast with APOD item title.
      }
    });
    WebSettings settings = webView.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setSupportZoom(true);
    settings.setBuiltInZoomControls(true);
    settings.setDisplayZoomControls(false);
    settings.setUseWideViewPort(true);
    settings.setLoadWithOverviewMode(true);
  }
}
