package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.stream.controllers.assist.security.SecurityUtils.SelfishUrlSpanNoUnderline;
import com.google.android.finsky.stream.controllers.view.MyAppsSecuritySeveralPhas;
import com.google.android.finsky.verifier.C4726d;
import com.squareup.leakcanary.C7582R;

final class C4343z extends C4325v {
    public final long f21831a;
    public final int f21832b;

    C4343z(ad adVar, Context context, C4726d c4726d, int i, long j) {
        super(adVar, context, c4726d);
        this.f21832b = i;
        this.f21831a = j;
    }

    public final int mo4119c() {
        return C7582R.layout.my_apps_security_several_phas;
    }

    public final void mo4116a(View view) {
        int i;
        if (MyAppsSecuritySeveralPhas.class.isAssignableFrom(view.getClass())) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            MyAppsSecuritySeveralPhas myAppsSecuritySeveralPhas = (MyAppsSecuritySeveralPhas) view;
            int i2 = this.f21832b;
            long j = this.f21831a;
            ag aaVar = new aa(this);
            TextView textView = (TextView) myAppsSecuritySeveralPhas.findViewById(C7582R.id.security_several_phas_message);
            if (textView != null) {
                String a = SecurityUtils.m20040a(myAppsSecuritySeveralPhas.getContext(), j);
                Object string = myAppsSecuritySeveralPhas.getContext().getResources().getString(C7582R.string.myapps_security_several_phas_message, new Object[]{Integer.valueOf(i2), a});
                if (TextUtils.isEmpty(string)) {
                    textView.setVisibility(8);
                    return;
                }
                CharSequence spannableString;
                CharSequence fromHtml = Html.fromHtml(string);
                if (fromHtml instanceof Spannable) {
                    spannableString = new SpannableString(fromHtml);
                    Spannable spannable = (Spannable) spannableString;
                    for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                        String url = uRLSpan.getURL();
                        int spanStart = spannable.getSpanStart(uRLSpan);
                        int spanEnd = spannable.getSpanEnd(uRLSpan);
                        spannable.removeSpan(uRLSpan);
                        spannable.setSpan(new SelfishUrlSpanNoUnderline(url, aaVar), spanStart, spanEnd, 0);
                    }
                } else {
                    spannableString = fromHtml;
                }
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setVisibility(0);
            }
        }
    }
}
