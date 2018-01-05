package io.reactivex.internal.p558d;

import io.reactivex.C7789g;
import io.reactivex.exceptions.C7788d;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.p552a.C7791b;
import io.reactivex.p551b.C7756b;
import io.reactivex.p553c.C7766a;
import io.reactivex.p553c.C7769d;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.atomic.AtomicReference;

public final class C7816c extends AtomicReference implements C7756b, C7789g {
    public final C7769d f40325a;
    public final C7769d f40326b;
    public final C7766a f40327c;
    public final C7769d f40328d;

    public C7816c(C7769d c7769d, C7769d c7769d2, C7766a c7766a, C7769d c7769d3) {
        this.f40325a = c7769d;
        this.f40326b = c7769d2;
        this.f40327c = c7766a;
        this.f40328d = c7769d3;
    }

    public final void mo6548a(C7756b c7756b) {
        if (C7791b.m37586a((AtomicReference) this, c7756b)) {
            try {
                this.f40328d.mo6543a(this);
            } catch (Throwable th) {
                C7788d.m37579a(th);
                c7756b.mo6530a();
                mo6549a(th);
            }
        }
    }

    public final void c_(Object obj) {
        if (!m37624b()) {
            try {
                this.f40325a.mo6543a(obj);
            } catch (Throwable th) {
                Throwable th2 = th;
                C7788d.m37579a(th2);
                ((C7756b) get()).mo6530a();
                mo6549a(th2);
            }
        }
    }

    public final void mo6549a(Throwable th) {
        if (!m37624b()) {
            lazySet(C7791b.f40312a);
            try {
                this.f40326b.mo6543a(th);
            } catch (Throwable th2) {
                C7788d.m37579a(th2);
                C7773a.m37567a(new CompositeException(th, th2));
            }
        }
    }

    public final void cZ_() {
        if (!m37624b()) {
            lazySet(C7791b.f40312a);
            try {
                this.f40327c.mo6542a();
            } catch (Throwable th) {
                C7788d.m37579a(th);
                C7773a.m37567a(th);
            }
        }
    }

    public final void mo6530a() {
        C7791b.m37585a((AtomicReference) this);
    }

    private final boolean m37624b() {
        return get() == C7791b.f40312a;
    }
}
