package com.google.android.finsky.bk;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.utils.FinskyLog;

public final class C2114h extends C2107a {
    public final Context f10730h;

    public C2114h(Context context, Handler handler) {
        super(context, handler);
        this.f10730h = context;
    }

    public final void mo2647e(C2839b c2839b) {
        if (this.d >= 0 && this.e >= 0) {
            long n = c2839b.mo3164n() - this.d;
            long max = (1000 * n) / Math.max(1, SystemClock.uptimeMillis() - this.e);
            C2109c c2109c = this.f;
            m11000a();
            if (max < 0 || n < 0) {
                FinskyLog.m21665c("Throughput or bytes transferred were calculated incorrectly or not at all", new Object[0]);
            } else {
                this.c.post(new C2115i(this, c2109c, n, max));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void mo2644f(C2839b c2839b) {
        super.mo2644f(c2839b);
    }

    public final /* bridge */ /* synthetic */ void mo2645g(C2839b c2839b) {
        super.mo2645g(c2839b);
    }

    public final /* bridge */ /* synthetic */ void mo2646h(C2839b c2839b) {
    }
}
