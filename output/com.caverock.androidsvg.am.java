package com.caverock.androidsvg;

public final class com.caverock.androidsvg.am implements com.caverock.androidsvg.an
{

    public byte[] a;
    public int b;
    public float[] c;
    public int d;

    am() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.a = new byte[8];
        this.c = new float[16];
    }

    private final void a(int p0) {
        if (this.c.length < this.d + p0) {
            v0 = new float[this.c.length * 2];
            System.arraycopy(this.c, 0, v0, 0, this.c.length);
            this.c = v0;
        }
    }

    public final void a() {
        this.a(8);
    }

    final void a(byte p0) {
        if (this.b == this.a.length) {
            v0 = new byte[this.a.length * 2];
            System.arraycopy(this.a, 0, v0, 0, this.a.length);
            this.a = v0;
        }
        this.b = this.b + 1;
        this.a[this.b] = p0;
    }

    public final void a(float p0, float p1) {
        this.a(0);
        this.a(2);
        this.d = this.d + 1;
        this.c[this.d] = p0;
        this.d = this.d + 1;
        this.c[this.d] = p1;
    }

    public final void a(float p0, float p1, float p2, float p3) {
        this.a(3);
        this.a(4);
        this.d = this.d + 1;
        this.c[this.d] = p0;
        this.d = this.d + 1;
        this.c[this.d] = p1;
        this.d = this.d + 1;
        this.c[this.d] = p2;
        this.d = this.d + 1;
        this.c[this.d] = p3;
    }

    public final void a(float p0, float p1, float p2, float p3, float p4, float p5) {
        this.a(2);
        this.a(6);
        this.d = this.d + 1;
        this.c[this.d] = p0;
        this.d = this.d + 1;
        this.c[this.d] = p1;
        this.d = this.d + 1;
        this.c[this.d] = p2;
        this.d = this.d + 1;
        this.c[this.d] = p3;
        this.d = this.d + 1;
        this.c[this.d] = p4;
        this.d = this.d + 1;
        this.c[this.d] = p5;
    }

    public final void a(float p0, float p1, float p2, boolean p3, boolean p4, float p5, float p6) {
        v0 = 0;
        if (p3 != 0)
            v1 = 2;
        else
            v1 = 0;
        if (p4 != 0)
            v0 = 1;
        this.a((byte)(v0 | v1 | 4));
        this.a(5);
        this.d = this.d + 1;
        this.c[this.d] = p0;
        this.d = this.d + 1;
        this.c[this.d] = p1;
        this.d = this.d + 1;
        this.c[this.d] = p2;
        this.d = this.d + 1;
        this.c[this.d] = p5;
        this.d = this.d + 1;
        this.c[this.d] = p6;
    }

    public final void a(com.caverock.androidsvg.an p0) {
        v8 = 0;
        v0 = 0;
        while (v8 < this.b) {
            switch (this.a[v8]) {
                case 0:
                    v1 = v0 + 2;
                    p0.a(this.c[v0], this.c[v0 + 1]);
                    break;
                case 1:
                    v1 = v0 + 2;
                    p0.b(this.c[v0], this.c[v0 + 1]);
                    break;
                case 2:
                    p0.a(this.c[v0], this.c[v0 + 1], this.c[v0 + 2], this.c[v0 + 3], this.c[v0 + 4], this.c[v0 + 5]);
                    v1 = v0 + 6;
                    break;
                case 3:
                    v1 = v0 + 4;
                    p0.a(this.c[v0], this.c[v0 + 1], this.c[v0 + 2], this.c[v0 + 3]);
                    break;
                case 4:
                    if (this.a[v8] & 2)
                        v4 = 1;
                    else
                        v4 = 0;
                    if (this.a[v8] & 1)
                        v5 = 1;
                    else
                        v5 = 0;
                    p0.a(this.c[v0], this.c[v0 + 1], this.c[v0 + 2], v4, v5, this.c[v0 + 3], this.c[v0 + 4]);
                    v1 = v0 + 5;
                    break;
                case 5:
                    if (this.a[v8] & 2)
                        v4 = 1;
                    else
                        v4 = 0;
                    if (this.a[v8] & 1)
                        v5 = 1;
                    else
                        v5 = 0;
                    p0.a(this.c[v0], this.c[v0 + 1], this.c[v0 + 2], v4, v5, this.c[v0 + 3], this.c[v0 + 4]);
                    v1 = v0 + 5;
                    break;
                case 6:
                    if (this.a[v8] & 2)
                        v4 = 1;
                    else
                        v4 = 0;
                    if (this.a[v8] & 1)
                        v5 = 1;
                    else
                        v5 = 0;
                    p0.a(this.c[v0], this.c[v0 + 1], this.c[v0 + 2], v4, v5, this.c[v0 + 3], this.c[v0 + 4]);
                    v1 = v0 + 5;
                    break;
                case 7:
                    if (this.a[v8] & 2)
                        v4 = 1;
                    else
                        v4 = 0;
                    if (this.a[v8] & 1)
                        v5 = 1;
                    else
                        v5 = 0;
                    p0.a(this.c[v0], this.c[v0 + 1], this.c[v0 + 2], v4, v5, this.c[v0 + 3], this.c[v0 + 4]);
                    v1 = v0 + 5;
                    break;
                case 8:
                    p0.a();
                    v1 = v0;
                    break;
                default:
                    if (this.a[v8] & 2)
                        v4 = 1;
                    else
                        v4 = 0;
                    if (this.a[v8] & 1)
                        v5 = 1;
                    else
                        v5 = 0;
                    p0.a(this.c[v0], this.c[v0 + 1], this.c[v0 + 2], v4, v5, this.c[v0 + 3], this.c[v0 + 4]);
                    v1 = v0 + 5;
                    break;
            }
            v8 = v8 + 1;
            v0 = v1;
        }
    }

    public final void b(float p0, float p1) {
        this.a(1);
        this.a(2);
        this.d = this.d + 1;
        this.c[this.d] = p0;
        this.d = this.d + 1;
        this.c[this.d] = p1;
    }

}
