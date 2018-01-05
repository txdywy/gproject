package com.google.android.finsky.billing.iab;

import android.os.Binder;

final class C1858m implements C1857q {
    C1858m() {
    }

    public final long mo2472a() {
        return Binder.clearCallingIdentity();
    }

    public final void mo2473a(long j) {
        Binder.restoreCallingIdentity(j);
    }

    public final int mo2474b() {
        return Binder.getCallingUid();
    }
}
