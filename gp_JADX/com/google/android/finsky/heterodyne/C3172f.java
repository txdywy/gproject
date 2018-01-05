package com.google.android.finsky.heterodyne;

import android.content.Context;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

public class C3172f extends C0971t {
    public Context f16426a;
    public C3170c f16427c;
    public C0986a f16428d;

    protected final void mo1167a() {
        super.mo1167a();
        ((C1390e) C3947d.m18649a(C1390e.class)).mo1851a(this);
    }

    protected final void mo1170a(C1254c c1254c, C2495w c2495w) {
        FinskyLog.m21659a("Triggered Heterodyne Sync.", new Object[0]);
        this.f16427c.m16168a(this.f16426a, c2495w).m16156a(this.f16426a.getPackageName(), this.f16428d.mo1191g());
    }
}
