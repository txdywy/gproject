package com.google.android.gms.internal;

final class im extends gm {
    public /* synthetic */ il f27006f;

    im(il ilVar, hv hvVar) {
        this.f27006f = ilVar;
        super(hvVar);
    }

    public final void mo4763a() {
        hy hyVar = this.f27006f;
        hyVar.mo4728b();
        if (hyVar.m24847t()) {
            hyVar.mo4742p().f26851j.m24652a("Inactivity, disconnecting from the service");
            hyVar.m24850z();
        }
    }
}
