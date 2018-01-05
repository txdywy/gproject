package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;

final class iy implements Runnable {
    public /* synthetic */ iu f27034a;

    iy(iu iuVar) {
        this.f27034a = iuVar;
    }

    public final void run() {
        il ilVar = this.f27034a.f27027c;
        Context j = this.f27034a.f27027c.mo4736j();
        gj.m24442H();
        il.m24822a(ilVar, new ComponentName(j, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
