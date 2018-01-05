package com.android.volley.a;

import com.android.volley.VolleyError;

public final class com.android.volley.a.ac implements com.android.volley.a.x
{

    public final boolean a;
    public final com.android.volley.a.ab b;

    ac(com.android.volley.a.ab p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(VolleyError p0) {
        if (this.b.c != 0)
            this.b.setImageResource(this.b.c);
    }

    public final void a(com.android.volley.a.w p0, boolean p1) {
        if (p1 != 0 && this.a != 0)
            this.b.post(new com.android.volley.a.ad(this, p0));
        else if (p0.a != 0)
            this.b.setImageBitmap(p0.a);
        else if (this.b.b != 0)
            this.b.setImageResource(this.b.b);
    }

}
