package com.google.android.finsky.eb;

import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.a.a.a.a.ao;

public final class C2967b extends C0971t {
    public C3300k f15616a;

    protected final void mo1167a() {
        super.mo1167a();
        ((C1380a) C3947d.m18649a(C1380a.class)).mo1834a(this);
    }

    protected final void mo1170a(C1254c c1254c, C2495w c2495w) {
        ao aoVar = new ao();
        if (((Boolean) C1789d.f9316c.m5760a()).booleanValue()) {
            aoVar.a(((Integer) C1789d.f9315b.m5760a()).intValue());
        } else {
            aoVar.a(0);
        }
        aoVar.b(this.f15616a.mo3442b());
        C2474c c2474c = new C2474c(2001);
        c2474c.m13220a(aoVar);
        c2495w.m13367a(c2474c);
    }
}
