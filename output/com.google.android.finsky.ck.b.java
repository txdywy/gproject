package com.google.android.finsky.ck;

import com.google.android.finsky.accounts.c;
import com.google.android.finsky.by.e;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.ey;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.v;
import java.util.List;

public final class com.google.android.finsky.ck.b
{

    public final com.google.android.finsky.accounts.c a;
    public final com.google.android.finsky.by.o b;

    b(com.google.android.finsky.accounts.c p0, com.google.android.finsky.by.o p1) {
        this.a = p0;
        this.b = p1;
    }

    public static float a(com.google.android.finsky.cv.a.bl p0) {
        v0 = 0;
        if (p0.d() && p0.k > 0 && p0.k - p0.e > 0)
            v0 = (float)(p0.k - p0.e) / (float)p0.k;
        return v0;
    }

    public static int a(bl[] p0) {
        v0 = 0;
        v1 = 0;
        while (v1 < p0.length) {
            if (p0[v1].aL_()) {
                if (p0[v1].p == 1 || p0[v1].p == 7 || p0[v1].p == 3 || p0[v1].p == 4)
                    v0 = v0 + 1;
            }
            v1 = v1 + 1;
        }
        return v0;
    }

    public static com.google.android.finsky.cv.a.bl a(bl[] p0, boolean p1, com.google.android.finsky.dfemodel.v p2) {
  0:    v4 = 0;
  8:    v6 = 0;
  9:    v0 = 9223372036854775807;
 10:    if (v6 >= p0.length)
 63:        return v4;
 18:    if (!p0[v6].aL_()) goto 64;
 23:    if (p0[v6].p == 1) goto 34;
 26:    if (p0[v6].p == 7) goto 34;
 29:    if (p0[v6].p == 3) goto 34;
 32:    if (p0[v6].p != 4) goto 64;
 34:    if (p2 == 0) goto 42;
 40:    if (!p2.a(p0[v6].p)) goto 64;
 44:    if (p1 == 0) {
 50:        if (p0[v6].e != 0 && p0[v6].e < v0) {
 56:            v0 = p0[v6].e;
 57:            v2 = p0[v6];
            }
            else
 64:            v2 = v4;
        }
 60:    v6 = v6 + 1;
 61:    v4 = v2;
 62:    goto 10;
    }

    private static com.google.android.finsky.cv.a.bl b(bl[] p0) {
        v3 = 0;
        v1 = 0;
        v4 = 0;
        while (v4 < p0.length) {
            v0 = p0[v4];
            v2 = com.google.android.finsky.ck.b.a(v0);
            if (v2 > v3)
                v1 = v2;
            else {
                v0 = v1;
                v1 = v3;
            }
            v4 = v4 + 1;
            v3 = v1;
            v1 = v0;
        }
        return v1;
    }

    public final com.google.android.finsky.cv.a.bl a(Document p0, DfeToc p1, com.google.android.finsky.by.e p2) {
        if (p0.a.e != 16 && p0.a.e != 24) {
            v0 = com.google.android.finsky.ck.b.a(p0.a.n, 1, 0);
            return v0;
        }
        v0 = p0.V();
        if (v0 != 0 && v0.f != 0) {
            v0 = p0.bk();
            if (v0 != 0) {
                v0 = this.b(v0, p1, p2);
                if (v0 != 0 && (v0.aL_()))
                    return v0;
            }
            v0 = 0;
            return v0;
        }
        v6 = this.b.b(p0, p1, p2);
        v7 = v6.size();
        if (v7 <= 0) {
            v0 = p0.bk();
            if (v0 != 0) {
                v0 = this.b(v0, p1, p2);
                if (v0 != 0 && (v0.aL_()))
                    return v0;
            }
            v0 = 0;
            return v0;
        }
        if (v7 == 1)
            v0 = ((Document)v6.get(0)).a.n;
        else {
            v1 = 0;
            v3 = 0;
            while (v1 < v7) {
                v3 = v3 + ((Document)v6.get(v1)).a.n.length;
                v1 = v1 + 1;
            }
            v1 = new bl[v3];
            v3 = 0;
            v5 = 0;
            while (v3 < v7) {
                v0 = ((Document)v6.get(v3)).a.n;
                System.arraycopy(v0, 0, v1, v5, v0.length);
                v5 = v5 + v0.length;
                v3 = v3 + 1;
            }
            v0 = v1;
        }
        v1 = com.google.android.finsky.ck.b.a(v0, 0, 0);
        if (v1 == 0)
            v0 = com.google.android.finsky.ck.b.a(v0, 1, 0);
        else
            v0 = v1;
        if (v0 == 0) {
            v0 = p0.bk();
            if (v0 != 0) {
                v0 = this.b(v0, p1, p2);
                if (v0 != 0 && (v0.aL_()))
                    return v0;
            }
            v0 = 0;
            return v0;
        }
        return v0;
    }

    public final com.google.android.finsky.cv.a.bl b(Document p0, DfeToc p1, com.google.android.finsky.by.e p2) {
        v0 = 0;
        if (p0 != 0) {
            if (p0.a.e != 17 && p0.a.e != 25)
                return v0;
            if (!this.b.a(p0, p1, p2))
                return v0;
            v2 = 0;
            while (true) {
                if (v2 >= p0.a.n.length)
                    return v0;
                if (p0.a.n[v2].p == 1)
                    break;
                v2 = v2 + 1;
            }
            v0 = p0.a.n[v2];
        }
        return v0;
    }

    public final com.google.android.finsky.cv.a.bl c(Document p0, DfeToc p1, com.google.android.finsky.by.e p2) {
  6:    if (p0.a.e != 16 && p0.a.e != 24) {
 95:        v1 = com.google.android.finsky.ck.b.b(p0.a.n);
 99:        return v1;
        }
 18:    v5 = this.b.b(p0, p1, p2);
 22:    v3 = 0;
 23:    v1 = 0;
 29:    v4 = 0;
 30:    if (v4 >= v5.size()) {
 63:        v0 = p0.bk();
 67:        if (v0 != 0) {
 69:            v0 = this.b(v0, p1, p2);
 73:            if (v0 != 0 && v0.aL_() && com.google.android.finsky.ck.b.a(v0) > v3)
 89:                v1 = v0;
            }
 90:        return v1;
        }
 42:    v0 = com.google.android.finsky.ck.b.b(((Document)v5.get(v4)).a.n);
 46:    if (v0 == 0) goto 100;
 48:    v2 = com.google.android.finsky.ck.b.a(v0);
 54:    if (v2 <= v3) goto 100;
 56:    v1 = v2;
 59:    v4 = v4 + 1;
 60:    v3 = v1;
 61:    v1 = v0;
 62:    goto 30;
 63:    v0 = p0.bk();
 67:    if (v0 != 0) {
 69:        v0 = this.b(v0, p1, p2);
 73:        if (v0 != 0 && v0.aL_() && com.google.android.finsky.ck.b.a(v0) > v3)
 89:            v1 = v0;
        }
 90:    return v1;
100:    v0 = v1;
101:    v1 = v3;
102:    goto 57;
    }

}
