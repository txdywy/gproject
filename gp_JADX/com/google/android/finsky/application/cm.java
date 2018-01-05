package com.google.android.finsky.application;

import com.google.android.finsky.cg.C2277d;
import com.google.android.play.utils.p146c.C1458e;
import com.google.android.play.utils.p354b.C6322j;

final class cm implements C1458e {
    public final /* synthetic */ C1475d f7966a;

    cm(C1475d c1475d) {
        this.f7966a = c1475d;
    }

    public final int mo2011a() {
        C2277d c2277d = this.f7966a.aO;
        if (((Boolean) C6322j.f31571A.m28964b()).booleanValue()) {
            return C2277d.m11740a();
        }
        int i = C2277d.f11278a;
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }
}
