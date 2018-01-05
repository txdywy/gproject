package com.google.android.finsky.activities;

import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.iab.C1866v;
import com.google.android.finsky.dc.C2556b;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dp.C1096g;
import com.google.android.finsky.p140i.C3219f;
import com.google.wireless.android.finsky.dfe.nano.gp;

final class C1097m implements C1096g {
    public final /* synthetic */ boolean[] f6962a;
    public final /* synthetic */ C1552e f6963b;
    public final /* synthetic */ C1254c f6964c;
    public final /* synthetic */ String f6965d;
    public final /* synthetic */ boolean f6966e;
    public final /* synthetic */ C1036b f6967f;

    C1097m(C1036b c1036b, boolean[] zArr, C1552e c1552e, C1254c c1254c, String str, boolean z) {
        this.f6967f = c1036b;
        this.f6962a = zArr;
        this.f6963b = c1552e;
        this.f6964c = c1254c;
        this.f6965d = str;
        this.f6966e = z;
    }

    public final void mo1427a(gp gpVar) {
        if (this.f6962a[0]) {
            new C3219f(this.f6967f.getApplicationContext(), C1473m.f7980a.mo2267z()).m16266a(10000, new C1123n());
            return;
        }
        this.f6962a[0] = true;
        C1473m.f7980a.mo2057a(new DfeToc(gpVar));
        C2556b a = C1473m.f7980a.mo2050a(this.f6963b);
        a.mo2948a(a.mo2945a(gpVar), this.f6964c, this.f6963b, this.f6967f.f6323t.m13184a(null));
        C1866v.m9978a(this.f6965d, gpVar.f31772o);
        C1473m.f7980a.mo2037Q().m8837a(new C1125o(this.f6967f, this.f6966e));
    }

    public final void mo1426a(VolleyError volleyError) {
        this.f6967f.mo1251u();
        this.f6967f.mo1248a(volleyError);
    }
}
