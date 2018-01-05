package com.google.android.finsky.scheduler.p238b;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.scheduler.p236a.p237a.C4013b;
import com.google.android.finsky.utils.FinskyLog;

public final class C4024b {
    public final C4013b f20247a;

    public C4024b() {
        this.f20247a = new C4013b();
    }

    C4024b(C4013b c4013b) {
        this();
        m18839a(c4013b.f20154b);
        m18843b(c4013b.f20155c);
        m18838a(c4013b.f20156d);
        m18840a(c4013b.f20157e);
        m18844b(c4013b.f20158f);
        m18842b(c4013b.f20159g);
        boolean z = c4013b.f20160h;
        C4013b c4013b2 = this.f20247a;
        c4013b2.f20153a |= 64;
        c4013b2.f20160h = z;
        z = c4013b.f20161i;
        c4013b2 = this.f20247a;
        c4013b2.f20153a |= 128;
        c4013b2.f20161i = z;
    }

    public final C4024b m18839a(long j) {
        this.f20247a.m18768a(j);
        return this;
    }

    public final C4024b m18843b(long j) {
        C4013b c4013b = this.f20247a;
        c4013b.f20153a |= 2;
        c4013b.f20155c = j;
        return this;
    }

    public final C4024b m18838a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                C4013b c4013b = this.f20247a;
                c4013b.f20156d = i;
                c4013b.f20153a |= 4;
                return this;
            default:
                throw new IllegalArgumentException("invalid network type");
        }
    }

    public final C4024b m18840a(boolean z) {
        C4013b c4013b = this.f20247a;
        c4013b.f20153a |= 8;
        c4013b.f20157e = z;
        return this;
    }

    public final C4024b m18844b(boolean z) {
        C4013b c4013b = this.f20247a;
        c4013b.f20153a |= 16;
        c4013b.f20158f = z;
        return this;
    }

    public final C4024b m18842b(int i) {
        switch (i) {
            case 1:
            case 3:
            case 5:
                C4013b c4013b = this.f20247a;
                c4013b.f20159g = i;
                c4013b.f20153a |= 32;
                return this;
            default:
                throw new IllegalArgumentException("invalid priority");
        }
    }

    public final C4023a m18837a() {
        return new C4024b(this.f20247a).m18841b();
    }

    final C4023a m18841b() {
        if (this.f20247a.f20154b > ((Long) C0955b.iR.m28964b()).longValue()) {
            FinskyLog.m21665c("Clipping MinimumLatency to %d from %d", C0955b.iR.m28964b(), Long.valueOf(this.f20247a.f20154b));
            this.f20247a.m18768a(((Long) C0955b.iR.m28964b()).longValue());
        }
        if (this.f20247a.f20154b < 0) {
            this.f20247a.m18768a(((Long) C0955b.iS.m28964b()).longValue());
        }
        if (this.f20247a.f20155c < 0) {
            throw new IllegalStateException("OverrideDeadline required");
        } else if (this.f20247a.f20155c >= this.f20247a.f20154b) {
            return new C4023a(this.f20247a);
        } else {
            throw new IllegalArgumentException("OverrideDeadline should be after minimum latency");
        }
    }
}
