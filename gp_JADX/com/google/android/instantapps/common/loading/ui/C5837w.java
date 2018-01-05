package com.google.android.instantapps.common.loading.ui;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

final class C5837w implements Runnable {
    public final long f29307a = 300;
    public final long f29308b = 33;
    public final Handler f29309c = new Handler(Looper.getMainLooper());
    public final long f29310d = SystemClock.elapsedRealtime();
    public boolean f29311e = false;
    public final /* synthetic */ C5822h f29312f;

    public C5837w(C5822h c5822h) {
        this.f29312f = c5822h;
        if (c5822h.aJ != null && c5822h.aJ.f29311e) {
            c5822h.aJ = null;
            c5822h.ad();
        }
        c5822h.al.m27251a(Math.min(c5822h.aI, c5822h.aK));
        this.f29309c.postDelayed(this, 33);
    }

    public final void run() {
        if (!this.f29311e) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f29310d >= this.f29307a) {
                this.f29311e = true;
                C5822h c5822h = this.f29312f;
                c5822h.aK = 100;
                if (c5822h.aJ != null && c5822h.aJ.f29311e) {
                    c5822h.aJ = null;
                    c5822h.ad();
                }
                c5822h.al.m27251a(Math.min(c5822h.aI, c5822h.aK));
                return;
            }
            C5822h c5822h2 = this.f29312f;
            c5822h2.aK = (int) (((elapsedRealtime - this.f29310d) * 100) / this.f29307a);
            if (c5822h2.aJ != null && c5822h2.aJ.f29311e) {
                c5822h2.aJ = null;
                c5822h2.ad();
            }
            c5822h2.al.m27251a(Math.min(c5822h2.aI, c5822h2.aK));
            this.f29309c.postDelayed(this, this.f29308b);
        }
    }
}
