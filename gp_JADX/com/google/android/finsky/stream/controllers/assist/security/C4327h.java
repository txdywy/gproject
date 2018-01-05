package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.stream.controllers.view.MyAppsSecurityInfo;
import com.google.android.finsky.verifier.C4726d;
import com.squareup.leakcanary.C7582R;

final class C4327h extends C4325v {
    public final long f21807a;

    C4327h(ad adVar, Context context, C4726d c4726d, long j) {
        super(adVar, context, c4726d);
        this.f21807a = j;
    }

    public final int mo4118b() {
        return C7582R.layout.my_apps_security_info;
    }

    public final void mo4116a(View view) {
        Object obj;
        if (MyAppsSecurityInfo.class.isAssignableFrom(view.getClass())) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            MyAppsSecurityInfo myAppsSecurityInfo = (MyAppsSecurityInfo) view;
            long j = this.f21807a;
            OnClickListener g = m20095g();
            TextView textView = (TextView) myAppsSecurityInfo.findViewById(C7582R.id.security_info_message);
            if (textView != null) {
                textView.setText(SecurityUtils.m20040a(myAppsSecurityInfo.getContext(), j));
                myAppsSecurityInfo.setOnClickListener(g);
            }
            myAppsSecurityInfo.setupOnRefreshListener(m20094f());
            myAppsSecurityInfo.setupIconListener(m20095g());
        }
    }

    public final void mo4115a() {
        C0954a.br.m5763a(null);
    }
}
