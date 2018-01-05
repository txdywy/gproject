package com.google.android.finsky.dfemodel;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import java.util.HashSet;

public abstract class C2335k implements C0657w {
    public VolleyError f11507h;
    public final HashSet f11508i = new HashSet();
    public final HashSet f11509j = new HashSet();

    public abstract boolean mo2861a();

    public final void m11918a(C1031w c1031w) {
        if (!this.f11508i.contains(c1031w)) {
            this.f11508i.add(c1031w);
        }
    }

    public final void m11917a(C0657w c0657w) {
        if (!this.f11509j.contains(c0657w)) {
            this.f11509j.add(c0657w);
        }
    }

    public VolleyError mo3127g() {
        return this.f11507h;
    }

    public boolean mo3128h() {
        return this.f11507h != null;
    }

    public void mo1062a(VolleyError volleyError) {
        this.f11507h = volleyError;
        m11920b(volleyError);
    }

    public final void m11922b(C1031w c1031w) {
        this.f11508i.remove(c1031w);
    }

    public final void m11921b(C0657w c0657w) {
        this.f11509j.remove(c0657w);
    }

    protected void mo3129i() {
        this.f11507h = null;
    }

    public final void m11926j() {
        this.f11508i.clear();
        this.f11509j.clear();
    }

    public final void m11927l() {
        C1031w[] c1031wArr = (C1031w[]) this.f11508i.toArray(new C1031w[this.f11508i.size()]);
        for (C1031w m_ : c1031wArr) {
            m_.m_();
        }
    }

    protected final void m11920b(VolleyError volleyError) {
        C0657w[] c0657wArr = (C0657w[]) this.f11509j.toArray(new C0657w[this.f11509j.size()]);
        for (C0657w a : c0657wArr) {
            a.mo1062a(volleyError);
        }
    }
}
