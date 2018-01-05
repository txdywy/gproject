package com.google.android.libraries.performance.primes;

import android.os.SystemClock;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import com.google.android.libraries.performance.primes.p339f.C5994a;
import d.a.a.a.a.a.al;
import d.a.a.a.a.a.bp;

final class bt {
    public final C5994a f29816a;
    public final C5984a f29817b;
    public final eo f29818c;
    public final eo f29819d;
    public final bv f29820e;

    bt(C5984a c5984a, eo eoVar, eo eoVar2, bv bvVar, int i) {
        this.f29817b = (C5984a) C5916a.m27406a((Object) c5984a);
        this.f29818c = (eo) C5916a.m27406a((Object) eoVar);
        this.f29819d = eoVar2;
        this.f29820e = bvVar;
        this.f29816a = new C5994a(i);
    }

    final void m27746a(String str, boolean z, bp bpVar, al alVar) {
        if (bpVar == null) {
            String str2 = "MetricRecorder";
            String str3 = "metric is null, skipping recorded metric for event: ";
            String valueOf = String.valueOf(str);
            C5989do.m27824a(5, str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            return;
        }
        bp a = ((bw) this.f29818c.mo5221a()).m27750a(bpVar);
        if (z) {
            a.q = str;
        } else {
            a.c = str;
        }
        if (alVar != null) {
            a.n = alVar;
        }
        this.f29817b.mo5248a(a);
        C5994a c5994a = this.f29816a;
        synchronized (c5994a.f30051a) {
            c5994a.f30053c++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - c5994a.f30054d > 1000) {
                c5994a.f30053c = 0;
                c5994a.f30054d = elapsedRealtime;
            }
        }
    }
}
