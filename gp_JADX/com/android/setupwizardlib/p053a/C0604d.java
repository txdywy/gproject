package com.android.setupwizardlib.p053a;

import android.text.Spannable;

public final class C0604d {
    public static void m4220a(Spannable spannable, Object obj, Object obj2) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        spannable.setSpan(obj2, spanStart, spanEnd, 0);
    }
}
