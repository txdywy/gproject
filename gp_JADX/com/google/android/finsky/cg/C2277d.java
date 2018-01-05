package com.google.android.finsky.cg;

import android.support.v4.p037h.C0313h;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.herrevad.C5248e;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import com.google.android.play.image.bf;
import com.google.android.play.utils.c.a;
import com.google.android.play.utils.c.b;
import com.google.android.play.utils.c.c;
import com.google.android.play.utils.p354b.C6322j;

public final class C2277d implements C1549f, C1643x {
    public static int f11278a = -1;
    public static final long[] f11279d = new long[]{12604072, 12604073, 12604074, 12604075, 12604076, 12604164, 12604165, 12604166, 12604167};
    public C1461c f11280b;
    public C5058o f11281c;
    public C2274a f11282e;

    public C2277d(C1461c c1461c) {
        ((C1365h) C3947d.m18649a(C1365h.class)).mo1781a(this);
        this.f11280b = c1461c;
        c1461c.dj().mo2291a((C1549f) this);
        m11742b();
    }

    public static int m11740a() {
        int intValue = ((Integer) C6322j.f31572B.m28964b()).intValue() == 1 ? ((Integer) C6322j.f31573C.m28964b()).intValue() : ((Integer) C6322j.f31572B.m28964b()).intValue() == 2 ? ((Integer) C6322j.f31574D.m28964b()).intValue() : ((Integer) C6322j.f31572B.m28964b()).intValue() == 3 ? ((Integer) C6322j.f31575E.m28964b()).intValue() : ((Integer) C6322j.f31572B.m28964b()).intValue() == 4 ? ((Integer) C6322j.f31576F.m28964b()).intValue() : 0;
        return intValue / 1000;
    }

    private final synchronized void m11742b() {
        c a;
        C1552e dj = this.f11280b.dj();
        for (long j : f11279d) {
            if (dj.mo2294a(j)) {
                a = C2277d.m11741a(j);
                break;
            }
        }
        a = null;
        bf.a(a);
    }

    private static c m11741a(long j) {
        int i;
        if (j == 12604072) {
            i = 0;
        } else if (j == 12604073) {
            i = 500;
        } else if (j == 12604074) {
            i = 1000;
        } else if (j == 12604075) {
            i = 1500;
        } else if (j == 12604076) {
            i = 2000;
        } else if (j == 12604164) {
            i = 2500;
        } else if (j == 12604165) {
            i = 3000;
        } else if (j == 12604166) {
            i = 3500;
        } else if (j != 12604167) {
            return null;
        } else {
            i = 4000;
        }
        float floatValue = ((Float) C0955b.fL.m28964b()).floatValue();
        int intValue = ((Integer) C0955b.fN.m28964b()).intValue() + i;
        float floatValue2 = ((Float) C0955b.fM.m28964b()).floatValue();
        return new a(new b(i, floatValue, intValue, floatValue2), ((Integer) C0955b.fO.m28964b()).intValue());
    }

    public final void mo2287a(boolean z) {
    }

    public final synchronized void mo2286a(C0313h c0313h, C0313h c0313h2) {
        int i = 0;
        synchronized (this) {
            long j;
            for (long j2 : f11279d) {
                if (c0313h2.m1690c(j2) >= 0) {
                    bf.a(null);
                    break;
                }
            }
            long[] jArr = f11279d;
            int length = jArr.length;
            while (i < length) {
                j2 = jArr[i];
                if (c0313h.m1690c(j2) >= 0) {
                    bf.a(C2277d.m11741a(j2));
                    break;
                }
                i++;
            }
        }
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5248e c5248e = (C5248e) c4980w;
        if (c5248e.mo4505b().m23271a()) {
            int i;
            PredictedNetworkQuality a = c5248e.mo4724a();
            if (a == null) {
                i = -1;
            } else {
                i = a.f26366b;
            }
            f11278a = i;
        } else {
            FinskyLog.m21667d("Failed to fetch PredictedNetworkQuality", new Object[0]);
        }
        if (this.f11281c != null) {
            this.f11281c.mo4559g();
            this.f11281c = null;
        }
    }
}
