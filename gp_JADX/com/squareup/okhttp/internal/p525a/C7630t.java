package com.squareup.okhttp.internal.p525a;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import p526e.C7631z;

public final class C7630t {
    public long f39507a = 0;
    public long f39508b;
    public final int f39509c;
    public final C7614e f39510d;
    public List f39511e;
    public final C7633v f39512f;
    public final C7632u f39513g;
    public final C7635w f39514h = new C7635w(this);
    public final C7635w f39515i = new C7635w(this);
    public C7609a f39516j = null;

    C7630t(int i, C7614e c7614e, boolean z, boolean z2, List list) {
        if (c7614e == null) {
            throw new NullPointerException("connection == null");
        } else if (list == null) {
            throw new NullPointerException("requestHeaders == null");
        } else {
            this.f39509c = i;
            this.f39510d = c7614e;
            this.f39508b = (long) c7614e.f39462p.m36756b();
            this.f39512f = new C7633v(this, (long) c7614e.f39461o.m36756b());
            this.f39513g = new C7632u(this);
            this.f39512f.f39525e = z2;
            this.f39513g.f39519c = z;
        }
    }

    public final synchronized boolean m36824a() {
        boolean z = false;
        synchronized (this) {
            if (this.f39516j == null) {
                if (!(this.f39512f.f39525e || this.f39512f.f39524d) || (!(this.f39513g.f39519c || this.f39513g.f39518b) || this.f39511e == null)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean m36826b() {
        boolean z;
        if ((this.f39509c & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        return this.f39510d.f39449c == z;
    }

    public final synchronized List m36827c() {
        this.f39514h.cV_();
        while (this.f39511e == null && this.f39516j == null) {
            try {
                m36832g();
            } catch (Throwable th) {
                this.f39514h.m36854b();
            }
        }
        this.f39514h.m36854b();
        if (this.f39511e != null) {
        } else {
            throw new IOException("stream was reset: " + this.f39516j);
        }
        return this.f39511e;
    }

    public final C7631z m36829d() {
        synchronized (this) {
            if (this.f39511e != null || m36826b()) {
            } else {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f39513g;
    }

    public final void m36823a(C7609a c7609a) {
        if (m36821d(c7609a)) {
            this.f39510d.m36795b(this.f39509c, c7609a);
        }
    }

    public final void m36825b(C7609a c7609a) {
        if (m36821d(c7609a)) {
            this.f39510d.m36790a(this.f39509c, c7609a);
        }
    }

    private final boolean m36821d(C7609a c7609a) {
        synchronized (this) {
            if (this.f39516j != null) {
                return false;
            } else if (this.f39512f.f39525e && this.f39513g.f39519c) {
                return false;
            } else {
                this.f39516j = c7609a;
                notifyAll();
                this.f39510d.m36793b(this.f39509c);
                return true;
            }
        }
    }

    final void m36830e() {
        synchronized (this) {
            this.f39512f.f39525e = true;
            boolean a = m36824a();
            notifyAll();
        }
        if (!a) {
            this.f39510d.m36793b(this.f39509c);
        }
    }

    final synchronized void m36828c(C7609a c7609a) {
        if (this.f39516j == null) {
            this.f39516j = c7609a;
            notifyAll();
        }
    }

    final void m36831f() {
        synchronized (this) {
            Object obj = (!this.f39512f.f39525e && this.f39512f.f39524d && (this.f39513g.f39519c || this.f39513g.f39518b)) ? 1 : null;
            boolean a = m36824a();
        }
        if (obj != null) {
            m36823a(C7609a.CANCEL);
        } else if (!a) {
            this.f39510d.m36793b(this.f39509c);
        }
    }

    final void m36822a(long j) {
        this.f39508b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    final void m36832g() {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new InterruptedIOException();
        }
    }
}
