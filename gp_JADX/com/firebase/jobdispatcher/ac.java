package com.firebase.jobdispatcher;

final class ac implements Runnable {
    public final /* synthetic */ C0751z f4652a;
    public final /* synthetic */ aa f4653b;

    ac(aa aaVar, C0751z c0751z) {
        this.f4653b = aaVar;
        this.f4652a = c0751z;
    }

    public final void run() {
        synchronized (this.f4653b.f4649b) {
            if (!this.f4653b.mo3884a(this.f4652a)) {
                ae aeVar = (ae) this.f4653b.f4649b.remove(this.f4652a.mo1122e());
                if (aeVar != null) {
                    aeVar.m4818a(0);
                }
            }
        }
    }
}
