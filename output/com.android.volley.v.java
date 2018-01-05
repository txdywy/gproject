package com.android.volley;

public final class com.android.volley.v
{

    public final Object a;
    public final com.android.volley.b b;
    public final VolleyError c;
    public boolean d;

    v(VolleyError p0) {
        this.d = 0;
        this.a = 0;
        this.b = 0;
        this.c = p0;
    }

    v(Object p0, com.android.volley.b p1) {
        this.d = 0;
        this.a = p0;
        this.b = p1;
        this.c = 0;
    }

    public static com.android.volley.v a(VolleyError p0) {
        return new com.android.volley.v(p0);
    }

    public static com.android.volley.v a(Object p0, com.android.volley.b p1) {
        return new com.android.volley.v(p0, p1);
    }

    public final boolean a() {
        if (this.c == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
