package com.google.android.finsky.wear;

import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;

final /* synthetic */ class al implements Runnable {
    public final ak f24805a;

    al(ak akVar) {
        this.f24805a = akVar;
    }

    public final void run() {
        ak akVar = this.f24805a;
        if (akVar.f24803m != null && akVar.f24804n != null) {
            ForegroundCoordinator.m16015a(akVar.f24804n);
            akVar.f24804n = null;
        }
    }
}
