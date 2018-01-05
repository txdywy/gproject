package com.google.android.finsky.wear;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class C4791l implements Runnable {
    public final /* synthetic */ C4790k f25011a;

    C4791l(C4790k c4790k) {
        this.f25011a = c4790k;
    }

    public final void run() {
        synchronized (this.f25011a) {
            C4790k c4790k = this.f25011a;
            c4790k.f25007j--;
        }
        C4790k c4790k2 = this.f25011a;
        if (c4790k2.f25006i == null) {
            int i;
            for (String str : c4790k2.f25003f.m22521a()) {
                C3647b c3647b;
                C3646a a = c4790k2.f24998a.m22484a(str);
                List a2 = a.m17245a();
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C3647b c3647b2 = (C3647b) a2.get(i2);
                    if (c3647b2.f18029d.f10813g != 90) {
                        c3647b = c3647b2;
                        break;
                    }
                }
                c3647b = null;
                if (c3647b != null) {
                    FinskyLog.m21659a("Wear node %s kick - starting %s", str, c3647b.f18026a);
                    c4790k2.f25006i = new C4796q(c3647b.f18026a, str, C1473m.f7980a.f7981b, c4790k2, a, c4790k2.f25000c, c4790k2.f24999b, c4790k2.f25002e, c4790k2.f25003f);
                    C1473m c1473m = C1473m.f7980a;
                    C1552e dj = c1473m.dj();
                    c4790k2.f25009l = c1473m.bz();
                    if (!dj.mo2294a(12609856) && c4790k2.f25008k && c4790k2.f25009l.m16017a() && "com.google.android.gms".equals(c3647b.f18026a)) {
                        if (c4790k2.f25010m != null) {
                            FinskyLog.m21669e("Already exists foreground connection", new Object[0]);
                        } else {
                            int i3;
                            String str2 = c3647b.f18026a;
                            C2127b c2127b = c4790k2.f24998a.m22484a(str).f18022b;
                            C2129c a3 = c2127b.mo2657a(str2);
                            if (a3 != null) {
                                i3 = a3.f10819m;
                            } else {
                                i3 = 0;
                            }
                            int i4 = i3 | 2;
                            if (i4 != i3) {
                                c2127b.mo2675d(str2, i4);
                            }
                            String str3 = c3647b.f18026a;
                            C2127b c2127b2 = c4790k2.f24998a.m22484a(str).f18022b;
                            C2129c a4 = c2127b2.mo2657a(str3);
                            if (a4 != null) {
                                i = a4.f10819m;
                                int i5 = i & -17;
                                if (i5 != i) {
                                    c2127b2.mo2675d(str3, i5);
                                }
                            }
                            c4790k2.f25010m = c4790k2.f25009l.m16016a(4, dj, new C4792m(c4790k2));
                        }
                        if (c4790k2.f25006i != null) {
                            for (cc d : c4790k2.f25005h) {
                                d.mo4392d();
                            }
                            c4790k2.f25005h.clear();
                        }
                    }
                    c4790k2.f25006i.m22562a();
                    if (c4790k2.f25006i != null) {
                        while (r1.hasNext()) {
                            d.mo4392d();
                        }
                        c4790k2.f25005h.clear();
                    }
                }
            }
            if (c4790k2.f25006i != null) {
                while (r1.hasNext()) {
                    d.mo4392d();
                }
                c4790k2.f25005h.clear();
            }
        }
    }
}
