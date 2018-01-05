package com.google.android.finsky.bi.p150a;

import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.utils.FinskyLog;

final class C1640b implements Runnable {
    public final /* synthetic */ String f8564a;
    public final /* synthetic */ int f8565b;
    public final /* synthetic */ String f8566c;
    public final /* synthetic */ C1639a f8567d;

    C1640b(C1639a c1639a, String str, int i, String str2) {
        this.f8567d = c1639a;
        this.f8564a = str;
        this.f8565b = i;
        this.f8566c = str2;
    }

    public final void run() {
        FinskyLog.m21659a("Set autoupdate of %s to %d (%s)", this.f8564a, Integer.valueOf(this.f8565b), this.f8566c);
        ((C3646a) this.f8567d.f8563b.mo1a()).f18022b.mo2661a(this.f8564a, this.f8565b);
    }
}
