package com.google.common.p415b;

import com.google.common.p414a.C6937m;

final class by extends at {
    public static final at f34321c = new by(new Object[0], 0);
    public final transient Object[] f34322d;
    public final transient int f34323e;

    by(Object[] objArr, int i) {
        this.f34322d = objArr;
        this.f34323e = i;
    }

    public final int size() {
        return this.f34323e;
    }

    final boolean mo5890c() {
        return false;
    }

    final int mo5885a(Object[] objArr, int i) {
        System.arraycopy(this.f34322d, 0, objArr, 0, this.f34323e);
        return this.f34323e + 0;
    }

    public final Object get(int i) {
        C6937m.m31622a(i, this.f34323e);
        return this.f34322d[i];
    }
}
