package io.reactivex.internal.p559e.p562b;

import io.reactivex.C7757j;
import io.reactivex.C7789g;
import io.reactivex.exceptions.C7788d;
import io.reactivex.internal.p552a.C7791b;
import io.reactivex.internal.p556c.C7792c;
import io.reactivex.internal.p556c.C7794a;
import io.reactivex.internal.p558d.C7813a;
import io.reactivex.internal.p563f.C7832c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;

final class C7826e extends C7813a implements C7789g, Runnable {
    public final C7789g f40345a;
    public final C7757j f40346b;
    public final boolean f40347c;
    public final int f40348d;
    public C7792c f40349e;
    public C7756b f40350f;
    public Throwable f40351g;
    public volatile boolean f40352h;
    public volatile boolean f40353i;
    public int f40354j;
    public boolean f40355k;

    C7826e(C7789g c7789g, C7757j c7757j, boolean z, int i) {
        this.f40345a = c7789g;
        this.f40346b = c7757j;
        this.f40347c = z;
        this.f40348d = i;
    }

    public final void mo6548a(C7756b c7756b) {
        if (C7791b.m37584a(this.f40350f, c7756b)) {
            this.f40350f = c7756b;
            if (c7756b instanceof C7794a) {
                C7794a c7794a = (C7794a) c7756b;
                c7794a.mo6541e();
                this.f40354j = 2;
                this.f40349e = c7794a;
                this.f40345a.mo6548a((C7756b) this);
                return;
            }
            this.f40349e = new C7832c(this.f40348d);
            this.f40345a.mo6548a((C7756b) this);
        }
    }

    public final void c_(Object obj) {
        if (!this.f40352h) {
            if (this.f40354j != 2) {
                this.f40349e.mo6537a(obj);
            }
            m37647f();
        }
    }

    public final void mo6549a(Throwable th) {
        if (this.f40352h) {
            C7773a.m37567a(th);
            return;
        }
        this.f40351g = th;
        this.f40352h = true;
        m37647f();
    }

    public final void cZ_() {
        if (!this.f40352h) {
            this.f40352h = true;
            m37647f();
        }
    }

    public final void mo6530a() {
        if (!this.f40353i) {
            this.f40353i = true;
            this.f40350f.mo6530a();
            this.f40346b.mo6530a();
            if (getAndIncrement() == 0) {
                this.f40349e.mo6540d();
            }
        }
    }

    private final void m37647f() {
        if (getAndIncrement() == 0) {
            this.f40346b.mo6564a((Runnable) this);
        }
    }

    public final void run() {
        int i = 1;
        Throwable th;
        if (this.f40355k) {
            while (!this.f40353i) {
                boolean z = this.f40352h;
                Throwable th2 = this.f40351g;
                if (this.f40347c || !z || th2 == null) {
                    this.f40345a.c_(null);
                    if (z) {
                        th = this.f40351g;
                        if (th != null) {
                            this.f40345a.mo6549a(th);
                        } else {
                            this.f40345a.cZ_();
                        }
                        this.f40346b.mo6530a();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                this.f40345a.mo6549a(this.f40351g);
                this.f40346b.mo6530a();
                return;
            }
            return;
        }
        C7792c c7792c = this.f40349e;
        C7789g c7789g = this.f40345a;
        int i2 = 1;
        while (!m37646a(this.f40352h, c7792c.mo6539c(), c7789g)) {
            while (true) {
                boolean z2 = this.f40352h;
                try {
                    Object b = c7792c.mo6538b();
                    boolean z3 = b == null;
                    if (!m37646a(z2, z3, c7789g)) {
                        if (z3) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        }
                        c7789g.c_(b);
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    C7788d.m37579a(th3);
                    this.f40350f.mo6530a();
                    c7792c.mo6540d();
                    c7789g.mo6549a(th3);
                    this.f40346b.mo6530a();
                    return;
                }
            }
        }
    }

    private final boolean m37646a(boolean z, boolean z2, C7789g c7789g) {
        if (this.f40353i) {
            this.f40349e.mo6540d();
            return true;
        }
        if (z) {
            Throwable th = this.f40351g;
            if (this.f40347c) {
                if (z2) {
                    if (th != null) {
                        c7789g.mo6549a(th);
                    } else {
                        c7789g.cZ_();
                    }
                    this.f40346b.mo6530a();
                    return true;
                }
            } else if (th != null) {
                this.f40349e.mo6540d();
                c7789g.mo6549a(th);
                this.f40346b.mo6530a();
                return true;
            } else if (z2) {
                c7789g.cZ_();
                this.f40346b.mo6530a();
                return true;
            }
        }
        return false;
    }

    public final int mo6541e() {
        this.f40355k = true;
        return 2;
    }

    public final Object mo6538b() {
        return this.f40349e.mo6538b();
    }

    public final void mo6540d() {
        this.f40349e.mo6540d();
    }

    public final boolean mo6539c() {
        return this.f40349e.mo6539c();
    }
}
