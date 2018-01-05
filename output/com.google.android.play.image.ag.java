package com.google.android.play.image;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.h.i;
import android.text.TextUtils;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.b.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class com.google.android.play.image.ag implements com.google.android.play.image.w
{

    public com.google.android.play.image.ab c;
    public final com.android.volley.r d;
    public final int e;
    public final com.google.android.play.image.ae f;
    public final HashMap g;
    public final HashMap h;
    public final Handler i;
    public Runnable j;
    public com.google.android.play.image.by k;
    public boolean l;
    public com.google.android.play.image.aa m;
    public com.google.android.play.image.as n;
    public android.support.v4.h.i o;
    public com.google.android.play.image.z p;

    ag(com.android.volley.r p0, int p1, int p2, com.google.android.play.image.by p3) {
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new Handler(Looper.getMainLooper());
        this.d = p0;
        this.n = new com.google.android.play.image.as(this);
        this.n.a();
        v0 = ((Integer)com.google.android.play.utils.b.j.w.b()).intValue();
        if (v0 == -1)
            v1 = Math.max(3145728, (int)(((Float)com.google.android.play.utils.b.j.x.b()).floatValue() * (float)(p1 * p2 * 4)));
        else
            v1 = v0 * 1024 * 1024;
        this.e = Math.max(((Integer)com.google.android.play.utils.b.j.y.b()).intValue(), v1 / 6);
        this.f = new com.google.android.play.image.ae(v1);
        this.o = new android.support.v4.h.i(50);
        this.k = p3;
    }

    private final void a(com.google.android.play.image.an p0, String p1, com.google.android.play.image.ao p2, int p3, int p4) {
        v5 = new com.google.android.play.image.ah(p0);
        p0.g = v5;
        this.n.a(p1, p2, p3, p4, v5);
    }

    private final void a(String p0, com.google.android.play.image.aq p1, com.google.android.play.image.an p2) {
        v0 = (com.google.android.play.image.ar)this.g.get(p0);
        if (v0 != 0)
            v0.c.add(p2);
        else {
            v0 = p1.a();
            this.d.a(v0);
            this.g.put(p0, new com.google.android.play.image.ar(this, v0, p2));
        }
    }

    public com.google.android.play.image.ap a(String p0, int p1, int p2, int p3, com.android.volley.x p4, com.android.volley.w p5) {
        return new com.google.android.play.image.ap(p0, p4, p1, p2, p3, p5);
    }

    public final com.google.android.play.image.u a() {
        return this.f;
    }

    public final com.google.android.play.image.x a(String p0, int p1, int p2, com.google.android.play.image.y p3) {
        return this.a(p0, p1, p2, 1, p3, 0);
    }

    public final com.google.android.play.image.x a(String p0, int p1, int p2, boolean p3, com.google.android.play.image.y p4, boolean p5) {
        v10 = -1;
        if (p1 > 0 || p2 > 0) {
            v10 = com.google.android.play.image.bp.a().b.a();
            v8 = com.google.android.play.image.bf.a(p0, p1, p2, v10);
        }
        else
            v8 = p0;
        v4 = new com.google.android.play.image.ai(this, p1, p2, v8, p0, v10, p5);
        if (TextUtils.isEmpty(p0))
            v4 = new com.google.android.play.image.an(this, 0, 0, 0, p1, p2, 0);
        else {
            v6 = 0;
            if (p5 == 0 && this.o != 0 && this.o.a(p0) != 0)
                v6 = (Bitmap)((WeakReference)this.o.a(p0)).get();
            if (v6 != 0 && ((double)v6.getWidth() * 4608308318706860032 >= (double)p1 || (double)v6.getHeight() * 4608308318706860032 >= (double)p2)) {
                if (this.p != 0)
                    this.p.a();
                v4 = new com.google.android.play.image.an(this, v6, p0, v8, p1, p2, p4);
            }
            else {
                if (v6 != 0 && p3 != 0) {
                    if (this.p != 0)
                        this.p.a(1);
                    v6 = new com.google.android.play.image.an(this, v6, p0, v8, p1, p2, p4);
                }
                else {
                    if (this.p != 0)
                        this.p.a(0);
                    v6 = new com.google.android.play.image.an(this, 0, p0, v8, p1, p2, p4);
                }
                if (p5 != 0)
                    v12 = 0;
                else
                    v12 = (com.google.android.play.image.ao)this.f.a.a(p0);
                if (v12 != 0) {
                    if (v12.a == 0) {
                        PlayCommonLog.c("An invalid cache entry was loaded.", new Object[0]);
                        v12 = 0;
                    }
                }
                if (v12 != 0) {
                    if (v10 < v12.d || (double)p1 > (double)v12.b * 4608308318706860032 || (double)p2 > (double)v12.c * 4608308318706860032) {
                        if (p3 != 0)
                            this.a(v6, p0, v12, p1, p2);
                        this.a(v8, v4, v6);
                        v6.h = 1;
                    }
                    else
                        this.a(v6, p0, v12, p1, p2);
                    v4 = v6;
                }
                else {
                    if (p3 != 0) {
                        if (this.c != 0)
                            this.c.a(v6, this.f);
                    }
                    this.a(v8, v4, v6);
                    v6.h = 1;
                    v4 = v6;
                }
            }
        }
        return v4;
    }

    public final void a(int p0) {
        v2 = new ArrayList();
        v3 = this.g.keySet().iterator();
        while (v3.hasNext()) {
            v0 = (String)v3.next();
            if (((com.google.android.play.image.ar)this.g.get(v0)).a == 0 || ((com.google.android.play.image.ar)this.g.get(v0)).a.c() < p0)
                v2.add(v0);
        }
        v0 = (ArrayList)v2;
        v2 = 0;
        while (v2 < v0.size()) {
            v1 = v0.get(v2);
            v2 = v2 + 1;
            this.g.remove((String)v1);
        }
    }

    public final void a(com.google.android.play.image.aa p0) {
        this.m = p0;
    }

    public final void a(com.google.android.play.image.ab p0) {
        this.c = p0;
    }

    public final void a(com.google.android.play.image.z p0) {
        this.p = p0;
    }

    public final com.google.android.play.image.x b(String p0, int p1, int p2, com.google.android.play.image.y p3) {
        return this.a(p0, p1, p2, 0, p3, 0);
    }

    public final void b() {
        this.f.a();
    }

}
