package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.ProgressBar;

final class cx extends WebChromeClient {
    public ProgressBar f33668a;
    public Context f33669b;
    public boolean f33670c;
    public int f33671d;

    public cx(Context context) {
        this.f33669b = context;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        this.f33671d = i;
        if (this.f33668a != null) {
            this.f33668a.setProgress(i);
            m30921a();
        }
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (message == null) {
            return false;
        }
        Message obtainMessage = webView.getHandler().obtainMessage();
        webView.requestFocusNodeHref(obtainMessage);
        Object string = obtainMessage.getData().getString("url");
        if (TextUtils.isEmpty(string)) {
            WebView webView2 = new WebView(this.f33669b);
            webView2.setWebViewClient(new cy(this));
            ((WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
        } else {
            m30922a(Uri.parse(string));
        }
        return true;
    }

    final void m30922a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        this.f33669b.startActivity(intent);
    }

    public final void m30923a(boolean z) {
        this.f33670c = z;
        m30921a();
    }

    final void m30921a() {
        if (this.f33668a != null) {
            ProgressBar progressBar = this.f33668a;
            int i = (this.f33671d == 100 || !this.f33670c) ? 4 : 0;
            progressBar.setVisibility(i);
        }
    }
}
