package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.stream.controllers.view.MyAppsSecurityRecentlyRemoved;
import com.google.android.finsky.verifier.C4726d;
import com.squareup.leakcanary.C7582R;

final class C4334o extends C4325v {
    public final long f21816a;
    public final int f21817b;

    C4334o(ad adVar, Context context, C4726d c4726d, long j, int i) {
        super(adVar, context, c4726d);
        this.f21816a = j;
        this.f21817b = i;
    }

    public final int mo4118b() {
        return C7582R.layout.my_apps_security_recently_removed;
    }

    public final void mo4116a(View view) {
        int i;
        if (MyAppsSecurityRecentlyRemoved.class.isAssignableFrom(view.getClass())) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            MyAppsSecurityRecentlyRemoved myAppsSecurityRecentlyRemoved = (MyAppsSecurityRecentlyRemoved) view;
            long j = this.f21816a;
            int i2 = this.f21817b;
            OnClickListener g = m20095g();
            TextView textView = (TextView) myAppsSecurityRecentlyRemoved.findViewById(C7582R.id.security_recently_removed_message);
            if (textView != null) {
                String a = SecurityUtils.m20040a(myAppsSecurityRecentlyRemoved.getContext(), j);
                textView.setText(myAppsSecurityRecentlyRemoved.getResources().getQuantityString(C7582R.plurals.myapps_security_recently_removed_message, i2, new Object[]{Integer.valueOf(i2), a}));
                myAppsSecurityRecentlyRemoved.setOnClickListener(g);
            }
            myAppsSecurityRecentlyRemoved.setupOnRefreshListener(m20094f());
        }
    }

    public final void mo4115a() {
        C0954a.br.m5763a(null);
    }
}
