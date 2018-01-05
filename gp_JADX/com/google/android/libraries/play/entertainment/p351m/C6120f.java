package com.google.android.libraries.play.entertainment.p351m;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.widget.TextView;

public final class C6120f {
    public static Spanned m28114a(Spanned spanned) {
        Spanned spannableStringBuilder = new SpannableStringBuilder(spanned);
        while (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    public static int m28113a(TextView textView) {
        return Math.round(textView.getPaint().getFontSpacing() * textView.getLineSpacingMultiplier());
    }
}
