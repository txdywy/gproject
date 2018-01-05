package com.google.android.finsky.installer.p207a;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.volley.DisplayMessageError;

final class au implements C0657w {
    public final /* synthetic */ String f16950a;
    public final /* synthetic */ ah f16951b;

    au(ah ahVar, String str) {
        this.f16951b = ahVar;
        this.f16950a = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        String str;
        C3322j c3322j = this.f16951b.f16901i;
        int a = C3322j.m16692a(volleyError);
        if (volleyError instanceof DisplayMessageError) {
            str = ((DisplayMessageError) volleyError).a;
        } else {
            str = null;
        }
        FinskyLog.m21659a("Received VolleyError %d (%s)", Integer.valueOf(a), str);
        this.f16951b.m16435a(false);
        this.f16951b.f16874E.m11221a(this.f16950a, new C2474c(104).m13236a(this.f16950a).m13210a(a).m13238a((Throwable) volleyError).m13231a(this.f16951b.f16893X).f13342a);
        this.f16951b.m16423a(3, a);
        this.f16951b.m16425a(a, str);
    }
}
