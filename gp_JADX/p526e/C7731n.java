package p526e;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class C7731n implements aa {
    public int f40199a = 0;
    public final C7725i f40200b;
    public final Inflater f40201c;
    public final C7732o f40202d;
    public final CRC32 f40203e = new CRC32();

    public C7731n(aa aaVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f40201c = new Inflater(true);
        this.f40200b = C7733p.m37442a(aaVar);
        this.f40202d = new C7732o(this.f40200b, this.f40201c);
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f40199a == 0) {
                Object obj;
                long q;
                this.f40200b.mo6485a(10);
                byte b = this.f40200b.mo6486b().m37383b(3);
                if (((b >> 1) & 1) == 1) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    m37433a(this.f40200b.mo6486b(), 0, 10);
                }
                C7731n.m37434a("ID1ID2", 8075, this.f40200b.mo6499g());
                this.f40200b.mo6497f(8);
                if (((b >> 2) & 1) == 1) {
                    this.f40200b.mo6485a(2);
                    if (obj != null) {
                        m37433a(this.f40200b.mo6486b(), 0, 2);
                    }
                    short a = ad.m37328a(this.f40200b.mo6486b().mo6499g());
                    this.f40200b.mo6485a((long) a);
                    if (obj != null) {
                        m37433a(this.f40200b.mo6486b(), 0, (long) a);
                    }
                    this.f40200b.mo6497f((long) a);
                }
                if (((b >> 3) & 1) == 1) {
                    q = this.f40200b.mo6506q();
                    if (q == -1) {
                        throw new EOFException();
                    }
                    if (obj != null) {
                        m37433a(this.f40200b.mo6486b(), 0, 1 + q);
                    }
                    this.f40200b.mo6497f(1 + q);
                }
                if (((b >> 4) & 1) == 1) {
                    q = this.f40200b.mo6506q();
                    if (q == -1) {
                        throw new EOFException();
                    }
                    if (obj != null) {
                        m37433a(this.f40200b.mo6486b(), 0, 1 + q);
                    }
                    this.f40200b.mo6497f(1 + q);
                }
                if (obj != null) {
                    C7731n.m37434a("FHCRC", this.f40200b.mo6501i(), (short) ((int) this.f40203e.getValue()));
                    this.f40203e.reset();
                }
                this.f40199a = 1;
            }
            if (this.f40199a == 1) {
                long j2 = c7726f.f40188c;
                long a2 = this.f40202d.mo6423a(c7726f, j);
                if (a2 != -1) {
                    m37433a(c7726f, j2, a2);
                    return a2;
                }
                this.f40199a = 2;
            }
            if (this.f40199a == 2) {
                C7731n.m37434a("CRC", this.f40200b.mo6502j(), (int) this.f40203e.getValue());
                C7731n.m37434a("ISIZE", this.f40200b.mo6502j(), (int) this.f40201c.getBytesWritten());
                this.f40199a = 3;
                if (!this.f40200b.mo6492d()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final ab mo6424a() {
        return this.f40200b.mo6424a();
    }

    public final void close() {
        this.f40202d.close();
    }

    private final void m37433a(C7726f c7726f, long j, long j2) {
        C7740w c7740w = c7726f.f40187b;
        while (j >= ((long) (c7740w.f40223c - c7740w.f40222b))) {
            j -= (long) (c7740w.f40223c - c7740w.f40222b);
            c7740w = c7740w.f40226f;
        }
        while (j2 > 0) {
            int i = (int) (((long) c7740w.f40222b) + j);
            int min = (int) Math.min((long) (c7740w.f40223c - i), j2);
            this.f40203e.update(c7740w.f40221a, i, min);
            j2 -= (long) min;
            c7740w = c7740w.f40226f;
            j = 0;
        }
    }

    private static void m37434a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
