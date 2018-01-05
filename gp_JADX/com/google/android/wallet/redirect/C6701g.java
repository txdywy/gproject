package com.google.android.wallet.redirect;

import android.webkit.JavascriptInterface;

final class C6701g {
    public final C6703h f33046a;

    C6701g(C6703h c6703h) {
        this.f33046a = c6703h;
    }

    @JavascriptInterface
    public final void completeRedirectMessagePassThrough(String str) {
        C6703h c6703h = this.f33046a;
        c6703h.f33051d.post(new C6704i(c6703h, str));
    }
}
