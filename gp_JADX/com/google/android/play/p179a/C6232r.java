package com.google.android.play.p179a;

import com.google.android.play.p179a.p352a.al;
import com.google.android.play.p179a.p352a.ao;
import com.google.android.play.p179a.p352a.ap;

public class C6232r {
    public static final String f31210a = C6232r.class.getSimpleName();
    public static C6232r f31211b = null;
    public final C6233s f31212c = new C6233s(ap.class, 60);
    public final C6233s f31213d = new C6233s(al.class, 50);
    public final C6233s f31214e = new C6233s(ao.class, 60);
    public final C6233s f31215f = new C6233s(C6231q.class, 60);

    public static synchronized C6232r m28732a() {
        C6232r c6232r;
        synchronized (C6232r.class) {
            if (f31211b == null) {
                f31211b = new C6232r();
            }
            c6232r = f31211b;
        }
        return c6232r;
    }

    private C6232r() {
    }

    public final void m28733a(ap apVar) {
        al[] alVarArr = apVar.f30852h;
        for (al alVar : alVarArr) {
            alVar.m28576c();
            this.f31213d.m28736a(alVar);
        }
        apVar.m28596c();
        ao aoVar = apVar.f30862r;
        if (aoVar != null) {
            aoVar.m28584a();
            this.f31214e.m28736a(aoVar);
        }
        this.f31212c.m28736a(apVar);
    }

    public final ao m28734b() {
        return (ao) this.f31214e.m28735a();
    }
}
