package com.google.common.flogger.parser;

import com.google.common.flogger.backend.C7054z;
import com.google.common.flogger.p422a.C7003d;
import com.google.common.flogger.p423b.C7011b;

public abstract class C7045e {
    public final C7054z f34550e;
    public int f34551f = 0;
    public int f34552g = -1;

    public C7045e(C7054z c7054z) {
        this.f34550e = (C7054z) C7011b.m31954a(c7054z, "context");
    }

    public abstract void mo5999a(int i, int i2, C7003d c7003d);

    public abstract Object mo6004c();

    public final void m32098b(int i, int i2, C7003d c7003d) {
        if (c7003d.f34444d < 32) {
            this.f34551f |= 1 << c7003d.f34444d;
        }
        this.f34552g = Math.max(this.f34552g, c7003d.f34444d);
        mo5999a(i, i2, c7003d);
    }
}
