package com.google.android.finsky.bh;

import com.google.android.gms.car.C1629k;

final class C1630d implements C1629k {
    public final /* synthetic */ C1627b f8557a;

    C1630d(C1627b c1627b) {
        this.f8557a = c1627b;
    }

    public final void mo2361a(boolean z) {
        this.f8557a.f8544b = z;
        if (this.f8557a.f8549g.getCount() > 0) {
            new Object[1][0] = Boolean.valueOf(this.f8557a.f8544b);
            this.f8557a.f8549g.countDown();
            synchronized (this.f8557a.f8545c) {
                while (!this.f8557a.f8545c.isEmpty()) {
                    ((Runnable) this.f8557a.f8545c.remove(0)).run();
                }
            }
        }
        this.f8557a.m9311a(z);
    }

    public final void mo2360a() {
    }
}
