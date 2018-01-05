package com.google.android.agera;

import android.os.Message;
import java.util.concurrent.Executor;

public final class com.google.android.agera.i extends com.google.android.agera.b implements com.google.android.agera.ac, com.google.android.agera.am, Runnable
{

    public final Object i;
    public final com.google.android.agera.t j;
    public final Object[] k;
    public final com.google.android.agera.p l;
    public final int m;
    public final int n;
    public final com.google.android.agera.z o;
    public final com.google.android.agera.ao p;
    public int q;
    public boolean r;
    public int s;
    public Object t;
    public Object u;
    public Thread v;

    i(Object p0, com.google.android.agera.t p1, Object[] p2, com.google.android.agera.p p3, int p4, int p5, com.google.android.agera.z p6) {
        com.google.android.agera.b();
        this.q = 0;
        this.s = -1;
        this.i = p0;
        this.t = p0;
        this.u = p0;
        this.j = p1;
        this.k = p2;
        this.l = p3;
        this.m = p4;
        this.n = p5;
        this.o = p6;
        this.p = com.google.android.agera.ao.a();
    }

    private final void a(int p0, boolean p1) {
        enter this;
        try {
            if (this.q == 1 || this.q == 3) {
                this.r = p1;
                if (!(p0 & 1)) {
                    exit this;
                    return;
                }
                this.q = 2;
                if ((p0 & 5) == 5 && this.v != 0)
                    this.v.interrupt();
            }
            if (p1 == 0 && (p0 & 3) == 3)
                this.b(this.i);
            exit this;
            return;
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    private final synchronized void a(Object p0) {
  0:    v1 = 0;
  1:    enter this;
  2:    v0 = 0;
  3:    try {
  3:        enter this;
        }
        catch (Throwable ex) {
 46:        exit this;
 47:        throw ex;
        }
  7:    if (this.q == 5)
  9:        v1 = 1;
 11:    this.q = 0;
 15:    if (this.u != p0) {
 17:        v0 = this.u;
 19:        this.u = p0;
        }
 21:    if (v1 == 0) goto 38;
 23:    this.t = p0;
 25:    this.g();
 28:    exit this;
 29:    if (v0 != 0) {
 31:        try {
 33:            this.o.b(v0);
            }
            catch (Throwable ex) {
 46:            exit this;
 47:            throw ex;
            }
        }
 36:    exit this;
 37:    return;
 38:    this.b(p0);
 41:    goto 25;
 43:    exit this;
 44:    try {
 44:        throw ex;
        }
        catch (Throwable ex) {
 46:        exit this;
 47:        throw ex;
        }
 49:    try
            run 38...44
        catch (Throwable ex) {
 38:        goto 42;
        }
 51:    try
            run 4...29
        catch (Throwable ex) {
  4:        goto 42;
        }
    }

    private final void a(Object p0, com.google.android.agera.j p1) {
        if (p1 == 0)
            this.h();
        else
            this.a(com.google.android.agera.x.a(p1.a(p0)));
    }

    private final void b(int p0, boolean p1) {
  6:    v4 = p0;
  7:    if (v4 < 0)
 33:        return;
  9:    if (v4 >= this.k.length)
 33:        return;
 15:    v0 = ((Integer)this.k[v4]).intValue();
 19:    if (p1 != 0) goto 25;
 21:    if (v0 == 5) goto 25;
 23:    if (v0 != 6) goto 42;
 25:    enter this;
 30:    if (this.f()) {
 32:        exit this;
 33:        return;
        }
 34:    if (v0 == 5) {
 36:        this.s = v4;
 39:        this.q = 3;
        }
 48:    else if (v0 == 6) {
 50:        this.s = v4;
 53:        this.q = 4;
 55:        this.a();
 58:        this.g();
 61:        exit this;
 62:        return;
        }
 41:    exit this;
 42:    switch (v0) {
            case 0:
 42:            goto 302;
            case 1:
 42:            goto 66;
            case 2:
 42:            goto 86;
            case 3:
 42:            goto 118;
            case 4:
 42:            goto 141;
            case 5:
 42:            goto 181;
            case 6:
 42:            goto 45;
            case 7:
 42:            goto 193;
            case 8:
 42:            goto 209;
            case 9:
 42:            goto 232;
            case 10:
 42:            goto 268;
            default:
        }
 45:    v0 = v4;
 46:    v4 = v0;
 47:    goto 7;
 64:    exit this;
 65:    throw ex;
 80:    this.u = com.google.android.agera.x.a(((com.google.android.agera.al)this.k[v4 + 1]).i_());
 84:    v4 = v4 + 2;
 85:    goto 7;
112:    this.u = com.google.android.agera.x.a(((com.google.android.agera.p)this.k[v4 + 2]).a(this.u, ((com.google.android.agera.al)this.k[v4 + 1]).i_()));
116:    v4 = v4 + 3;
117:    goto 7;
134:    this.u = com.google.android.agera.x.a(((com.google.android.agera.j)this.k[v4 + 1]).a(this.u));
138:    v4 = v4 + 2;
139:    goto 7;
169:    if (((com.google.android.agera.y)this.k[v4 + 2]).a())
171:        v0 = v4 + 4;
        else {
176:        this.a(((com.google.android.agera.j)this.k[v4 + 1]).a(this.u), (com.google.android.agera.j)this.k[v4 + 3]);
179:        v0 = -1;
        }
173:    v4 = v0;
174:    goto 7;
187:    ((Executor)this.k[v4 + 1]).execute(this);
190:    v0 = -1;
191:    goto 46;
201:    ((com.google.android.agera.z)this.k[v4 + 1]).b(this.u);
206:    v4 = v4 + 2;
207:    goto 7;
221:    ((com.google.android.agera.al)this.k[v4 + 1]).i_();
224:    ((com.google.android.agera.c)this.k[v4 + 2]).a();
229:    v4 = v4 + 3;
230:    goto 7;
246:    if (((com.google.android.agera.ak)this.u).a()) {
252:        this.u = ((com.google.android.agera.ak)this.u).b();
254:        v0 = v4 + 2;
        }
        else {
263:        this.a(((com.google.android.agera.ak)this.u).d(), (com.google.android.agera.j)this.k[v4 + 1]);
266:        v0 = -1;
        }
256:    v4 = v0;
257:    goto 7;
276:    if (((com.google.android.agera.ak)this.u).a()) {
286:        this.a(((com.google.android.agera.ak)this.u).b(), com.google.android.agera.k.a());
289:        v0 = -1;
        }
        else {
297:        this.u = ((com.google.android.agera.ak)this.u).d();
299:        v0 = v4 + 1;
        }
290:    v4 = v0;
291:    goto 7;
312:    if (((Boolean)this.k[v4 + 1]).booleanValue())
314:        this.h();
        else
320:        this.a(this.u);
317:    goto 190;
324:    try
            run 26...65
        catch (Throwable ex) {
 26:        goto 63;
        }
    }

    private final void b(Object p0) {
        this.t = p0;
        if (((Boolean)this.l.a(this.t, p0)).booleanValue())
            this.a();
    }

    private final boolean f() {
        if (this.q == 2) {
            this.p.obtainMessage(5, this).sendToTarget();
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

    private final void g() {
        if (this.r != 0)
            this.p.obtainMessage(4, this).sendToTarget();
    }

    private final void h() {
        v0 = 0;
        enter this;
        try {
            this.q = 0;
            if (this.u != this.t) {
                v0 = this.u;
                this.u = this.t;
            }
            this.g();
            exit this;
        }
        catch (Throwable ex) {
            try {
                exit this;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            throw ex;
        }
        if (v0 != 0)
            this.o.b(v0);
    }

    public final void ad_() {
        this.a(this.n, 1);
        this.e();
    }

    protected final void b() {
        this.j.a(this);
        this.e();
    }

    protected final void c() {
        this.j.b(this);
        this.a(this.m, 0);
    }

    final void e() {
        enter this;
        try {
            if (this.q == 0) {
                this.q = 1;
                this.s = -1;
                this.r = 0;
                exit this;
                this.u = this.t;
                this.b(0, 0);
                return;
            }
            if (this.q == 4) {
                this.q = 1;
                this.s = -1;
                this.r = 0;
                exit this;
                this.u = this.t;
                this.b(0, 0);
                return;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            if (this.q == 2)
                this.r = 1;
            exit this;
            return;
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final synchronized Object i_() {
        enter this;
        try {
            if (this.q == 4) {
                this.q = 5;
                com.google.android.agera.x.a(this.k[this.s].equals(Integer.valueOf(6)), "Inconsistent directive state for goLazy");
                this.b(this.s + 1, 0);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.t;
    }

    public final void run() {
        v2 = Thread.currentThread();
        enter this;
        try {
            if (this.q == 3 || this.q == 2)
                v0 = 1;
            else
                v0 = 0;
            com.google.android.agera.x.a(v0, "Illegal call of Runnable.run()");
            this.s = -1;
            if (this.f()) {
                exit this;
                return;
            }
            this.q = 1;
            this.v = v2;
            exit this;
        }
        catch (Throwable ex) {
            try {
                exit this;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            throw ex;
        }
        com.google.android.agera.x.a(this.k[this.s].equals(Integer.valueOf(5)), "Inconsistent directive state for goTo");
        this.b(this.s + 2, 1);
        Thread.interrupted();
        enter this;
        try {
            if (this.v == v2)
                this.v = 0;
            exit this;
            return;
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

}
