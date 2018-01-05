package com.google.android.finsky.cb;

import a.a;
import android.content.res.Configuration;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.w;

public final class com.google.android.finsky.cb.a implements ComponentCallbacks2
{

    public final a.a a;
    public final a.a b;

    a(a.a p0, a.a p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void onConfigurationChanged(Configuration p0) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int p0) {
        v1 = new Object[1];
        v1[0] = Integer.valueOf(p0);
        FinskyLog.a("Memory trim requested to level %d", v1);
        if (p0 == 20 && ((com.google.android.finsky.ba.c)this.b.a()).dj().a(12606496)) {
            FinskyLog.a("Flushing in-memory image cache", new Object[0]);
            ((com.google.android.play.image.w)this.a.a()).b();
        }
    }

}
