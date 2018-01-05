package com.google.android.play.utils;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;

public final class UrlSpanUtils {

    class SelfishUrlSpan extends URLSpan {
        public final C6454m f32390a;

        public SelfishUrlSpan(String str, C6454m c6454m) {
            super(str);
            this.f32390a = c6454m;
        }

        public void onClick(View view) {
            this.f32390a.m29512a(view, getURL());
        }
    }

    @Deprecated
    public static void m29466a(CharSequence charSequence, CharSequence charSequence2, C6454m c6454m) {
        if (c6454m == null) {
            throw new IllegalStateException("listener should not be null");
        } else if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                if (charSequence2 == null || charSequence2.equals(url)) {
                    int spanStart = spannable.getSpanStart(uRLSpan);
                    int spanEnd = spannable.getSpanEnd(uRLSpan);
                    spannable.removeSpan(uRLSpan);
                    spannable.setSpan(new SelfishUrlSpan(url, c6454m), spanStart, spanEnd, 0);
                }
            }
        }
    }

    public static CharSequence m29467b(CharSequence charSequence, CharSequence charSequence2, C6454m c6454m) {
        if (!(charSequence instanceof Spannable)) {
            return charSequence;
        }
        CharSequence spannableString = new SpannableString(charSequence);
        m29466a(spannableString, charSequence2, c6454m);
        return spannableString;
    }
}
