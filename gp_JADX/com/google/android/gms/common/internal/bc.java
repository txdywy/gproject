package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

public final class bc extends as {
    public /* synthetic */ ar f26003c;

    public bc(ar arVar, int i) {
        this.f26003c = arVar;
        super(arVar, i, null);
    }

    protected final void mo4616a(ConnectionResult connectionResult) {
        this.f26003c.f25424q.mo4580a(connectionResult);
        this.f26003c.m23010a(connectionResult);
    }

    protected final boolean mo4617a() {
        this.f26003c.f25424q.mo4580a(ConnectionResult.f25609a);
        return true;
    }
}
