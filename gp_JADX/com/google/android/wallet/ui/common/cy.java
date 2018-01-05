package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class cy extends WebViewClient {
    public final /* synthetic */ cx f33672a;

    cy(cx cxVar) {
        this.f33672a = cxVar;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f33672a.m30922a(Uri.parse(str));
        webView.destroy();
        return true;
    }

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f33672a.m30922a(webResourceRequest.getUrl());
        webView.destroy();
        return true;
    }
}
