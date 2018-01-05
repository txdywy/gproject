package com.google.android.gms.phenotype;

import android.database.ContentObserver;

final class C5564w extends ContentObserver {
    public /* synthetic */ C5501a f28478a;

    C5564w(C5501a c5501a) {
        this.f28478a = c5501a;
        super(null);
    }

    public final void onChange(boolean z) {
        synchronized (this.f28478a.f28320e) {
            this.f28478a.f28321f = null;
        }
    }
}
