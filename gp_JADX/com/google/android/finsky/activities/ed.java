package com.google.android.finsky.activities;

import android.view.View;
import com.google.android.finsky.C1473m;

final class ed implements Runnable {
    public final /* synthetic */ View f6700a;
    public final /* synthetic */ ec f6701b;

    ed(ec ecVar, View view) {
        this.f6701b = ecVar;
        this.f6700a = view;
    }

    public final void run() {
        this.f6701b.f6697a.onClick(this.f6700a);
        this.f6701b.f6699c.ar = false;
        if (C1473m.f7980a.dj().mo2294a(12640245)) {
            dx.m6471a(this.f6701b.f6698b);
        }
    }
}
