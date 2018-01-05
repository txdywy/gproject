package com.google.android.finsky.notification.impl;

import com.google.android.finsky.notification.C3667j;

final class C3787b implements Runnable {
    public final /* synthetic */ C3786a f19042a;

    C3787b(C3786a c3786a) {
        this.f19042a = c3786a;
    }

    public final void run() {
        for (C3667j a : this.f19042a.f19007c) {
            a.mo3577a(this.f19042a.mo3756a());
        }
    }
}
