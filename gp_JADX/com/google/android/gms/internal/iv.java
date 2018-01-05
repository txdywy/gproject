package com.google.android.gms.internal;

final class iv implements Runnable {
    public /* synthetic */ gu f27028a;
    public /* synthetic */ iu f27029b;

    iv(iu iuVar, gu guVar) {
        this.f27029b = iuVar;
        this.f27028a = guVar;
    }

    public final void run() {
        synchronized (this.f27029b) {
            this.f27029b.f27025a = false;
            if (!this.f27029b.f27027c.m24847t()) {
                this.f27029b.f27027c.mo4742p().f26851j.m24652a("Connected to service");
                this.f27029b.f27027c.m24825a(this.f27028a);
            }
        }
    }
}
