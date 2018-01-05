package com.google.android.finsky.family.remoteescalation;

import android.support.v7.p045f.C0447d;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import java.util.ArrayList;
import java.util.List;

final class C3089e extends C0447d {
    public final List f16018a;
    public final int f16019b;
    public final /* synthetic */ C3088d f16020c;

    public C3089e(C3088d c3088d, List list, int i) {
        this.f16020c = c3088d;
        this.f16018a = new ArrayList(list);
        this.f16019b = i;
    }

    public final int mo3283a() {
        return this.f16019b;
    }

    public final int mo3285b() {
        return this.f16020c.mo1508a();
    }

    public final boolean mo3284a(int i, int i2) {
        return ((ac) this.f16018a.get(i)).k.equals(((ac) this.f16020c.h.get(i2)).k);
    }

    public final boolean mo3286b(int i, int i2) {
        return true;
    }
}
