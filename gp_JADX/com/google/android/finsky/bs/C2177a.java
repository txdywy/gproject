package com.google.android.finsky.bs;

import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.p167r.C3961b;

public final class C2177a implements C2176c {
    public final C1461c f10948a;
    public final C3960a f10949b;

    public C2177a(C1461c c1461c, C3960a c3960a) {
        this.f10948a = c1461c;
        this.f10949b = c3960a;
    }

    public static boolean m11443a() {
        if (!((Boolean) C0955b.gy.m28964b()).booleanValue()) {
            return false;
        }
        if (C0327a.m1722b()) {
            return false;
        }
        return true;
    }

    public final void mo2769a(C3961b c3961b) {
        if ("com.google.android.instantapps.supervisor".equals(c3961b.f19983a.cf())) {
            c3961b.f19994l |= 1;
            c3961b.f19993k |= 1;
            this.f10948a.dj();
            if (!C2177a.m11443a()) {
                c3961b.f19990h |= 256;
            } else if (c3961b.f19985c == null || c3961b.f19985c.f10808b != 2) {
                Object obj;
                c3961b.f19987e = new C3366j(c3961b.f19986d.m13375a("auto_update"), c3961b.f19983a);
                c3961b.f19988f = new C3361d();
                if (this.f10948a.dj().mo2294a(12630207)) {
                    c3961b.f19987e.m16809a(C3367k.f17269c);
                } else {
                    c3961b.f19987e.m16809a(C3367k.f17268b);
                }
                c3961b.f19989g = 68;
                if (((Boolean) C0955b.du.m28964b()).booleanValue()) {
                    c3961b.f19989g |= 128;
                }
                if (this.f10948a.dj().mo2294a(12633462) && this.f10949b.m18669b() && c3961b.f19985c != null) {
                    long j = c3961b.f19985c.f10797D;
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (j >= 0 && currentTimeMillis >= 0 && currentTimeMillis < ((Long) C0955b.gY.m28964b()).longValue()) {
                        obj = 1;
                        if (obj != null) {
                            c3961b.f19989g |= 272;
                            c3961b.f19988f.m16793a(2);
                        }
                    }
                }
                obj = null;
                if (obj != null) {
                    c3961b.f19989g |= 272;
                    c3961b.f19988f.m16793a(2);
                }
            } else {
                c3961b.f19990h |= 4;
            }
        }
    }
}
