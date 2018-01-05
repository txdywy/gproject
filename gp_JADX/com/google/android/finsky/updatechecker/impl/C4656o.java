package com.google.android.finsky.updatechecker.impl;

import android.app.AlarmManager;
import android.content.Context;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.updatechecker.C4638a;
import com.google.android.finsky.updatechecker.C4640d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.aa;

public final class C4656o implements C4638a {
    public final Context f23980a;
    public final ba f23981b;
    public final C4661t f23982c;

    protected C4656o(Context context, C2266a c2266a, C2206c c2206c, C3646a c3646a, C1627b c1627b, C4640d c4640d, bb bbVar, C1502a c1502a, C3960a c3960a) {
        this.f23982c = new C4661t(context, c2266a, c2206c, c3646a, c1627b, c4640d, c1502a, c3960a);
        this.f23980a = context;
        this.f23981b = bbVar.m18890a(4);
    }

    public final boolean mo4312a() {
        return (this.f23982c.f23994e.m9312b() || this.f23982c.m21650b()) ? false : true;
    }

    public final void mo4311a(C2495w c2495w) {
        ((AlarmManager) this.f23980a.getSystemService("alarm")).cancel(ReschedulerUsingAlarmManager.m21598b(this.f23980a, null));
        this.f23981b.m18887a(821848296).mo4398a(C4658q.f23984a);
        FinskyLog.m21659a("Canceling auto-update wifi check.", new Object[0]);
        C4023a b = C4656o.m21638b();
        if (b != null) {
            this.f23981b.m18888a(821848296, "pre-l-auto-update", C4659r.class, b, C4656o.m21639b(c2495w)).mo4398a(C4657p.f23983a);
            FinskyLog.m21659a("Scheduling recheck in %d MS", C0955b.dp.m28964b());
        }
        if (this.f23982c.m21650b()) {
            FinskyLog.m21659a("Checking wifi: disabled, will check wifi again later.", new Object[0]);
            C4661t c4661t = this.f23982c;
            aa aaVar = new aa();
            aaVar.a |= 32768;
            aaVar.q = true;
            aaVar.b(c4661t.m21649a());
            aaVar.c(c4661t.m21650b());
            aaVar.a(false);
            c2495w.m13367a(new C2474c(131).m13214a(aaVar).m13244b("wifi_checker").m13217a(c4661t.f23996g.m8828a()));
        }
    }

    static C4025c m21639b(C2495w c2495w) {
        C4025c c4025c = new C4025c();
        c4025c.m18848a("logging_context", c2495w);
        return c4025c;
    }

    static C4023a m21638b() {
        Long l = (Long) C0955b.dp.m28964b();
        if (l.longValue() <= 0) {
            return null;
        }
        return new C4024b().m18839a(l.longValue()).m18843b(((Long) C0955b.ds.m28964b()).longValue()).m18837a();
    }
}
