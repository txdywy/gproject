package com.google.android.gms.internal;

final class ug extends uk {
    public final int f27518d;
    public final int f27519e;

    ug(byte[] bArr, int i, int i2) {
        super(bArr);
        ud.m25651a(i, i + i2, bArr.length);
        this.f27518d = i;
        this.f27519e = i2;
    }

    public final byte mo4891a(int i) {
        int a = mo4892a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.f[this.f27518d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + a);
    }

    public final int mo4892a() {
        return this.f27519e;
    }

    protected final void mo4895a(byte[] bArr, int i) {
        System.arraycopy(this.f, mo4900e(), bArr, 0, i);
    }

    protected final int mo4900e() {
        return this.f27518d;
    }
}
