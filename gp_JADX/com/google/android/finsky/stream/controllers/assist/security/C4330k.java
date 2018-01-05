package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.stream.controllers.view.MyAppsSecurityOnePhaRemoved;
import com.google.android.finsky.verifier.C4726d;
import com.squareup.leakcanary.C7582R;

final class C4330k extends C4325v {
    public final String f21809a;
    public final long f21810b;
    public final boolean f21811c;

    C4330k(ad adVar, Context context, C4726d c4726d, String str, boolean z, long j) {
        super(adVar, context, c4726d);
        this.f21809a = str;
        this.f21810b = j;
        this.f21811c = z;
    }

    public final int mo4119c() {
        return C7582R.layout.my_apps_security_one_pha_removed;
    }

    public final void mo4116a(View view) {
        int i;
        if (MyAppsSecurityOnePhaRemoved.class.isAssignableFrom(view.getClass())) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            MyAppsSecurityOnePhaRemoved myAppsSecurityOnePhaRemoved = (MyAppsSecurityOnePhaRemoved) view;
            long j = this.f21810b;
            String str = this.f21809a;
            boolean z = this.f21811c;
            OnClickListener g = m20095g();
            TextView textView = (TextView) myAppsSecurityOnePhaRemoved.findViewById(C7582R.id.security_one_pha_removed_message);
            if (textView != null) {
                int i2;
                String a = SecurityUtils.m20040a(myAppsSecurityOnePhaRemoved.getContext(), j);
                if (z) {
                    i2 = C7582R.string.myapps_security_one_pha_disabled_message;
                } else {
                    i2 = C7582R.string.myapps_security_one_pha_removed_message;
                }
                textView.setText(myAppsSecurityOnePhaRemoved.getResources().getString(i2, new Object[]{a, str}));
                myAppsSecurityOnePhaRemoved.setOnClickListener(g);
            }
            myAppsSecurityOnePhaRemoved.setupOnRefreshListener(m20094f());
        }
    }
}
