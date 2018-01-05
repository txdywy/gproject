package com.google.android.gms.tasks;

final class C5597m implements Runnable {
    public /* synthetic */ C5587d f28518a;
    public /* synthetic */ C5596l f28519b;

    C5597m(C5596l c5596l, C5587d c5587d) {
        this.f28519b = c5596l;
        this.f28518a = c5587d;
    }

    public final void run() {
        synchronized (this.f28519b.f28516b) {
            if (this.f28519b.f28517c != null) {
                C5585b c5585b = this.f28519b.f28517c;
                this.f28518a.mo5062d();
                c5585b.mo5052a();
            }
        }
    }
}
