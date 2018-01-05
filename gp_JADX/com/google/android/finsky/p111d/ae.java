package com.google.android.finsky.p111d;

import android.app.Application;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.libraries.performance.primes.cc;

public final class ae {
    public static final cc f13328a = cc.m27770a("SCROLL");
    public final C2487n f13329b;
    public final Application f13330c;
    public boolean f13331d;
    public final C1461c f13332e;

    public ae(C2487n c2487n, Application application, C1461c c1461c) {
        this.f13329b = c2487n;
        this.f13330c = application;
        this.f13332e = c1461c;
    }

    public static boolean m13192a(C1461c c1461c) {
        C1552e dj = c1461c.dj();
        return dj.mo2294a(12628179) || dj.mo2294a(12638619) || dj.mo2294a(12640007) || dj.mo2294a(12634791);
    }

    static {
        cc.m27770a("ANIMATION");
    }
}
