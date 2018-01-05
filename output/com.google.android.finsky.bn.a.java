package com.google.android.finsky.bn;

import com.google.android.finsky.cv.a.n;
import com.google.wireless.android.finsky.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final synchronized class com.google.android.finsky.bn.a implements com.google.android.finsky.bn.b
{

    public final Map a;

    a() {
        this.a = new HashMap();
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
        return (com.google.android.finsky.bn.c)this.a.get(p0);
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
        return new ArrayList(this.a.values());
    }

    public final synchronized void a(com.google.android.finsky.bn.c p0) {
        enter this;
        try {
            this.a.put(p0.a, p0);
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
            this.a.put(p0.b, p0.a((com.google.android.finsky.bn.c)this.a.get(p0.b)));
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).e(p1).a(p2).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1, p2).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).b(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).a(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b(String p0, int p1) {
        enter this;
        try {
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).b(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).b(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).e(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).d(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).c(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).f(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).f(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).d(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).g(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).g(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).e(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).h(p1).a);
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
            this.a.put(p0, com.google.android.finsky.bn.d.a(this.a(p0), p0).h(p1).a);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}
