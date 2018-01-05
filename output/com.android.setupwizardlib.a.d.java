package com.android.setupwizardlib.a;

import android.text.Spannable;

public static class com.android.setupwizardlib.a.d
{

    public static void a(Spannable p0, Object p1, Object p2) {
        p0.removeSpan(p1);
        p0.setSpan(p2, p0.getSpanStart(p1), p0.getSpanEnd(p1), 0);
    }

}
