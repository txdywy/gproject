package com.google.android.libraries.bind.p323a;

import android.os.Handler;
import android.os.SystemClock;

public final class C5858d {
    public final Object f29360a = this.f29363d;
    public final Runnable f29361b;
    public final Handler f29362c;
    public final Runnable f29363d = new C5859e(this);
    public long f29364e = -1;

    public C5858d(Handler handler, Runnable runnable) {
        this.f29361b = runnable;
        this.f29362c = handler;
    }

    public final boolean m27298a() {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis() + 75;
        synchronized (this.f29360a) {
            if (m27297b()) {
                if (uptimeMillis > this.f29364e) {
                    m27296a(uptimeMillis);
                }
                z = true;
            } else {
                m27296a(uptimeMillis);
                z = false;
            }
        }
        return z;
    }

    private final boolean m27297b() {
        boolean z;
        synchronized (this.f29360a) {
            z = this.f29364e > 0;
        }
        return z;
    }

    private final void m27296a(long j) {
        this.f29364e = j;
        this.f29362c.removeCallbacks(this.f29363d);
        if (!this.f29362c.postAtTime(this.f29363d, this.f29364e)) {
            this.f29364e = -1;
        }
    }
}
