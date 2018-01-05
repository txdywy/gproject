package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class C0700r {
    public final AtomicInteger f4180a;
    public final Set f4181b;
    public final PriorityBlockingQueue f4182c;
    public final PriorityBlockingQueue f4183d;
    public final C0659a f4184e;
    public final C0663k f4185f;
    public final C0691y f4186g;
    public final C0696l[] f4187h;
    public C0685c f4188i;
    public final List f4189j;

    public C0700r(C0659a c0659a, C0663k c0663k, int i, C0691y c0691y) {
        this.f4180a = new AtomicInteger();
        this.f4181b = new HashSet();
        this.f4182c = new PriorityBlockingQueue();
        this.f4183d = new PriorityBlockingQueue();
        this.f4189j = new ArrayList();
        this.f4184e = c0659a;
        this.f4185f = c0663k;
        this.f4187h = new C0696l[i];
        this.f4186g = c0691y;
    }

    public C0700r(C0659a c0659a, C0663k c0663k, int i) {
        this(c0659a, c0663k, i, new C0692g(new Handler(Looper.getMainLooper())));
    }

    public C0700r(C0659a c0659a, C0663k c0663k) {
        this(c0659a, c0663k, 4);
    }

    public final void m4511a() {
        int i = 0;
        if (this.f4188i != null) {
            this.f4188i.m4489a();
        }
        for (C0696l c0696l : this.f4187h) {
            if (c0696l != null) {
                c0696l.f4165e = true;
                c0696l.interrupt();
            }
        }
        this.f4188i = new C0685c(this.f4182c, this.f4183d, this.f4184e, this.f4186g);
        this.f4188i.start();
        while (i < this.f4187h.length) {
            C0696l c0696l2 = new C0696l(this.f4183d, this.f4185f, this.f4184e, this.f4186g);
            this.f4187h[i] = c0696l2;
            c0696l2.start();
            i++;
        }
    }

    public final void m4512a(C0701t c0701t) {
        synchronized (this.f4181b) {
            for (C0656n c0656n : this.f4181b) {
                if (c0701t.mo1083a(c0656n)) {
                    c0656n.mo1057f();
                }
            }
        }
    }

    public final C0656n m4510a(C0656n c0656n) {
        c0656n.mo1540a(this);
        synchronized (this.f4181b) {
            this.f4181b.add(c0656n);
        }
        c0656n.f4032g = Integer.valueOf(this.f4180a.incrementAndGet());
        c0656n.m4366a("add-to-queue");
        if (c0656n.f4034i) {
            this.f4182c.add(c0656n);
        } else {
            this.f4183d.add(c0656n);
        }
        return c0656n;
    }
}
