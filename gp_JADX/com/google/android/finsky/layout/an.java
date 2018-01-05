package com.google.android.finsky.layout;

import android.database.DataSetObserver;

final class an extends DataSetObserver {
    public final /* synthetic */ HorizontalStrip f18490a;

    an(HorizontalStrip horizontalStrip) {
        this.f18490a = horizontalStrip;
    }

    public final void onChanged() {
        this.f18490a.m17320b();
    }

    public final void onInvalidated() {
        this.f18490a.mo3564a();
    }
}
