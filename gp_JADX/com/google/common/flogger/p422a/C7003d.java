package com.google.common.flogger.p422a;

import com.google.common.flogger.backend.C7034b;

public abstract class C7003d {
    public final int f34444d;
    public final C7034b f34445e;

    public C7003d(C7034b c7034b, int i) {
        if (c7034b == null) {
            throw new IllegalArgumentException("format options cannot be null");
        } else if (i < 0) {
            throw new IllegalArgumentException("invalid index: " + i);
        } else {
            this.f34444d = i;
            this.f34445e = c7034b;
        }
    }

    public abstract void mo5956a(C7007e c7007e, Object obj);
}
