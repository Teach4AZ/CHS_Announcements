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
    private Button announcementsButton;
    private Button teacherPagesButton;
    private Button callOfficeButton;
    private Button callAttendanceButton;

    WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        newsletterButton = (Button) findViewById(R.id.newsletterButton);
        announcementsButton = (Button) findViewById(R.id.announcementsButton);
        teacherPagesButton = (Button) findViewById(R.id.teacherPagesButton);
        callOfficeButton = (Button) findViewById(R.id.callOfficeButton);
        callAttendanceButton = (Button) findViewById(R.id.callAttendanceButton);
        newsletterButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this,NewsletterActivity.class);
                startActivity(intent);

            }



        });
        announcementsButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(MainActivity.this,AnnouncementsActivity.class);
                startActivity(intent);

            }



        });
    }

}