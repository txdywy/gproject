package com.android.volley.a;

import android.graphics.Bitmap;
import com.android.volley.VolleyError;
import com.android.volley.n;
import java.util.LinkedList;

public final class com.android.volley.a.u
{

    public final com.android.volley.n a;
    public Bitmap b;
    public VolleyError c;
    public final LinkedList d;

    u(com.android.volley.n p0, com.android.volley.a.w p1) {
        this.d = new LinkedList();
        this.a = p0;
        this.d.add(p1);
    }

    public final boolean a(com.android.volley.a.w p0) {
        this.d.remove(p0);
        if (this.d.size() == 0) {
            this.a.f();
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

}
