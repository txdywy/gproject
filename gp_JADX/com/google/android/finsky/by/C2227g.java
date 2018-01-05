package com.google.android.finsky.by;

import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.Document;

public class C2227g {
    public static final String f11100g = null;
    public final String f11101h;
    public String f11102i;
    public int f11103j;
    public String f11104k;
    public int f11105l;
    public int f11106m;
    public final long f11107n;
    public final long f11108o;
    public final boolean f11109p;
    public final boolean f11110q;
    public final String f11111r;
    public final int f11112s;
    public final long f11113t;

    public static C2227g m11633a(String str, String str2, Document document, int i) {
        return new C2227g(str, str2, document.f14885a.f12099f, document.f14885a.f12097d, document.f14885a.f12098e, i);
    }

    public static C2227g m11632a(String str, String str2, ax axVar, int i) {
        return new C2227g(str, str2, axVar.f11835d, axVar.f11833b, axVar.f11834c, i);
    }

    public C2227g(String str, String str2, int i, String str3, int i2, int i3) {
        this(str, str2, i, str3, i2, i3, Long.MIN_VALUE, Long.MAX_VALUE, false, false, null, 0, 0);
    }

    public C2227g(String str, String str2, int i, String str3, int i2, int i3, long j, long j2, boolean z, boolean z2, String str4, int i4, long j3) {
        if (str3 == null) {
            throw new NullPointerException();
        }
        this.f11101h = str;
        this.f11102i = str2;
        this.f11103j = i;
        this.f11104k = str3;
        this.f11105l = i2;
        this.f11106m = i3;
        this.f11107n = j;
        this.f11108o = j2;
        this.f11109p = z;
        this.f11110q = z2;
        this.f11111r = str4;
        this.f11112s = i4;
        this.f11113t = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2227g)) {
            return false;
        }
        C2227g c2227g = (C2227g) obj;
        if (this.f11103j != c2227g.f11103j) {
            return false;
        }
        if (this.f11105l != c2227g.f11105l) {
            return false;
        }
        if (this.f11106m != c2227g.f11106m) {
            return false;
        }
        if (this.f11101h != f11100g && c2227g.f11101h != f11100g && !this.f11101h.equals(c2227g.f11101h)) {
            return false;
        }
        if (!this.f11104k.equals(c2227g.f11104k)) {
            return false;
        }
        if (this.f11102i.equals(c2227g.f11102i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (this.f11102i != null) {
            hashCode = this.f11102i.hashCode();
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + 0) * 31;
        if (this.f11104k != null) {
            i = this.f11104k.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f11105l) * 31) + this.f11106m;
    }
}
