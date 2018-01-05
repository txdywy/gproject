package com.google.android.play.utils;

import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.widget.TextView;

public final class C6453l {
    public static void m29511a(TextView textView, Drawable drawable, boolean z) {
        boolean z2;
        int i;
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (ai.a.k(textView) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == z) {
            i = 0;
        } else {
            i = 2;
        }
        compoundDrawables[i] = drawable;
        textView.setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }
}
