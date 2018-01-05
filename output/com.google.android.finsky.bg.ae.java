package com.google.android.finsky.bg;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.play.utils.m;

public static class com.google.android.finsky.bg.ae
{

    public static String a(String p0) {
        return String.valueOf(p0).concat(" ");
    }

    public static void a(Activity p0, EditText p1, int p2, int p3) {
        if (Build$VERSION.SDK_INT >= 24 && p0.isInMultiWindowMode()) {
            p1.setImeOptions(p3);
            p1.setImeActionLabel(p0.getResources().getText(2131952062), p3);
        }
        else
            p1.setImeOptions(268435456 | p2);
    }

    public static void a(TextView p0, CharSequence p1) {
        if (TextUtils.isEmpty(p1))
            p0.setVisibility(8);
        else {
            p0.setText(p1);
            p0.setVisibility(0);
        }
    }

    public static void a(TextView p0, String p1) {
        v0 = Html.fromHtml(p1);
        p0.setText(v0);
        if (((URLSpan[])new SpannableStringBuilder(v0).getSpans(0, v0.length(), URLSpan)).length > 0)
            p0.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void a(TextView p0, String p1, com.google.android.play.utils.m p2) {
        if (TextUtils.isEmpty(p1))
            p0.setVisibility(8);
        else {
            p0.setText(UrlSpanUtils.b(Html.fromHtml(p1), 0, p2));
            p0.setMovementMethod(LinkMovementMethod.getInstance());
            p0.setVisibility(0);
        }
    }

    public static void a(TextView p0, String p1, String p2) {
        p0.setError(p2);
        v2 = new Object[2];
        v2[0] = p1;
        v2[1] = p2;
        com.google.android.finsky.bg.a.a(p0.getContext(), p0.getResources().getString(2131951651, v2), p0, 0);
    }

}
