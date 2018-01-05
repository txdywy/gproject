package com.google.protobuf;

import java.nio.charset.Charset;

class C7211q extends C7210p {
    public final byte[] f35431f;

    C7211q(byte[] bArr) {
        this.f35431f = bArr;
    }

    public byte mo6169a(int i) {
        return this.f35431f[i];
    }

    public int mo6170a() {
        return this.f35431f.length;
    }

    public final C7203j mo6172a(int i, int i2) {
        int c = C7203j.m33205c(i, i2, mo6170a());
        if (c == 0) {
            return C7203j.f35320a;
        }
        return new C7212m(this.f35431f, mo6224g() + i, c);
    }

    protected void mo6176b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f35431f, i, bArr, i2, i3);
    }

    final void mo6174a(C7195i c7195i) {
        c7195i.mo6038a(this.f35431f, mo6224g(), mo6170a());
    }

    protected final String mo6173a(Charset charset) {
        return new String(this.f35431f, mo6224g(), mo6170a(), charset);
    }

    public final boolean mo6177c() {
        int g = mo6224g();
        return Utf8.m32681a(this.f35431f, g, mo6170a() + g);
    }

    protected final int mo6171a(int i, int i2, int i3) {
        int g = mo6224g() + i2;
        return Utf8.f35084a.mo6217a(i, this.f35431f, g, g + i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7203j)) {
            return false;
        }
        if (mo6170a() != ((C7203j) obj).mo6170a()) {
            return false;
        }
        if (mo6170a() == 0) {
            return true;
        }
        if (!(obj instanceof C7211q)) {
            return obj.equals(this);
        }
        C7211q c7211q = (C7211q) obj;
        int i = this.f35322c;
        int i2 = c7211q.f35322c;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo6223a((C7211q) obj, 0, mo6170a());
        }
        return false;
    }

    final boolean mo6223a(C7203j c7203j, int i, int i2) {
        if (i2 > c7203j.mo6170a()) {
            throw new IllegalArgumentException("Length too large: " + i2 + mo6170a());
        } else if (i + i2 > c7203j.mo6170a()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + c7203j.mo6170a());
        } else if (!(c7203j instanceof C7211q)) {
            return c7203j.mo6172a(i, i + i2).equals(mo6172a(0, i2));
        } else {
            C7211q c7211q = (C7211q) c7203j;
            byte[] bArr = this.f35431f;
            byte[] bArr2 = c7211q.f35431f;
            int g = mo6224g() + i2;
            int g2 = mo6224g();
            int g3 = c7211q.mo6224g() + i;
            while (g2 < g) {
                if (bArr[g2] != bArr2[g3]) {
                    return false;
                }
                g2++;
                g3++;
            }
            return true;
        }
    }

    protected final int mo6175b(int i, int i2, int i3) {
        return bb.m32990a(i, this.f35431f, mo6224g() + i2, i3);
    }

    public final C7225s mo6178d() {
        return C7225s.m33629a(this.f35431f, mo6224g(), mo6170a(), true);
    }

    protected int mo6224g() {
        return 0;
    }
}
