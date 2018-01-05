package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class cs extends ay {
    public /* synthetic */ Dialog f25821a;
    public /* synthetic */ cr f25822b;

    cs(cr crVar, Dialog dialog) {
        this.f25822b = crVar;
        this.f25821a = dialog;
    }

    public final void mo4566a() {
        this.f25822b.f25820b.m23539f();
        if (this.f25821a.isShowing()) {
            this.f25821a.dismiss();
        }
    }
}
