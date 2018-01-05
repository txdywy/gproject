package com.google.android.finsky.p167r.p231a;

import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3961b;
import com.google.android.finsky.tos.C4569e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

public final class C3957f implements C2176c {
    public final C1461c f19968a;
    public final C4569e f19969b;
    public List f19970c;
    public Integer f19971d;

    public C3957f(C1461c c1461c, C4569e c4569e) {
        this.f19968a = c1461c;
        this.f19969b = c4569e;
    }

    public final void mo2769a(C3961b c3961b) {
        C3958g c3958g;
        if (this.f19970c == null) {
            this.f19970c = C3958g.m18661a();
        }
        int size = this.f19970c.size();
        for (int i = 0; i < size; i++) {
            C3958g c3958g2 = (C3958g) this.f19970c.get(i);
            if (c3958g2.f19972a.equals(c3961b.f19983a.m14625N().f13171k)) {
                c3958g = c3958g2;
                break;
            }
        }
        c3958g = null;
        if (c3958g != null) {
            int i2;
            c3961b.f19994l |= 1;
            if (c3958g.f19972a.equals(c3961b.f19983a.m14625N().f13171k) && (c3958g.f19975d & 4) != 0) {
                i2 = c3961b.f19984b.f11419d;
                if (i2 < 0) {
                    FinskyLog.m21665c("Server thinks we have an asset that we don't have : %s", c3958g.f19972a);
                } else {
                    if (c3958g.f19974c > 0) {
                        i2 %= c3958g.f19974c;
                    }
                    if (i2 < c3958g.f19973b) {
                        i2 = 1;
                        if (i2 != 0) {
                            if ("com.android.chrome".equals(c3961b.f19983a.m14625N().f13171k)) {
                                i2 = 1;
                            } else {
                                if (this.f19971d == null) {
                                    this.f19971d = Integer.valueOf(this.f19969b.m21206b());
                                }
                                i2 = this.f19971d.intValue() < ((Integer) C0955b.eT.m28964b()).intValue() ? 1 : 0;
                            }
                            if (i2 != 0) {
                                c3961b.f19989g &= -285;
                                if ((c3958g.f19975d & 2) != 0) {
                                    c3961b.f19989g &= -3;
                                }
                                if (this.f19968a.dj().mo2294a(12643667)) {
                                    c3961b.f19989g &= -513;
                                }
                                if (!(this.f19968a.dj().mo2294a(12635548) && C0327a.m1721a())) {
                                    if ((c3958g.f19975d & 1) == 0) {
                                        c3961b.f19987e.m16809a(C3367k.f17269c);
                                    } else {
                                        c3961b.f19987e.m16809a(C3367k.f17267a);
                                    }
                                }
                                c3961b.f19987e.m16810a("rapid_auto_update");
                            }
                        }
                    }
                }
            }
            i2 = 0;
            if (i2 != 0) {
                if ("com.android.chrome".equals(c3961b.f19983a.m14625N().f13171k)) {
                    if (this.f19971d == null) {
                        this.f19971d = Integer.valueOf(this.f19969b.m21206b());
                    }
                    if (this.f19971d.intValue() < ((Integer) C0955b.eT.m28964b()).intValue()) {
                    }
                } else {
                    i2 = 1;
                }
                if (i2 != 0) {
                    c3961b.f19989g &= -285;
                    if ((c3958g.f19975d & 2) != 0) {
                        c3961b.f19989g &= -3;
                    }
                    if (this.f19968a.dj().mo2294a(12643667)) {
                        c3961b.f19989g &= -513;
                    }
                    if ((c3958g.f19975d & 1) == 0) {
                        c3961b.f19987e.m16809a(C3367k.f17267a);
                    } else {
                        c3961b.f19987e.m16809a(C3367k.f17269c);
                    }
                    c3961b.f19987e.m16810a("rapid_auto_update");
                }
            }
        }
    }
}
