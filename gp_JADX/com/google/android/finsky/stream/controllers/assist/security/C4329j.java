package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.stream.controllers.view.MyAppsSecurityOnePhaDismissed;
import com.google.android.finsky.verifier.C4726d;
import com.squareup.leakcanary.C7582R;

final class C4329j extends C4325v {
    public final long f21808a;

    C4329j(ad adVar, Context context, C4726d c4726d, long j) {
        super(adVar, context, c4726d);
        this.f21808a = j;
    }

    public final int mo4119c() {
        return C7582R.layout.my_apps_security_one_pha_dismissed;
    }

    public final void mo4116a(View view) {
        Object obj;
        if (MyAppsSecurityOnePhaDismissed.class.isAssignableFrom(view.getClass())) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            MyAppsSecurityOnePhaDismissed myAppsSecurityOnePhaDismissed = (MyAppsSecurityOnePhaDismissed) view;
            long j = this.f21808a;
            OnClickListener g = m20095g();
            TextView textView = (TextView) myAppsSecurityOnePhaDismissed.findViewById(C7582R.id.security_one_pha_dismissed_message);
            if (textView != null) {
                textView.setText(SecurityUtils.m20040a(myAppsSecurityOnePhaDismissed.getContext(), j));
                myAppsSecurityOnePhaDismissed.setOnClickListener(g);
            }
            myAppsSecurityOnePhaDismissed.setupOnRefreshListener(m20094f());
        }
    }
}
