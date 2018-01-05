package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class com.android.volley.r
{

    public final AtomicInteger a;
    public final Set b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final com.android.volley.a e;
    public final com.android.volley.k f;
    public final com.android.volley.y g;
    public final l[] h;
    public com.android.volley.c i;
    public final List j;

    r(com.android.volley.a p0, com.android.volley.k p1) {
        com.android.volley.r(p0, p1, 4);
    }

    r(com.android.volley.a p0, com.android.volley.k p1, int p2) {
        com.android.volley.r(p0, p1, p2, new com.android.volley.g(new Handler(Looper.getMainLooper())));
    }

    r(com.android.volley.a p0, com.android.volley.k p1, int p2, com.android.volley.y p3) {
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.j = new ArrayList();
        this.e = p0;
        this.f = p1;
        this.h = new l[p2];
        this.g = p3;
    }

    public final com.android.volley.n a(com.android.volley.n p0) {
        p0.a(this);
        enter this.b;
        try {
            this.b.add(p0);
            exit this.b;
        }
        catch (Throwable ex) {
            try {
                exit this.b;
            }
            catch (Throwable ex) {
                exit this.b;
                throw ex;
            }
            throw ex;
        }
        p0.g = Integer.valueOf(this.a.incrementAndGet());
        p0.a("add-to-queue");
        if (p0.i == 0)
            this.d.add(p0);
        else
            this.c.add(p0);
        return p0;
    }

    public final void a() {
        v0 = 0;
        if (this.i != 0)
            this.i.a();
        v1 = 0;
        while (v1 < this.h.length) {
            if (this.h[v1] != 0) {
                this.h[v1].e = 1;
                this.h[v1].interrupt();
            }
            v1 = v1 + 1;
        }
        this.i = new com.android.volley.c(this.c, this.d, this.e, this.g);
        this.i.start();
        while (v0 < this.h.length) {
            v1 = new com.android.volley.l(this.d, this.f, this.e, this.g);
            this.h[v0] = v1;
            v1.start();
            v0 = v0 + 1;
        }
    }

    public final void a(com.android.volley.t p0) {
        enter this.b;
        try {
            v2 = this.b.iterator();
            while (v2.hasNext()) {
                v0 = (com.android.volley.n)v2.next();
                if (!p0.a(v0))
                    continue;
                v0.f();
            }
            exit this.b;
        }
        catch (Throwable ex) {
            exit this.b;
            throw ex;
        }
        try {
            exit this.b;
        }
        catch (Throwable ex) {
            exit this.b;
            throw ex;
        }
    }

}
