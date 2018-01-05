package com.google.android.finsky.billing.lightpurchase;

import android.webkit.WebView;
import com.google.android.wallet.ui.common.q;

final class C1912b extends q {
    public final /* synthetic */ AuthenticatedWebViewActivity f9837a;

    C1912b(AuthenticatedWebViewActivity authenticatedWebViewActivity) {
        this.f9837a = authenticatedWebViewActivity;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AuthenticatedWebViewActivity authenticatedWebViewActivity = this.f9837a;
        if (!str.startsWith(authenticatedWebViewActivity.f9620d)) {
            return false;
        }
        authenticatedWebViewActivity.m10035a(true);
        return true;
    }
}
