package com.google.android.finsky.p111d;

import com.google.wireless.android.a.a.a.a.bq;
import com.google.wireless.android.a.a.a.a.bv;

public final class aa {
    public static aa f13312e;
    public final bq f13313a = new bq();
    public final bv f13314b = new bv();
    public final bv f13315c = new bv();
    public boolean f13316d;

    public static synchronized aa m13186a() {
        aa aaVar;
        synchronized (aa.class) {
            if (f13312e == null) {
                f13312e = new aa();
            }
            aaVar = f13312e;
        }
        return aaVar;
    }

    private aa() {
    }

    public final synchronized boolean m13188b() {
        return this.f13316d;
    }

    public final synchronized bq m13189c() {
        bv bvVar;
        bq bqVar = this.f13313a;
        if (this.f13314b.b == 0) {
            bvVar = null;
        } else {
            bvVar = this.f13315c;
        }
        bqVar.b = bvVar;
        return this.f13313a;
    }

    public final synchronized void m13187a(boolean z) {
        this.f13316d = z;
        if (this.f13316d) {
            this.f13314b.a(0);
        }
    }

    public final synchronized void m13190d() {
        this.f13314b.a(1);
        this.f13315c.a(1);
        m13187a(false);
    }
}
