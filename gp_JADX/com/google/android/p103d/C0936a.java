package com.google.android.p103d;

import com.squareup.haha.perflib.HprofParser;

public final class C0936a {
    public final byte[] f5732a;
    public final int f5733b = 0;
    public int f5734c;

    C0936a(byte[] bArr) {
        this.f5732a = bArr;
    }

    public final int m5674a() {
        int i = this.f5733b + this.f5734c;
        this.f5734c += 4;
        int i2 = i + 1;
        int i3 = i2 + 1;
        return ((((this.f5732a[i] & HprofParser.ROOT_UNKNOWN) << 0) | ((this.f5732a[i2] & HprofParser.ROOT_UNKNOWN) << 8)) | ((this.f5732a[i3] & HprofParser.ROOT_UNKNOWN) << 16)) | ((this.f5732a[i3 + 1] & HprofParser.ROOT_UNKNOWN) << 24);
    }

    public final short m5675b() {
        int i = this.f5733b + this.f5734c;
        this.f5734c += 2;
        return (short) (((this.f5732a[i] & HprofParser.ROOT_UNKNOWN) << 0) | ((this.f5732a[i + 1] & HprofParser.ROOT_UNKNOWN) << 8));
    }
}
