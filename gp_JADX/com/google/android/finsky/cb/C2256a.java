package com.google.android.finsky.cb;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import p002a.C0002a;

public final class C2256a implements ComponentCallbacks2 {
    public final C0002a f11199a;
    public final C0002a f11200b;

    public C2256a(C0002a c0002a, C0002a c0002a2) {
        this.f11199a = c0002a;
        this.f11200b = c0002a2;
    }

    public final void onTrimMemory(int i) {
        FinskyLog.m21659a("Memory trim requested to level %d", Integer.valueOf(i));
        if (i == 20 && ((C1461c) this.f11200b.mo1a()).dj().mo2294a(12606496)) {
            FinskyLog.m21659a("Flushing in-memory image cache", new Object[0]);
            ((C1294w) this.f11199a.mo1a()).mo1678b();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }
}
