package com.google.android.finsky.billing.lightpurchase;

import android.webkit.WebView;
import com.google.android.wallet.ui.common.q;

public final class com.google.android.finsky.billing.lightpurchase.b extends com.google.android.wallet.ui.common.q
{

    public final AuthenticatedWebViewActivity a;

    b(AuthenticatedWebViewActivity p0) {
        this.a = p0;
        com.google.android.wallet.ui.common.q();
    }

    public final boolean shouldOverrideUrlLoading(WebView p0, String p1) {
        v0 = 1;
        if (p1.startsWith(this.a.d))
            this.a.a(1);
        else
            v0 = 0;
        return v0;
    }

}
