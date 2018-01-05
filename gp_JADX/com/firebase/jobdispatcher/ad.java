package com.firebase.jobdispatcher;

final class ad implements Runnable {
    public final /* synthetic */ boolean f4654a;
    public final /* synthetic */ ae f4655b;
    public final /* synthetic */ aa f4656c;

    ad(aa aaVar, boolean z, ae aeVar) {
        this.f4656c = aaVar;
        this.f4654a = z;
        this.f4655b = aeVar;
    }

    public final void run() {
        this.f4656c.mo3883a();
        if (this.f4654a) {
            this.f4655b.m4818a(0);
        }
    }
}
