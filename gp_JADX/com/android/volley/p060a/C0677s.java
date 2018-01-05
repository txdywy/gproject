package com.android.volley.p060a;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;

final class C0677s implements C0657w {
    public final /* synthetic */ String f4104a;
    public final /* synthetic */ C0675q f4105b;

    C0677s(C0675q c0675q, String str) {
        this.f4105b = c0675q;
        this.f4104a = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        C0675q c0675q = this.f4105b;
        String str = this.f4104a;
        C0679u c0679u = (C0679u) c0675q.f4098d.remove(str);
        if (c0679u != null) {
            c0679u.f4109c = volleyError;
            c0675q.m4466a(str, c0679u);
        }
    }
}
