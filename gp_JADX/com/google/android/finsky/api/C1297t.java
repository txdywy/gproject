package com.google.android.finsky.api;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0690f;
import com.android.volley.C0697m;
import com.android.volley.C0700r;
import com.android.volley.C0704v;
import com.android.volley.NoConnectionError;
import com.android.volley.VolleyError;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cg.C2276c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.C4678i;
import com.google.android.play.image.C6319q;
import com.google.android.play.image.bf;
import com.google.android.play.image.bt;
import com.google.android.play.image.bu;
import com.google.android.play.image.by;
import com.google.android.play.image.m;
import com.google.android.play.image.o;
import com.google.android.play.utils.C6324f;
import com.google.i.a.a;

public final class C1297t extends bt implements C1282b {
    public long f7718A = -1;
    public final Context f7719q;
    public final C2482j f7720r;
    public final C1461c f7721s;
    public final C2276c f7722t;
    public final NetworkInfo f7723u;
    public final m f7724v;
    public final long f7725w;
    public long f7726x;
    public int f7727y;
    public long f7728z = -1;

    public C1297t(Context context, C2482j c2482j, C1461c c1461c, C2276c c2276c, m mVar, C0657w c0657w, o oVar, C6319q c6319q, by byVar, bu buVar) {
        super(mVar, c0657w, oVar, c6319q, byVar, buVar);
        this.f7719q = context;
        this.f7720r = c2482j;
        this.f7721s = c1461c;
        this.f7722t = c2276c;
        this.f7724v = mVar;
        this.f7723u = c2276c.mo2833a();
        this.f7725w = SystemClock.elapsedRealtime();
    }

    public final long mo1681b() {
        return SystemClock.elapsedRealtime() - this.f7725w;
    }

    public final long mo1680a() {
        return this.f7726x;
    }

    public final String m7744e() {
        if (!mo1545d().equals(this.f7724v.a) && this.f7721s.dj().mo2294a(12630075) && a.a(this.f7724v.a)) {
            return bf.a(this.f7724v.a, this.f7724v.d, this.f7724v.e, -1);
        }
        return super.e();
    }

    public final C0656n m7738a(C0700r c0700r) {
        this.f7728z = C4678i.m21813b();
        return super.a(c0700r);
    }

    protected final C0704v m7739a(C0697m c0697m) {
        long b = C4678i.m21813b();
        this.f7726x = c0697m.f4171f;
        this.f7727y = c0697m.f4167b.length;
        C0704v a = super.a(c0697m);
        this.f7718A = C4678i.m21813b() - b;
        return a;
    }

    public final void m7743c(VolleyError volleyError) {
        super.c(volleyError);
        this.f7726x = volleyError.f4023c;
        m7736a(false, volleyError, false);
    }

    protected final void m7741a(byte[] bArr) {
        super.a(bArr);
        m7736a(true, null, this.f7726x <= 0);
    }

    private final void m7736a(boolean z, VolleyError volleyError, boolean z2) {
        if (this.f7720r.m13331a(z2, true)) {
            float f;
            if (this.f4038m instanceof C0690f) {
                f = ((C0690f) this.f4038m).f4153d;
            } else {
                f = 0.0f;
            }
            Boolean bool = null;
            if (volleyError instanceof NoConnectionError) {
                bool = Boolean.valueOf(C6324f.m28968b(this.f7719q));
            }
            long j = -1;
            if (this.f7728z > 0) {
                j = C4678i.m21813b() - this.f7728z;
            }
            this.f7720r.m13330a(mo1545d(), this.f7726x, 0, j, this.f7718A, this.f4038m.mo1079b() + 1, this.f4038m.mo1077a(), f, z, volleyError, this.f7723u, this.f7722t.mo2833a(), this.f7727y, z2, 0, bool, 0, null);
        }
    }
}
