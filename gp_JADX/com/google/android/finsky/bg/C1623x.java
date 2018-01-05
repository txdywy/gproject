package com.google.android.finsky.bg;

import android.view.View;

final class C1623x implements Runnable {
    public final /* synthetic */ View f8540a;
    public final /* synthetic */ C1625z f8541b;

    C1623x(View view, C1625z c1625z) {
        this.f8540a = view;
        this.f8541b = c1625z;
    }

    public final void run() {
        this.f8540a.startAnimation(C1621v.m9307b(this.f8540a.getContext(), 150, new C1624y(this)));
    }
}
