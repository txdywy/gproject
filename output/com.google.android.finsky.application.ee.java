package com.google.android.finsky.application;

import a.a.c;
import c.a.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.m;
import com.google.android.finsky.notification.h;
import com.google.android.finsky.notification.impl.au;

public final class com.google.android.finsky.application.ee implements c.a.a
{

    public final c.a.a a;

    ee(c.a.a p0) {
        this.a = p0;
    }

    public final Object a() {
        if (com.google.android.finsky.m.a.dj().a(12637790))
            v0 = ((com.google.android.finsky.notification.impl.au)this.a.a()).a;
        else
            v0 = com.google.android.finsky.notification.h.a;
        return (com.google.android.finsky.notification.h)a.a.c.a(v0, "Cannot return null from a non-@Nullable @Provides method");
    }

}
