package com.google.android.finsky.wear;

import android.os.Handler;

final class ao implements Runnable {
    public final /* synthetic */ C4780a f24812a;
    public final /* synthetic */ Handler f24813b;
    public final /* synthetic */ ak f24814c;

    ao(ak akVar, C4780a c4780a, Handler handler) {
        this.f24814c = akVar;
        this.f24812a = c4780a;
        this.f24813b = handler;
    }

    public final void run() {
        this.f24812a.mo4386b();
        int size = this.f24814c.f24800j.size();
        for (int i = 0; i < size; i++) {
            this.f24813b.post((Runnable) this.f24814c.f24800j.get(i));
        }
        this.f24814c.f24800j.clear();
        this.f24814c.f24799i = true;
    }
}
