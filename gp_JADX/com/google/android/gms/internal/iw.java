package com.google.android.gms.internal;

import android.content.ComponentName;

final class iw implements Runnable {
    public /* synthetic */ ComponentName f27030a;
    public /* synthetic */ iu f27031b;

    iw(iu iuVar, ComponentName componentName) {
        this.f27031b = iuVar;
        this.f27030a = componentName;
    }

    public final void run() {
        il.m24822a(this.f27031b.f27027c, this.f27030a);
    }
}
