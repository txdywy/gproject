package com.google.android.finsky.uninstall;

import android.support.v7.p045f.C0447d;
import com.google.android.finsky.dfemodel.Document;
import java.util.List;

public final class bf extends C0447d {
    public List f23548a;
    public List f23549b;
    public final /* synthetic */ bd f23550c;

    public bf(bd bdVar, List list, List list2) {
        this.f23550c = bdVar;
        this.f23548a = list;
        this.f23549b = list2;
    }

    public final int mo3283a() {
        if (this.f23548a == null) {
            return 0;
        }
        return this.f23548a.size() + this.f23550c.m21362d();
    }

    public final int mo3285b() {
        if (this.f23549b == null) {
            return 0;
        }
        return this.f23549b.size() + this.f23550c.m21362d();
    }

    public final boolean mo3284a(int i, int i2) {
        if (this.f23550c.mo1040a(i) == 0 && this.f23550c.mo1040a(i2) == 0) {
            return ((Document) this.f23548a.get(i - this.f23550c.m21362d())).cf().equals(((Document) this.f23549b.get(i2 - this.f23550c.m21362d())).cf());
        }
        if (this.f23550c.mo1040a(i) == 3 && this.f23550c.mo1040a(i2) == 3) {
            return true;
        }
        if (this.f23550c.mo1040a(i) == 2 && this.f23550c.mo1040a(i2) == 2) {
            return true;
        }
        if (this.f23550c.mo1040a(i) == 1 && this.f23550c.mo1040a(i2) == 1) {
            return true;
        }
        return false;
    }

    public final boolean mo3286b(int i, int i2) {
        if (this.f23550c.mo1040a(i) == 3 || this.f23550c.mo1040a(i) == 2 || this.f23550c.mo1040a(i2) == 3 || this.f23550c.mo1040a(i2) == 2) {
            return true;
        }
        return false;
    }
}
