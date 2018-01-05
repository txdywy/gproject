package com.google.android.play.article;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

final class C6255l extends WebChromeClient {
    public final /* synthetic */ C6254k f31283a;

    C6255l(C6254k c6254k) {
        this.f31283a = c6254k;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (this.f31283a.f31281e != null) {
            this.f31283a.f31281e.mo5361a(i);
        }
    }
}
