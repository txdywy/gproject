package com.google.android.finsky.cn;

import java.util.Arrays;

public final class C2322b {
    public final String f11416a;
    public final String[] f11417b;
    public final String[] f11418c;
    public final int f11419d;
    public final int f11420e;
    public final long f11421f;
    public final boolean f11422g;
    public final boolean f11423h;
    public final boolean f11424i;
    public final boolean f11425j;
    public final boolean f11426k;
    public final int f11427l;
    public final int f11428m;
    public final boolean f11429n;
    public final String[] f11430o;

    public C2322b(String str, String[] strArr, String[] strArr2, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, int i4) {
        this(str, strArr, strArr2, z, z2, z3, z4, i, i2, 0, false, i3, i4, false, null);
    }

    public C2322b(String str, String[] strArr, String[] strArr2, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, long j, boolean z5, int i3, int i4, boolean z6, String[] strArr3) {
        this.f11416a = str;
        this.f11417b = strArr;
        this.f11418c = strArr2;
        this.f11422g = z;
        this.f11423h = z2;
        this.f11424i = z3;
        this.f11425j = z4;
        this.f11419d = i;
        this.f11420e = i2;
        this.f11421f = j;
        this.f11426k = z5;
        this.f11427l = i3;
        this.f11428m = i4;
        this.f11429n = z6;
        this.f11430o = strArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2322b)) {
            return false;
        }
        C2322b c2322b = (C2322b) obj;
        if (this.f11419d != c2322b.f11419d) {
            return false;
        }
        if (this.f11420e != c2322b.f11420e) {
            return false;
        }
        if (this.f11421f != c2322b.f11421f) {
            return false;
        }
        if (this.f11426k != c2322b.f11426k) {
            return false;
        }
        if (this.f11424i != c2322b.f11424i) {
            return false;
        }
        if (this.f11425j != c2322b.f11425j) {
            return false;
        }
        if (this.f11422g != c2322b.f11422g) {
            return false;
        }
        if (this.f11423h != c2322b.f11423h) {
            return false;
        }
        if (this.f11427l != c2322b.f11427l) {
            return false;
        }
        if (this.f11428m != c2322b.f11428m) {
            return false;
        }
        if (!Arrays.equals(this.f11417b, c2322b.f11417b)) {
            return false;
        }
        if (!Arrays.equals(this.f11418c, c2322b.f11418c)) {
            return false;
        }
        if (this.f11416a == null ? c2322b.f11416a != null : !this.f11416a.equals(c2322b.f11416a)) {
            return false;
        }
        if (this.f11429n != c2322b.f11429n) {
            return false;
        }
        if (Arrays.equals(this.f11430o, c2322b.f11430o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1;
        int i2 = 0;
        int hashCode2 = (this.f11416a != null ? this.f11416a.hashCode() : 0) * 31;
        if (this.f11417b != null) {
            hashCode = Arrays.hashCode(this.f11417b);
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f11418c != null) {
            hashCode = Arrays.hashCode(this.f11418c);
        } else {
            hashCode = 0;
        }
        hashCode2 = (((((((((((((hashCode + hashCode2) * 31) + this.f11419d) * 31) + this.f11420e) * 31) + ((int) (this.f11421f >> 32))) * 31) + ((int) (this.f11421f & 65535))) * 31) + this.f11427l) * 31) + this.f11428m) * 31;
        if (this.f11422g) {
            hashCode = 1;
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f11423h) {
            hashCode = 1;
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f11424i) {
            hashCode = 1;
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f11425j) {
            hashCode = 1;
        } else {
            hashCode = 0;
        }
        hashCode2 = (hashCode + hashCode2) * 31;
        if (this.f11426k) {
            hashCode = 1;
        } else {
            hashCode = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        if (!this.f11429n) {
            i = 0;
        }
        hashCode = (hashCode + i) * 31;
        if (this.f11430o != null) {
            i2 = Arrays.hashCode(this.f11430o);
        }
        return hashCode + i2;
    }

    public final String toString() {
        return String.format("(packageName=%s,installedVersion=%d,installedDerivedApkId=%d,installedFrostingId=%d,isSystemApp=%s,certificateHashes=%s,certificateMD5Hashes=%s,isAppDebuggable=%s,splitNames=%s)", new Object[]{this.f11416a, Integer.valueOf(this.f11419d), Integer.valueOf(this.f11420e), Long.valueOf(this.f11421f), Boolean.valueOf(this.f11422g), Arrays.deepToString(this.f11417b), Arrays.deepToString(this.f11418c), Boolean.valueOf(this.f11429n), Arrays.deepToString(this.f11430o)});
    }
}
