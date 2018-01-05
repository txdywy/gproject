package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5588e;

abstract class C5062y extends C5057a {
    public final C5588e f25794a;

    public C5062y(C5588e c5588e) {
        this.f25794a = c5588e;
    }

    public void mo4583a(Status status) {
        this.f25794a.m26584b(new ApiException(status));
    }

    public final void mo4584a(aq aqVar) {
        try {
            mo4592b(aqVar);
        } catch (RemoteException e) {
            mo4583a(C5057a.m23287a(e));
            throw e;
        } catch (RemoteException e2) {
            mo4583a(C5057a.m23287a(e2));
        }
    }

    public void mo4585a(C5067h c5067h, boolean z) {
    }

    protected abstract void mo4592b(aq aqVar);
}
