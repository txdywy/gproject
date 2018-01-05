package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;

final class jj extends gm {
    public /* synthetic */ ji f27058f;

    jj(ji jiVar, hv hvVar) {
        this.f27058f = jiVar;
        super(hvVar);
    }

    public final void mo4763a() {
        this.f27058f.mo4742p().f26851j.m24652a("Sending upload intent from DelayedRunnable");
        hy hyVar = this.f27058f;
        Intent intent = new Intent();
        Context j = hyVar.mo4736j();
        gj.m24442H();
        intent = intent.setClassName(j, "com.google.android.gms.measurement.AppMeasurementReceiver");
        intent.setAction("com.google.android.gms.measurement.UPLOAD");
        hyVar.mo4736j().sendBroadcast(intent);
    }
}
