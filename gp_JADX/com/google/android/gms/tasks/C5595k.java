package com.google.android.gms.tasks;

final class C5595k implements Runnable {
    public /* synthetic */ C5587d f28513a;
    public /* synthetic */ C5594j f28514b;

    C5595k(C5594j c5594j, C5587d c5587d) {
        this.f28514b = c5594j;
        this.f28513a = c5587d;
    }

    public final void run() {
        synchronized (this.f28514b.f28511b) {
            if (this.f28514b.f28512c != null) {
                this.f28514b.f28512c.mo4375a(this.f28513a);
            }
        }
    }
}
