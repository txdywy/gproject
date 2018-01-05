package com.google.android.finsky.detailspage;

import com.google.android.finsky.detailsmodules.p183a.C2597a;
import com.google.android.finsky.detailsmodules.p183a.C2598b;

final class ax implements Runnable {
    public final /* synthetic */ aw f14264a;

    ax(aw awVar) {
        this.f14264a = awVar;
    }

    public final void run() {
        int i = 0;
        if (!this.f14264a.bl) {
            this.f14264a.aR = false;
            aw awVar = this.f14264a;
            int size = awVar.as.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2597a c2597a = (C2597a) awVar.as.get(i2);
                if (!c2597a.f13820a.isEmpty() && c2597a.f13820a.get(0) != null && (c2597a instanceof gn)) {
                    ((gn) c2597a).mo3028a();
                    break;
                }
            }
            while (i < this.f14264a.ar.size()) {
                C2598b c2598b = (C2598b) this.f14264a.ar.get(i);
                if (this.f14264a.mo3044b(c2598b) && !this.f14264a.as.contains(c2598b)) {
                    this.f14264a.m13898c(c2598b);
                }
                i++;
            }
        }
    }
}
