package com.google.android.gms.internal;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.p270c.C4909c;

public final class mh extends nd {
    public final View f27177a;

    public mh(jp jpVar, String str, String str2, ci ciVar, int i, View view) {
        super(jpVar, str, str2, ciVar, i, 57);
        this.f27177a = view;
    }

    protected final void mo4764a() {
        if (this.f27177a != null) {
            DisplayMetrics displayMetrics = this.d.f27072b.getResources().getDisplayMetrics();
            boolean booleanValue = ((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27760p)).booleanValue();
            jv jvVar = new jv((String) this.h.invoke(null, new Object[]{this.f27177a, displayMetrics, Boolean.valueOf(booleanValue)}));
            ck ckVar = new ck();
            ckVar.f26629c = jvVar.f27106b;
            ckVar.f26630d = jvVar.f27107c;
            ckVar.f26631e = jvVar.f27108d;
            this.g.f26577Y = ckVar;
        }
    }
}
