package com.google.android.finsky.family.remoteescalation;

import android.support.v7.p045f.C0447d;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import java.util.ArrayList;
import java.util.List;

final class C3095m extends C0447d {
    public final List f16027a;
    public final int f16028b;
    public final /* synthetic */ C3087j f16029c;

    public C3095m(C3087j c3087j, List list, int i) {
        this.f16029c = c3087j;
        this.f16027a = new ArrayList(list);
        this.f16028b = i;
    }

    public final int mo3283a() {
        return this.f16028b;
    }

    public final int mo3285b() {
        return this.f16029c.mo1508a();
    }

    public final boolean mo3284a(int i, int i2) {
        boolean z;
        if (!(i == 0)) {
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int a = this.f16029c.mo1508a();
                boolean a2 = C3087j.m15817a(this.f16028b, this.f16027a.size(), i);
                z = C3087j.m15817a(a, this.f16029c.f16016h.size(), i2);
                if (!a2 && !z) {
                    return ((ac) this.f16027a.get(i - 1)).k.equals(((ac) this.f16029c.f16016h.get(i2 - 1)).k);
                } else if (a2 && z) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean mo3286b(int i, int i2) {
        if (C3087j.m15817a(this.f16029c.mo1508a(), this.f16029c.f16016h.size(), i2)) {
            return false;
        }
        return true;
    }
}
