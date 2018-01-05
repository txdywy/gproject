package com.google.android.finsky.bu.p168a;

import com.google.android.finsky.bu.C2188c;

final class C2185c implements Runnable {
    public final /* synthetic */ C2183a f10971a;

    C2185c(C2183a c2183a) {
        this.f10971a = c2183a;
    }

    public final void run() {
        synchronized (this.f10971a.f10959c) {
            for (int i = 0; i < this.f10971a.f10959c.size(); i++) {
                ((C2188c) this.f10971a.f10959c.get(i)).m11478a();
            }
        }
    }
}
