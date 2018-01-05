package com.google.android.finsky.application;

import com.google.android.finsky.bp.C2155a;

final class dh implements Runnable {
    public final /* synthetic */ boolean f8040a;
    public final /* synthetic */ C1475d f8041b;

    dh(C1475d c1475d, boolean z) {
        this.f8041b = c1475d;
        this.f8040a = z;
    }

    public final void run() {
        C2155a bG = this.f8041b.bG();
        boolean z = this.f8041b.bG().m11228a() && !this.f8040a;
        bG.m11229b(z);
    }
}
