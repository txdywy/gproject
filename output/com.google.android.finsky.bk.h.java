package com.google.android.finsky.bk;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.finsky.download.b;
import com.google.android.finsky.download.h;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.bk.h extends com.google.android.finsky.bk.a
{

    public final Context h;

    h(Context p0, Handler p1) {
        com.google.android.finsky.bk.a(p0, p1);
        this.h = p0;
    }

    public final void b(com.google.android.finsky.download.b p0, int p1) {
        super.b(p0, p1);
    }

    public final void b(com.google.android.finsky.download.b p0, com.google.android.finsky.download.h p1) {
        super.b(p0, p1);
    }

    public final void e(com.google.android.finsky.download.b p0) {
        if (this.d >= 0 && this.e >= 0) {
            v4 = p0.n() - this.d;
            v6 = 1000 * v4 / Math.max(1, SystemClock.uptimeMillis() - this.e);
            this.a();
            if (v6 < 0 || v4 < 0)
                FinskyLog.c("Throughput or bytes transferred were calculated incorrectly or not at all", new Object[0]);
            else
                this.c.post(new com.google.android.finsky.bk.i(this, this.f, v4, v6));
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
