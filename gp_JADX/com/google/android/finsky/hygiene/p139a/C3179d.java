package com.google.android.finsky.hygiene.p139a;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ae.C1182a;
import com.google.android.finsky.ae.C1183b;
import com.google.android.finsky.api.C1301y;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bt.C2180a;
import com.google.android.finsky.hygiene.C3178v;
import com.google.android.finsky.hygiene.DailyHygiene.DailyHygieneService;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ag;

public final class C3179d implements C1183b, C3178v {
    public final Context f16455a;
    public final C3176a f16456b;
    public final C1461c f16457c;
    public final C1502a f16458d;
    public final ba f16459e;
    public final int f16460f;
    public final C1182a f16461g;
    public final C3181h[] f16462h = new C3181h[]{new C3182f(this), new C3183g()};
    public C3189n f16463i;

    public C3179d(Context context, C1461c c1461c, C1502a c1502a, bb bbVar, C3176a c3176a, int i, C1182a c1182a) {
        this.f16455a = context;
        this.f16457c = c1461c;
        this.f16458d = c1502a;
        this.f16459e = bbVar.m18890a(1);
        this.f16456b = c3176a;
        this.f16460f = i;
        this.f16461g = c1182a;
    }

    public final void mo3362a(int i) {
        if (!this.f16457c.dj().mo2294a(12640552)) {
            C3176a.m16196a(this.f16455a, i);
        } else if (C3177b.m16203c()) {
            FinskyLog.m21665c("Routine hygiene hasn't run recently, reverting to legacy hygiene.", new Object[0]);
            C3176a.m16196a(this.f16455a, i);
        } else {
            for (C3181h c3181h : this.f16462h) {
                if (c3181h.mo3371a()) {
                    FinskyLog.m21659a("Scheduling %d in onApplicationCreate", Integer.valueOf(c3181h.f16465b));
                    m16213a(C3177b.m16202b(), c3181h.f16465b);
                    return;
                }
                FinskyLog.m21662b("Skipping %d in onApplicationCreate", Integer.valueOf(c3181h.f16465b));
            }
        }
    }

    public final void mo3366d() {
        if (!this.f16457c.dj().mo2294a(12640552)) {
            C3176a.m16197a(this.f16455a, C3176a.f16447b, 6);
        }
    }

    public final void mo3365c() {
        if (this.f16457c.dj().mo2294a(12640552)) {
            m16213a(C3177b.m16202b(), 2);
        } else {
            C3176a.m16197a(this.f16455a, C3176a.f16446a, 2);
        }
    }

    public final void mo3368f() {
        if (this.f16457c.dj().mo2294a(12640552)) {
            m16213a(C3177b.m16202b(), 10);
        }
    }

    public final void mo3367e() {
        if (this.f16457c.dj().mo2294a(12640552)) {
            m16213a(C3177b.m16202b(), 1);
        } else {
            C3176a.m16197a(this.f16455a, C3176a.f16446a, 1);
        }
    }

    public final void mo3363a(int i, boolean z, boolean z2, C2495w c2495w) {
        if (z) {
            C0954a.f5845o.m5763a(Long.valueOf(C4678i.m21812a()));
            C0954a.f5806B.m5763a(Integer.valueOf(12));
            C0954a.f5849s.m5763a(Integer.valueOf(this.f16460f));
            C0954a.f5850t.m5763a(C1301y.m7756a(VERSION.RELEASE));
        }
        if (z2) {
            C0954a.f5846p.m5763a(Long.valueOf(C4678i.m21812a()));
        }
        c2495w.m13367a(new C2474c(152).m13216a(new ag().a(i)).m13217a(this.f16458d.m8828a()).m13239a(z));
        if (this.f16457c.dj().mo2294a(12640552)) {
            long a = (C3177b.m16201a() - C4678i.m21812a()) + ((Long) C0955b.aG.m28964b()).longValue();
            long longValue = a + ((Long) C0955b.aG.m28964b()).longValue();
            long max = Math.max(a, (((Long) C0955b.aH.m28964b()).longValue() + ((Long) C0954a.f5845o.m5760a()).longValue()) - C4678i.m21812a());
            C4024b c4024b = new C4024b();
            c4024b.m18842b(1).m18839a(max).m18843b(longValue).m18838a(1);
            C4023a a2 = c4024b.m18837a();
            if (this.f16463i != null) {
                C4025c c4025c = new C4025c();
                c4025c.m18853b("reason", 7);
                this.f16463i.m16233a(new C4030h(false, a2, c4025c));
                return;
            }
            m16213a(a2, 7);
            return;
        }
        if (this.f16463i != null) {
            this.f16463i.m16233a(null);
        }
        C3176a c3176a = this.f16456b;
        max = ((Long) C0954a.f5845o.m5760a()).longValue();
        C1473m.f7980a.cl();
        if (!z) {
            int intValue = ((Integer) C0954a.f5844n.m5760a()).intValue() + 1;
            if (intValue <= C3176a.f16453h.length) {
                max = C2180a.m11451a(((long) C3176a.f16453h[intValue - 1]) * C3176a.f16450e, C3176a.f16452g);
                FinskyLog.m21659a("Scheduling new run in %d minutes (failures=%d)", Long.valueOf(max / 60000), Integer.valueOf(intValue));
                C0954a.f5844n.m5763a(Integer.valueOf(intValue));
            } else {
                FinskyLog.m21659a("Giving up. (failures=%d)", Integer.valueOf(intValue));
                C0954a.f5844n.m5765c();
                max = C2180a.m11451a(C3176a.f16448c, C3176a.f16452g);
            }
        } else if (max == 0) {
            max = C2180a.m11451a(C3176a.f16448c, C3176a.f16451f);
            FinskyLog.m21659a("Scheduling first run in %1.1f hours", Float.valueOf(((float) max) / 3600000.0f));
        } else {
            max = C2180a.m11451a(C3176a.f16448c, C3176a.f16452g);
        }
        C3176a.m16198a(c3176a.f16454i, max, 7, c2495w);
    }

    public final void mo3364a(C2495w c2495w) {
        C3176a.m16198a(this.f16455a, C3176a.f16449d, 3, c2495w);
    }

    public final boolean mo3370h() {
        if (this.f16457c.dj().mo2294a(12640552)) {
            return C3177b.m16203c();
        }
        return C3176a.m16199a();
    }

    public final boolean mo3369g() {
        return C3176a.m16200b();
    }

    final void m16219b(int i) {
        C3176a c3176a = this.f16456b;
        Intent intent = new Intent(c3176a.f16454i, DailyHygieneService.class);
        intent.putExtra("reason", i);
        c3176a.f16454i.startService(intent);
    }

    public final boolean mo2949a() {
        return this.f16463i != null;
    }

    public final int mo2950b() {
        return 1;
    }

    private final void m16213a(C4023a c4023a, int i) {
        if (this.f16459e.m18889b(1337)) {
            FinskyLog.m21659a("No need to schedule routine hygiene, as hygiene is already running.", new Object[0]);
            return;
        }
        C4025c c4025c = new C4025c();
        c4025c.m18853b("reason", i);
        this.f16459e.m18888a(1337, "routine-hygiene", C3189n.class, c4023a, c4025c).mo4398a(C3180e.f16464a);
    }
}
