package p526e;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.Inflater;

public final class C7732o implements aa {
    public final C7725i f40204a;
    public final Inflater f40205b;
    public int f40206c;
    public boolean f40207d;

    public C7732o(aa aaVar, Inflater inflater) {
        this(C7733p.m37442a(aaVar), inflater);
    }

    C7732o(C7725i c7725i, Inflater inflater) {
        if (c7725i == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        } else {
            this.f40204a = c7725i;
            this.f40205b = inflater;
        }
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f40207d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            boolean b;
            do {
                b = m37440b();
                try {
                    C7740w b2 = c7726f.m37387b(1);
                    int inflate = this.f40205b.inflate(b2.f40221a, b2.f40223c, 8192 - b2.f40223c);
                    if (inflate > 0) {
                        b2.f40223c += inflate;
                        c7726f.f40188c += (long) inflate;
                        return (long) inflate;
                    } else if (this.f40205b.finished() || this.f40205b.needsDictionary()) {
                        m37437c();
                        if (b2.f40222b == b2.f40223c) {
                            c7726f.f40187b = b2.m37485a();
                            C7741x.m37489a(b2);
                        }
                        return -1;
                    }
                } catch (Throwable e) {
                    throw new IOException(e);
                }
            } while (!b);
            throw new EOFException("source exhausted prematurely");
        }
    }

    public final boolean m37440b() {
        if (!this.f40205b.needsInput()) {
            return false;
        }
        m37437c();
        if (this.f40205b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f40204a.mo6492d()) {
            return true;
        } else {
            C7740w c7740w = this.f40204a.mo6486b().f40187b;
            this.f40206c = c7740w.f40223c - c7740w.f40222b;
            this.f40205b.setInput(c7740w.f40221a, c7740w.f40222b, this.f40206c);
            return false;
        }
    }

    private final void m37437c() {
        if (this.f40206c != 0) {
            int remaining = this.f40206c - this.f40205b.getRemaining();
            this.f40206c -= remaining;
            this.f40204a.mo6497f((long) remaining);
        }
    }

    public final ab mo6424a() {
        return this.f40204a.mo6424a();
    }

    public final void close() {
        if (!this.f40207d) {
            this.f40205b.end();
            this.f40207d = true;
            this.f40204a.close();
        }
    }
}
