package com.google.android.finsky.ia2;

import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1060p;

final class C3232h extends C1060p {
    public final /* synthetic */ C3230f f16635a;

    C3232h(C3230f c3230f, ViewGroup viewGroup) {
        this.f16635a = c3230f;
        super(viewGroup);
    }

    public final void onGlobalLayout() {
        C3230f c3230f = this.f16635a;
        if (c3230f.f16605M) {
            c3230f.f16604L.mo1393b(1738, c3230f.f16601I, c3230f.f16602J, true);
            c3230f.f16603K.mo3382c();
        }
        if (C1473m.f7980a.dj().mo2294a(12636210)) {
            this.f16635a.m16314c(1704);
        } else if (this.f16635a.f16596D.m13357b()) {
            this.f16635a.f16597E.mo1293j(1704);
        }
        super.m6486a();
        if (this.f16635a.f16606N != null) {
            this.f16635a.f16606N.mo1255B();
            this.f16635a.f16606N = null;
        }
    }
}
