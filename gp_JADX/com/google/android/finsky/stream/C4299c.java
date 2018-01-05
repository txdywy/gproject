package com.google.android.finsky.stream;

import android.support.v7.widget.eo;

final class C4299c extends eo {
    public final /* synthetic */ C4240a f21672a;

    C4299c(C4240a c4240a) {
        this.f21672a = c4240a;
    }

    public final void mo1044a(int i, int i2) {
        super.mo1044a(i, i2);
        this.f21672a.f21453m.mo4087a(this.f21672a.f21456p, this.f21672a.f21443c + i, i2, false);
    }

    public final void mo875b(int i, int i2) {
        super.mo875b(i, i2);
        int i3 = this.f21672a.f21443c + i;
        this.f21672a.f21453m.mo4086a(this.f21672a.f21456p, i3, i2);
        if (i3 > 0) {
            this.f21672a.f21453m.mo4087a(this.f21672a.f21456p, i3 - 1, 1, false);
        }
        if (i3 + i2 < this.f21672a.mo4034a()) {
            this.f21672a.f21453m.mo4087a(this.f21672a.f21456p, i3 + i2, 1, false);
        }
    }

    public final void mo876c(int i, int i2) {
        super.mo876c(i, i2);
        this.f21672a.f21453m.mo4088b(this.f21672a.f21456p, this.f21672a.f21443c + i, i2);
    }

    public final void mo873a(int i, int i2, int i3) {
        super.mo873a(i, i2, i3);
        this.f21672a.f21453m.mo4089c(this.f21672a.f21456p, this.f21672a.f21443c + i, this.f21672a.f21443c + i2);
    }
}
