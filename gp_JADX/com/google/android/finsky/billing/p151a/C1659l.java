package com.google.android.finsky.billing.p151a;

import android.content.Context;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.c.a.ap;
import com.google.wireless.android.finsky.dfe.c.a.du;
import com.google.wireless.android.finsky.dfe.c.a.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

final class C1659l extends Thread {
    public final /* synthetic */ ap f8629a;
    public final /* synthetic */ C1658k f8630b;

    C1659l(C1658k c1658k, ap apVar) {
        this.f8630b = c1658k;
        this.f8629a = apVar;
    }

    public final void run() {
        C2495w c2495w = this.f8630b.f8622b ? this.f8630b.f8623c : null;
        C1655h c1655h = this.f8630b.f8628h;
        Context context = this.f8630b.f8624d;
        C1254c c1254c = this.f8630b.f8625e;
        ap apVar = this.f8629a;
        boolean z = this.f8630b.f8626f;
        l lVar = this.f8630b.f8627g.f;
        long j = apVar.c;
        if (z) {
            C1648a c1648a = c1655h.f8605a;
            C4025c c4025c = new C4025c();
            c4025c.m18849a("key_directory", c1648a.f8586b.getAbsolutePath());
            c1648a.f8587c.f8633a.m18888a(821848297, "Commerce_JanitorTask", C1649b.class, new C4024b().m18839a(j).m18843b(86400000 + j).m18842b(5).m18837a(), c4025c).mo4398a(new C1662o());
            FinskyLog.m21659a("Scheduled clear job.", new Object[0]);
        }
        if (apVar.e == null || apVar.e.a == null) {
            c1655h.f8611g = Collections.emptySet();
        } else {
            c1655h.f8611g = new HashSet(Arrays.asList(apVar.e.a));
        }
        if (apVar.e == null || apVar.e.b == null) {
            c1655h.f8612h = Collections.emptyList();
        } else {
            c1655h.f8612h = Arrays.asList(apVar.e.b);
        }
        String c = c1254c.mo1636c();
        if (apVar.f != null) {
            c1655h.f8605a.m9358a(c1655h.m9403a(context, c, lVar), apVar.f, j, c2495w);
        }
        for (du duVar : apVar.b) {
            c1655h.f8605a.m9359a(c1655h.m9404a(context, c, duVar.d, lVar), duVar, j, c2495w);
        }
        c1655h.f8605a.m9360a(C1655h.m9402b(c1254c.mo1636c()), C0757i.m4909a(apVar.e), j, c2495w);
        if (c2495w != null) {
            c2495w.m13367a(new C2474c(2032));
        }
    }
}
