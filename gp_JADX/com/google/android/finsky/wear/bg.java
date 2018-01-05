package com.google.android.finsky.wear;

import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;

final class bg implements Runnable {
    public final /* synthetic */ ar f24876a;

    bg(ar arVar) {
        this.f24876a = arVar;
    }

    public final void run() {
        if (this.f24876a.f24826j != null) {
            ForegroundCoordinator foregroundCoordinator = this.f24876a.f24825i;
            ForegroundCoordinator.m16015a(this.f24876a.f24826j);
            this.f24876a.f24826j = null;
        }
    }
}
