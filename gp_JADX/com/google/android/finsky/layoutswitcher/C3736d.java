package com.google.android.finsky.layoutswitcher;

import android.content.Context;
import android.net.NetworkInfo;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cg.C2278e;

public final class C3736d {
    public C1461c f18876a;
    public Context f18877b;

    public C3736d(C1461c c1461c, Context context) {
        this.f18876a = c1461c;
        this.f18877b = context;
    }

    public final boolean m17616a() {
        if (!this.f18876a.dj().mo2294a(12637762)) {
            return false;
        }
        NetworkInfo a = C2278e.m11746a(this.f18877b);
        if (a == null || !a.isConnected()) {
            return true;
        }
        return false;
    }
}
