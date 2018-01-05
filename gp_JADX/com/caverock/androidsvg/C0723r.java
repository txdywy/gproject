package com.caverock.androidsvg;

public final class C0723r implements Cloneable {
    public float f4620a;
    public float f4621b;
    public float f4622c;
    public float f4623d;

    public C0723r(float f, float f2, float f3, float f4) {
        this.f4620a = f;
        this.f4621b = f2;
        this.f4622c = f3;
        this.f4623d = f4;
    }

    public static C0723r m4797a(float f, float f2, float f3, float f4) {
        return new C0723r(f, f2, f3 - f, f4 - f2);
    }

    public final float m4798a() {
        return this.f4620a + this.f4622c;
    }

    public final float m4799b() {
        return this.f4621b + this.f4623d;
    }

    public final String toString() {
        float f = this.f4620a;
        float f2 = this.f4621b;
        float f3 = this.f4622c;
        return "[" + f + " " + f2 + " " + f3 + " " + this.f4623d + "]";
    }
}
