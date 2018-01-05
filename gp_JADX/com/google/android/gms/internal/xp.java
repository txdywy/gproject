package com.google.android.gms.internal;

import android.os.Binder;

final class xp implements Runnable {
    public /* synthetic */ xo f27716a;

    xp(xo xoVar) {
        this.f27716a = xoVar;
    }

    public final void run() {
        xo xoVar = this.f27716a;
        synchronized (xoVar.f27714a) {
            if (xoVar.f27715b == null) {
                return;
            }
            if (xoVar.f27715b.m23021j() || xoVar.f27715b.m23022k()) {
                xoVar.f27715b.mo4510e();
            }
            xoVar.f27715b = null;
            Binder.flushPendingCommands();
        }
    }
}
