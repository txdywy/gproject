package com.google.android.p102c;

import android.database.ContentObserver;

final class C0922d extends ContentObserver {
    public final /* synthetic */ C0924f f5693a;

    C0922d(C0924f c0924f) {
        this.f5693a = c0924f;
        super(null);
    }

    public final void onChange(boolean z) {
        this.f5693a.f5697c.set(true);
    }
}
