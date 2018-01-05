package com.google.android.d;

public final class com.google.android.d.a
{

    public final byte[] a;
    public final int b;
    public int c;

    a(byte[] p0) {
        this.a = p0;
        this.b = 0;
    }

    public final int a() {
        this.c = this.c + 4;
        return (this.a[this.b + this.c] & 255) << 0 | (this.a[this.b + this.c + 1] & 255) << 8 | (this.a[this.b + this.c + 2] & 255) << 16 | (this.a[this.b + this.c + 3] & 255) << 24;
    }

    public final short b() {
        this.c = this.c + 2;
        return (short)((this.a[this.b + this.c] & 255) << 0 | (this.a[this.b + this.c + 1] & 255) << 8);
    }

}
