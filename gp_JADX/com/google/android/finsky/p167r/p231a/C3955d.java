package com.google.android.finsky.p167r.p231a;

import android.content.Context;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bi.C1641a;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.p167r.C3961b;

public final class C3955d implements C2176c {
    public final C3960a f19963a;
    public final Context f19964b;
    public final C1461c f19965c;

    public C3955d(C3960a c3960a, Context context, C1461c c1461c) {
        this.f19963a = c3960a;
        this.f19964b = context;
        this.f19965c = c1461c;
    }

    public final void mo2769a(C3961b c3961b) {
        if (C1641a.m9335a(c3961b.f19983a.m14625N())) {
            c3961b.f19994l |= 1;
            c3961b.f19993k |= 1;
            if (((Boolean) C0955b.aR.m28964b()).booleanValue()) {
                if (c3961b.f19985c != null && c3961b.f19985c.f10808b == 2) {
                    c3961b.f19990h |= 4;
                }
                c3961b.f19989g = 132;
                if (((Boolean) C0955b.aS.m28964b()).booleanValue()) {
                    c3961b.f19989g |= 64;
                }
                c3961b.f19987e = new C3366j(c3961b.f19986d.m13375a("auto_update"), c3961b.f19983a);
                Object obj = (this.f19965c.dj().mo2294a(12635214) && C0327a.m1721a()) ? 1 : null;
                if (obj != null) {
                    c3961b.f19987e.m16809a(C3367k.f17268b);
                } else {
                    c3961b.f19987e.m16809a(C3367k.f17269c);
                }
                c3961b.f19988f = new C3361d();
                c3961b.f19991i = 2;
                c3961b.f19987e.m16814b(2);
                c3961b.f19992j = -1000;
                if (C1503a.m8831b(this.f19964b) && C2968a.m15380a(this.f19964b).m15384c()) {
                    obj = 1;
                } else {
                    if (this.f19965c.dj().mo2294a(12617485) && c3961b.f19984b != null && ((!c3961b.f19984b.f11422g || c3961b.f19984b.f11423h) && this.f19963a.m18669b())) {
                        int i;
                        C2441n N = c3961b.f19983a.m14625N();
                        if (N != null) {
                            for (int i2 : N.f13157F) {
                                if (i2 == 300) {
                                    obj = 1;
                                    break;
                                }
                            }
                        }
                        obj = null;
                        if (obj == null && c3961b.f19985c != null) {
                            long j = c3961b.f19985c.f10797D;
                            long currentTimeMillis = System.currentTimeMillis() - j;
                            if (j >= 0 && currentTimeMillis >= 0 && currentTimeMillis < ((Long) C0955b.gX.m28964b()).longValue()) {
                                i = 1;
                            }
                        }
                    }
                    obj = null;
                }
                if (obj != null) {
                    c3961b.f19989g |= 272;
                    c3961b.f19988f.m16793a(2);
                    return;
                }
                return;
            }
            c3961b.f19990h |= 256;
        }
    }
}
