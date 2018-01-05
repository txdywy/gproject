package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5588e;

public final class ce extends C5057a {
    public final bw f25791a;
    public final C5588e f25792b;
    public final bs f25793c;

    public ce(bw bwVar, C5588e c5588e, bs bsVar) {
        this.f25792b = c5588e;
        this.f25791a = bwVar;
        this.f25793c = bsVar;
    }

    public final void mo4583a(Status status) {
        this.f25792b.m26584b(this.f25793c.mo4593a(status));
    }

    public final void mo4584a(aq aqVar) {
        try {
            this.f25791a.mo5048a(aqVar.f25716b, this.f25792b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo4583a(C5057a.m23287a(e2));
        }
    }

    public final void mo4585a(C5067h c5067h, boolean z) {
        C5588e c5588e = this.f25792b;
        c5067h.f25867b.put(c5588e, Boolean.valueOf(z));
        c5588e.f28505a.mo5055a(new C5070j(c5067h, c5588e));
    }
}
