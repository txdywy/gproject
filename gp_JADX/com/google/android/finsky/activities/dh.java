package com.google.android.finsky.activities;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C1507b;

final class dh implements C0657w {
    public final /* synthetic */ de f6666a;

    dh(de deVar) {
        this.f6666a = deVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        String a = C1290m.m7702a(this.f6666a.m603h(), volleyError);
        if (a != null) {
            C1507b.m8844a(this.f6666a.f730B, this.f6666a, null, a, this.f6666a.bw, 10);
        } else {
            this.f6666a.bm.mo1244m();
        }
    }
}
