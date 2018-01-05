package com.google.android.finsky.bn;

import android.os.Handler;
import com.google.android.finsky.cv.a.n;
import com.google.wireless.android.finsky.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final synchronized class com.google.android.finsky.bn.h implements com.google.android.finsky.bn.b
{

    public final com.google.android.finsky.bn.b a;
    public final com.google.android.finsky.bn.b b;
    public final Handler c;
    public final Handler d;
    public boolean e;
    public Collection f;

    h(com.google.android.finsky.bn.b p0, com.google.android.finsky.bn.b p1, Handler p2, Handler p3) {
        this.f = new ArrayList();
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final synchronized com.google.android.finsky.bn.c a(String p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.a.a(p0);
    }

    public final synchronized Collection a() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.a.a();
    }

    public final synchronized void a(com.google.android.finsky.bn.c p0) {
        enter this;
        try {
            this.a.a(p0);
            this.c.post(new com.google.android.finsky.bn.q(this, p0));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(com.google.android.finsky.bn.e p0) {
        enter this;
        try {
            this.a.a(p0);
            this.c.post(new com.google.android.finsky.bn.aa(this, p0));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, int p1) {
        enter this;
        try {
            this.a.a(p0, p1);
            this.c.post(new com.google.android.finsky.bn.ac(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, int p1, String p2) {
        enter this;
        try {
            this.a.a(p0, p1, p2);
            this.c.post(new com.google.android.finsky.bn.j(this, p0, p1, p2));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, long p1) {
        enter this;
        try {
            this.a.a(p0, p1);
            this.c.post(new com.google.android.finsky.bn.k(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, com.google.android.finsky.cv.a.n p1) {
        enter this;
        try {
            this.a.a(p0, p1);
            this.c.post(new com.google.android.finsky.bn.y(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, com.google.wireless.android.finsky.b.a p1, long p2) {
        enter this;
        try {
            this.a.a(p0, p1, p2);
            this.c.post(new com.google.android.finsky.bn.af(this, p0, p1, p2));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, String p1) {
        enter this;
        try {
            this.a.a(p0, p1);
            this.c.post(new com.google.android.finsky.bn.l(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, byte[] p1) {
        enter this;
        try {
            this.a.a(p0, p1);
            this.c.post(new com.google.android.finsky.bn.w(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String p0, String[] p1) {
        enter this;
        try {
            this.a.a(p0, p1);
            this.c.post(new com.google.android.finsky.bn.u(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized boolean a(Runnable p0) {
        enter this;
        try {
            if (this.e != 0) {
                if (p0 != 0)
                    this.d.post(p0);
                v0 = 1;
            }
            else {
                try {
                    this.f.add(p0);
                    if (this.f.size() < 2)
                        this.c.post(new com.google.android.finsky.bn.i(this));
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
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

    public final synchronized void b(String p0, int p1) {
        enter this;
        try {
            this.a.b(p0, p1);
            this.c.post(new com.google.android.finsky.bn.ad(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b(String p0, long p1) {
        enter this;
        try {
            this.a.b(p0, p1);
            this.c.post(new com.google.android.finsky.bn.p(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b(String p0, String p1) {
        enter this;
        try {
            this.a.b(p0, p1);
            this.c.post(new com.google.android.finsky.bn.n(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized boolean b() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.e;
    }

    public final synchronized void c() {
        enter this;
        try {
            if (this.e != 0) {
                v1 = this.f.iterator();
                while (v1.hasNext()) {
                    v0 = (Runnable)v1.next();
                    if (v0 == 0)
                        continue;
                    this.d.post(v0);
                }
                this.f.clear();
                exit this;
                return;
            }
            v1 = this.b.a().iterator();
            while (v1.hasNext())
                this.a.a((com.google.android.finsky.bn.c)v1.next());
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            this.e = 1;
            v1 = this.f.iterator();
            while (v1.hasNext()) {
                v0 = (Runnable)v1.next();
                if (v0 == 0)
                    continue;
                this.d.post(v0);
            }
            this.f.clear();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void c(String p0, int p1) {
        enter this;
        try {
            this.a.c(p0, p1);
            this.c.post(new com.google.android.finsky.bn.ae(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void c(String p0, long p1) {
        enter this;
        try {
            this.a.c(p0, p1);
            this.c.post(new com.google.android.finsky.bn.x(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void c(String p0, String p1) {
        enter this;
        try {
            this.a.c(p0, p1);
            this.c.post(new com.google.android.finsky.bn.o(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void d(String p0, int p1) {
        enter this;
        try {
            this.a.d(p0, p1);
            this.c.post(new com.google.android.finsky.bn.m(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void d(String p0, long p1) {
        enter this;
        try {
            this.a.d(p0, p1);
            this.c.post(new com.google.android.finsky.bn.z(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void d(String p0, String p1) {
        enter this;
        try {
            this.a.d(p0, p1);
            this.c.post(new com.google.android.finsky.bn.t(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void e(String p0, int p1) {
        enter this;
        try {
            this.a.e(p0, p1);
            this.c.post(new com.google.android.finsky.bn.r(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void e(String p0, long p1) {
        enter this;
        try {
            this.a.e(p0, p1);
            this.c.post(new com.google.android.finsky.bn.ab(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void e(String p0, String p1) {
        enter this;
        try {
            this.a.e(p0, p1);
            this.c.post(new com.google.android.finsky.bn.v(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void f(String p0, int p1) {
        enter this;
        try {
            this.a.f(p0, p1);
            this.c.post(new com.google.android.finsky.bn.s(this, p0, p1));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}
