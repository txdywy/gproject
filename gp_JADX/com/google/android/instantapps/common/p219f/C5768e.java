package com.google.android.instantapps.common.p219f;

import android.support.v7.widget.eo;

final class C5768e extends eo {
    public final C5766c f29172a;
    public final C3472a f29173b;
    public final int f29174c;
    public int f29175d;
    public int f29176e;

    C5768e(C5766c c5766c, C3472a c3472a, int i, int i2) {
        this.f29172a = c5766c;
        this.f29173b = c3472a;
        this.f29174c = i;
        this.f29175d = i2;
        this.f29176e = c3472a.mo1039a();
    }

    public final void mo872a() {
        int a = this.f29173b.mo1039a();
        int i = this.f29176e;
        m27154a(a);
        int min = Math.min(i, a);
        if (min < i) {
            this.f29172a.m3634d(this.f29175d + min, i - min);
        }
        if (min < a) {
            this.f29172a.m3632c(this.f29175d + min, a - min);
        }
        if (min > 0) {
            this.f29172a.m3619a(this.f29175d, min);
        }
    }

    public final void mo1044a(int i, int i2) {
        this.f29172a.m3619a(this.f29175d + i, i2);
    }

    public final void mo875b(int i, int i2) {
        m27154a(this.f29176e + i2);
        this.f29172a.m3632c(this.f29175d + i, i2);
    }

    public final void mo873a(int i, int i2, int i3) {
        throw new UnsupportedOperationException("ParentAdapter doesn't support move yet");
    }

    public final void mo876c(int i, int i2) {
        m27154a(this.f29176e - i2);
        this.f29172a.m3634d(this.f29175d + i, i2);
    }

    private final void m27154a(int i) {
        if (this.f29176e != i) {
            this.f29176e = i;
            int i2 = this.f29176e + this.f29175d;
            int size = this.f29172a.f29169c.size();
            int i3 = i2;
            for (i2 = this.f29174c + 1; i2 < size; i2++) {
                C5768e c5768e = (C5768e) this.f29172a.f29169c.get(i2);
                c5768e.f29175d = i3;
                i3 += c5768e.f29176e;
            }
        }
    }
}
