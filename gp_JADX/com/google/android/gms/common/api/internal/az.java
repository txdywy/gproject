package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.Status;

public final class az extends C5057a {
    public cn f25742a;

    public az(cn cnVar) {
        this.f25742a = cnVar;
    }

    public final void mo4583a(Status status) {
        this.f25742a.m23084b(status);
    }

    public final void mo4584a(aq aqVar) {
        this.f25742a.m23085b(aqVar.f25716b);
    }

    public final void mo4585a(C5067h c5067h, boolean z) {
        C4954s c4954s = this.f25742a;
        c5067h.f25866a.put(c4954s, Boolean.valueOf(z));
        c4954s.mo4489a(new C5069i(c5067h, c4954s));
    }
}
