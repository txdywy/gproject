package com.caverock.androidsvg;

public final class com.caverock.androidsvg.r implements Cloneable
{

    public float a;
    public float b;
    public float c;
    public float d;

    r(float p0, float p1, float p2, float p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public static com.caverock.androidsvg.r a(float p0, float p1, float p2, float p3) {
        return new com.caverock.androidsvg.r(p0, p1, p2 - p0, p3 - p1);
    }

    public final float a() {
        return this.a + this.c;
    }

    public final float b() {
        return this.b + this.d;
    }

    public final String toString() {
        return 65 + "[" + this.a + " " + this.b + " " + this.c + " " + this.d + "]";
    }

}
