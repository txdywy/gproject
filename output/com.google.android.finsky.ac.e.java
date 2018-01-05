package com.google.android.finsky.ac;

import com.google.android.finsky.by.l;
import com.google.android.finsky.packagemanager.f;
import com.google.android.finsky.scheduler.ak;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.z.e;

public final class com.google.android.finsky.ac.e
{

    public com.google.android.finsky.scheduler.ba a;
    public final com.google.android.finsky.by.l b;
    public final com.google.android.finsky.scheduler.bb c;
    public final com.google.android.finsky.packagemanager.f d;

    e(com.google.android.finsky.scheduler.bb p0, com.google.android.finsky.by.l p1, com.google.android.finsky.packagemanager.f p2) {
        this.c = p0;
        this.b = p1;
        this.d = p2;
    }

    public final void a() {
        if (this.a == 0)
            this.a = this.c.a(12);
        this.a.a.b(this.a.c).a(new com.google.android.finsky.ac.f(this));
    }

}
