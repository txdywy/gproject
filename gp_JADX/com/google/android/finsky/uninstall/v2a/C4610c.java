package com.google.android.finsky.uninstall.v2a;

import android.content.Context;
import com.google.android.finsky.dfemodel.C1031w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class C4610c implements ak {
    public static final ArrayList f23741a = new ArrayList();
    public List f23742b = null;
    public HashSet f23743c = new HashSet();
    public Context f23744d;
    public boolean f23745e = false;

    C4610c(Context context) {
        this.f23744d = context;
    }

    public final long mo4299a() {
        return -1;
    }

    public final long mo4302b() {
        return -1;
    }

    public final List mo4304c() {
        return this.f23742b;
    }

    public final ArrayList mo4305d() {
        return f23741a;
    }

    public final boolean mo4306e() {
        return this.f23745e;
    }

    public final void mo4301a(al alVar) {
    }

    public final void mo4300a(C1031w c1031w) {
        if (!this.f23743c.contains(c1031w)) {
            this.f23743c.add(c1031w);
        }
    }

    public final void mo4303b(C1031w c1031w) {
        this.f23743c.remove(c1031w);
    }

    final void m21521a(List list) {
        this.f23742b = list;
        this.f23745e = true;
        for (C1031w m_ : (C1031w[]) this.f23743c.toArray(new C1031w[this.f23743c.size()])) {
            m_.m_();
        }
    }

    public final void mo4307f() {
        this.f23745e = false;
        new C4611d(this).execute(new Object[0]);
    }
}
