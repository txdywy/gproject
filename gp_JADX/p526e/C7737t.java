package p526e;

final class C7737t implements C7724h {
    public final C7726f f40214a = new C7726f();
    public final C7631z f40215b;
    public boolean f40216c;

    C7737t(C7631z c7631z) {
        if (c7631z == null) {
            throw new NullPointerException("sink == null");
        }
        this.f40215b = c7631z;
    }

    public final C7726f mo6486b() {
        return this.f40214a;
    }

    public final void a_(C7726f c7726f, long j) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.a_(c7726f, j);
        mo6507r();
    }

    public final C7724h mo6482a(C7728j c7728j) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.mo6482a(c7728j);
        return mo6507r();
    }

    public final C7724h mo6483a(String str) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.mo6483a(str);
        return mo6507r();
    }

    public final C7724h mo6484a(byte[] bArr) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.mo6484a(bArr);
        return mo6507r();
    }

    public final C7724h mo6487b(byte[] bArr, int i, int i2) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.mo6487b(bArr, i, i2);
        return mo6507r();
    }

    public final long mo6481a(aa aaVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long a = aaVar.mo6423a(this.f40214a, 8192);
            if (a == -1) {
                return j;
            }
            j += a;
            mo6507r();
        }
    }

    public final C7724h mo6493e(int i) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.mo6493e(i);
        return mo6507r();
    }

    public final C7724h mo6491d(int i) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.mo6491d(i);
        return mo6507r();
    }

    public final C7724h mo6489c(int i) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.mo6489c(i);
        return mo6507r();
    }

    public final C7724h mo6498g(long j) {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        this.f40214a.mo6498g(j);
        return mo6507r();
    }

    public final C7724h mo6507r() {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        C7726f c7726f = this.f40214a;
        long j = c7726f.f40188c;
        if (j == 0) {
            j = 0;
        } else {
            C7740w c7740w = c7726f.f40187b.f40227g;
            if (c7740w.f40223c < 8192 && c7740w.f40225e) {
                j -= (long) (c7740w.f40223c - c7740w.f40222b);
            }
        }
        if (j > 0) {
            this.f40215b.a_(this.f40214a, j);
        }
        return this;
    }

    public final C7724h mo6488c() {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        long j = this.f40214a.f40188c;
        if (j > 0) {
            this.f40215b.a_(this.f40214a, j);
        }
        return this;
    }

    public final void flush() {
        if (this.f40216c) {
            throw new IllegalStateException("closed");
        }
        if (this.f40214a.f40188c > 0) {
            this.f40215b.a_(this.f40214a, this.f40214a.f40188c);
        }
        this.f40215b.flush();
    }

    public final void close() {
        if (!this.f40216c) {
            Throwable th = null;
            try {
                if (this.f40214a.f40188c > 0) {
                    this.f40215b.a_(this.f40214a, this.f40214a.f40188c);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f40215b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f40216c = true;
            if (th != null) {
                ad.m37330a(th);
            }
        }
    }

    public final ab mo6454a() {
        return this.f40215b.mo6454a();
    }

    public final String toString() {
        return "buffer(" + this.f40215b + ")";
    }
}
