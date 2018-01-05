package com.squareup.okhttp.internal.p525a;

import java.io.EOFException;
import java.io.IOException;
import p526e.C7725i;
import p526e.C7726f;
import p526e.aa;
import p526e.ab;

final class C7633v implements aa {
    public final C7726f f39521a = new C7726f();
    public final C7726f f39522b = new C7726f();
    public final long f39523c;
    public boolean f39524d;
    public boolean f39525e;
    public final /* synthetic */ C7630t f39526f;

    C7633v(C7630t c7630t, long j) {
        this.f39526f = c7630t;
        this.f39523c = j;
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        long j2;
        synchronized (this.f39526f) {
            m36836b();
            if (this.f39524d) {
                throw new IOException("stream closed");
            } else if (this.f39526f.f39516j != null) {
                throw new IOException("stream was reset: " + this.f39526f.f39516j);
            } else if (this.f39522b.f40188c == 0) {
                j2 = -1;
            } else {
                j2 = this.f39522b.mo6423a(c7726f, Math.min(j, this.f39522b.f40188c));
                C7630t c7630t = this.f39526f;
                c7630t.f39507a += j2;
                if (this.f39526f.f39507a >= ((long) (this.f39526f.f39510d.f39461o.m36756b() / 2))) {
                    this.f39526f.f39510d.m36789a(this.f39526f.f39509c, this.f39526f.f39507a);
                    this.f39526f.f39507a = 0;
                }
                synchronized (this.f39526f.f39510d) {
                    C7614e c7614e = this.f39526f.f39510d;
                    c7614e.f39459m += j2;
                    if (this.f39526f.f39510d.f39459m >= ((long) (this.f39526f.f39510d.f39461o.m36756b() / 2))) {
                        this.f39526f.f39510d.m36789a(0, this.f39526f.f39510d.f39459m);
                        this.f39526f.f39510d.f39459m = 0;
                    }
                }
            }
        }
        return j2;
    }

    private final void m36836b() {
        this.f39526f.f39514h.cV_();
        while (this.f39522b.f40188c == 0 && !this.f39525e && !this.f39524d && this.f39526f.f39516j == null) {
            try {
                this.f39526f.m36832g();
            } catch (Throwable th) {
                this.f39526f.f39514h.m36854b();
            }
        }
        this.f39526f.f39514h.m36854b();
    }

    final void m36839a(C7725i c7725i, long j) {
        while (j > 0) {
            synchronized (this.f39526f) {
                boolean z = this.f39525e;
                Object obj = this.f39522b.f40188c + j > this.f39523c ? 1 : null;
            }
            if (obj != null) {
                c7725i.mo6497f(j);
                this.f39526f.m36825b(C7609a.FLOW_CONTROL_ERROR);
                return;
            } else if (z) {
                c7725i.mo6497f(j);
                return;
            } else {
                long a = c7725i.mo6423a(this.f39521a, j);
                if (a == -1) {
                    throw new EOFException();
                }
                j -= a;
                synchronized (this.f39526f) {
                    if (this.f39522b.f40188c == 0) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    this.f39522b.mo6481a(this.f39521a);
                    if (obj != null) {
                        this.f39526f.notifyAll();
                    }
                }
            }
        }
    }

    public final ab mo6424a() {
        return this.f39526f.f39514h;
    }

    public final void close() {
        synchronized (this.f39526f) {
            this.f39524d = true;
            this.f39522b.m37409p();
            this.f39526f.notifyAll();
        }
        this.f39526f.m36831f();
    }
}
