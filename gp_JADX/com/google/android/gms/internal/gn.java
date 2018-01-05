package com.google.android.gms.internal;

import android.os.Looper;

final class gn implements Runnable {
    public /* synthetic */ gm f26791a;

    gn(gm gmVar) {
        this.f26791a = gmVar;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f26791a.f26787a.m24762e().m24733a((Runnable) this);
            return;
        }
        boolean b = this.f26791a.m24503b();
        this.f26791a.f26789d = 0;
        if (b && this.f26791a.f26790e) {
            this.f26791a.mo4763a();
        }
    }
}
