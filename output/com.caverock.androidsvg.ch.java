package com.caverock.androidsvg;

public final class com.caverock.androidsvg.ch
{

    public float a;
    public float b;
    public float c;
    public float d;

    ch(float p0, float p1, float p2, float p3) {
        this.c = 0;
        this.d = 0;
        this.a = p0;
        this.b = p1;
        v0 = Math.sqrt((double)(p2 * p2 + p3 * p3));
        if (v0 != 0) {
            this.c = (float)((double)p2 / v0);
            this.d = (float)((double)p3 / v0);
        }
    }

    public final void a(float p0, float p1) {
        v2 = Math.sqrt((double)((p0 - this.a) * (p0 - this.a) + (p1 - this.b) * (p1 - this.b)));
        if (v2 != 0) {
            this.c = (float)((double)(p0 - this.a) / v2) + this.c;
            this.d = this.d + (float)((double)(p1 - this.b) / v2);
        }
    }

    public final void a(com.caverock.androidsvg.ch p0) {
        this.c = this.c + p0.c;
        this.d = this.d + p0.d;
    }

    public final String toString() {
        return 65 + "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }

}
