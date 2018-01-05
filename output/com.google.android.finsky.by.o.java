package com.google.android.finsky.by;

import android.accounts.Account;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.bv;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.dm;
import com.google.android.finsky.cv.a.ln;
import com.google.android.finsky.cv.a.m;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.by.o
{

    public final com.google.android.finsky.by.c a;
    public com.google.android.finsky.by.g b;
    public com.google.android.finsky.by.g c;

    o(com.google.android.finsky.by.c p0) {
        this.a = p0;
    }

    private final com.google.android.finsky.by.g a() {
        if (this.c == 0)
            this.c = new com.google.android.finsky.by.g(com.google.android.finsky.by.g.g, com.google.android.finsky.by.h.a(2), 2, (String)com.google.android.finsky.aa.b.di.b(), 15, 1);
        return this.c;
    }

    private final synchronized com.google.android.finsky.by.g b(com.google.android.finsky.cv.a.ax p0, com.google.android.finsky.by.e p1, int p2) {
        enter this;
        try {
            v0 = com.google.android.finsky.by.h.a(p0.d);
            if (this.b == 0)
                this.b = com.google.android.finsky.by.g.a(com.google.android.finsky.by.g.g, v0, p0, p2);
            else {
                try {
                    this.b.i = v0;
                    this.b.j = p0.d;
                    this.b.k = p0.b;
                    this.b.l = p0.c;
                    this.b.m = p2;
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            v0 = p1.b(this.b);
            if (v0 != 0) {
                if (System.currentTimeMillis() >= v0.o)
                    v1 = 1;
                else
                    v1 = 0;
                if (v1 != 0)
                    v0 = 0;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    private final int c(com.google.android.finsky.cv.a.ax p0, com.google.android.finsky.by.e p1) {
        v0 = 1;
        if (!this.a(p0, p1, 1)) {
            if (this.a(p0, p1, 7))
                v0 = 7;
            else
                v0 = -1;
        }
        return v0;
    }

    public final Account a(Document p0) {
        v2 = this.a.e();
        v1 = 0;
        while (v1 < v2.size()) {
            v0 = (com.google.android.finsky.by.a)v2.get(v1);
            if (this.a(p0, v0)) {
                v0 = v0.a();
                return v0;
            }
            v1 = v1 + 1;
        }
        v0 = 0;
        return v0;
    }

    public final Account a(Document p0, Account p1) {
        if (!this.a(p0, this.a.a(p1))) {
            if (p0.a.e == 1)
                p1 = this.a(p0);
            else
                p1 = 0;
        }
        return p1;
    }

    public final Account a(List p0, Account p1) {
        v1 = 0;
        while (v1 < p0.size()) {
            v0 = this.a((Document)p0.get(v1), p1);
            if (v0 != 0)
                return v0;
            v1 = v1 + 1;
        }
        v0 = 0;
        return v0;
    }

    public final boolean a(com.google.android.finsky.by.e p0) {
        return p0.a(this.a());
    }

    public final boolean a(com.google.android.finsky.cv.a.ax p0, com.google.android.finsky.by.e p1) {
        if (this.b(p0, p1) != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean a(com.google.android.finsky.cv.a.ax p0, com.google.android.finsky.by.e p1, int p2) {
        if (this.b(p0, p1, p2) != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean a(Document p0, com.google.android.finsky.by.e p1) {
        return this.a(p0.d(), p1);
    }

    public final synchronized boolean a(Document p0, com.google.android.finsky.by.e p1, int p2) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.a(p0.d(), p1, p2);
    }

    public final boolean a(Document p0, DfeToc p1, com.google.android.finsky.by.e p2) {
        v0 = 0;
        if (p0.a.f == 0) {
            v4 = p0.af();
            if (v4 == 1)
                v1 = 1;
            else
                v1 = 0;
            if (v1 == 0) {
                if (p0.a.o != 0 && p0.a.o.d != 0)
                    v3 = 1;
                else
                    v3 = 0;
                if (v3 != 0 && this.a(p0, p2)) {
                    v3 = new Object[2];
                    v3[0] = p0.a.c;
                    v3[1] = Integer.valueOf(v4);
                    FinskyLog.a("%s available because owned, overriding [restriction=%d].", v3);
                    v1 = 1;
                }
            }
            if (v1 == 0) {
                v5 = new Object[2];
                v5[0] = p0.a.c;
                v5[1] = Integer.valueOf(v4);
                FinskyLog.a("%s not available [restriction=%d].", v5);
            }
            v0 = v1;
            return v0;
        }
        if (p1 == 0) {
            if (p0.a.f != 3)
                return v0;
            v4 = p0.af();
            if (v4 == 1)
                v1 = 1;
            else
                v1 = 0;
            if (v1 == 0) {
                if (p0.a.o != 0 && p0.a.o.d != 0)
                    v3 = 1;
                else
                    v3 = 0;
                if (v3 != 0 && this.a(p0, p2)) {
                    v3 = new Object[2];
                    v3[0] = p0.a.c;
                    v3[1] = Integer.valueOf(v4);
                    FinskyLog.a("%s available because owned, overriding [restriction=%d].", v3);
                    v1 = 1;
                }
            }
            if (v1 == 0) {
                v5 = new Object[2];
                v5[0] = p0.a.c;
                v5[1] = Integer.valueOf(v4);
                FinskyLog.a("%s not available [restriction=%d].", v5);
            }
            v0 = v1;
            return v0;
        }
        if (p1.a(p0.a.f) == 0) {
            v2 = new Object[1];
            v2[0] = p0.a.c;
            FinskyLog.a("Corpus for %s is not available.", v2);
            return v0;
            if (p0.a.f != 3)
                return v0;
        }
        v4 = p0.af();
        if (v4 == 1)
            v1 = 1;
        else
            v1 = 0;
        if (v1 == 0) {
            if (p0.a.o != 0 && p0.a.o.d != 0)
                v3 = 1;
            else
                v3 = 0;
            if (v3 != 0 && this.a(p0, p2)) {
                v3 = new Object[2];
                v3[0] = p0.a.c;
                v3[1] = Integer.valueOf(v4);
                FinskyLog.a("%s available because owned, overriding [restriction=%d].", v3);
                v1 = 1;
            }
        }
        if (v1 == 0) {
            v5 = new Object[2];
            v5[0] = p0.a.c;
            v5[1] = Integer.valueOf(v4);
            FinskyLog.a("%s not available [restriction=%d].", v5);
        }
        v0 = v1;
        return v0;
    }

    public final boolean a(String p0) {
        v2 = 0;
        v3 = this.a.e().iterator();
        while (true) {
            if (!v3.hasNext())
                return v2;
            v4 = ((com.google.android.finsky.by.a)v3.next()).d(p0);
            v1 = 0;
            while (v1 < v4.size()) {
                if (((com.google.android.finsky.by.j)v4.get(v1)).e != 0) {
                    v2 = 1;
                    return v2;
                }
                v1 = v1 + 1;
            }
        }
    }

    public final int b(Document p0, com.google.android.finsky.by.e p1) {
        return this.c(p0.d(), p1);
    }

    public final com.google.android.finsky.by.g b(com.google.android.finsky.cv.a.ax p0, com.google.android.finsky.by.e p1) {
        v1 = 1;
        v0 = this.b(p0, p1, 1);
        if (p0.d != 4 && p0.d != 1 && p0.d != 6)
            v1 = 0;
        if (v0 == 0 && v1 != 0)
            v0 = this.b(p0, p1, 3);
        if (v0 == 0 && p0.d == 4) {
            v0 = this.b(p0, p1, 7);
            if (v0 == 0)
                v0 = this.b(p0, p1, 4);
        }
        return v0;
    }

    public final List b(Document p0, DfeToc p1, com.google.android.finsky.by.e p2) {
        if (p0.bj()) {
            v1 = new ArrayList();
            v3 = p0.bl();
            v2 = 0;
            while (v2 < v3.size()) {
                v0 = (Document)v3.get(v2);
                if (this.a(v0, p1, p2)) {
                    if (v0.a.n.length > 0)
                        v1.add(v0);
                }
                v2 = v2 + 1;
            }
            v0 = v1;
        }
        else
            v0 = Collections.emptyList();
        return v0;
    }

    public final boolean b(Document p0) {
        v6 = 1;
        v0 = p0.e(11);
        if (v0 == 0 || v0.u == 0)
            v6 = 0;
        else if (!new com.google.android.finsky.by.g(com.google.android.finsky.by.g.g, com.google.android.finsky.by.h.a(v0.u.a.d), v0.u.a.d, v0.u.a.b, v0.u.a.c, 1).equals(this.a()))
            v6 = 0;
        return v6;
    }

    public final boolean c(Document p0, com.google.android.finsky.by.e p1) {
        v0 = 0;
        v1 = this.b(p0, p1);
        if (v1 != -1) {
            v2 = p1.b(com.google.android.finsky.by.g.a(com.google.android.finsky.by.g.g, com.google.android.finsky.by.h.a(p0.a.f), p0, v1));
            if (v2 != 0 && v2.p != 0) {
                v1 = p0.e(v1);
                if (v1 == 0 || Document.a(v1))
                    v0 = 1;
            }
        }
        return v0;
    }

    public final boolean d(Document p0, com.google.android.finsky.by.e p1) {
        if (this.e(p0, p1) != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.android.finsky.cv.a.ax e(Document p0, com.google.android.finsky.by.e p1) {
        if (p0.a.f == 4 && !p0.bp()) {
            if (p0.a.v != 0 && p0.a.v.E != 0)
                v0 = p0.a.v.E.f;
            else
                v0 = com.google.android.finsky.cv.a.ax.aG_();
            v2 = 0;
            while (v2 < v0.length) {
                v4 = this.c(v0[v2], p1);
                if (v4 != -1) {
                    v4 = p1.b(com.google.android.finsky.by.g.a(com.google.android.finsky.by.g.g, com.google.android.finsky.by.h.a(v0[v2].d), v0[v2], v4));
                    if (v4 != 0) {
                        if (v4.p != 0) {
                            v0 = v0[v2];
                            return v0;
                        }
                    }
                }
                v2 = v2 + 1;
            }
        }
        v0 = 0;
        return v0;
    }

}
