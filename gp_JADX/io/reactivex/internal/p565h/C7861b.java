package io.reactivex.internal.p565h;

import org.p561a.C7820a;

public final class C7861b extends C7860a {
    public final C7820a f40459a;
    public Object f40460b;

    public C7861b(C7820a c7820a) {
        this.f40459a = c7820a;
    }

    public final void mo6566a() {
        if (C7862c.m37732b()) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            Object obj = this.f40460b;
                            if (obj != null) {
                                this.f40460b = null;
                                C7820a c7820a = this.f40459a;
                                c7820a.mo6554a(obj);
                                if (get() != 4) {
                                    c7820a.mo6557b();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void m37726b(Object obj) {
        C7820a c7820a;
        int i = get();
        while (i != 8) {
            if ((i & -3) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                c7820a = this.f40459a;
                c7820a.mo6554a(obj);
                if (get() != 4) {
                    c7820a.mo6557b();
                    return;
                }
                return;
            }
            this.f40460b = obj;
            if (!compareAndSet(0, 1)) {
                i = get();
                if (i == 4) {
                    this.f40460b = null;
                    return;
                }
            }
            return;
        }
        this.f40460b = obj;
        lazySet(16);
        c7820a = this.f40459a;
        c7820a.mo6554a(obj);
        if (get() != 4) {
            c7820a.mo6557b();
        }
    }

    public final int mo6541e() {
        lazySet(8);
        return 2;
    }

    public final Object mo6538b() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.f40460b;
        this.f40460b = null;
        return obj;
    }

    public final boolean mo6539c() {
        return get() != 16;
    }

    public final void mo6540d() {
        lazySet(32);
        this.f40460b = null;
    }

    public final void mo6567f() {
        set(4);
        this.f40460b = null;
    }
}
