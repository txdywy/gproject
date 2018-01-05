package com.google.android.finsky.dc;

import android.content.Context;
import com.google.android.finsky.ae.C1182a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.db.C2537a;
import com.google.android.finsky.dc.p181a.C2538b;
import com.google.android.finsky.dc.p181a.C2539a;
import com.google.android.finsky.dc.p181a.C2544g;
import com.google.android.finsky.dc.p181a.C2553p;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.dfe.nano.gb;
import com.google.wireless.android.finsky.dfe.nano.gn;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.ArrayList;
import java.util.List;

public final class C2557c implements C2556b {
    public static final String f13643g = "3";
    public final int f13644a;
    public final Context f13645b;
    public final C2537a f13646c;
    public final C2544g f13647d;
    public final C1182a f13648e;
    public C2538b f13649f;
    public t f13650h;

    public C2557c(int i, Context context, C2537a c2537a, C2544g c2544g, C1182a c1182a) {
        this.f13644a = i;
        this.f13645b = context;
        this.f13646c = c2537a;
        this.f13647d = c2544g;
        this.f13648e = c1182a;
        try {
            this.f13648e.m7132a(new C2560f(this));
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
        if (this.f13649f != null) {
            C2538b c2538b = this.f13649f;
            while (c2538b.f13610q && c2538b.f13611r && c2538b.f13599f != null) {
                c2538b = c2538b.f13599f;
            }
            if (!c2538b.f13610q) {
                return true;
            }
        }
        return false;
    }

    public final boolean mo2948a(int i, C1254c c1254c, C1552e c1552e, C2495w c2495w) {
        if (mo2946a()) {
            FinskyLog.m21659a("Skipping DFE self-update check as there is an update already queued.", new Object[0]);
            c2495w.m13367a(new C2474c(153).m13236a(this.f13645b.getPackageName()).m13231a(new t().b(this.f13644a).a(true)).m13210a(-2));
            return true;
        } else if (!mo2947a(i)) {
            return false;
        } else {
            this.f13650h = new t().b(this.f13644a).a(i).a(true);
            C2495w a = c2495w.m13375a("self_update_v2");
            a.m13367a(m13549b(105));
            FinskyLog.m21659a("Starting DFE self-update from local version [%d] to server version [%d]", Integer.valueOf(this.f13644a), Integer.valueOf(i));
            C2544g c2544g = this.f13647d;
            C2538b c2539a = new C2539a(c2544g.f13619c, c2544g.f13620d, c1552e, a, c2544g.f13621e, c2544g.f13617a, c2544g.f13618b, c2544g.f13622f);
            this.f13649f = new C2553p(c2544g.f13619c, c2544g.f13620d, c1552e, a, c2544g.f13621e, c2539a, c2544g.f13617a, c2544g.f13618b, c2544g.f13622f);
            String packageName = this.f13645b.getPackageName();
            String a2 = this.f13646c.m13497a();
            String b = this.f13646c.m13498b();
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(this.f13644a);
            List arrayList = new ArrayList();
            if (c1552e.mo2294a(12619927)) {
                arrayList.add(f13643g);
            }
            c1254c.mo1600a(packageName, null, valueOf, valueOf2, null, null, null, (String[]) arrayList.toArray(new String[arrayList.size()]), null, a2, b, true, null, null, null, new C2558d(this, a, i), new C2559e(this, a));
            return true;
        }
    }

    public final boolean mo2947a(int i) {
        if (this.f13644a < i) {
            return true;
        }
        FinskyLog.m21659a("Skipping DFE self-update. Local Version [%d] >= Server Version [%d]", Integer.valueOf(this.f13644a), Integer.valueOf(i));
        return false;
    }

    final C2474c m13549b(int i) {
        return new C2474c(i).m13236a(this.f13645b.getPackageName()).m13231a(this.f13650h);
    }
}
