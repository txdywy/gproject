package com.google.android.finsky.bg;

import android.app.Activity;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.play.utils.m;
import com.squareup.leakcanary.C7582R;

public final class ae {
    public static void m9217a(TextView textView, String str) {
        CharSequence fromHtml = Html.fromHtml(str);
        textView.setText(fromHtml);
        if (((URLSpan[]) new SpannableStringBuilder(fromHtml).getSpans(0, fromHtml.length(), URLSpan.class)).length > 0) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void m9218a(TextView textView, String str, m mVar) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(UrlSpanUtils.b(Html.fromHtml(str), null, mVar));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setVisibility(0);
    }

    public static String m9214a(String str) {
        return String.valueOf(str).concat(" ");
    }

    public static void m9219a(TextView textView, String str, String str2) {
        textView.setError(str2);
        C1601a.m9199a(textView.getContext(), textView.getResources().getString(C7582R.string.accessibility_event_form_field_error, new Object[]{str, str2}), textView, false);
    }

    public static void m9215a(Activity activity, EditText editText, int i, int i2) {
        if (VERSION.SDK_INT < 24 || !activity.isInMultiWindowMode()) {
            editText.setImeOptions(268435456 | i);
            return;
        }
        editText.setImeOptions(i2);
        editText.setImeActionLabel(activity.getResources().getText(C7582R.string.done), i2);
    }

    public static void m9216a(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }
}
