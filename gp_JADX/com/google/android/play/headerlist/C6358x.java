package com.google.android.play.headerlist;

import android.database.DataSetObserver;
import android.widget.Adapter;

public final class C6358x implements aa {
    public final PlayHeaderListLayout f31922a;
    public final DataSetObserver f31923b = new C6359y(this);
    public Adapter f31924c;

    public C6358x(PlayHeaderListLayout playHeaderListLayout) {
        this.f31922a = playHeaderListLayout;
    }

    final void m29167a(boolean z) {
        while (z && this.f31924c != null) {
            if (this.f31924c != null) {
                this.f31924c.unregisterDataSetObserver(this.f31923b);
            }
            this.f31924c = null;
            if (this.f31924c != null) {
                this.f31924c.registerDataSetObserver(this.f31923b);
            }
            z = false;
        }
    }
}
