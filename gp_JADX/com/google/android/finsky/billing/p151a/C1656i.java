package com.google.android.finsky.billing.p151a;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.p030c.p031a.C0282a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.common.C1802r;
import com.google.android.finsky.billing.p131e.C1817e;
import com.google.android.finsky.billing.p153c.C1779a;
import com.google.android.finsky.billing.p153c.C1780b;
import com.google.android.finsky.billing.p153c.C1784h;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.w;
import java.util.ArrayList;
import java.util.List;

final /* synthetic */ class C1656i implements Runnable {
    public final C1655h f8613a;
    public final ao f8614b;
    public final C1780b f8615c;
    public final Context f8616d;
    public final Account f8617e;
    public final C1254c f8618f;
    public final C2495w f8619g;

    C1656i(C1655h c1655h, ao aoVar, C1780b c1780b, Context context, Account account, C1254c c1254c, C2495w c2495w) {
        this.f8613a = c1655h;
        this.f8614b = aoVar;
        this.f8615c = c1780b;
        this.f8616d = context;
        this.f8617e = account;
        this.f8618f = c1254c;
        this.f8619g = c2495w;
    }

    public final void run() {
        C1655h c1655h = this.f8613a;
        ao aoVar = this.f8614b;
        C1780b c1780b = this.f8615c;
        Context context = this.f8616d;
        Account account = this.f8617e;
        C1254c c1254c = this.f8618f;
        C2495w c2495w = this.f8619g;
        if (c1655h.f8610f == null) {
            C1552e j = c1655h.f8606b.mo2249j(account.name);
            C1802r c1802r = new C1802r();
            c1655h.f8610f = new C1784h(context, j, null);
        }
        aoVar.f = new C1779a(context, account, new C1817e(C0282a.m1599a(context)), c1655h.f8610f, c1780b, c1655h.f8607c, c1655h.f8608d, c1655h.f8609e, null).m9729a();
        String c = c1254c.mo1636c();
        C1552e j2 = c1655h.f8606b.mo2249j(c);
        if (j2.mo2294a(12639965) && c1655h.m9408b(c, null)) {
            if (j2.mo2294a(12644643) && c1655h.f8605a.m9361a(c1655h.m9403a(context, c, aoVar.f))) {
                aoVar.b = new w[0];
            } else {
                List arrayList = new ArrayList();
                for (w wVar : aoVar.b) {
                    if (!c1655h.f8605a.m9361a(c1655h.m9404a(context, c, wVar.c.f11833b, aoVar.f))) {
                        arrayList.add(wVar);
                    }
                }
                aoVar.b = (w[]) arrayList.toArray(new w[arrayList.size()]);
            }
        }
        if (aoVar.b.length == 0) {
            FinskyLog.m21659a("Skipping a request to /bulkAcquire since cache has all the records.", new Object[0]);
            return;
        }
        boolean a = j2.mo2294a(12639865);
        boolean z = !j2.mo2294a(12639867);
        Context applicationContext = context.getApplicationContext();
        boolean a2 = c1655h.f8606b.mo2249j(c).mo2294a(12639864);
        c1254c.mo1563a(aoVar, new C1658k(c1655h, a, a2, c2495w, applicationContext, c1254c, z, aoVar), new C1660m(a2, c2495w));
        if (a2) {
            c2495w.m13367a(new C2474c(2050));
        }
    }
}
