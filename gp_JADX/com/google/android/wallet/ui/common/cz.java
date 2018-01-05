package com.google.android.wallet.ui.common;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebView;

final class cz extends WebView {
    cz(Context context) {
        super(context);
    }

    public final boolean onCheckIsTextEditor() {
        return true;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (VERSION.SDK_INT < 19) {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
        }
    }
}
