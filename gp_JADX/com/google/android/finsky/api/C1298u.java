package com.google.android.finsky.api;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0690f;
import com.android.volley.C0697m;
import com.android.volley.C0700r;
import com.android.volley.C0704v;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cg.C2276c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.C4678i;
import com.google.android.play.image.m;
import com.google.android.play.utils.C6324f;

public final class C1298u extends C1293q implements C1282b {
    public final C2276c f7729A;
    public final NetworkInfo f7730B;
    public final long f7731C;
    public long f7732D = -1;
    public long f7733E = -1;
    public long f7734F;
    public int f7735G;
    public final C2482j f7736z;

    public C1298u(C2482j c2482j, C2276c c2276c, m mVar, C0660x c0660x, C0657w c0657w) {
        super(mVar, c0660x, c0657w);
        this.f7736z = c2482j;
        this.f7729A = c2276c;
        this.f7730B = c2276c.mo2833a();
        this.f7731C = SystemClock.elapsedRealtime();
    }

    public final long mo1681b() {
        return SystemClock.elapsedRealtime() - this.f7731C;
    }

    public final long mo1680a() {
        return this.f7734F;
    }

    protected final C0704v m7748a(C0697m c0697m) {
        long b = C4678i.m21813b();
        this.f7734F = c0697m.f4171f;
        this.f7735G = c0697m.f4167b.length;
        C0704v a = super.a(c0697m);
        this.f7733E = C4678i.m21813b() - b;
        return a;
    }

    public final void m7752c(VolleyError volleyError) {
        super.c(volleyError);
        this.f7734F = volleyError.f4023c;
        m7745a(false, volleyError, false);
    }

    protected final void m7749a(Bitmap bitmap) {
        super.a(bitmap);
        m7745a(true, null, this.f7734F <= 0);
    }

    private final void m7745a(boolean z, VolleyError volleyError, boolean z2) {
        if (C1473m.f7980a.dc().m13331a(z2, true)) {
            float f;
            if (this.f4038m instanceof C0690f) {
                f = ((C0690f) this.f4038m).f4153d;
            } else {
                f = 0.0f;
            }
            Boolean bool = null;
            if (volleyError instanceof NoConnectionError) {
                bool = Boolean.valueOf(C6324f.m28968b(C1473m.f7980a.f7981b));
            }
            long j = -1;
            if (this.f7732D > 0) {
                j = C4678i.m21813b() - this.f7732D;
            }
            this.f7736z.m13330a(mo1545d(), this.f7734F, 0, j, this.f7733E, this.f4038m.mo1079b() + 1, this.f4038m.mo1077a(), f, z, volleyError, this.f7730B, this.f7729A.mo2833a(), this.f7735G, z2, 0, bool, 0, null);
        }
    }

    public final C0656n m7747a(C0700r c0700r) {
        this.f7732D = C4678i.m21813b();
        return super.a(c0700r);
    }
}
