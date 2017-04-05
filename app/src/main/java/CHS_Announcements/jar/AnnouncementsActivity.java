package CHS_Announcements.jar;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by sam on 4/5/2017.
 */

public class AnnouncementsActivity extends Activity {
    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://cusd80.com/site/default.aspx?PageType=14&DomainID=913&PageID=6389&ModuleInstanceID=10178&ViewID=606008db-225b-4ad2-8f7b-9ebac54372c1&IsMoreExpandedView=True");
    }
    @Override
    public void onBackPressed()
    {
        if(webView.canGoBack())
            webView.goBack();
        else
            super.onBackPressed();
    }
}
