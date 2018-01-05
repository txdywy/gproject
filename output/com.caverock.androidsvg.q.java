package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.google.c.a.a.a.a.a;
import com.google.c.a.a.a.a.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public final class com.caverock.androidsvg.q
{

    public static com.caverock.androidsvg.cq a;
    public com.caverock.androidsvg.be b;
    public com.caverock.androidsvg.ct c;
    public float d;
    public com.caverock.androidsvg.h e;
    public Map f;
    public float g;

    static {
        com.caverock.androidsvg.q.a = new com.caverock.androidsvg.cq();
    }

    q() {
        this.b = 0;
        this.c = 0;
        this.d = 1119879168;
        this.e = new com.caverock.androidsvg.h();
        this.f = new HashMap();
        this.g = 1065353216;
    }

    public static float a(Resources p0) {
        return (float)p0.getDisplayMetrics().densityDpi / 1126170624;
    }

    private final Picture a(int p0, int p1, com.caverock.androidsvg.as p2) {
        v6 = new Picture();
        v0 = new com.caverock.androidsvg.cf(v6.beginRecording(p0, p1), new com.caverock.androidsvg.r(0, 0, (float)p0, (float)p1), this.d);
        if (p2 != 0) {
            v0.e = p2.b;
            v0.f = p2.a;
        }
        v0.g = this;
        v0.d = 0;
        if (this.b == 0)
            com.caverock.androidsvg.cf.a("Nothing to render. Document is empty.", new Object[0]);
        else {
            v0.h = new com.caverock.androidsvg.cm();
            v0.i = new Stack();
            v0.a(v0.h, com.caverock.androidsvg.av.a());
            v0.h.f = v0.b;
            v0.h.h = 0;
            v0.h.i = v0.d;
            v0.i.push((com.caverock.androidsvg.cm)v0.h.clone());
            v0.l = new Stack();
            v0.m = new Stack();
            v0.k = new Stack();
            v0.j = new Stack();
            v0.a(this.b);
            v0.a(this.b, this.b.c, this.b.d, this.b.w, this.b.v);
        }
        v6.endRecording();
        return v6;
    }

    public static Drawable a(Resources p0, int p1, int p2) {
        v0 = new com.caverock.androidsvg.as();
        if (p2 != 0)
            v0.b(p0.getColor(p2));
        try {
            v0 = com.caverock.androidsvg.q.a(p0, p1, v0);
        }
        catch (SVGParseException ex) {
            com.google.c.a.a.a.a.a.a.a(ex);
            v0 = 0;
        }
        return v0;
    }

    public static Drawable a(Resources p0, int p1, com.caverock.androidsvg.as p2) {
        v0 = com.caverock.androidsvg.q.a.a(p1, com.caverock.androidsvg.q.a(p0));
        if (v0 == 0) {
            v0 = com.caverock.androidsvg.q.a(p0, p1);
            v0.a(com.caverock.androidsvg.q.a(p0));
            com.caverock.androidsvg.q.a.a(v0, p1);
        }
        return new com.caverock.androidsvg.cs(v0, p2);
    }

    private final com.caverock.androidsvg.bk a(com.caverock.androidsvg.bi p0, String p1) {
        v0 = (com.caverock.androidsvg.bk)p0;
        if (!p1.equals(v0.o)) {
            v2 = p0.a().iterator();
            while (v2.hasNext()) {
                v0 = (com.caverock.androidsvg.bm)v2.next();
                if (!(v0 instanceof com.caverock.androidsvg.bk))
                    continue;
                if (p1.equals(((com.caverock.androidsvg.bk)v0).o)) {
                    v0 = (com.caverock.androidsvg.bk)v0;
                    return v0;
                }
                if (!(v0 instanceof com.caverock.androidsvg.bi))
                    continue;
                v0 = this.a((com.caverock.androidsvg.bi)v0, p1);
                if (v0 != 0)
                    return v0;
            }
            v0 = 0;
        }
        return v0;
    }

    public static com.caverock.androidsvg.q a(Context p0, int p1) {
        return com.caverock.androidsvg.q.a(p0.getResources(), p1);
    }

    public static com.caverock.androidsvg.q a(AssetManager p0, String p1) {
        v1 = p0.open(p1);
        try {
            try {
                v1.close();
            }
            catch (IOException ex) {
            }
        }
        catch (Throwable ex) {
            try {
                v1.close();
            }
            catch (IOException ex) {
            }
            throw ex;
        }
        return new com.caverock.androidsvg.cy().a(v1);
    }

    private static com.caverock.androidsvg.q a(Resources p0, int p1) {
        v1 = p0.openRawResource(p1);
        try {
            try {
                v1.close();
            }
            catch (IOException ex) {
            }
        }
        catch (Throwable ex) {
            try {
                v1.close();
            }
            catch (IOException ex) {
            }
            throw ex;
        }
        return new com.caverock.androidsvg.cy().a(v1);
    }

    public static com.caverock.androidsvg.q a(InputStream p0) {
        return new com.caverock.androidsvg.cy().a(p0);
    }

    public static com.caverock.androidsvg.q a(String p0) {
        return new com.caverock.androidsvg.cy().a(new ByteArrayInputStream(p0.getBytes()));
    }

    private final com.caverock.androidsvg.r d(float p0) {
        if (this.b.c == 0) {
            v0 = new com.caverock.androidsvg.r(-1082130432, -1082130432, -1082130432, -1082130432);
            return v0;
        }
        if (this.b.c.a()) {
            v0 = new com.caverock.androidsvg.r(-1082130432, -1082130432, -1082130432, -1082130432);
            return v0;
        }
        if (this.b.c.b == com.caverock.androidsvg.cc.i) {
            v0 = new com.caverock.androidsvg.r(-1082130432, -1082130432, -1082130432, -1082130432);
            return v0;
        }
        if (this.b.c.b == com.caverock.androidsvg.cc.b) {
            v0 = new com.caverock.androidsvg.r(-1082130432, -1082130432, -1082130432, -1082130432);
            return v0;
        }
        if (this.b.c.b == com.caverock.androidsvg.cc.c)
            v0 = new com.caverock.androidsvg.r(-1082130432, -1082130432, -1082130432, -1082130432);
        else {
            v1 = this.b.c.a(p0);
            if (this.b.d != 0) {
                if ((this.b.d.a()) || this.b.d.b == com.caverock.androidsvg.cc.i || this.b.d.b == com.caverock.androidsvg.cc.b || this.b.d.b == com.caverock.androidsvg.cc.c) {
                    v0 = new com.caverock.androidsvg.r(-1082130432, -1082130432, -1082130432, -1082130432);
                    return v0;
                }
                v0 = this.b.d.a(p0);
            }
            else if (this.b.w != 0)
                v0 = this.b.w.d * v1 / this.b.w.c;
            else
                v0 = v1;
            v0 = new com.caverock.androidsvg.r(0, 0, v1, v0);
        }
        return v0;
    }

    public final float a() {
        if (this.b == 0)
            throw new IllegalArgumentException("SVG document is empty");
        return this.d(this.d).c;
    }

    public final Picture a(com.caverock.androidsvg.as p0) {
        if (this.b.c != 0) {
            v1 = this.b.c.a(this.d);
            if (this.b.w != 0)
                v0 = this.b.w.d * v1 / this.b.w.c;
            else if (this.b.d != 0)
                v0 = this.b.d.a(this.d);
            else
                v0 = v1;
            v0 = this.a((int)Math.ceil((double)v1), (int)Math.ceil((double)v0), p0);
        }
        else
            v0 = this.a(512, 512, p0);
        return v0;
    }

    public final void a(float p0) {
        v0 = this.b();
        v1 = this.a();
        if (v0 > 0 && v1 > 0) {
            this.c(v0 * p0);
            this.b(v1 * p0);
            this.g = this.g * p0;
        }
    }

    public final float b() {
        if (this.b == 0)
            throw new IllegalArgumentException("SVG document is empty");
        return this.d(this.d).d;
    }

    protected final com.caverock.androidsvg.bm b(String p0) {
        v0 = 0;
        if (p0 != 0 && p0.length() > 1 && p0.startsWith("#")) {
            v1 = p0.substring(1);
            if (v1 != 0 && v1.length() != 0) {
                if (v1.equals(this.b.o))
                    v0 = this.b;
                else if (this.f.containsKey(v1))
                    v0 = (com.caverock.androidsvg.bm)this.f.get(v1);
                else {
                    v0 = this.a(this.b, v1);
                    this.f.put(v1, v0);
                }
            }
        }
        return v0;
    }

    public final void b(float p0) {
        if (this.b == 0)
            throw new IllegalArgumentException("SVG document is empty");
        this.b.c = new com.caverock.androidsvg.af(p0);
    }

    public final void c(float p0) {
        if (this.b == 0)
            throw new IllegalArgumentException("SVG document is empty");
        this.b.d = new com.caverock.androidsvg.af(p0);
    }

}
