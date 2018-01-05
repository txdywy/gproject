package com.google.android.gms.internal;

import com.squareup.haha.perflib.HprofParser;

public final class tx {
    public final byte[] f27505a = new byte[256];
    public int f27506b;
    public int f27507c;

    public tx(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.f27505a[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            i = ((i + this.f27505a[i2]) + bArr[i2 % bArr.length]) & HprofParser.ROOT_UNKNOWN;
            byte b = this.f27505a[i2];
            this.f27505a[i2] = this.f27505a[i];
            this.f27505a[i] = b;
        }
        this.f27506b = 0;
        this.f27507c = 0;
    }

    public final void m25643a(byte[] bArr) {
        int i = this.f27506b;
        int i2 = this.f27507c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & HprofParser.ROOT_UNKNOWN;
            i2 = (i2 + this.f27505a[i]) & HprofParser.ROOT_UNKNOWN;
            byte b = this.f27505a[i];
            this.f27505a[i] = this.f27505a[i2];
            this.f27505a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f27505a[(this.f27505a[i] + this.f27505a[i2]) & HprofParser.ROOT_UNKNOWN]);
        }
        this.f27506b = i;
        this.f27507c = i2;
    }
}
