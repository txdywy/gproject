package com.google.android.wallet.ui.common;

import android.graphics.Bitmap;
import android.os.Message;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class C6702q extends WebViewClient {
    public C6758r f33047v;

    public C6702q(C6758r c6758r) {
        this.f33047v = c6758r;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.f33047v != null) {
            this.f33047v.mo5660a(webView, str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f33047v != null) {
            this.f33047v.mo5659a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (this.f33047v != null) {
            this.f33047v.mo5657a();
        }
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        if (this.f33047v != null) {
            this.f33047v.mo5658a(message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }
}
