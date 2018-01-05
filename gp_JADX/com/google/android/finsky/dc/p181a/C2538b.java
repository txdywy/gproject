package com.google.android.finsky.dc.p181a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dd.C2567a;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.download.C2106x;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2845h;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p140i.C3219f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.b.a;

public abstract class C2538b implements C2106x {
    public final Context f13594a;
    public final C2850m f13595b;
    public final C1552e f13596c;
    public final C2495w f13597d;
    public final C3219f f13598e;
    public final C2538b f13599f;
    public final String f13600g;
    public a f13601h;
    public int f13602i;
    public int f13603j;
    public t f13604k;
    public long f13605l = -1;
    public String f13606m;
    public final C3322j f13607n;
    public final C2546i f13608o;
    public C2839b f13609p;
    public boolean f13610q;
    public boolean f13611r;

    C2538b(Context context, C2850m c2850m, C1552e c1552e, C2495w c2495w, C3219f c3219f, C2538b c2538b, C3322j c3322j, C2546i c2546i) {
        this.f13594a = context;
        this.f13595b = c2850m;
        this.f13597d = c2495w;
        this.f13596c = c1552e;
        this.f13598e = c3219f;
        this.f13599f = c2538b;
        this.f13607n = c3322j;
        this.f13608o = c2546i;
        this.f13600g = context.getPackageName();
    }

    protected abstract Uri mo2936a(Uri uri);

    protected abstract boolean mo2937a();

    protected abstract String mo2938b();

    public final void m13502a(int i, int i2, a aVar) {
        long j;
        String str;
        this.f13602i = i;
        this.f13603j = i2;
        this.f13601h = aVar;
        if (aVar.d()) {
            j = aVar.b;
        } else {
            j = -1;
        }
        this.f13605l = j;
        if (aVar.e()) {
            str = aVar.d;
        } else {
            str = null;
        }
        this.f13606m = str;
        mo2942d();
        bb.m21792a(new C2540c(this), new Void[0]);
    }

    final void m13509c() {
        this.f13610q = true;
        this.f13611r = true;
        if (this.f13599f != null) {
            this.f13599f.m13502a(this.f13602i, this.f13603j, this.f13601h);
        }
        this.f13595b.removeListener(this);
    }

    protected void mo2942d() {
        this.f13604k = new t();
        this.f13604k.b(this.f13602i);
        this.f13604k.a(this.f13603j);
        this.f13604k.a(true);
    }

    public final void m13504a(int i, Throwable th) {
        m13503a(111, null, i, th);
        if (this.f13596c.mo2294a(12635351)) {
            C0954a.bB.m5765c();
        }
        m13509c();
    }

    protected final void m13503a(int i, String str, int i2, Throwable th) {
        C2474c a = new C2474c(i).m13244b(str).m13236a(this.f13600g).m13210a(i2).m13238a(th).m13231a(this.f13604k);
        if ("free-space".equals(str)) {
            a.m13228a(C2830g.m14965a(false));
        }
        this.f13597d.m13367a(a);
    }

    protected final void m13501a(int i) {
        m13503a(i, null, 0, null);
    }

    public final void mo2647e(C2839b c2839b) {
        if (c2839b != this.f13609p) {
            FinskyLog.m21659a("Self-update ignoring completed download %s", c2839b);
            return;
        }
        m13499a(c2839b);
        m13501a(102);
        this.f13609p = null;
        bb.m21792a(new C2543f(this), c2839b.mo3162l());
    }

    public final void mo2642b(C2839b c2839b, int i) {
        if (c2839b == this.f13609p) {
            m13499a(c2839b);
            if (!(this.f13604k == null || TextUtils.isEmpty(c2839b.mo3159i()))) {
                this.f13604k.a(c2839b.mo3159i());
                FinskyLog.m21659a("Self-update failed, cpn=%s", c2839b.mo3159i());
            }
            m13503a(104, null, i, null);
            FinskyLog.m21667d("Self-update failed because of HTTP error code: %d", Integer.valueOf(i));
            m13509c();
        }
    }

    public final void mo2645g(C2839b c2839b) {
        if (c2839b == this.f13609p) {
            m13499a(c2839b);
            m13501a(101);
            if (!((Boolean) C0955b.jB.m28964b()).booleanValue() && this.f13596c.mo2294a(12637767)) {
                try {
                    if (this.f13609p.mo3162l() == null) {
                        FinskyLog.m21667d("Could not record self update recovery data, URI is missing!", new Object[0]);
                        C2567a.m13570a();
                        return;
                    }
                    C2567a.f13683c.m5763a(this.f13609p.mo3162l().toString());
                } catch (Throwable e) {
                    FinskyLog.m21660a(e, "Could not record self update recovery data.", new Object[0]);
                    C2567a.m13570a();
                }
            }
        }
    }

    public final void mo2643b(C2839b c2839b, C2845h c2845h) {
    }

    private final void m13499a(C2839b c2839b) {
        C2845h m = c2839b.mo3163m();
        if (m != null) {
            this.f13604k.a(m.f15277b);
            this.f13604k.b(m.f15278c);
            this.f13604k.e(m.f15279d);
        }
    }

    public final void mo2644f(C2839b c2839b) {
    }

    public final void mo2646h(C2839b c2839b) {
    }
}
