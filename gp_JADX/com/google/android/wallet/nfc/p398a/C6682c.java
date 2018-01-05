package com.google.android.wallet.nfc.p398a;

public final class C6682c {
    public final byte[] f32979a;

    C6682c(byte b, byte b2, byte b3, byte b4, byte[] bArr, byte b5, boolean z, boolean z2) {
        int i;
        int length = z ? bArr.length : 0;
        if (z) {
            i = length + 5;
        } else {
            i = 4;
        }
        if (z2) {
            i++;
        }
        this.f32979a = new byte[i];
        this.f32979a[0] = b;
        this.f32979a[1] = b2;
        this.f32979a[2] = b3;
        this.f32979a[3] = b4;
        if (z) {
            this.f32979a[4] = (byte) length;
            System.arraycopy(bArr, 0, this.f32979a, 5, bArr.length);
        }
        if (z2) {
            this.f32979a[i - 1] = b5;
        }
    }
}
