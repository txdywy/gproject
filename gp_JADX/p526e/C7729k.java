package p526e;

import java.util.zip.Deflater;

public final class C7729k implements C7631z {
    public final C7724h f40195a;
    public final Deflater f40196b;
    public boolean f40197c;

    public C7729k(C7631z c7631z, Deflater deflater) {
        this(C7733p.m37441a(c7631z), deflater);
    }

    private C7729k(C7724h c7724h, Deflater deflater) {
        if (c7724h == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        } else {
            this.f40195a = c7724h;
            this.f40196b = deflater;
        }
    }

    public final void a_(C7726f c7726f, long j) {
        ad.m37329a(c7726f.f40188c, 0, j);
        while (j > 0) {
            C7740w c7740w = c7726f.f40187b;
            int min = (int) Math.min(j, (long) (c7740w.f40223c - c7740w.f40222b));
            this.f40196b.setInput(c7740w.f40221a, c7740w.f40222b, min);
            m37425a(false);
            c7726f.f40188c -= (long) min;
            c7740w.f40222b += min;
            if (c7740w.f40222b == c7740w.f40223c) {
                c7726f.f40187b = c7740w.m37485a();
                C7741x.m37489a(c7740w);
            }
            j -= (long) min;
        }
    }

    private final void m37425a(boolean z) {
        C7726f b = this.f40195a.mo6486b();
        while (true) {
            int deflate;
            C7740w b2 = b.m37387b(1);
            if (z) {
                deflate = this.f40196b.deflate(b2.f40221a, b2.f40223c, 8192 - b2.f40223c, 2);
            } else {
                deflate = this.f40196b.deflate(b2.f40221a, b2.f40223c, 8192 - b2.f40223c);
            }
            if (deflate > 0) {
                b2.f40223c += deflate;
                b.f40188c += (long) deflate;
                this.f40195a.mo6507r();
            } else if (this.f40196b.needsInput()) {
                break;
            }
        }
        if (b2.f40222b == b2.f40223c) {
            b.f40187b = b2.m37485a();
            C7741x.m37489a(b2);
        }
    }

    public final void flush() {
        m37425a(true);
        this.f40195a.flush();
    }

    public final void close() {
        Throwable th;
        if (!this.f40197c) {
            Throwable th2 = null;
            try {
                this.f40196b.finish();
                m37425a(false);
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.f40196b.end();
                th3 = th2;
            } catch (Throwable th4) {
                th3 = th4;
                if (th2 != null) {
                    th3 = th2;
                }
            }
            try {
                this.f40195a.close();
            } catch (Throwable th22) {
                if (th3 == null) {
                    th3 = th22;
                }
            }
            this.f40197c = true;
            if (th3 != null) {
                ad.m37330a(th3);
            }
        }
    }

    public final ab mo6454a() {
        return this.f40195a.mo6454a();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f40195a + ")";
    }
}
