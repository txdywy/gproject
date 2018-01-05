package com.android.volley.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.widget.ImageView$ScaleType;
import com.android.volley.ParseError;
import com.android.volley.aa;
import com.android.volley.f;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.q;
import com.android.volley.v;
import com.android.volley.w;
import com.android.volley.x;

public final class com.android.volley.a.y extends com.android.volley.n
{

    public static final Object v;
    public final Object e;
    public com.android.volley.x q;
    public final Bitmap$Config r;
    public final int s;
    public final int t;
    public final ImageView$ScaleType u;

    static {
        com.android.volley.a.y.v = new Object();
    }

    y(String p0, com.android.volley.x p1, int p2, int p3, ImageView$ScaleType p4, Bitmap$Config p5, com.android.volley.w p6) {
        com.android.volley.n(0, p0, p6);
        this.e = new Object();
        this.m = new com.android.volley.f(1000, 2, 1073741824);
        this.q = p1;
        this.r = p5;
        this.s = p2;
        this.t = p3;
        this.u = p4;
    }

    private static int a(int p0, int p1, int p2, int p3) {
        v0 = 1065353216;
        while ((double)(v0 * 1073741824) <= Math.min((double)p0 / (double)p2, (double)p1 / (double)p3))
            v0 = v0 * 1073741824;
        return (int)v0;
    }

    private static int a(int p0, int p1, int p2, int p3, ImageView$ScaleType p4) {
        if (p0 == 0 && p1 == 0)
            p0 = p2;
        else if (p4 == ImageView$ScaleType.FIT_XY) {
            if (p0 == 0)
                p0 = p2;
        }
        else if (p0 == 0)
            p0 = (int)((double)p1 / (double)p3 * (double)p2);
        else if (p1 != 0) {
            if (p4 == ImageView$ScaleType.CENTER_CROP) {
                if ((double)p0 * (double)p3 / (double)p2 < (double)p1)
                    p0 = (int)((double)p1 / ((double)p3 / (double)p2));
            }
            else if ((double)p0 * (double)p3 / (double)p2 > (double)p1)
                p0 = (int)((double)p1 / ((double)p3 / (double)p2));
        }
        return p0;
    }

    public com.android.volley.v a(com.android.volley.m p0) {
        enter com.android.volley.a.y.v;
        try {
            v1 = new BitmapFactory$Options();
            if (this.s == 0 && this.t == 0) {
                v1.inPreferredConfig = this.r;
                v0 = BitmapFactory.decodeByteArray(p0.b, 0, p0.b.length, v1);
            }
            else {
                try {
                    v1.inJustDecodeBounds = 1;
                    BitmapFactory.decodeByteArray(p0.b, 0, p0.b.length, v1);
                    v5 = com.android.volley.a.y.a(this.s, this.t, v1.outWidth, v1.outHeight, this.u);
                    v6 = com.android.volley.a.y.a(this.t, this.s, v1.outHeight, v1.outWidth, this.u);
                    v1.inJustDecodeBounds = 0;
                    v1.inSampleSize = com.android.volley.a.y.a(v1.outWidth, v1.outHeight, v5, v6);
                    v1 = BitmapFactory.decodeByteArray(p0.b, 0, p0.b.length, v1);
                    if (v1 != 0 && (v1.getWidth() > v5 || v1.getHeight() > v6)) {
                        v0 = Bitmap.createScaledBitmap(v1, v5, v6, 1);
                        v1.recycle();
                    }
                    else
                        v0 = v1;
                }
                catch (OutOfMemoryError ex) {
                    v3 = new Object[2];
                    v3[0] = Integer.valueOf(p0.b.length);
                    v3[1] = this.d();
                    com.android.volley.aa.c("Caught OOM for %d byte image, url=%s", v3);
                    v0 = com.android.volley.v.a(new ParseError(ex));
                    exit com.android.volley.a.y.v;
                    return v0;
                }
                catch (Throwable ex) {
                    exit com.android.volley.a.y.v;
                    throw ex;
                }
            }
            if (v0 == 0)
                v0 = com.android.volley.v.a(new ParseError(p0));
            else {
                try {
                    v0 = com.android.volley.v.a(v0, com.android.volley.a.n.a(p0));
                }
                catch (OutOfMemoryError ex) {
                    v3 = new Object[2];
                    v3[0] = Integer.valueOf(p0.b.length);
                    v3[1] = this.d();
                    com.android.volley.aa.c("Caught OOM for %d byte image, url=%s", v3);
                    v0 = com.android.volley.v.a(new ParseError(ex));
                    exit com.android.volley.a.y.v;
                    return v0;
                }
                catch (Throwable ex) {
                    exit com.android.volley.a.y.v;
                    throw ex;
                }
            }
        }
        catch (OutOfMemoryError ex) {
            v3 = new Object[2];
            v3[0] = Integer.valueOf(p0.b.length);
            v3[1] = this.d();
            com.android.volley.aa.c("Caught OOM for %d byte image, url=%s", v3);
            v0 = com.android.volley.v.a(new ParseError(ex));
            exit com.android.volley.a.y.v;
            return v0;
        }
        catch (Throwable ex) {
            exit com.android.volley.a.y.v;
            throw ex;
        }
        try {
            exit com.android.volley.a.y.v;
        }
        catch (Throwable ex) {
            exit com.android.volley.a.y.v;
            throw ex;
        }
        return v0;
        try {
            v3 = new Object[2];
            v3[0] = Integer.valueOf(p0.b.length);
            v3[1] = this.d();
            com.android.volley.aa.c("Caught OOM for %d byte image, url=%s", v3);
            v0 = com.android.volley.v.a(new ParseError(ex));
            exit com.android.volley.a.y.v;
            return v0;
            exit com.android.volley.a.y.v;
        }
        catch (Throwable ex) {
            exit com.android.volley.a.y.v;
            throw ex;
        }
    }

    public void a(Bitmap p0) {
        enter this.e;
        try {
            exit this.e;
        }
        catch (Throwable ex) {
            try {
                exit this.e;
            }
            catch (Throwable ex) {
                exit this.e;
                throw ex;
            }
            throw ex;
        }
        if (this.q != 0)
            this.q.b_(p0);
    }

    public void a(Object p0) {
        this.a((Bitmap)p0);
    }

    public final void f() {
        super.f();
        enter this.e;
        try {
            this.q = 0;
            exit this.e;
            return;
            exit this.e;
        }
        catch (Throwable ex) {
            exit this.e;
            throw ex;
        }
    }

    public final com.android.volley.q n() {
        return com.android.volley.q.a;
    }

}
