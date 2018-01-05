package com.google.android.wallet.ui.common;

import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

public class ClickSpan extends URLSpan {
    public final C6527m f33325a;

    private ClickSpan(String str, C6527m c6527m) {
        super(str);
        if (c6527m == null) {
            throw new IllegalStateException("listener should not be null");
        }
        this.f33325a = c6527m;
    }

    public void onClick(View view) {
        this.f33325a.mo5472a(view, getURL());
    }

    public static void m30593a(TextView textView, String str, C6527m c6527m) {
        int i = 0;
        CharSequence spannableString = new SpannableString(Html.fromHtml(str));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        while (i < length) {
            URLSpan uRLSpan = uRLSpanArr[i];
            String url = uRLSpan.getURL();
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            int spanFlags = spannableString.getSpanFlags(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new ClickSpan(url, c6527m), spanStart, spanEnd, spanFlags);
            i++;
        }
        textView.setText(spannableString);
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod)) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
