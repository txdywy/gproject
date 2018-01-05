package com.squareup.okhttp.internal.p525a;

import com.squareup.haha.perflib.HprofParser;
import com.squareup.okhttp.internal.k;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;
import p526e.C7724h;
import p526e.C7726f;
import p526e.C7728j;
import p526e.C7729k;
import p526e.C7733p;

final class as implements C7611d {
    public final C7724h f39442a;
    public final C7726f f39443b = new C7726f();
    public final C7724h f39444c;
    public final boolean f39445d;
    public boolean f39446e;

    as(C7724h c7724h, boolean z) {
        this.f39442a = c7724h;
        this.f39445d = z;
        Deflater deflater = new Deflater();
        deflater.setDictionary(aq.f39438a);
        this.f39444c = C7733p.m37441a(new C7729k(this.f39443b, deflater));
    }

    public final void mo6432a(ap apVar) {
    }

    public final synchronized void mo6428a() {
    }

    public final synchronized void mo6436b() {
        if (this.f39446e) {
            throw new IOException("closed");
        }
        this.f39442a.flush();
    }

    public final synchronized void mo6435a(boolean z, int i, List list) {
        int i2 = 0;
        synchronized (this) {
            if (this.f39446e) {
                throw new IOException("closed");
            }
            m36764a(list);
            int i3 = (int) (10 + this.f39443b.f40188c);
            if (z) {
                i2 = 1;
            }
            i2 |= 0;
            this.f39442a.mo6489c(-2147287039);
            this.f39442a.mo6489c(((i2 & HprofParser.ROOT_UNKNOWN) << 24) | (i3 & 16777215));
            this.f39442a.mo6489c(Integer.MAX_VALUE & i);
            this.f39442a.mo6489c(0);
            this.f39442a.mo6491d(0);
            this.f39442a.mo6481a(this.f39443b);
            this.f39442a.flush();
        }
    }

    public final synchronized void mo6430a(int i, C7609a c7609a) {
        if (this.f39446e) {
            throw new IOException("closed");
        } else if (c7609a.f39386t == -1) {
            throw new IllegalArgumentException();
        } else {
            this.f39442a.mo6489c(-2147287037);
            this.f39442a.mo6489c(8);
            this.f39442a.mo6489c(Integer.MAX_VALUE & i);
            this.f39442a.mo6489c(c7609a.f39386t);
            this.f39442a.flush();
        }
    }

    public final int mo6438c() {
        return 16383;
    }

    public final synchronized void mo6434a(boolean z, int i, C7726f c7726f, int i2) {
        int i3 = z ? 1 : 0;
        if (this.f39446e) {
            throw new IOException("closed");
        } else if (((long) i2) > 16777215) {
            throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i2);
        } else {
            this.f39442a.mo6489c(Integer.MAX_VALUE & i);
            this.f39442a.mo6489c(((i3 & HprofParser.ROOT_UNKNOWN) << 24) | (16777215 & i2));
            if (i2 > 0) {
                this.f39442a.a_(c7726f, (long) i2);
            }
        }
    }

    private final void m36764a(List list) {
        this.f39444c.mo6489c(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7728j c7728j = ((C7636x) list.get(i)).f39545h;
            this.f39444c.mo6489c(c7728j.mo6522e());
            this.f39444c.mo6482a(c7728j);
            c7728j = ((C7636x) list.get(i)).f39546i;
            this.f39444c.mo6489c(c7728j.mo6522e());
            this.f39444c.mo6482a(c7728j);
        }
        this.f39444c.flush();
    }

    public final synchronized void mo6437b(ap apVar) {
        if (this.f39446e) {
            throw new IOException("closed");
        }
        int bitCount = Integer.bitCount(apVar.f39434a);
        int i = (bitCount * 8) + 4;
        this.f39442a.mo6489c(-2147287036);
        this.f39442a.mo6489c((i & 16777215) | 0);
        this.f39442a.mo6489c(bitCount);
        for (bitCount = 0; bitCount <= 10; bitCount++) {
            if (apVar.m36755a(bitCount)) {
                this.f39442a.mo6489c(((apVar.m36757b(bitCount) & HprofParser.ROOT_UNKNOWN) << 24) | (bitCount & 16777215));
                this.f39442a.mo6489c(apVar.f39437d[bitCount]);
            }
        }
        this.f39442a.flush();
    }

    public final synchronized void mo6433a(boolean z, int i, int i2) {
        boolean z2 = true;
        synchronized (this) {
            if (this.f39446e) {
                throw new IOException("closed");
            }
            boolean z3;
            boolean z4 = this.f39445d;
            if ((i & 1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z4 == z3) {
                z2 = false;
            }
            if (z != z2) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.f39442a.mo6489c(-2147287034);
            this.f39442a.mo6489c(4);
            this.f39442a.mo6489c(i);
            this.f39442a.flush();
        }
    }

    public final synchronized void mo6431a(int i, C7609a c7609a, byte[] bArr) {
        if (this.f39446e) {
            throw new IOException("closed");
        } else if (c7609a.f39387u == -1) {
            throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
        } else {
            this.f39442a.mo6489c(-2147287033);
            this.f39442a.mo6489c(8);
            this.f39442a.mo6489c(i);
            this.f39442a.mo6489c(c7609a.f39387u);
            this.f39442a.flush();
        }
    }

    public final synchronized void mo6429a(int i, long j) {
        if (this.f39446e) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
        } else {
            this.f39442a.mo6489c(-2147287031);
            this.f39442a.mo6489c(8);
            this.f39442a.mo6489c(i);
            this.f39442a.mo6489c((int) j);
            this.f39442a.flush();
        }
    }

    public final synchronized void close() {
        this.f39446e = true;
        k.a(this.f39442a, this.f39444c);
    }
}
