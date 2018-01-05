package com.google.android.finsky.wear;

import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.de.C2496e;
import com.google.android.finsky.p107l.C3648c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gb;

final class be implements C2496e {
    public final /* synthetic */ C4788i f24870a;
    public final /* synthetic */ C1254c f24871b;
    public final /* synthetic */ bd f24872c;

    be(bd bdVar, C4788i c4788i, C1254c c1254c) {
        this.f24872c = bdVar;
        this.f24870a = c4788i;
        this.f24871b = c1254c;
    }

    public final void mo2920a(gb gbVar) {
        int i;
        FinskyLog.m21659a("Wear selfupdate node %s - installed %d, server %d", this.f24872c.f24867a, Integer.valueOf(this.f24870a.f24980k), Integer.valueOf(gbVar.c));
        if (((Boolean) C0955b.es.m28964b()).booleanValue()) {
            i = gbVar.c;
        } else {
            FinskyLog.m21659a("Skipping self-update node %s - not enabled", this.f24872c.f24867a);
            i = -1;
        }
        ar arVar = this.f24872c.f24869c;
        String str = this.f24872c.f24867a;
        String c = this.f24871b.mo1636c();
        cc ccVar = this.f24872c.f24868b;
        arVar.f24823g.m22451a();
        C4788i b = arVar.f24824h.m22522b(str);
        C2320a a = ag.m22436a(arVar.f24828l, str, arVar.f24823g.f24792b);
        C1287h d = C1473m.f7980a.mo2222d(str);
        String str2 = b.f24986q;
        C1473m c1473m = C1473m.f7980a;
        C3648c c3648c = new C3648c(c1473m.mo2040T(), c1473m.ah(), a, arVar.f24823g.f24795e, arVar.f24823g.f24796f, str2, str, d, c1473m.aR(), C1473m.f7980a.aN());
        c3648c.m17255a(new as(arVar, c3648c, str, i, c, ccVar));
    }

    public final void mo2919a(VolleyError volleyError) {
        FinskyLog.m21659a("Failed selfupdate check error %s for node %s", volleyError, this.f24872c.f24867a);
        this.f24872c.f24869c.m22467a(this.f24872c.f24867a);
        this.f24872c.f24869c.m22468a(this.f24872c.f24867a, this.f24872c.f24868b);
    }
}
