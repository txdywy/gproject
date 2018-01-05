package com.google.android.finsky.api;

import android.net.NetworkInfo;
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
import com.google.android.play.image.ao;
import com.google.android.play.image.ap;
import com.google.android.play.utils.C6324f;

public final class C1296s extends ap {
    public C2482j f7711q;
    public C2276c f7712r;
    public long f7713s;
    public NetworkInfo f7714t;
    public int f7715u;
    public long f7716v = -1;
    public long f7717w = -1;

    public C1296s(C2482j c2482j, C2276c c2276c, String str, C0660x c0660x, int i, int i2, int i3, C0657w c0657w) {
        super(str, c0660x, i, i2, i3, c0657w);
        this.f7711q = c2482j;
        this.f7712r = c2276c;
        this.f7714t = c2276c.mo2833a();
    }

    protected final C0704v m7732a(C0697m c0697m) {
        long b = C4678i.m21813b();
        this.f7713s = c0697m.f4171f;
        this.f7715u = c0697m.f4167b.length;
        C0704v a = super.a(c0697m);
        this.f7717w = C4678i.m21813b() - b;
        return a;
    }

    public final void m7735c(VolleyError volleyError) {
        super.c(volleyError);
        this.f7713s = volleyError.f4023c;
        m7730a(false, volleyError, false);
    }

    protected final void m7733a(ao aoVar) {
        super.a(aoVar);
        m7730a(true, null, this.f7713s <= 0);
    }

    private final void m7730a(boolean z, VolleyError volleyError, boolean z2) {
        if (this.f7711q.m13331a(z2, true)) {
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
            if (this.f7716v > 0) {
                j = C4678i.m21813b() - this.f7716v;
            }
            this.f7711q.m13330a(mo1545d(), this.f7713s, 0, j, this.f7717w, this.f4038m.mo1079b() + 1, this.f4038m.mo1077a(), f, z, volleyError, this.f7714t, this.f7712r.mo2833a(), this.f7715u, z2, 0, bool, 0, null);
        }
    }

    public final C0656n m7731a(C0700r c0700r) {
        this.f7716v = C4678i.m21813b();
        return super.a(c0700r);
    }
}
