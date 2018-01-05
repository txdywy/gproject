package com.google.android.finsky.billing.iab;

import android.os.Binder;

public final class com.google.android.finsky.billing.iab.m implements com.google.android.finsky.billing.iab.q
{

    m() {
    }

    public final long a() {
        return Binder.clearCallingIdentity();
    }

    public final void a(long p0) {
        Binder.restoreCallingIdentity(p0);
    }

    public final int b() {
        return Binder.getCallingUid();
    }

}
