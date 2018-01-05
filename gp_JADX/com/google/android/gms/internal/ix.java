package com.google.android.gms.internal;

final class ix implements Runnable {
    public /* synthetic */ gu f27032a;
    public /* synthetic */ iu f27033b;

    ix(iu iuVar, gu guVar) {
        this.f27033b = iuVar;
        this.f27032a = guVar;
    }

    public final void run() {
        synchronized (this.f27033b) {
            this.f27033b.f27025a = false;
            if (!this.f27033b.f27027c.m24847t()) {
                this.f27033b.f27027c.mo4742p().f26850i.m24652a("Connected to remote service");
                this.f27033b.f27027c.m24825a(this.f27032a);
            }
        }
    }
}
