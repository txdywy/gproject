package com.google.android.finsky.billing.iab;

import android.os.Bundle;
import com.android.volley.C0660x;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.p111d.C2474c;
import com.google.wireless.android.finsky.dfe.nano.ge;
import com.google.wireless.android.finsky.dfe.nano.gf;
import com.google.wireless.android.finsky.dfe.nano.gg;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

final class C1850f implements C0660x {
    public final /* synthetic */ Bundle f9514a;
    public final /* synthetic */ Semaphore f9515b;
    public final /* synthetic */ int f9516c;
    public final /* synthetic */ String f9517d;
    public final /* synthetic */ String f9518e;
    public final /* synthetic */ gf f9519f;
    public final /* synthetic */ C1849e f9520g;

    C1850f(C1849e c1849e, Bundle bundle, Semaphore semaphore, int i, String str, String str2, gf gfVar) {
        this.f9520g = c1849e;
        this.f9514a = bundle;
        this.f9515b = semaphore;
        this.f9516c = i;
        this.f9517d = str;
        this.f9518e = str2;
        this.f9519f = gfVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        gg ggVar = (gg) obj;
        ge[] geVarArr = ggVar.b;
        ArrayList arrayList = new ArrayList(geVarArr.length);
        for (ge geVar : geVarArr) {
            if (((geVar.b & 1) != 0 ? 1 : 0) != 0) {
                arrayList.add(geVar.c);
            }
        }
        this.f9514a.putStringArrayList("DETAILS_LIST", arrayList);
        this.f9514a.putInt("RESPONSE_CODE", C1868x.RESULT_OK.f9566l);
        this.f9515b.release();
        if (ggVar.c) {
            byte[] b = this.f9520g.f9511p.m9769b(this.f9520g.f9500e, this.f9520g.f9501f.mo1636c());
            PurchaseParams a = this.f9520g.f9507l.m9991a(this.f9520g.f9500e, this.f9516c, this.f9517d, null, "", this.f9518e, null, this.f9520g.f9502g, null);
            if (a != null) {
                this.f9520g.f9513r.m9405a(this.f9520g.f9500e, this.f9520g.f9501f, this.f9519f, b, ggVar, a, this.f9520g.f9503h);
            } else if (this.f9520g.f9502g.mo2294a(12639864)) {
                this.f9520g.f9503h.m13367a(new C2474c(2052).m13254g(1));
            }
        }
    }
}
