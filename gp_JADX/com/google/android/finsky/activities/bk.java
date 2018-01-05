package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;

final class bk implements OnClickListener {
    public final /* synthetic */ bc f6485a;

    bk(bc bcVar) {
        this.f6485a = bcVar;
    }

    public final void onClick(View view) {
        bc bcVar = this.f6485a;
        bcVar.m6307a("queue size: " + bcVar.f6477a.mo3767b());
    }
}
