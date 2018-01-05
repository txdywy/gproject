package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.am;

abstract class gm {
    public static volatile Handler f26786b;
    public final hv f26787a;
    public final Runnable f26788c = new gn(this);
    public volatile long f26789d;
    public boolean f26790e = true;

    gm(hv hvVar) {
        am.m23733a((Object) hvVar);
        this.f26787a = hvVar;
    }

    public abstract void mo4763a();

    public final void m24502a(long j) {
        m24504c();
        if (j >= 0) {
            this.f26789d = this.f26787a.f26939n.mo4629a();
            if (!m24500d().postDelayed(this.f26788c, j)) {
                this.f26787a.m24761d().f26845d.m24653a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean m24503b() {
        return this.f26789d != 0;
    }

    public final void m24504c() {
        this.f26789d = 0;
        m24500d().removeCallbacks(this.f26788c);
    }

    private final Handler m24500d() {
        if (f26786b != null) {
            return f26786b;
        }
        Handler handler;
        synchronized (gm.class) {
            if (f26786b == null) {
                f26786b = new Handler(this.f26787a.f26927b.getMainLooper());
            }
            handler = f26786b;
        }
        return handler;
    }
}
