package com.google.android.play.headerlist;

import android.database.DataSetObserver;

final class C6359y extends DataSetObserver {
    public final /* synthetic */ C6358x f31925a;

    C6359y(C6358x c6358x) {
        this.f31925a = c6358x;
    }

    public final void onChanged() {
        this.f31925a.m29167a(false);
        this.f31925a.f31922a.aZ = 2;
    }

    public final void onInvalidated() {
        onChanged();
    }
}
