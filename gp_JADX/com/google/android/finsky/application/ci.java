package com.google.android.finsky.application;

import com.android.volley.C0656n;
import com.android.volley.C0701t;
import com.android.volley.p060a.C0682y;
import com.google.android.finsky.api.C1253j;

final class ci implements C0701t {
    public final /* synthetic */ int f7962a;
    public final /* synthetic */ C1475d f7963b;

    ci(C1475d c1475d, int i) {
        this.f7963b = c1475d;
        this.f7962a = i;
    }

    public final boolean mo1083a(C0656n c0656n) {
        if (c0656n instanceof C1253j) {
            if (((C1253j) c0656n).mo1541a()) {
                return false;
            }
        } else if (this.f7963b.dj().mo2294a(12639221) && (c0656n instanceof C0682y)) {
            return false;
        }
        return c0656n.m4369c() < this.f7962a;
    }
}
