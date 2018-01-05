package com.google.android.finsky.billing.common;

import com.google.android.finsky.by.a;
import com.google.android.finsky.by.e;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.h;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.lt;
import com.google.android.finsky.dfemodel.Document;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public final class com.google.android.finsky.billing.common.v
{

    public com.google.android.finsky.by.g a;
    public final com.google.android.finsky.by.o b;

    v(com.google.android.finsky.by.o p0) {
        this.b = p0;
    }

    public static boolean a(com.google.android.finsky.by.a p0) {
        v1 = p0.g(com.google.android.finsky.by.h.f).iterator();
        while (true) {
            if (!v1.hasNext()) {
                v0 = 0;
                return v0;
            }
            if (((com.google.android.finsky.by.g)v1.next()).l == 29) {
                v0 = 1;
                return v0;
            }
        }
    }

    private final synchronized boolean a(String p0, com.google.android.finsky.by.e p1) {
        enter this;
        try {
            if (this.a == 0)
                this.a = new com.google.android.finsky.by.g(com.google.android.finsky.by.g.g, com.google.android.finsky.by.h.f, 10, p0, 29, 1);
            else {
                try {
                    this.a.k = p0;
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return p1.a(this.a);
    }

    public static Collection b(com.google.android.finsky.by.a p0) {
        v1 = 0;
        v2 = p0.g(com.google.android.finsky.by.h.f).iterator();
        while (v2.hasNext()) {
            v0 = (com.google.android.finsky.by.g)v2.next();
            if (v0.l != 29)
                continue;
            if (v1 == 0)
                v1 = new ArrayList();
            v1.add(v0.k);
        }
        if (v1 == 0)
            v1 = Collections.emptySet();
        return v1;
    }

    public final boolean a(Document p0, com.google.android.finsky.by.a p1) {
  0:    v0 = 1;
  6:    if (!p0.C()) goto 43;
  8:    v3 = p0.D();
 13:    v2 = 0;
 14:    if (v2 >= v3.length) goto 43;
 26:    if (!this.a(v3[v2].b.d, p1)) goto 40;
 28:    v2 = 1;
 29:    if (v2 == 0 || this.b.a(p0, p1))
 45:        v0 = 0;
 39:    return v0;
 40:    v2 = v2 + 1;
 42:    goto 14;
 43:    v2 = 0;
 44:    goto 29;
    }

    public final boolean a(Document p0, com.google.android.finsky.by.a p1, int p2) {
  0:    v0 = 1;
  6:    if (!p0.C()) goto 59;
  8:    v4 = p0.D();
 13:    v3 = 0;
 14:    if (v3 >= v4.length) goto 59;
 26:    if (!this.a(v4[v3].b.d, p1)) goto 55;
 31:    v2 = 0;
 32:    if (v2 >= v4[v3].c.length) goto 55;
 38:    if (v4[v3].c[v2].p != p2) goto 52;
 40:    v2 = 1;
 41:    if (v2 == 0 || this.b.a(p0, p1, p2))
 61:        v0 = 0;
 51:    return v0;
 52:    v2 = v2 + 1;
 54:    goto 32;
 57:    v3 = v3 + 1;
 58:    goto 14;
 59:    v2 = 0;
 60:    goto 41;
    }

}
