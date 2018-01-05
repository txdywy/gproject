package com.google.android.finsky.bk;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.s;
import com.google.android.gms.e.a;
import com.google.android.gms.e.c;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.fi;

public final class com.google.android.finsky.bk.i implements Runnable
{

    public final com.google.android.finsky.bk.c a;
    public final long b;
    public final long c;
    public final com.google.android.finsky.bk.h d;

    i(com.google.android.finsky.bk.h p0, com.google.android.finsky.bk.c p1, long p2, long p4) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p4;
    }

    public final void run() {
        if (com.google.android.finsky.bk.h.a(this.a, this.d.b())) {
            v0 = new Bundle();
            v0.putString("bytes_transferred", Long.toString(this.b));
            if (com.google.android.gms.e.a.a != 0) {
                v1 = new com.google.android.gms.common.api.p(this.d.h).a(com.google.android.gms.e.a.b).a(com.google.android.gms.internal.fb.c).b();
                v1.e();
                try {
                    com.google.android.gms.internal.fb.d.a(v1, Long.valueOf(this.c), v0).a(new com.google.android.gms.e.c(v1));
                }
                catch (RuntimeException ex) {
                    v0 = String.valueOf(ex);
                    Log.w("Herrevad", (String.valueOf(v0).length() + 95) + "Exception in logNetworkStats.  This call should always fail silently, so we will swallow this: " + v0);
                }
            }
        }
    }

}
