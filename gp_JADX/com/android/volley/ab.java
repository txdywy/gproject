package com.android.volley;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class ab {
    public static final boolean f4125a = aa.f4124b;
    public final List f4126b = new ArrayList();
    public boolean f4127c = false;

    ab() {
    }

    public final synchronized void m4486a(String str, long j) {
        if (this.f4127c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f4126b.add(new ac(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void m4485a(String str) {
        long j;
        this.f4127c = true;
        if (this.f4126b.size() == 0) {
            j = 0;
        } else {
            j = ((ac) this.f4126b.get(this.f4126b.size() - 1)).f4130c - ((ac) this.f4126b.get(0)).f4130c;
        }
        if (j > 0) {
            long j2 = ((ac) this.f4126b.get(0)).f4130c;
            aa.m4482b("(%-4d ms) %s", Long.valueOf(j), str);
            j = j2;
            for (ac acVar : this.f4126b) {
                aa.m4482b("(+%-4d) [%2d] %s", Long.valueOf(acVar.f4130c - j), Long.valueOf(acVar.f4129b), acVar.f4128a);
                j = acVar.f4130c;
            }
        }
    }

    protected final void finalize() {
        if (!this.f4127c) {
            m4485a("Request on the loose");
            aa.m4483c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
