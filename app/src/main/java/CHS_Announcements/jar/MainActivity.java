package CHS_Announcements.jar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class MainActivity extends Activity {
    private Button newsletterButton;
    WebView webView;
    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        newsletterButton = (Button) findViewById(R.id.newsletterButton);

        newsletterButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this,NewsletterActivity.class);
                startActivity(intent);

            }



        });
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            if(webView != null)
            {
                setContentView(R.layout.main);
                webView = null;
            }
            else this.finishActivity(0);
        }
    }

    private void showWebPage()
    {
        setContentView(R.layout.webview);
        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.smore.com/wdmg0");
    }

}