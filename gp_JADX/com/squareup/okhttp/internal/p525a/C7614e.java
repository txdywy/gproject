package com.squareup.okhttp.internal.p525a;

import com.squareup.okhttp.af;
import com.squareup.okhttp.internal.k;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p526e.C7726f;

public final class C7614e implements Closeable {
    public static final ExecutorService f39447a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), k.a("OkHttp FramedConnection"));
    public final af f39448b;
    public final boolean f39449c;
    public final C7624n f39450d;
    public final Map f39451e = new HashMap();
    public final String f39452f;
    public int f39453g;
    public int f39454h;
    public boolean f39455i;
    public final ExecutorService f39456j;
    public Map f39457k;
    public final an f39458l;
    public long f39459m;
    public long f39460n;
    public ap f39461o;
    public final ap f39462p;
    public boolean f39463q;
    public final at f39464r;
    public final Socket f39465s;
    public final C7611d f39466t;
    public final C7626p f39467u;
    public final Set f39468v;

    public C7614e(C7623m c7623m) {
        System.nanoTime();
        this.f39459m = 0;
        this.f39461o = new ap();
        this.f39462p = new ap();
        this.f39463q = false;
        this.f39468v = new LinkedHashSet();
        this.f39448b = c7623m.f39496f;
        this.f39458l = c7623m.f39497g;
        this.f39449c = c7623m.f39498h;
        this.f39450d = c7623m.f39495e;
        this.f39454h = c7623m.f39498h ? 1 : 2;
        if (c7623m.f39498h && this.f39448b == af.d) {
            this.f39454h += 2;
        }
        if (c7623m.f39498h) {
            this.f39461o.m36754a(7, 0, 16777216);
        }
        this.f39452f = c7623m.f39492b;
        if (this.f39448b == af.d) {
            this.f39464r = new ac();
            this.f39456j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), k.a(String.format("OkHttp %s Push Observer", new Object[]{this.f39452f})));
            this.f39462p.m36754a(7, 0, 65535);
            this.f39462p.m36754a(5, 0, 16384);
        } else if (this.f39448b == af.c) {
            this.f39464r = new aq();
            this.f39456j = null;
        } else {
            throw new AssertionError(this.f39448b);
        }
        this.f39460n = (long) this.f39462p.m36756b();
        this.f39465s = c7623m.f39491a;
        this.f39466t = this.f39464r.mo6422a(c7623m.f39494d, this.f39449c);
        this.f39467u = new C7626p(this, this.f39464r.mo6421a(c7623m.f39493c, this.f39449c));
        new Thread(this.f39467u).start();
    }

    final synchronized C7630t m36787a(int i) {
        return (C7630t) this.f39451e.get(Integer.valueOf(i));
    }

    final synchronized C7630t m36793b(int i) {
        C7630t c7630t;
        c7630t = (C7630t) this.f39451e.remove(Integer.valueOf(i));
        if (c7630t != null && this.f39451e.isEmpty()) {
            m36785a(true);
        }
        notifyAll();
        return c7630t;
    }

    private final synchronized void m36785a(boolean z) {
        if (z) {
            System.nanoTime();
        }
    }

    public final synchronized int m36786a() {
        ap apVar;
        apVar = this.f39462p;
        return (apVar.f39434a & 16) != 0 ? apVar.f39437d[4] : Integer.MAX_VALUE;
    }

    public final C7630t m36788a(List list, boolean z) {
        C7630t c7630t;
        boolean z2 = false;
        if (!z) {
            z2 = true;
        }
        synchronized (this.f39466t) {
            int i;
            synchronized (this) {
                if (this.f39455i) {
                    throw new IOException("shutdown");
                }
                i = this.f39454h;
                this.f39454h += 2;
                c7630t = new C7630t(i, this, z2, false, list);
                if (c7630t.m36824a()) {
                    this.f39451e.put(Integer.valueOf(i), c7630t);
                    m36785a(false);
                }
            }
            this.f39466t.mo6435a(z2, i, list);
        }
        if (!z) {
            this.f39466t.mo6436b();
        }
        return c7630t;
    }

    public final void m36791a(int i, boolean z, C7726f c7726f, long j) {
        if (j == 0) {
            this.f39466t.mo6434a(z, i, c7726f, 0);
            return;
        }
        while (j > 0) {
            int min;
            boolean z2;
            synchronized (this) {
                while (this.f39460n <= 0) {
                    try {
                        if (this.f39451e.containsKey(Integer.valueOf(i))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException e) {
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.f39460n), this.f39466t.mo6438c());
                this.f39460n -= (long) min;
            }
            j -= (long) min;
            C7611d c7611d = this.f39466t;
            if (z && j == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c7611d.mo6434a(z2, i, c7726f, min);
        }
    }

    final void m36790a(int i, C7609a c7609a) {
        f39447a.submit(new C7616f(this, "OkHttp %s stream %d", new Object[]{this.f39452f, Integer.valueOf(i)}, i, c7609a));
    }

    final void m36795b(int i, C7609a c7609a) {
        this.f39466t.mo6430a(i, c7609a);
    }

    final void m36789a(int i, long j) {
        f39447a.execute(new C7617g(this, "OkHttp Window Update %s stream %d", new Object[]{this.f39452f, Integer.valueOf(i)}, i, j));
    }

    final synchronized am m36796c(int i) {
        return this.f39457k != null ? (am) this.f39457k.remove(Integer.valueOf(i)) : null;
    }

    public final void m36794b() {
        this.f39466t.mo6436b();
    }

    public final void close() {
        m36792a(C7609a.NO_ERROR, C7609a.CANCEL);
    }

    final void m36792a(C7609a c7609a, C7609a c7609a2) {
        IOException iOException;
        IOException iOException2;
        try {
            synchronized (this.f39466t) {
                synchronized (this) {
                    if (this.f39455i) {
                        iOException = null;
                    } else {
                        this.f39455i = true;
                        this.f39466t.mo6431a(this.f39453g, c7609a, k.a);
                        iOException = null;
                    }
                }
                C7630t[] c7630tArr;
                if (c7630tArr != null) {
                    iOException2 = iOException;
                    for (C7630t a : c7630tArr) {
                        try {
                            a.m36823a(c7609a2);
                        } catch (IOException iOException3) {
                            if (iOException2 != null) {
                                iOException2 = iOException3;
                            }
                        }
                    }
                    iOException3 = iOException2;
                }
                am[] amVarArr;
                if (amVarArr != null) {
                    for (am amVar : amVarArr) {
                        if (amVar.f39432c == -1 || amVar.f39431b == -1) {
                            throw new IllegalStateException();
                        }
                        amVar.f39432c = amVar.f39431b - 1;
                        amVar.f39430a.countDown();
                    }
                }
                this.f39466t.close();
                iOException2 = iOException3;
                this.f39465s.close();
                if (iOException2 != null) {
                    throw iOException2;
                }
            }
        } catch (IOException iOException22) {
            iOException3 = iOException22;
        }
        synchronized (this) {
            if (this.f39451e.isEmpty()) {
                c7630tArr = null;
            } else {
                C7630t[] c7630tArr2 = (C7630t[]) this.f39451e.values().toArray(new C7630t[this.f39451e.size()]);
                this.f39451e.clear();
                m36785a(false);
                c7630tArr = c7630tArr2;
            }
            if (this.f39457k != null) {
                am[] amVarArr2 = (am[]) this.f39457k.values().toArray(new am[this.f39457k.size()]);
                this.f39457k = null;
                amVarArr = amVarArr2;
            } else {
                amVarArr = null;
            }
        }
        if (c7630tArr != null) {
            iOException22 = iOException3;
            while (r2 < r6) {
                a.m36823a(c7609a2);
            }
            iOException3 = iOException22;
        }
        if (amVarArr != null) {
            while (r0 < r2) {
                if (amVar.f39432c == -1) {
                }
                throw new IllegalStateException();
            }
        }
        try {
            this.f39466t.close();
            iOException22 = iOException3;
        } catch (IOException e) {
            iOException22 = e;
            if (iOException3 != null) {
                iOException22 = iOException3;
            }
        }
        try {
            this.f39465s.close();
        } catch (IOException e2) {
            iOException22 = e2;
        }
        if (iOException22 != null) {
            throw iOException22;
        }
    }
}
