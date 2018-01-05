package com.google.android.finsky.dc;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.dd.C2567a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.packagemanager.C2554g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.t;

public final class C2555a implements C2554g {
    public final int f13639a;
    public final String f13640b;
    public final C2482j f13641c;
    public final C1552e f13642d;

    public C2555a(int i, String str, C2482j c2482j, C1552e c1552e) {
        this.f13639a = i;
        this.f13640b = str;
        this.f13641c = c2482j;
        this.f13642d = c1552e;
    }

    public final void mo2943a() {
        boolean z;
        t a;
        if (!((Boolean) C0955b.jB.m28964b()).booleanValue() && this.f13642d.mo2294a(12637767)) {
            C2567a.m13570a();
        }
        FinskyLog.m21659a("Package has been replaced, self-update succeeded.", new Object[0]);
        C0757i tVar = new t();
        if (!this.f13642d.mo2294a(12635351) || !C0954a.bB.m5764b() || !ab.m21686a((String) C0954a.bB.m5760a(), tVar)) {
            z = false;
        } else if (tVar.d() && tVar.b == this.f13639a) {
            z = true;
        } else {
            FinskyLog.m21665c("Installed version %d is different than expected version %d.", Integer.valueOf(this.f13639a), Integer.valueOf(tVar.b));
            z = false;
        }
        if (z) {
            C0757i c0757i = tVar;
        } else {
            a = new t().a(this.f13639a).a(true);
        }
        this.f13641c.m13319a(new C2474c(110).m13236a(this.f13640b).m13231a(a).f13342a, null);
        C0954a.bB.m5765c();
    }
}
