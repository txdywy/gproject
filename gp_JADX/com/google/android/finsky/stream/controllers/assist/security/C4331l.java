package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.stream.controllers.view.MyAppsSecurityOnePha;
import com.google.android.finsky.verifier.C4726d;
import com.squareup.leakcanary.C7582R;

final class C4331l extends C4325v {
    public final C4316a f21812a;
    public final long f21813b;

    C4331l(ad adVar, Context context, C4726d c4726d, C4316a c4316a, long j) {
        super(adVar, context, c4726d);
        this.f21812a = c4316a;
        this.f21813b = j;
    }

    public final int mo4119c() {
        return C7582R.layout.my_apps_security_one_pha;
    }

    public final void mo4116a(View view) {
        Object obj;
        if (MyAppsSecurityOnePha.class.isAssignableFrom(view.getClass())) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            int i;
            MyAppsSecurityOnePha myAppsSecurityOnePha = (MyAppsSecurityOnePha) view;
            myAppsSecurityOnePha.setDismissClickListener(new C4332m(this));
            OnClickListener c4333n = new C4333n(this);
            boolean z = this.f21812a.f21772d;
            TextView textView = (TextView) myAppsSecurityOnePha.findViewById(C7582R.id.security_one_pha_uninstall);
            if (textView != null) {
                textView.setText(myAppsSecurityOnePha.getContext().getResources().getString(z ? C7582R.string.myapps_security_disable : C7582R.string.myapps_security_uninstall).toUpperCase());
                textView.setOnClickListener(c4333n);
            }
            myAppsSecurityOnePha.setupLearnMore(m20095g());
            CharSequence charSequence = this.f21812a.f21771c;
            boolean z2 = this.f21812a.f21772d;
            textView = (TextView) myAppsSecurityOnePha.findViewById(C7582R.id.security_one_pha_message);
            if (textView != null) {
                textView.setText(charSequence);
            }
            textView = (TextView) myAppsSecurityOnePha.findViewById(C7582R.id.security_one_pha_title);
            if (z2) {
                i = C7582R.string.myapps_security_one_pha_disable_prompt;
            } else {
                i = C7582R.string.myapps_security_one_pha_uninstall_prompt;
            }
            if (textView != null) {
                textView.setText(i);
            }
        }
    }
}
