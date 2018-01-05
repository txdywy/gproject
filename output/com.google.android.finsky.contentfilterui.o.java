package com.google.android.finsky.contentfilterui;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ab.a;
import java.util.List;

public final class com.google.android.finsky.contentfilterui.o implements com.android.volley.w, com.android.volley.x
{

    public Context a;
    public List b;
    public boolean c;
    public Runnable d;
    public Runnable e;
    public final com.google.android.finsky.contentfilterui.n f;

    o(com.google.android.finsky.contentfilterui.n p0, Context p1, List p2, boolean p3, Runnable p4, Runnable p5) {
        this.f = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
    }

    public final void a(VolleyError p0) {
        Toast.makeText(this.a, 2131951944, 0).show();
        if (this.e != 0)
            this.e.run();
    }

    public final void b_(Object p0) {
        this.f.e = this.b;
        this.f.f = this.c;
        this.f.h = 1;
        if (!this.f.c()) {
            v6 = com.google.android.finsky.contentfilterui.n.a;
            if (this.c != 0)
                v6 = (b[])this.f.e.toArray(new b[this.f.e.size()]);
            else {
                com.google.android.finsky.aa.a.i.c();
                this.f.g = 0;
            }
            com.google.android.finsky.ab.a.a(this.a, this.f.k, this.f.j, this.f.i, this.c, this.f.b, v6);
        }
        if (this.d != 0)
            this.d.run();
    }

}
