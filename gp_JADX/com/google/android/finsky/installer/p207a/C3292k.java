package com.google.android.finsky.installer.p207a;

import android.os.ResultReceiver;

final class C3292k implements Runnable {
    public final /* synthetic */ C3296o f17042a;
    public final /* synthetic */ ResultReceiver f17043b;
    public final /* synthetic */ C3289h f17044c;

    C3292k(C3289h c3289h, C3296o c3296o, ResultReceiver resultReceiver) {
        this.f17044c = c3289h;
        this.f17042a = c3296o;
        this.f17043b = resultReceiver;
    }

    public final void run() {
        synchronized (this.f17044c.f17029a) {
            if (this.f17042a.f17054d) {
                return;
            }
            this.f17044c.m16521a(0, this.f17042a, this.f17043b);
            this.f17042a.f17053c = true;
        }
    }
}
