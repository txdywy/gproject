package com.google.android.finsky.bk;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.finsky.download.b;
import com.google.android.finsky.download.h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.herrevad.a;
import com.google.android.gms.herrevad.b;

public final class com.google.android.finsky.bk.d extends com.google.android.finsky.bk.a
{

    public final com.google.android.gms.common.api.o h;
    public final com.google.android.gms.herrevad.b i;

    d(Context p0, Handler p1) {
        com.google.android.finsky.bk.d(p0, p1, com.google.android.gms.herrevad.a.d);
    }

    d(Context p0, Handler p1, com.google.android.gms.herrevad.b p2) {
        com.google.android.finsky.bk.a(p0, p1);
        this.h = new com.google.android.gms.common.api.p(p0).a(com.google.android.gms.herrevad.a.c).a(new com.google.android.finsky.bk.e()).b();
        this.i = p2;
    }

    public final void b(com.google.android.finsky.download.b p0, int p1) {
        super.b(p0, p1);
    }

    public final void b(com.google.android.finsky.download.b p0, com.google.android.finsky.download.h p1) {
        super.b(p0, p1);
    }

    public final void e(com.google.android.finsky.download.b p0) {
        if (this.d >= 0 && this.e >= 0) {
            v6 = p0.n() - this.d;
            this.a();
            if (v6 < 0)
                FinskyLog.c("Throughput was calculated incorrectly or not at all", new Object[0]);
            else
                this.c.post(new com.google.android.finsky.bk.g(this, this.f, SystemClock.uptimeMillis() - this.e, v6));
        }
    }

    public final void f(com.google.android.finsky.download.b p0) {
        super.f(p0);
    }

    public final void g(com.google.android.finsky.download.b p0) {
        super.g(p0);
    }

    public final void h(com.google.android.finsky.download.b p0) {
    }

}
