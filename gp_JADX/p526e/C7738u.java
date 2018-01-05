package p526e;

import java.io.EOFException;
import java.io.InputStream;

final class C7738u implements C7725i {
    public final C7726f f40217a = new C7726f();
    public final aa f40218b;
    public boolean f40219c;

    C7738u(aa aaVar) {
        if (aaVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f40218b = aaVar;
    }

    public final C7726f mo6486b() {
        return this.f40217a;
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (c7726f == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f40219c) {
            throw new IllegalStateException("closed");
        } else if (this.f40217a.f40188c == 0 && this.f40218b.mo6423a(this.f40217a, 8192) == -1) {
            return -1;
        } else {
            return this.f40217a.mo6423a(c7726f, Math.min(j, this.f40217a.f40188c));
        }
    }

    public final boolean mo6492d() {
        if (!this.f40219c) {
            return this.f40217a.mo6492d() && this.f40218b.mo6423a(this.f40217a, 8192) == -1;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void mo6485a(long j) {
        if (!m37466b(j)) {
            throw new EOFException();
        }
    }

    private final boolean m37466b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f40219c) {
            throw new IllegalStateException("closed");
        } else {
            while (this.f40217a.f40188c < j) {
                if (this.f40218b.mo6423a(this.f40217a, 8192) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    public final byte mo6496f() {
        mo6485a(1);
        return this.f40217a.mo6496f();
    }

    public final C7728j mo6490c(long j) {
        mo6485a(j);
        return this.f40217a.mo6490c(j);
    }

    public final byte[] mo6505o() {
        this.f40217a.mo6481a(this.f40218b);
        return this.f40217a.mo6505o();
    }

    public final byte[] mo6495e(long j) {
        mo6485a(j);
        return this.f40217a.mo6495e(j);
    }

    public final String mo6504n() {
        if (Long.MAX_VALUE < 0) {
            throw new IllegalArgumentException("limit < 0: " + Long.MAX_VALUE);
        }
        long j = Long.MAX_VALUE == Long.MAX_VALUE ? Long.MAX_VALUE : Long.MIN_VALUE;
        long a = m37465a((byte) 10, 0, j);
        if (a != -1) {
            return this.f40217a.m37392d(a);
        }
        if (j < Long.MAX_VALUE && m37466b(j) && this.f40217a.m37383b(j - 1) == (byte) 13 && m37466b(j + 1) && this.f40217a.m37383b(j) == (byte) 10) {
            return this.f40217a.m37392d(j);
        }
        C7726f c7726f = new C7726f();
        this.f40217a.m37376a(c7726f, 0, Math.min(32, this.f40217a.f40188c));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f40217a.f40188c, Long.MAX_VALUE) + " content=" + c7726f.m37405l().mo6520c() + '…');
    }

    public final short mo6499g() {
        mo6485a(2);
        return this.f40217a.mo6499g();
    }

    public final short mo6501i() {
        mo6485a(2);
        return ad.m37328a(this.f40217a.mo6499g());
    }

    public final int mo6500h() {
        mo6485a(4);
        return this.f40217a.mo6500h();
    }

    public final int mo6502j() {
        mo6485a(4);
        return ad.m37327a(this.f40217a.mo6500h());
    }

    public final long mo6503k() {
        mo6485a(1);
        for (int i = 0; m37466b((long) (i + 1)); i++) {
            byte b = this.f40217a.m37383b((long) i);
            if ((b < (byte) 48 || b > (byte) 57) && ((b < (byte) 97 || b > (byte) 102) && (b < (byte) 65 || b > (byte) 70))) {
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(b)}));
                }
                return this.f40217a.mo6503k();
            }
        }
        return this.f40217a.mo6503k();
    }

    public final void mo6497f(long j) {
        if (this.f40219c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f40217a.f40188c == 0 && this.f40218b.mo6423a(this.f40217a, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f40217a.f40188c);
            this.f40217a.mo6497f(min);
            j -= min;
        }
    }

    public final long mo6506q() {
        return m37465a((byte) 0, 0, Long.MAX_VALUE);
    }

    private final long m37465a(byte b, long j, long j2) {
        if (this.f40219c) {
            throw new IllegalStateException("closed");
        } else if (0 < 0 || j2 < 0) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(0), Long.valueOf(j2)}));
        } else {
            long j3 = j;
            while (j3 < j2) {
                long a = this.f40217a.m37371a(b, j3, j2);
                if (a != -1) {
                    return a;
                }
                a = this.f40217a.f40188c;
                if (a >= j2 || this.f40218b.mo6423a(this.f40217a, 8192) == -1) {
                    return -1;
                }
                j3 = Math.max(j3, a);
            }
            return -1;
        }
    }

    public final InputStream mo6494e() {
        return new C7739v(this);
    }

    public final void close() {
        if (!this.f40219c) {
            this.f40219c = true;
            this.f40218b.close();
            this.f40217a.m37409p();
        }
    }

    public final ab mo6424a() {
        return this.f40218b.mo6424a();
    }

    public final String toString() {
        return "buffer(" + this.f40218b + ")";
    }
}
