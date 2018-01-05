package com.google.android.finsky.ea;

import android.support.v4.view.af;
import android.view.ViewGroup;

public abstract class C2962b extends af implements C1069e {
    public C2964d f15605n;

    public abstract Object mo4201b(ViewGroup viewGroup, int i);

    public abstract void mo4202b(ViewGroup viewGroup, int i, Object obj);

    public abstract void mo4204e(int i);

    public final Object mo1372a(ViewGroup viewGroup, int i) {
        Object b = mo4201b(viewGroup, i);
        this.f15605n.m15373c(i);
        return b;
    }

    public final void mo1373a(ViewGroup viewGroup, int i, Object obj) {
        mo4202b(viewGroup, i, obj);
        this.f15605n.m15374d(i);
    }

    public final void mo1374a(C2964d c2964d) {
        this.f15605n = c2964d;
    }

    public final void mo1378d(int i) {
        mo4204e(i);
    }

    public final void mo1382i() {
        this.f15605n = null;
    }
}
