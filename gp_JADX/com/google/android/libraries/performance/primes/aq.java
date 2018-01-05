package com.google.android.libraries.performance.primes;

import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p340g.C5999b;
import com.google.android.libraries.performance.primes.p340g.C6001a;
import d.a.a.a.a.a.ag;

final class aq implements as {
    public final C5999b f29666a = ((C5999b) C5916a.m27406a(ep.m27849d()));
    public final C6001a f29667b;
    public final C6001a f29668c;
    public final C6001a f29669d;
    public final C6001a f29670e;

    aq(String str) {
        this.f29667b = new C6001a(1, str);
        this.f29668c = new C6001a(2, str);
        this.f29669d = new C6001a(3, str);
        this.f29670e = new C6001a(4, str);
    }

    public final void mo5232a(int i, int i2) {
        long j;
        long j2 = 1;
        this.f29666a.mo5258a(this.f29667b, (long) i);
        this.f29666a.mo5258a(this.f29668c, i > i2 ? 1 : 0);
        C5999b c5999b = this.f29666a;
        C6001a c6001a = this.f29669d;
        if (i > 150) {
            j = 1;
        } else {
            j = 0;
        }
        c5999b.mo5258a(c6001a, j);
        C5999b c5999b2 = this.f29666a;
        C6001a c6001a2 = this.f29670e;
        if (i <= 700) {
            j2 = 0;
        }
        c5999b2.mo5258a(c6001a2, j2);
    }

    public final boolean mo5233a() {
        return false;
    }

    public final ag mo5234b() {
        return null;
    }
}
