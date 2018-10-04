package tk.kozmomap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/*
 *   Main screen of app shows a current content of www.bilisimguru.com
 */
public class MainActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview =(WebView)findViewById(R.id.webView);
    }

    /*
     *   Activity downloads the content of the site whenever activity comes to the front
     */
    @Override
    public void onResume(){
        super.onResume();

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        webview.loadUrl("http://kozmomap.tk/");
    }
}