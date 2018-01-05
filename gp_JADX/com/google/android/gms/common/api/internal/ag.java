package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.C4966t;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;

final class ag implements C1643x {
    public /* synthetic */ bt f25673a;
    public /* synthetic */ boolean f25674b;
    public /* synthetic */ C5058o f25675c;
    public /* synthetic */ ac f25676d;

    ag(ac acVar, bt btVar, boolean z, C5058o c5058o) {
        this.f25676d = acVar;
        this.f25673a = btVar;
        this.f25674b = z;
        this.f25675c = c5058o;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        c4980w = (Status) c4980w;
        C4966t.m23100a(this.f25676d.f25648g).m23108c();
        if (c4980w.m23271a() && this.f25676d.mo4562j()) {
            this.f25676d.mo4560h();
        }
        this.f25673a.m23071a(c4980w);
        if (this.f25674b) {
            this.f25675c.mo4559g();
        }
    }
}
