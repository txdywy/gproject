package org.chromium.net.impl;

final class ay implements bd {
    public final /* synthetic */ aw f40824a;

    ay(aw awVar) {
        this.f40824a = awVar;
    }

    public final void mo6615a() {
        if (this.f40824a.f40820d.f40780g.compareAndSet(bq.STARTED, bq.AWAITING_READ)) {
            this.f40824a.f40817a.mo6580a(this.f40824a.f40820d, this.f40824a.f40820d.f40790q);
        }
    }
}
