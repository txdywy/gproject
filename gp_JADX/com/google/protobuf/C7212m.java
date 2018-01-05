package com.google.protobuf;

final class C7212m extends C7211q {
    public final int f35432d;
    public final int f35433e;

    C7212m(byte[] bArr, int i, int i2) {
        super(bArr);
        C7203j.m33205c(i, i + i2, bArr.length);
        this.f35432d = i;
        this.f35433e = i2;
    }

    public final byte mo6169a(int i) {
        C7203j.m33204b(i, mo6170a());
        return this.f[this.f35432d + i];
    }

    public final int mo6170a() {
        return this.f35433e;
    }

    protected final int mo6224g() {
        return this.f35432d;
    }

    protected final void mo6176b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f, mo6224g() + i, bArr, i2, i3);
    }
}
