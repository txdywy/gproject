package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.co;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.am;

public final class du extends ds {
    public final co f26669a;

    public du(co coVar) {
        this.f26669a = (co) am.m23734a((Object) coVar, (Object) "Holder must not be null");
    }

    public final void mo4713a(DataHolder dataHolder) {
        this.f26669a.mo4494a(new dv(dataHolder));
    }
}
