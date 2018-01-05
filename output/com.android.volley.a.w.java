package com.android.volley.a;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

public final class com.android.volley.a.w
{

    public Bitmap a;
    public final com.android.volley.a.x b;
    public final String c;
    public final String d;
    public final com.android.volley.a.q e;

    w(com.android.volley.a.q p0, Bitmap p1, String p2, String p3, com.android.volley.a.x p4) {
        this.e = p0;
        this.a = p1;
        this.d = p2;
        this.c = p3;
        this.b = p4;
    }

    public final void a() {
        if (this.b != 0) {
            v0 = this.e.d.get(this.c);
            if ((com.android.volley.a.u)v0 != 0) {
                if (((com.android.volley.a.u)v0).a(this))
                    this.e.d.remove(this.c);
            }
            else {
                v0 = (com.android.volley.a.u)this.e.e.get(this.c);
                if (v0 != 0) {
                    v0.a(this);
                    if (v0.d.size() == 0)
                        this.e.e.remove(this.c);
                }
            }
        }
    }

}
