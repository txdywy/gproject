package com.google.android.finsky.stream.myapps;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;

final /* synthetic */ class C4554u implements C0657w {
    public final C4552s f23292a;

    C4554u(C4552s c4552s) {
        this.f23292a = c4552s;
    }

    public final void mo1062a(VolleyError volleyError) {
        C4552s c4552s = this.f23292a;
        c4552s.f23285l = volleyError;
        c4552s.f23275b = false;
        for (C0657w a : c4552s.f23289p) {
            a.mo1062a(volleyError);
        }
    }
}
