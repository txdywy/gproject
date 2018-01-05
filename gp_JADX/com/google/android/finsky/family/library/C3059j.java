package com.google.android.finsky.family.library;

import android.support.v7.p045f.C0447d;
import com.google.android.finsky.dfemodel.Document;
import java.util.List;

final class C3059j extends C0447d {
    public List f15937a;
    public int f15938b;
    public final /* synthetic */ C3058i f15939c;

    C3059j(C3058i c3058i, List list, int i) {
        this.f15939c = c3058i;
        this.f15937a = list;
        this.f15938b = i;
    }

    public final int mo3283a() {
        return this.f15938b;
    }

    public final int mo3285b() {
        return this.f15939c.mo1508a();
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
                return ((Document) this.f15937a.get(i - 1)).f14885a.f12096c.equals(((Document) this.f15939c.f15936h.get(i2 - 1)).f14885a.f12096c);
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
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }
}
