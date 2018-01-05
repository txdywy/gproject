package com.google.android.finsky.cg;

import android.content.Context;
import android.support.v4.p037h.C0313h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.bp;
import com.google.android.play.utils.C6324f;

public final class C2274a implements C1549f {
    public static final long[] f11271a = new long[]{12605174, 12605175, 12605176, 12605177, 12605178, 12605179, 12605180};
    public boolean f11272b = false;
    public float f11273c = 1.0f;
    public int f11274d = 0;
    public final C1461c f11275e;
    public final Context f11276f;

    public C2274a(C1461c c1461c, Context context) {
        this.f11275e = c1461c;
        this.f11276f = context;
        this.f11275e.dj().mo2291a((C1549f) this);
        m11734c();
    }

    final int m11735a() {
        switch (C6324f.m28966a(this.f11276f)) {
            case 1:
                return 3;
            case 3:
            case 4:
            case 6:
                return 1;
            default:
                return 2;
        }
    }

    private final void m11733b() {
        this.f11272b = false;
        this.f11273c = 1.0f;
        this.f11274d = 0;
        bp.m28936a().f31546b = null;
    }

    private final synchronized void m11734c() {
        C1552e dj = this.f11275e.dj();
        for (long j : f11271a) {
            if (dj.mo2294a(j)) {
                m11732a(j);
                break;
            }
        }
        m11733b();
    }

    private final void m11732a(long j) {
        m11733b();
        if (j == 12605174) {
            this.f11273c = 1.0f;
        } else if (j == 12605175) {
            this.f11273c = 1.5f;
        } else if (j == 12605176) {
            this.f11273c = 2.0f;
        } else if (j == 12605177) {
            this.f11273c = 2.0f;
            this.f11274d = 300;
        } else if (j == 12605178) {
            this.f11273c = 2.5f;
        } else if (j == 12605179) {
            this.f11273c = 3.0f;
        } else if (j == 12605180) {
            this.f11272b = true;
        } else {
            FinskyLog.m21659a("Bucket experiment disabled", new Object[0]);
            return;
        }
        FinskyLog.m21659a("Enabling bucket experiment: factor=%.3f, zeroDelta=%dms, forceNetwork=%b", Float.valueOf(this.f11273c), Integer.valueOf(this.f11274d), Boolean.valueOf(this.f11272b));
        bp.m28936a().f31546b = new C2275b(this);
    }

    public final void mo2287a(boolean z) {
    }

    public final synchronized void mo2286a(C0313h c0313h, C0313h c0313h2) {
        int i = 0;
        synchronized (this) {
            long j;
            for (long j2 : f11271a) {
                if (c0313h2.m1690c(j2) >= 0) {
                    m11733b();
                    break;
                }
            }
            long[] jArr = f11271a;
            int length = jArr.length;
            while (i < length) {
                j2 = jArr[i];
                if (c0313h.m1690c(j2) >= 0) {
                    m11732a(j2);
                    break;
                }
                i++;
            }
        }
    }
}
