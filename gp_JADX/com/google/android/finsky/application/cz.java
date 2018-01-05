package com.google.android.finsky.application;

import com.google.android.finsky.aa.C0955b;

final class cz implements Runnable {
    public final /* synthetic */ C1475d f7979a;

    cz(C1475d c1475d) {
        this.f7979a = c1475d;
    }

    public final void run() {
        if (this.f7979a.dj().mo2294a(12636767) || this.f7979a.dj().mo2294a(12637793)) {
            this.f7979a.dy().postDelayed(new da(this), (long) ((Integer) C0955b.gG.m28964b()).intValue());
        } else {
            this.f7979a.cK().mo3922a(this.f7979a.f7981b);
        }
    }
}
