package com.google.android.finsky.dfemodel;

import com.android.volley.AuthFailureError;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import java.util.ArrayList;
import java.util.List;

public class C2728s extends C2335k implements C1031w {
    public final List f14946a = new ArrayList();
    public VolleyError f14947b;
    public final boolean f14948c;

    public C2728s(boolean z) {
        this.f14948c = z;
    }

    public final void m14759a(C1254c c1254c, List list, boolean z) {
        C2335k c2718h = new C2718h(c1254c, list, z);
        c2718h.m11918a((C1031w) this);
        c2718h.m11917a((C0657w) this);
        this.f14946a.add(c2718h);
    }

    public final boolean mo2861a() {
        if (this.f14948c) {
            int i = 0;
            for (C2718h c2718h : this.f14946a) {
                if (c2718h.mo2861a()) {
                    i++;
                } else if (!(c2718h.mo3127g() instanceof AuthFailureError)) {
                    return false;
                }
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
        for (C2718h c2718h2 : this.f14946a) {
            if (!c2718h2.mo2861a()) {
                return false;
            }
        }
        return true;
    }

    public final void m_() {
        if (mo2861a()) {
            m14757b();
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f14947b == null) {
            if (!this.f14948c || !(volleyError instanceof AuthFailureError)) {
                m11920b(volleyError);
                this.f14947b = volleyError;
            } else if (mo2861a()) {
                m14757b();
            } else {
                int i = 0;
                for (C2718h c2718h : this.f14946a) {
                    int i2;
                    int i3;
                    if (c2718h.mo2861a()) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    if (((c2718h.mo3127g() instanceof AuthFailureError) & i2) != 0) {
                        i3 = i + 1;
                    } else {
                        i3 = i;
                    }
                    i = i3;
                }
                if (i == this.f14946a.size()) {
                    m11920b(volleyError);
                    this.f14947b = volleyError;
                }
            }
        }
    }

    public void mo3191a(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public final VolleyError mo3127g() {
        throw new UnsupportedOperationException();
    }

    public final boolean mo3128h() {
        throw new UnsupportedOperationException();
    }

    protected final void mo3129i() {
        throw new UnsupportedOperationException();
    }

    private final void m14757b() {
        mo3191a(new C2729t(this));
    }
}
