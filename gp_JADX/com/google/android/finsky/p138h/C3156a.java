package com.google.android.finsky.p138h;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.u;
import com.google.wireless.android.a.a.a.a.v;
import java.util.ArrayList;
import java.util.List;

public class C3156a extends C0971t {
    public C3646a f16319a;
    public C1461c f16320b;

    protected final void mo1167a() {
        super.mo1167a();
        ((C1388b) C3947d.m18649a(C1388b.class)).mo1846a(this);
    }

    protected final void mo1170a(C1254c c1254c, C2495w c2495w) {
        if (this.f16320b.dj().mo2294a(12637343)) {
            long longValue = ((Long) C0954a.f5852v.m5760a()).longValue();
            Object obj = (longValue == 0 || C4678i.m21812a() - longValue > ((Long) C0955b.gO.m28964b()).longValue()) ? 1 : null;
            if (obj == null) {
                FinskyLog.m21662b("Skipping app freshness because last check was too recent", new Object[0]);
                return;
            }
            long a = C4678i.m21812a();
            List arrayList = new ArrayList();
            C2127b c2127b = this.f16319a.f18022b;
            C2320a c2320a = this.f16319a.f18023c;
            int i = 0;
            for (C2129c c2129c : c2127b.mo2658a()) {
                String str = c2129c.f10807a;
                C2322b a2 = c2320a.mo2854a(str);
                if (a2 != null) {
                    i++;
                    long j = c2129c.f10797D;
                    if (j != 0) {
                        j = a - j;
                        if (j >= ((Long) C0955b.gN.m28964b()).longValue()) {
                            v vVar = new v();
                            vVar.a(str);
                            vVar.a(a2.f11419d);
                            vVar.a(j);
                            arrayList.add(vVar);
                        }
                    }
                }
            }
            u uVar = new u();
            if (arrayList.size() > 0) {
                uVar.b = (v[]) arrayList.toArray(new v[arrayList.size()]);
            }
            uVar.a(i);
            if (uVar.b.length == 0) {
                FinskyLog.m21662b("Skipping app freshness because no app data", new Object[0]);
                return;
            }
            c2495w.m13367a(new C2474c(166).m13232a(uVar));
            C0954a.f5852v.m5763a(Long.valueOf(C4678i.m21812a()));
            return;
        }
        FinskyLog.m21662b("Skipping app freshness because experiment is disabled", new Object[0]);
    }
}
