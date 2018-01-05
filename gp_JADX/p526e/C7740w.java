package p526e;

public final class C7740w {
    public final byte[] f40221a;
    public int f40222b;
    public int f40223c;
    public boolean f40224d;
    public boolean f40225e;
    public C7740w f40226f;
    public C7740w f40227g;

    C7740w() {
        this.f40221a = new byte[8192];
        this.f40225e = true;
        this.f40224d = false;
    }

    C7740w(C7740w c7740w) {
        this(c7740w.f40221a, c7740w.f40222b, c7740w.f40223c);
        c7740w.f40224d = true;
    }

    C7740w(byte[] bArr, int i, int i2) {
        this.f40221a = bArr;
        this.f40222b = i;
        this.f40223c = i2;
        this.f40225e = false;
        this.f40224d = true;
    }

    public final C7740w m37485a() {
        C7740w c7740w = this.f40226f != this ? this.f40226f : null;
        this.f40227g.f40226f = this.f40226f;
        this.f40226f.f40227g = this.f40227g;
        this.f40226f = null;
        this.f40227g = null;
        return c7740w;
    }

    public final C7740w m37486a(C7740w c7740w) {
        c7740w.f40227g = this;
        c7740w.f40226f = this.f40226f;
        this.f40226f.f40227g = c7740w;
        this.f40226f = c7740w;
        return c7740w;
    }

    public final void m37487a(C7740w c7740w, int i) {
        if (c7740w.f40225e) {
            if (c7740w.f40223c + i > 8192) {
                if (c7740w.f40224d) {
                    throw new IllegalArgumentException();
                } else if ((c7740w.f40223c + i) - c7740w.f40222b > 8192) {
                    throw new IllegalArgumentException();
                } else {
                    System.arraycopy(c7740w.f40221a, c7740w.f40222b, c7740w.f40221a, 0, c7740w.f40223c - c7740w.f40222b);
                    c7740w.f40223c -= c7740w.f40222b;
                    c7740w.f40222b = 0;
                }
            }
            System.arraycopy(this.f40221a, this.f40222b, c7740w.f40221a, c7740w.f40223c, i);
            c7740w.f40223c += i;
            this.f40222b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
