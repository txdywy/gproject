package com.google.android.instantapps.common.p221d.p222a;

import android.util.Log;
import com.google.common.f.a.aj;

final class C5712c implements aj {
    public final /* synthetic */ C5716f f28928a;
    public final /* synthetic */ C5710a f28929b;

    C5712c(C5710a c5710a, C5716f c5716f) {
        this.f28929b = c5710a;
        this.f28928a = c5716f;
    }

    public final void m27002a(Throwable th) {
        Log.wtf("LoggingContext", "nextId failure", th);
        m27000a();
    }

    private final void m27000a() {
        synchronized (this.f28929b.f28895s) {
            this.f28929b.f28896t = false;
        }
        this.f28929b.m26985e();
    }

    public final /* synthetic */ void m27001a(Object obj) {
        long j;
        boolean z = true;
        Long l = (Long) obj;
        C5710a c5710a = this.f28929b;
        ac acVar = this.f28928a.f28938a;
        long j2 = this.f28928a.f28939b;
        long longValue = l.longValue();
        synchronized (c5710a) {
            j = c5710a.f28892p ? c5710a.f28893q : -1;
            c5710a.f28892p = true;
            c5710a.f28893q = longValue;
        }
        if (((Boolean) c5710a.f28886j.mo5158a()).booleanValue()) {
            z = false;
        }
        if (z) {
            c5710a.f28891o.mo3541a();
        }
        c5710a.f28879c.execute(new C5711b(c5710a, z, acVar, longValue, j, j2));
        m27000a();
    }
}
