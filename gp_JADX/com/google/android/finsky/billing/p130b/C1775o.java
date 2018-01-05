package com.google.android.finsky.billing.p130b;

import com.google.wireless.android.finsky.a.a.ax;

final class C1775o implements Runnable {
    public final /* synthetic */ ax f9200a;
    public final /* synthetic */ C1774n f9201b;

    C1775o(C1774n c1774n, ax axVar) {
        this.f9201b = c1774n;
        this.f9200a = axVar;
    }

    public final void run() {
        this.f9201b.f9199m = false;
        if (this.f9201b.f9198l != null) {
            this.f9201b.m9718a(this.f9201b.f9198l);
            this.f9201b.f9198l = null;
        }
        if (this.f9200a != null) {
            this.f9201b.f9190d.m9752a(this.f9200a);
        }
    }
}
