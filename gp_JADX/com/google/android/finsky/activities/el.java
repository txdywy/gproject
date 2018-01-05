package com.google.android.finsky.activities;

final /* synthetic */ class el implements Runnable {
    public final ek f6762a;

    el(ek ekVar) {
        this.f6762a = ekVar;
    }

    public final void run() {
        ek ekVar = this.f6762a;
        if (ekVar.f6724D != null) {
            ekVar.f6724D.L_();
            ekVar.f6724D = null;
        }
    }
}
