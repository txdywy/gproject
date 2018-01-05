package com.google.android.finsky.actionbuttons;

import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.text.SpannableString;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

public final class C1020p {
    public static void m6006a(PlayActionButtonV2 playActionButtonV2, Drawable drawable) {
        CharSequence spannableString;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        C1028x c1028x = new C1028x(drawable);
        String valueOf;
        if (ai.f1848a.mo400k(playActionButtonV2) == 1) {
            valueOf = String.valueOf(playActionButtonV2.getText());
            spannableString = new SpannableString(new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append(" ").toString());
            spannableString.setSpan(c1028x, spannableString.length() - 1, spannableString.length(), 17);
        } else {
            valueOf = String.valueOf(playActionButtonV2.getText());
            spannableString = new SpannableString(new StringBuilder(String.valueOf(valueOf).length() + 1).append(" ").append(valueOf).toString());
            spannableString.setSpan(c1028x, 0, 1, 17);
        }
        playActionButtonV2.setTransformationMethod(null);
        playActionButtonV2.setText(spannableString);
    }
}
