package com.google.android.gms.tasks;

final class C5599o implements Runnable {
    public /* synthetic */ C5587d f28523a;
    public /* synthetic */ C5598n f28524b;

    C5599o(C5598n c5598n, C5587d c5587d) {
        this.f28524b = c5598n;
        this.f28523a = c5587d;
    }

    public final void run() {
        synchronized (this.f28524b.f28521b) {
            if (this.f28524b.f28522c != null) {
                C5586c c5586c = this.f28524b.f28522c;
                this.f28523a.mo5061c();
                c5586c.mo5053b();
            }
        }
    }
}
