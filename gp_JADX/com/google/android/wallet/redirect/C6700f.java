package com.google.android.wallet.redirect;

import android.webkit.JavascriptInterface;

final class C6700f {
    public final C6703h f33045a;

    public C6700f(C6703h c6703h) {
        this.f33045a = c6703h;
    }

    @JavascriptInterface
    public final void send(String str, Object obj) {
        C6703h c6703h = this.f33045a;
        C6696a c6696a = new C6696a();
        c6703h.f33063p = null;
    }

    @JavascriptInterface
    public final void submit(String str, String str2) {
        this.f33045a.f33063p = new C6699e(str, str2);
    }
}
