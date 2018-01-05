package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class ai extends ay {
    public WeakReference f25678a;

    ai(ac acVar) {
        this.f25678a = new WeakReference(acVar);
    }

    public final void mo4566a() {
        ac acVar = (ac) this.f25678a.get();
        if (acVar != null) {
            ac.m23332a(acVar);
        }
    }
}
