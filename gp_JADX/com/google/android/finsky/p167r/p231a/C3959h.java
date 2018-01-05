package com.google.android.finsky.p167r.p231a;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cv.p177a.ch;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.dr.C2883a;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3961b;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4680k;
import p002a.C0002a;

public final class C3959h implements C2176c {
    public final C1461c f19976a;
    public final C0988c f19977b;
    public final C0002a f19978c;
    public final C2320a f19979d;
    public final C3654j f19980e;

    public C3959h(C1461c c1461c, C0988c c0988c, C0002a c0002a, C2320a c2320a, C3654j c3654j) {
        this.f19976a = c1461c;
        this.f19977b = c0988c;
        this.f19978c = c0002a;
        this.f19979d = c2320a;
        this.f19980e = c3654j;
    }

    public final void mo2769a(C3961b c3961b) {
        if (c3961b.f19984b != null) {
            boolean b;
            String str = c3961b.f19984b.f11416a;
            boolean z = c3961b.f19984b.f11422g;
            if (C2883a.m15119a(this.f19977b, (C1506e) this.f19978c.mo1a(), this.f19976a)) {
                if ("com.google.android.gms".equals(str)) {
                    b = C2883a.m15122b((C1506e) this.f19978c.mo1a(), this.f19976a);
                } else if (z) {
                    b = C2883a.m15120a((C1506e) this.f19978c.mo1a(), this.f19976a);
                }
                if (b && !c3961b.f19984b.f11424i) {
                    Object obj;
                    c3961b.f19993k |= 1;
                    es z2 = c3961b.f19983a.m14671z();
                    if (z2 == null) {
                        obj = null;
                    } else {
                        Object[] a = C4680k.m21818a((String) C0955b.az.m28964b());
                        for (ch chVar : z2.f12312d) {
                            if (chVar != null && C4672c.m21804a(a, chVar.f12035c)) {
                                this.f19980e.m17263a(chVar).m17262a(this.f19979d.mo2854a(chVar.f12035c));
                                if (!this.f19980e.m17269e()) {
                                    obj = null;
                                    break;
                                }
                            }
                        }
                        obj = 1;
                    }
                    if (obj != null) {
                        if (this.f19976a.dj().mo2294a(12643667)) {
                            c3961b.f19989g &= -513;
                        }
                        c3961b.f19988f.m16798d();
                        if (!"com.google.android.gms".equals(str)) {
                            c3961b.f19987e.m16809a(C3367k.f17268b);
                            c3961b.f19988f.m16793a(2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            b = false;
            if (b) {
            }
        }
    }
}
