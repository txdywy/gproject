package com.android.volley;

final class C0694i implements Runnable {
    public final C0656n f4156a;
    public final C0704v f4157b;
    public final Runnable f4158c;

    public C0694i(C0656n c0656n, C0704v c0704v, Runnable runnable) {
        this.f4156a = c0656n;
        this.f4157b = c0704v;
        this.f4158c = runnable;
    }

    public final void run() {
        if (this.f4156a.mo1073g()) {
            this.f4156a.m4368b("canceled-at-delivery");
            return;
        }
        if (this.f4157b.m4518a()) {
            this.f4156a.mo1056a(this.f4157b.f4191a);
        } else {
            this.f4156a.mo1544c(this.f4157b.f4193c);
        }
        if (this.f4157b.f4194d) {
            this.f4156a.m4366a("intermediate-response");
        } else {
            this.f4156a.m4368b("done");
        }
        if (this.f4158c != null) {
            this.f4158c.run();
        }
    }
}
