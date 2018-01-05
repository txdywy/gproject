package com.squareup.okhttp.internal.p525a;

import com.squareup.haha.perflib.HprofParser;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import p526e.C7724h;
import p526e.C7726f;

final class ag implements C7611d {
    public final C7724h f39412a;
    public final boolean f39413b;
    public final C7726f f39414c = new C7726f();
    public final ab f39415d = new ab(this.f39414c);
    public int f39416e = 16384;
    public boolean f39417f;

    ag(C7724h c7724h, boolean z) {
        this.f39412a = c7724h;
        this.f39413b = z;
    }

    public final synchronized void mo6436b() {
        if (this.f39417f) {
            throw new IOException("closed");
        }
        this.f39412a.flush();
    }

    public final synchronized void mo6432a(ap apVar) {
        if (this.f39417f) {
            throw new IOException("closed");
        }
        int i = this.f39416e;
        if ((apVar.f39434a & 32) != 0) {
            i = apVar.f39437d[5];
        }
        this.f39416e = i;
        m36726a(0, 0, (byte) 4, (byte) 1);
        this.f39412a.flush();
    }

    public final synchronized void mo6428a() {
        if (this.f39417f) {
            throw new IOException("closed");
        } else if (this.f39413b) {
            if (ac.f39397a.isLoggable(Level.FINE)) {
                ac.f39397a.fine(String.format(">> CONNECTION %s", new Object[]{ac.f39398b.mo6520c()}));
            }
            this.f39412a.mo6484a(ac.f39398b.mo6524f());
            this.f39412a.flush();
        }
    }

    public final synchronized void mo6435a(boolean z, int i, List list) {
        if (this.f39417f) {
            throw new IOException("closed");
        } else if (this.f39417f) {
            throw new IOException("closed");
        } else {
            this.f39415d.m36694a(list);
            long j = this.f39414c.f40188c;
            int min = (int) Math.min((long) this.f39416e, j);
            byte b = j == ((long) min) ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m36726a(i, min, (byte) 1, b);
            this.f39412a.a_(this.f39414c, (long) min);
            if (j > ((long) min)) {
                m36727b(i, j - ((long) min));
            }
        }
    }

    private final void m36727b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f39416e, j);
            j -= (long) min;
            m36726a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f39412a.a_(this.f39414c, (long) min);
        }
    }

    public final synchronized void mo6430a(int i, C7609a c7609a) {
        if (this.f39417f) {
            throw new IOException("closed");
        } else if (c7609a.f39385s == -1) {
            throw new IllegalArgumentException();
        } else {
            m36726a(i, 4, (byte) 3, (byte) 0);
            this.f39412a.mo6489c(c7609a.f39385s);
            this.f39412a.flush();
        }
    }

    public final int mo6438c() {
        return this.f39416e;
    }

    public final synchronized void mo6434a(boolean z, int i, C7726f c7726f, int i2) {
        byte b = (byte) 0;
        synchronized (this) {
            if (this.f39417f) {
                throw new IOException("closed");
            }
            if (z) {
                b = (byte) 1;
            }
            m36726a(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f39412a.a_(c7726f, (long) i2);
            }
        }
    }

    public final synchronized void mo6437b(ap apVar) {
        synchronized (this) {
            if (this.f39417f) {
                throw new IOException("closed");
            }
            m36726a(0, Integer.bitCount(apVar.f39434a) * 6, (byte) 4, (byte) 0);
            for (int i = 0; i < 10; i++) {
                if (apVar.m36755a(i)) {
                    int i2;
                    if (i == 4) {
                        i2 = 3;
                    } else if (i == 7) {
                        i2 = 4;
                    } else {
                        i2 = i;
                    }
                    this.f39412a.mo6491d(i2);
                    this.f39412a.mo6489c(apVar.f39437d[i]);
                }
            }
            this.f39412a.flush();
        }
    }

    public final synchronized void mo6433a(boolean z, int i, int i2) {
        byte b = (byte) 0;
        synchronized (this) {
            if (this.f39417f) {
                throw new IOException("closed");
            }
            if (z) {
                b = (byte) 1;
            }
            m36726a(0, 8, (byte) 6, b);
            this.f39412a.mo6489c(i);
            this.f39412a.mo6489c(i2);
            this.f39412a.flush();
        }
    }

    public final synchronized void mo6431a(int i, C7609a c7609a, byte[] bArr) {
        if (this.f39417f) {
            throw new IOException("closed");
        } else if (c7609a.f39385s == -1) {
            throw ac.m36699a("errorCode.httpCode == -1", new Object[0]);
        } else {
            m36726a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f39412a.mo6489c(i);
            this.f39412a.mo6489c(c7609a.f39385s);
            if (bArr.length > 0) {
                this.f39412a.mo6484a(bArr);
            }
            this.f39412a.flush();
        }
    }

    public final synchronized void mo6429a(int i, long j) {
        if (this.f39417f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw ac.m36699a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            m36726a(i, 4, (byte) 8, (byte) 0);
            this.f39412a.mo6489c((int) j);
            this.f39412a.flush();
        }
    }

    public final synchronized void close() {
        this.f39417f = true;
        this.f39412a.close();
    }

    private final void m36726a(int i, int i2, byte b, byte b2) {
        if (ac.f39397a.isLoggable(Level.FINE)) {
            ac.f39397a.fine(ae.m36708a(false, i, i2, b, b2));
        }
        if (i2 > this.f39416e) {
            throw ac.m36699a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f39416e), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) != 0) {
            throw ac.m36699a("reserved bit set: %s", Integer.valueOf(i));
        } else {
            ac.m36700a(this.f39412a, i2);
            this.f39412a.mo6493e(b & HprofParser.ROOT_UNKNOWN);
            this.f39412a.mo6493e(b2 & HprofParser.ROOT_UNKNOWN);
            this.f39412a.mo6489c(Integer.MAX_VALUE & i);
        }
    }
}
