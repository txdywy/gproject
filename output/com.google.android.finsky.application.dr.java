package com.google.android.finsky.application;

import a.a.c;
import c.a.a;
import com.google.android.finsky.notification.h;
import com.google.android.finsky.notification.impl.a;

public final class com.google.android.finsky.application.dr implements c.a.a
{

    public final c.a.a a;
    public final c.a.a b;

    dr(c.a.a p0, c.a.a p1) {
        this.a = p0;
        this.b = p1;
    }

    public final Object a() {
        v2 = new com.google.android.finsky.notification.impl.a((com.google.android.finsky.notification.h)this.a.a(), (com.google.android.finsky.notification.h)this.b.a());
        v2.d.a(v2);
        v2.e.a(v2);
        return (com.google.android.finsky.notification.h)a.a.c.a(v2, "Cannot return null from a non-@Nullable @Provides method");
    }

}
