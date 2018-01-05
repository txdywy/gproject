package com.google.android.finsky.dc;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.ae.C1182a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.db.C2537a;
import com.google.android.finsky.download.C2106x;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2845h;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p140i.C3219f;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.dfe.nano.gb;
import com.google.wireless.android.finsky.dfe.nano.gn;
import com.google.wireless.android.finsky.dfe.nano.gp;

public final class C2561g implements C2556b, C2106x {
    public static final String[] f13657k = new String[]{"1", "2"};
    public final C2850m f13658a;
    public final C3322j f13659b;
    public C3219f f13660c;
    public int f13661d;
    public boolean f13662e = false;
    public t f13663f = null;
    public long f13664g = -1;
    public String f13665h = null;
    public C2839b f13666i = null;
    public final C2537a f13667j;
    public C2495w f13668l;
    public C1182a f13669m;
    public Context f13670n;
    public C3219f f13671o;
    public C3849a f13672p;

    public C2561g(C2850m c2850m, int i, Context context, C2537a c2537a, C3322j c3322j, C1182a c1182a, C3219f c3219f, C3849a c3849a) {
        this.f13658a = c2850m;
        this.f13661d = i;
        this.f13670n = context;
        this.f13659b = c3322j;
        this.f13667j = c2537a;
        this.f13669m = c1182a;
        this.f13671o = c3219f;
        this.f13672p = c3849a;
        try {
            this.f13669m.m7132a(new C2566l(this));
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Failed to register SelfUpdate critical job.", new Object[0]);
        }
    }

    public final int mo2945a(gp gpVar) {
        if (gpVar.f31770m == null) {
            return -1;
        }
        gn gnVar = gpVar.f31770m;
        if (gnVar.d()) {
            return gnVar.b;
        }
        return -1;
    }

    public final int mo2944a(gb gbVar) {
        if (gbVar.d()) {
            return gbVar.c;
        }
        return -1;
    }

    public final boolean mo2946a() {
        return this.f13662e;
    }

    public final boolean mo2948a(int i, C1254c c1254c, C1552e c1552e, C2495w c2495w) {
        if (this.f13662e) {
            FinskyLog.m21659a("Skipping DFE self-update check as there is an update already queued.", new Object[0]);
            c2495w.m13367a(new C2474c(153).m13236a(this.f13670n.getPackageName()).m13231a(new t().b(this.f13661d).a(true)).m13210a(-2));
            return true;
        } else if (!mo2947a(i)) {
            return false;
        } else {
            FinskyLog.m21659a("Starting DFE self-update from local version [%d] to server version [%d]", Integer.valueOf(this.f13661d), Integer.valueOf(i));
            this.f13662e = true;
            this.f13663f = new t();
            this.f13663f.b(this.f13661d);
            this.f13663f.a(i);
            this.f13663f.a(true);
            this.f13668l = c2495w.m13375a("self_update");
            this.f13668l.m13367a(m13558b(105));
            C1254c c1254c2 = c1254c;
            c1254c2.mo1600a(this.f13670n.getPackageName(), null, Integer.valueOf(i), Integer.valueOf(this.f13661d), null, null, null, f13657k, null, this.f13667j.m13497a(), this.f13667j.m13498b(), true, null, null, null, new C2562h(this, c1552e), new C2563i(this));
            return true;
        }
    }

    public final boolean mo2947a(int i) {
        if (this.f13661d < i) {
            return true;
        }
        FinskyLog.m21659a("Skipping DFE self-update. Local Version [%d] >= Server Version [%d]", Integer.valueOf(this.f13661d), Integer.valueOf(i));
        return false;
    }

    final C2474c m13558b(int i) {
        return new C2474c(i).m13236a(this.f13670n.getPackageName()).m13231a(this.f13663f);
    }

    public final void mo2647e(C2839b c2839b) {
        if (c2839b != this.f13666i) {
            FinskyLog.m21659a("Self-update ignoring completed download %s", c2839b);
            return;
        }
        String packageName = this.f13670n.getPackageName();
        this.f13668l.m13367a(m13558b(102));
        this.f13666i = null;
        if (this.f13660c != null) {
            FinskyLog.m21659a("Self-update package Uri was already assigned!", new Object[0]);
            return;
        }
        FinskyLog.m21659a("Self-update ready to be installed, waiting for market to close.", new Object[0]);
        this.f13660c = this.f13671o;
        this.f13660c.m16266a(10000, new C2564j(this, packageName, c2839b));
    }

    public final void mo2642b(C2839b c2839b, int i) {
        if (c2839b == this.f13666i) {
            this.f13662e = false;
            if (!(this.f13663f == null || TextUtils.isEmpty(c2839b.mo3159i()))) {
                this.f13663f.a(c2839b.mo3159i());
                FinskyLog.m21659a("Self-update failed, cpn=%s", c2839b.mo3159i());
            }
            this.f13668l.m13367a(m13558b(104).m13210a(i));
            FinskyLog.m21667d("Self-update failed because of HTTP error code: %d", Integer.valueOf(i));
        }
    }

    public final void mo2645g(C2839b c2839b) {
        if (c2839b == this.f13666i) {
            this.f13668l.m13367a(m13558b(101));
        }
    }

    public final void mo2644f(C2839b c2839b) {
    }

    public final void mo2646h(C2839b c2839b) {
    }

    public final void mo2643b(C2839b c2839b, C2845h c2845h) {
    }
}
