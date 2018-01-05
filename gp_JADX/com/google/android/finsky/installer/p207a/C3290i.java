package com.google.android.finsky.installer.p207a;

import android.os.ResultReceiver;

final class C3290i implements Runnable {
    public final /* synthetic */ C3296o f17034a;
    public final /* synthetic */ ResultReceiver f17035b;
    public final /* synthetic */ C3289h f17036c;

    C3290i(C3289h c3289h, C3296o c3296o, ResultReceiver resultReceiver) {
        this.f17036c = c3289h;
        this.f17034a = c3296o;
        this.f17035b = resultReceiver;
    }

    public final void run() {
        C3289h c3289h = this.f17036c;
        c3289h.f17032d.mo3404a(new C3292k(c3289h, this.f17034a, this.f17035b));
    }
}
