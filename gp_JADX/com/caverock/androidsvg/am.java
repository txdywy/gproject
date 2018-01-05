package com.caverock.androidsvg;

public final class am implements an {
    public byte[] f4253a;
    public int f4254b;
    public float[] f4255c;
    public int f4256d;

    public am() {
        this.f4253a = null;
        this.f4254b = 0;
        this.f4255c = null;
        this.f4256d = 0;
        this.f4253a = new byte[8];
        this.f4255c = new float[16];
    }

    final void m4585a(byte b) {
        if (this.f4254b == this.f4253a.length) {
            Object obj = new byte[(this.f4253a.length * 2)];
            System.arraycopy(this.f4253a, 0, obj, 0, this.f4253a.length);
            this.f4253a = obj;
        }
        byte[] bArr = this.f4253a;
        int i = this.f4254b;
        this.f4254b = i + 1;
        bArr[i] = b;
    }

    private final void m4583a(int i) {
        if (this.f4255c.length < this.f4256d + i) {
            Object obj = new float[(this.f4255c.length * 2)];
            System.arraycopy(this.f4255c, 0, obj, 0, this.f4255c.length);
            this.f4255c = obj;
        }
    }

    public final void mo1098a(float f, float f2) {
        m4585a((byte) 0);
        m4583a(2);
        float[] fArr = this.f4255c;
        int i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f2;
    }

    public final void mo1102b(float f, float f2) {
        m4585a((byte) 1);
        m4583a(2);
        float[] fArr = this.f4255c;
        int i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f2;
    }

    public final void mo1100a(float f, float f2, float f3, float f4, float f5, float f6) {
        m4585a((byte) 2);
        m4583a(6);
        float[] fArr = this.f4255c;
        int i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f2;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f3;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f4;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f5;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f6;
    }

    public final void mo1099a(float f, float f2, float f3, float f4) {
        m4585a((byte) 3);
        m4583a(4);
        float[] fArr = this.f4255c;
        int i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f2;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f3;
        fArr = this.f4255c;
        i = this.f4256d;
        this.f4256d = i + 1;
        fArr[i] = f4;
    }

    public final void mo1101a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        int i = 0;
        int i2 = (z ? 2 : 0) | 4;
        if (z2) {
            i = 1;
        }
        m4585a((byte) (i | i2));
        m4583a(5);
        float[] fArr = this.f4255c;
        i2 = this.f4256d;
        this.f4256d = i2 + 1;
        fArr[i2] = f;
        fArr = this.f4255c;
        i2 = this.f4256d;
        this.f4256d = i2 + 1;
        fArr[i2] = f2;
        fArr = this.f4255c;
        i2 = this.f4256d;
        this.f4256d = i2 + 1;
        fArr[i2] = f3;
        fArr = this.f4255c;
        i2 = this.f4256d;
        this.f4256d = i2 + 1;
        fArr[i2] = f4;
        fArr = this.f4255c;
        i2 = this.f4256d;
        this.f4256d = i2 + 1;
        fArr[i2] = f5;
    }

    public final void mo1097a() {
        m4585a((byte) 8);
    }

    public final void m4590a(an anVar) {
        int i = 0;
        int i2 = 0;
        while (i < this.f4254b) {
            int i3;
            byte b = this.f4253a[i];
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            switch (b) {
                case (byte) 0:
                    i4 = i2 + 1;
                    i3 = i4 + 1;
                    anVar.mo1098a(this.f4255c[i2], this.f4255c[i4]);
                    break;
                case (byte) 1:
                    i4 = i2 + 1;
                    i3 = i4 + 1;
                    anVar.mo1102b(this.f4255c[i2], this.f4255c[i4]);
                    break;
                case (byte) 2:
                    i4 = i2 + 1;
                    i5 = i4 + 1;
                    i6 = i5 + 1;
                    int i9 = i6 + 1;
                    i7 = i9 + 1;
                    i8 = i7 + 1;
                    anVar.mo1100a(this.f4255c[i2], this.f4255c[i4], this.f4255c[i5], this.f4255c[i6], this.f4255c[i9], this.f4255c[i7]);
                    i3 = i8;
                    break;
                case (byte) 3:
                    i4 = i2 + 1;
                    i5 = i4 + 1;
                    i6 = i5 + 1;
                    i3 = i6 + 1;
                    anVar.mo1099a(this.f4255c[i2], this.f4255c[i4], this.f4255c[i5], this.f4255c[i6]);
                    break;
                case (byte) 8:
                    anVar.mo1097a();
                    i3 = i2;
                    break;
                default:
                    boolean z;
                    boolean z2;
                    if ((b & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((b & 1) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i4 = i2 + 1;
                    i5 = i4 + 1;
                    i7 = i5 + 1;
                    i8 = i7 + 1;
                    int i10 = i8 + 1;
                    anVar.mo1101a(this.f4255c[i2], this.f4255c[i4], this.f4255c[i5], z, z2, this.f4255c[i7], this.f4255c[i8]);
                    i3 = i10;
                    break;
            }
            i++;
            i2 = i3;
        }
    }
}
