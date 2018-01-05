package com.google.android.finsky.stream.controllers.assist;

final class C4315g implements Runnable {
    public final /* synthetic */ C4304f f21765a;

    C4315g(C4304f c4304f) {
        this.f21765a = c4304f;
    }

    public final void run() {
        boolean z = this.f21765a.f21751b;
        this.f21765a.f21751b = this.f21765a.mo4113d();
        if (z && !this.f21765a.f21751b) {
            this.f21765a.C.mo4088b(this.f21765a, 0, 2);
        } else if (!z && this.f21765a.f21751b) {
            this.f21765a.C.mo4086a(this.f21765a, 0, 2);
        } else if (z && this.f21765a.f21751b) {
            this.f21765a.C.mo4087a(this.f21765a, 0, 1, false);
        }
    }
}
