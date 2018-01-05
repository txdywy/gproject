package com.google.vr.p482b.p483a;

import com.google.vr.p482b.p483a.p484a.C7260j;

public final class C7264d extends C7260j {
    public final /* synthetic */ Runnable f35530a;
    public final /* synthetic */ Runnable f35531b;

    public C7264d(Runnable runnable, Runnable runnable2) {
        this.f35530a = runnable;
        this.f35531b = runnable2;
    }

    public final void mo6360a(int i) {
        if (i == 2) {
            C7263c.f35528a.post(this.f35530a);
        } else {
            C7263c.f35528a.post(this.f35531b);
        }
    }
}
