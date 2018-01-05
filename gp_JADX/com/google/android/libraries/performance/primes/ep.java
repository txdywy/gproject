package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import com.google.android.libraries.performance.primes.p340g.C5999b;
import com.google.android.libraries.performance.primes.p340g.p341a.C6000d;
import d.a.a.a.a.a.bp;

public class ep extends C5949a implements C5993q {
    public static volatile ep f30042e;
    public static volatile C5999b f30043f;
    public final C6018r f30044g;

    static C5999b m27849d() {
        if (f30043f == null) {
            synchronized (ep.class) {
                if (f30043f == null) {
                    f30043f = new C6000d();
                }
            }
        }
        return f30043f;
    }

    public static ep m27848a(C5984a c5984a, Application application, eo eoVar) {
        if (f30042e == null) {
            synchronized (ep.class) {
                if (f30042e == null) {
                    f30042e = new ep(c5984a, application, eoVar);
                }
            }
        }
        return f30042e;
    }

    private ep(C5984a c5984a, Application application, eo eoVar) {
        super(c5984a, application, eoVar, bv.SAME_THREAD);
        this.f30044g = C6018r.m27894a(application);
        this.f30044g.m27896a((C5950g) this);
    }

    public final void mo5256a(int i) {
        if (m27849d().mo5259b() && i != 5) {
            bp a = m27849d().mo5257a();
            if (a != null) {
                m27577a(a);
            }
        }
    }

    final void mo5222c() {
        this.f30044g.m27897b((C5950g) this);
    }
}
