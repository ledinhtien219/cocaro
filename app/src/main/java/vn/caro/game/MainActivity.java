package vn.caro.game;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        web = new WebView(this);
        setContentView(web);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setSupportZoom(false);
        web.setOverScrollMode(View.OVER_SCROLL_NEVER);
        web.setBackgroundColor(Color.TRANSPARENT);
        web.setLongClickable(false);
        web.setOnLongClickListener(v -> true);
        web.setHapticFeedbackEnabled(false);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("file:///android_asset/index.html");
    }

    @Override
    protected void onDestroy() {
        if (web != null) web.destroy();
        super.onDestroy();
    }
}
