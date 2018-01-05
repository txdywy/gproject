package com.google.android.libraries.play.entertainment.p344d;

import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.concurrent.Executor;

public abstract class C6056i implements C6055u {
    public static final C6090b f30180b = C6090b.m28050a();
    public final Object f30181c = new Object();
    public int f30182d;
    public boolean f30183e;
    public C6048p f30184f;
    public Executor f30185g;

    protected abstract C6061h mo5271a();

    public final void mo5270c() {
        Object obj = 1;
        synchronized (this.f30181c) {
            if (mo5269b()) {
                obj = null;
            } else {
                this.f30182d = 1;
            }
        }
        if (obj != null) {
            mo5273d();
        }
    }

    public final boolean mo5269b() {
        boolean z = true;
        synchronized (this.f30181c) {
            if (this.f30182d != 1) {
                z = false;
            }
        }
        return z;
    }

    protected void mo5273d() {
    }

    public final void m27965a(C6063v c6063v, Executor executor, C6048p c6048p) {
        synchronized (this.f30181c) {
            if (this.f30183e) {
                throw new IllegalStateException("Pending already owned");
            }
            this.f30183e = true;
            c6063v.mo5272a(this);
            this.f30185g = (Executor) C6116b.m28100a((Object) executor);
            this.f30184f = (C6048p) C6116b.m28100a((Object) c6048p);
            boolean g = m27961g();
        }
        if (g) {
            m27960f();
        }
    }

    public final C6056i m27964a(Executor executor, C6038t c6038t) {
        C6063v a = C6056i.m27959a(c6038t);
        m27965a(a, executor, (C6048p) a);
        return a;
    }

    private static C6064n m27959a(C6038t c6038t) {
        return new C6065j(c6038t);
    }

    public static C6056i m27958a(Executor executor, Object obj, C6038t c6038t) {
        C6061h a = C6061h.m27972a(obj);
        C6056i a2 = C6056i.m27959a(c6038t);
        executor.execute(new C6066k(a2, a));
        return a2;
    }

    public final C6056i m27963a(C6041o c6041o) {
        C6063v c6067l = new C6067l(c6041o);
        m27965a(c6067l, C6058e.f30187a, (C6048p) c6067l);
        return c6067l;
    }

    private final void m27960f() {
        if (mo5269b()) {
            f30180b.m28054a("Canceled state; recipient not invoked", new Object[0]);
            return;
        }
        ((Executor) C6116b.m28100a(this.f30185g)).execute(new C6068m(this));
        this.f30185g = null;
    }

    protected final void m27969e() {
        Object obj = 1;
        synchronized (this.f30181c) {
            C6116b.m28103a(this.f30182d != 2);
            if (this.f30184f == null) {
                obj = null;
            }
            if (mo5269b()) {
                mo5271a().m27978e();
            } else {
                this.f30182d = 2;
            }
        }
        if (obj != null) {
            m27960f();
        }
    }

    private final boolean m27961g() {
        boolean z;
        synchronized (this.f30181c) {
            z = this.f30182d == 2;
        }
        return z;
    }
}
