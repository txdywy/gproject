package com.google.android.finsky.cn;

import java.util.Arrays;

public final class com.google.android.finsky.cn.b
{

    public final String a;
    public final String[] b;
    public final String[] c;
    public final int d;
    public final int e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final boolean n;
    public final String[] o;

    b(String p0, String[] p1, String[] p2, boolean p3, boolean p4, boolean p5, boolean p6, int p7, int p8, int p9, int p10) {
        com.google.android.finsky.cn.b(p0, p1, p2, p3, p4, p5, p6, p7, p8, 0, 0, p9, p10, 0, 0);
    }

    b(String p0, String[] p1, String[] p2, boolean p3, boolean p4, boolean p5, boolean p6, int p7, int p8, long p9, boolean p11, int p12, int p13, boolean p14, String[] p15) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.g = p3;
        this.h = p4;
        this.i = p5;
        this.j = p6;
        this.d = p7;
        this.e = p8;
        this.f = p9;
        this.k = p11;
        this.l = p12;
        this.m = p13;
        this.n = p14;
        this.o = p15;
    }

    public final boolean equals(Object p0) {
  0:    v0 = 1;
  2:    if (this == p0)
  4:        return v0;
  7:    if (!(p0 instanceof com.google.android.finsky.cn.b)) {
  9:        v0 = 0;
 10:        return v0;
        }
 11:    p0 = (com.google.android.finsky.cn.b)p0;
 17:    if (this.d != p0.d) {
 19:        v0 = 0;
 20:        return v0;
        }
 25:    if (this.e != p0.e) {
 27:        v0 = 0;
 28:        return v0;
        }
 35:    if (this.f != p0.f) {
 37:        v0 = 0;
 38:        return v0;
        }
 43:    if (this.k != p0.k) {
 45:        v0 = 0;
 46:        return v0;
        }
 51:    if (this.i != p0.i) {
 53:        v0 = 0;
 54:        return v0;
        }
 59:    if (this.j != p0.j) {
 61:        v0 = 0;
 62:        return v0;
        }
 67:    if (this.g != p0.g) {
 69:        v0 = 0;
 70:        return v0;
        }
 75:    if (this.h != p0.h) {
 77:        v0 = 0;
 78:        return v0;
        }
 83:    if (this.l != p0.l) {
 85:        v0 = 0;
 86:        return v0;
        }
 91:    if (this.m != p0.m) {
 93:        v0 = 0;
 94:        return v0;
        }
103:    if (!Arrays.equals(this.b, p0.b)) {
105:        v0 = 0;
106:        return v0;
        }
115:    if (!Arrays.equals(this.c, p0.c)) {
117:        v0 = 0;
118:        return v0;
        }
121:    if (this.a == 0) {
138:        if (p0.a != 0) {
133:            v0 = 0;
134:            return v0;
            }
144:        if (this.n != p0.n)
146:            v0 = 0;
157:        else if (!Arrays.equals(this.o, p0.o))
159:            v0 = 0;
147:        return v0;
        }
131:    if (!this.a.equals(p0.a)) {
133:        v0 = 0;
134:        return v0;
        }
132:    goto 140;
138:    if (p0.a != 0) {
133:        v0 = 0;
134:        return v0;
        }
144:    if (this.n != p0.n)
146:        v0 = 0;
157:    else if (!Arrays.equals(this.o, p0.o))
159:        v0 = 0;
147:    return v0;
    }

    public final int hashCode() {
        v2 = 1;
        v1 = 0;
        if (this.a != 0)
            v0 = this.a.hashCode();
        else
            v0 = 0;
        v3 = v0 * 31;
        if (this.b != 0)
            v0 = Arrays.hashCode(this.b);
        else
            v0 = 0;
        v3 = (v0 + v3) * 31;
        if (this.c != 0)
            v0 = Arrays.hashCode(this.c);
        else
            v0 = 0;
        v3 = (((((((v0 + v3) * 31 + this.d) * 31 + this.e) * 31 + (int)(this.f >> 32)) * 31 + (int)(this.f & 65535)) * 31 + this.l) * 31 + this.m) * 31;
        if (this.g != 0)
            v0 = 1;
        else
            v0 = 0;
        v3 = (v0 + v3) * 31;
        if (this.h != 0)
            v0 = 1;
        else
            v0 = 0;
        v3 = (v0 + v3) * 31;
        if (this.i != 0)
            v0 = 1;
        else
            v0 = 0;
        v3 = (v0 + v3) * 31;
        if (this.j != 0)
            v0 = 1;
        else
            v0 = 0;
        v3 = (v0 + v3) * 31;
        if (this.k != 0)
            v0 = 1;
        else
            v0 = 0;
        if (this.n == 0)
            v2 = 0;
        if (this.o != 0)
            v1 = Arrays.hashCode(this.o);
        return ((v0 + v3) * 31 + v2) * 31 + v1;
    }

    public final String toString() {
        v1 = new Object[9];
        v1[0] = this.a;
        v1[1] = Integer.valueOf(this.d);
        v1[2] = Integer.valueOf(this.e);
        v1[3] = Long.valueOf(this.f);
        v1[4] = Boolean.valueOf(this.g);
        v1[5] = Arrays.deepToString(this.b);
        v1[6] = Arrays.deepToString(this.c);
        v1[7] = Boolean.valueOf(this.n);
        v1[8] = Arrays.deepToString(this.o);
        return String.format("(packageName=%s,installedVersion=%d,installedDerivedApkId=%d,installedFrostingId=%d,isSystemApp=%s,certificateHashes=%s,certificateMD5Hashes=%s,isAppDebuggable=%s,splitNames=%s)", v1);
    }

}
