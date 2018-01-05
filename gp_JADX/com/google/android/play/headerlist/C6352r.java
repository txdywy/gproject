package com.google.android.play.headerlist;

import android.database.DataSetObserver;

final class C6352r extends DataSetObserver {
    public final /* synthetic */ C6351q f31910a;

    C6352r(C6351q c6351q) {
        this.f31910a = c6351q;
    }

    public final void onChanged() {
        this.f31910a.m29155a(false);
        this.f31910a.f31903a.aZ = 2;
    }

    public final void onInvalidated() {
        onChanged();
    }
}
