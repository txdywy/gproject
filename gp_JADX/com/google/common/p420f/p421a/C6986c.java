package com.google.common.p420f.p421a;

final class C6986c {
    public static final C6986c f34414a;
    public static final C6986c f34415b;
    public final boolean f34416c;
    public final Throwable f34417d;

    C6986c(boolean z, Throwable th) {
        this.f34416c = z;
        this.f34417d = th;
    }

    static {
        if (C6977a.f34371a) {
            f34415b = null;
            f34414a = null;
            return;
        }
        f34415b = new C6986c(false, null);
        f34414a = new C6986c(true, null);
    }
}
