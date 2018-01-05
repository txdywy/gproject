package com.google.android.finsky.billing.p151a;

import android.content.Context;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.ap;
import com.google.wireless.android.finsky.dfe.c.a.du;

final class C1658k implements C0660x {
    public final /* synthetic */ boolean f8621a;
    public final /* synthetic */ boolean f8622b;
    public final /* synthetic */ C2495w f8623c;
    public final /* synthetic */ Context f8624d;
    public final /* synthetic */ C1254c f8625e;
    public final /* synthetic */ boolean f8626f;
    public final /* synthetic */ ao f8627g;
    public final /* synthetic */ C1655h f8628h;

    C1658k(C1655h c1655h, boolean z, boolean z2, C2495w c2495w, Context context, C1254c c1254c, boolean z3, ao aoVar) {
        this.f8628h = c1655h;
        this.f8621a = z;
        this.f8622b = z2;
        this.f8623c = c2495w;
        this.f8624d = context;
        this.f8625e = c1254c;
        this.f8626f = z3;
        this.f8627g = aoVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        ap apVar = (ap) obj;
        du[] duVarArr = apVar.b;
        if (this.f8621a && duVarArr != null && duVarArr.length > 0) {
            new C1659l(this, apVar).start();
        }
        if (this.f8622b) {
            this.f8623c.m13367a(new C2474c(2051).m13239a(true).m13240a(apVar.d));
        }
    }
}
