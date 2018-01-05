package com.google.android.play.headerlist;

import android.support.v4.view.bi;

final class C6335a implements bi {
    public final /* synthetic */ PlayHeaderListLayout f31892a;

    C6335a(PlayHeaderListLayout playHeaderListLayout) {
        this.f31892a = playHeaderListLayout;
    }

    public final void d_(int i) {
        if (this.f31892a.ax != null) {
            this.f31892a.ax.d_(i);
        }
        if (i == 0) {
            return;
        }
        if (this.f31892a.ar == 0 || this.f31892a.ar == 2 || this.f31892a.ar == 4) {
            this.f31892a.m29090a(true, true);
        }
    }

    public final void m29116a(int i, float f, int i2) {
        if (this.f31892a.aC != null) {
            int i3 = (f > 0.5f ? 1 : 0) + i;
            boolean z = this.f31892a.f31847W.d;
            C6349o c6349o;
            if (i3 != this.f31892a.aL) {
                this.f31892a.aL = i3;
                c6349o = this.f31892a.aC;
                i3 = this.f31892a.aL;
                throw new NoSuchMethodError();
            }
            c6349o = this.f31892a.aC;
            throw new NoSuchMethodError();
        } else if (this.f31892a.ax != null) {
            this.f31892a.ax.a(i, f, i2);
        }
    }

    public final void m29117b(int i) {
        this.f31892a.m29099g();
        if (this.f31892a.ax != null) {
            this.f31892a.ax.b(i);
        }
    }
}
