package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;

final class cf implements OnClickListener {
    public final /* synthetic */ int f6599a;
    public final /* synthetic */ bq f6600b;

    cf(bq bqVar, int i) {
        this.f6600b = bqVar;
        this.f6599a = i;
    }

    public final void onClick(View view) {
        this.f6600b.z.mo3624a(this.f6600b.C, this.f6600b.D, 1, null, this.f6600b.L, this.f6599a, this.f6600b.T, this.f6600b.S).onClick(view);
    }
}
