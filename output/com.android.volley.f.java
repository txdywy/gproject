package com.android.volley;

public final class com.android.volley.f implements com.android.volley.z
{

    public int a;
    public int b;
    public final int c;
    public final float d;

    f() {
        com.android.volley.f(2500, 1, 1065353216);
    }

    f(int p0, int p1, float p2) {
        this.a = p0;
        this.c = p1;
        this.d = p2;
    }

    public final int a() {
        return this.a;
    }

    public void a(VolleyError p0) {
        this.b = this.b + 1;
        this.a = (int)((float)this.a + (float)this.a * this.d);
        if (this.b <= this.c)
            v0 = 1;
        else
            v0 = 0;
        if (v0 == 0)
            throw p0;
    }

    public final int b() {
        return this.b;
    }

}
