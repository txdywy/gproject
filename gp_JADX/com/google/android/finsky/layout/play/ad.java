package com.google.android.finsky.layout.play;

import com.squareup.haha.perflib.HprofParser;

final class ad implements Runnable {
    public final /* synthetic */ FinskyDrawerLayout f18758a;

    ad(FinskyDrawerLayout finskyDrawerLayout) {
        this.f18758a = finskyDrawerLayout;
    }

    public final void run() {
        this.f18758a.m17537b((int) HprofParser.ROOT_VM_INTERNAL);
        this.f18758a.f18667P.mo3721x();
        this.f18758a.f18667P.mo3647a(this.f18758a.f18673V, this.f18758a.ad, 1);
    }
}
