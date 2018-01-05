package p526e;

import java.util.Arrays;

final class C7742y extends C7728j {
    public final transient byte[][] f40230f;
    public final transient int[] f40231g;

    C7742y(C7726f c7726f, int i) {
        int i2 = 0;
        super(null);
        ad.m37329a(c7726f.f40188c, 0, (long) i);
        C7740w c7740w = c7726f.f40187b;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            if (c7740w.f40223c == c7740w.f40222b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += c7740w.f40223c - c7740w.f40222b;
            i3++;
            c7740w = c7740w.f40226f;
        }
        this.f40230f = new byte[i3][];
        this.f40231g = new int[(i3 * 2)];
        C7740w c7740w2 = c7726f.f40187b;
        i4 = 0;
        while (i2 < i) {
            this.f40230f[i4] = c7740w2.f40221a;
            int i5 = (c7740w2.f40223c - c7740w2.f40222b) + i2;
            if (i5 > i) {
                i5 = i;
            }
            this.f40231g[i4] = i5;
            this.f40231g[this.f40230f.length + i4] = c7740w2.f40222b;
            c7740w2.f40224d = true;
            i4++;
            c7740w2 = c7740w2.f40226f;
            i2 = i5;
        }
    }

    public final String mo6515a() {
        return m37491g().mo6515a();
    }

    public final String mo6519b() {
        return m37491g().mo6519b();
    }

    public final String mo6520c() {
        return m37491g().mo6520c();
    }

    public final C7728j mo6521d() {
        return m37491g().mo6521d();
    }

    public final C7728j mo6514a(int i, int i2) {
        return m37491g().mo6514a(i, i2);
    }

    public final byte mo6513a(int i) {
        ad.m37329a((long) this.f40231g[this.f40230f.length - 1], (long) i, 1);
        int b = m37490b(i);
        return this.f40230f[b][(i - (b == 0 ? 0 : this.f40231g[b - 1])) + this.f40231g[this.f40230f.length + b]];
    }

    private final int m37490b(int i) {
        int binarySearch = Arrays.binarySearch(this.f40231g, 0, this.f40230f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    public final int mo6522e() {
        return this.f40231g[this.f40230f.length - 1];
    }

    public final byte[] mo6524f() {
        int i = 0;
        Object obj = new byte[this.f40231g[this.f40230f.length - 1]];
        int length = this.f40230f.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f40231g[length + i];
            int i4 = this.f40231g[i];
            System.arraycopy(this.f40230f[i], i3, obj, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return obj;
    }

    final void mo6516a(C7726f c7726f) {
        int i = 0;
        int length = this.f40230f.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f40231g[length + i];
            int i4 = this.f40231g[i];
            C7740w c7740w = new C7740w(this.f40230f[i], i3, (i3 + i4) - i2);
            if (c7726f.f40187b == null) {
                c7740w.f40227g = c7740w;
                c7740w.f40226f = c7740w;
                c7726f.f40187b = c7740w;
            } else {
                c7726f.f40187b.f40227g.m37486a(c7740w);
            }
            i++;
            i2 = i4;
        }
        c7726f.f40188c = ((long) i2) + c7726f.f40188c;
    }

    public final boolean mo6517a(int i, C7728j c7728j, int i2, int i3) {
        if (mo6522e() - i3 < 0) {
            return false;
        }
        int b = m37490b(0);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f40231g[b - 1];
            int min = Math.min(i3, ((this.f40231g[b] - i4) + i4) - i);
            if (!c7728j.mo6518a(i2, this.f40230f[b], (i - i4) + this.f40231g[this.f40230f.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    public final boolean mo6518a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo6522e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m37490b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f40231g[b - 1];
            int min = Math.min(i3, ((this.f40231g[b] - i4) + i4) - i);
            if (!ad.m37331a(this.f40230f[b], (i - i4) + this.f40231g[this.f40230f.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    private final C7728j m37491g() {
        return new C7728j(mo6524f());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C7728j) && ((C7728j) obj).mo6522e() == mo6522e() && mo6517a(0, (C7728j) obj, 0, mo6522e());
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            i = 1;
            int length = this.f40230f.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr = this.f40230f[i2];
                int i4 = this.f40231g[length + i2];
                int i5 = this.f40231g[i2];
                i3 = (i5 - i3) + i4;
                int i6 = i4;
                i4 = i;
                for (i = i6; i < i3; i++) {
                    i4 = (i4 * 31) + bArr[i];
                }
                i2++;
                i3 = i5;
                i = i4;
            }
            this.d = i;
        }
        return i;
    }

    public final String toString() {
        return m37491g().toString();
    }
}
