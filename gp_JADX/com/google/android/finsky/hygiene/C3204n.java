package com.google.android.finsky.hygiene;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ag;
import com.google.wireless.android.a.a.a.a.t;
import java.util.ArrayDeque;

public final class C3204n {
    public final C2471a f16505a = C1473m.f7980a.aR();
    public final C1506e f16506b = C1473m.f7980a.mo2035O();
    public final C1289l f16507c = C1473m.f7980a.aM();
    public C1552e f16508d;
    public C2495w f16509e;
    public final int f16510f;
    public final C3175r f16511g;

    public C3204n(int i, C3175r c3175r, C1552e c1552e, C2495w c2495w) {
        this.f16510f = i;
        this.f16511g = c3175r;
        this.f16508d = c1552e;
        if (c2495w != null) {
            this.f16509e = c2495w;
        } else {
            this.f16509e = this.f16505a.m13184a(null).m13366a(C1473m.f7980a.cY());
        }
    }

    public static void m16249a(String str) {
        FinskyLog.m21662b("DailyHygiene stage: %s", str);
    }

    public final void m16250a() {
        C3204n.m16249a("checkVpaDeferredNotificationSupport");
        if (!C0954a.bf.m5764b()) {
            C2320a c2320a = C1473m.f7980a.mo2029I().f18023c;
            if (c2320a == null) {
                m16252a(null);
                return;
            }
            C2322b a = c2320a.mo2854a("com.android.vending");
            if (a == null) {
                m16252a(null);
                return;
            }
            C0957n c0957n = C0954a.bf;
            boolean z = C1473m.f7980a.bh() == -1 && !a.f11423h;
            c0957n.m5763a(Boolean.valueOf(z));
        }
        m16252a(null);
    }

    final void m16252a(ArrayDeque arrayDeque) {
        C1254c ap;
        C3204n.m16249a("probeAccounts");
        if (arrayDeque == null) {
            if (((Boolean) C0955b.av.m28964b()).booleanValue()) {
                arrayDeque = this.f16507c.m7700a(((Boolean) C0955b.aw.m28964b()).booleanValue());
            } else {
                arrayDeque = new ArrayDeque();
                ap = C1473m.f7980a.ap();
                if (ap != null) {
                    arrayDeque.add(ap);
                }
            }
        }
        if (arrayDeque.isEmpty()) {
            this.f16511g.mo3361a(null, true, this.f16508d, this.f16509e, false);
            return;
        }
        ap = (C1254c) arrayDeque.removeFirst();
        if (ap.mo1620b() != null) {
            FinskyLog.m21659a("Probe %s for daily hygiene pass", FinskyLog.m21655a(ap.mo1636c()));
            this.f16508d = C1473m.f7980a.mo2249j(ap.mo1636c());
            this.f16509e = this.f16509e.m13366a(ap.mo1620b());
        } else {
            FinskyLog.m21659a("Probe unauthenticated for daily hygiene pass", new Object[0]);
            this.f16508d = C1473m.f7980a.mo2249j(null);
            this.f16509e = this.f16509e.m13366a(null);
        }
        C2495w c2495w = this.f16509e;
        int i = this.f16510f;
        ag agVar = new ag();
        agVar.a(i);
        c2495w.m13367a(new C2474c(151).m13216a(agVar).m13217a(C1473m.f7980a.cs().m8828a()));
        C3204n.m16249a("beginPreloadExperiments");
        if (!((Boolean) C0955b.au.m28964b()).booleanValue() || ap.mo1620b() == null) {
            m16251a(ap, arrayDeque);
        } else {
            C1473m.f7980a.mo2038R().m15108a(ap, false, false, new C3206p(this, ap, arrayDeque));
        }
    }

    final void m16251a(C1254c c1254c, ArrayDeque arrayDeque) {
        C3204n.m16249a("beginSelfUpdateCheck");
        if (((Boolean) C0955b.eM.m28964b()).booleanValue() && this.f16506b.m8840c()) {
            this.f16511g.mo3361a(c1254c, true, this.f16508d, this.f16509e, false);
            return;
        }
        int bi = C1473m.f7980a.bi();
        t tVar = new t();
        tVar.b(bi);
        tVar.a(true);
        C1473m.f7980a.bI().m13571a(c1254c, C2693e.m14552a(), new C3207q(this, tVar, this.f16509e.m13375a("su_daily_hygiene"), c1254c, bi, arrayDeque));
    }
}
