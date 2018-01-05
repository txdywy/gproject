package com.android.volley.a;

import android.graphics.Bitmap;
import java.util.HashMap;

public final class com.android.volley.a.r implements com.android.volley.x
{

    public final String a;
    public final com.android.volley.a.q b;

    r(com.android.volley.a.q p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        this.b.c.a(this.a, (Bitmap)p0);
        v0 = this.b.d.remove(this.a);
        if ((com.android.volley.a.u)v0 != 0) {
            ((com.android.volley.a.u)v0).b = (Bitmap)p0;
            this.b.a(this.a, (com.android.volley.a.u)v0);
        }
    }

}
