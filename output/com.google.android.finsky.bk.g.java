package com.google.android.finsky.bk;

import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.herrevad.NetworkQualityReport;
import com.google.android.gms.herrevad.b;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.bk.g implements Runnable
{

    public final com.google.android.finsky.bk.c a;
    public final long b;
    public final long c;
    public final com.google.android.finsky.bk.d d;

    g(com.google.android.finsky.bk.d p0, com.google.android.finsky.bk.c p1, long p2, long p4) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p4;
    }

    public final void run() {
        if (com.google.android.finsky.bk.d.a(this.a, this.d.b())) {
            v2 = new NetworkQualityReport();
            v2.c = this.c;
            v2.b = TimeUnit.MILLISECONDS.toMicros(this.b);
            (new Object[1])[0] = v2;
            this.d.h.e();
            this.d.i.a(this.d.h, v2).a(new com.google.android.finsky.bk.f(this.d));
        }
    }

}
