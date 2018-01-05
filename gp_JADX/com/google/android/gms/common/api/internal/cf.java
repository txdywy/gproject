package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5588e;

public final class cf extends C5062y {
    public bj f25795b;

    public cf(bj bjVar, C5588e c5588e) {
        super(c5588e);
        this.f25795b = bjVar;
    }

    public final /* bridge */ /* synthetic */ void mo4583a(Status status) {
        super.mo4583a(status);
    }

    public final /* bridge */ /* synthetic */ void mo4585a(C5067h c5067h, boolean z) {
    }

    public final void mo4592b(aq aqVar) {
        bn bnVar = (bn) aqVar.f25720f.remove(this.f25795b);
        if (bnVar != null) {
            bnVar.f25762b.m23517a();
            throw new NoSuchMethodError();
        }
        this.a.m26584b(new ApiException(new Status(13, "listener already unregistered")));
    }
}
