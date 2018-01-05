package com.google.android.play.image;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.support.v4.h.i;
import com.google.android.play.d;
import com.google.android.play.e;

public final class C6363a implements ac {
    public static i f31957A = new i(10);
    public static int f31958v;
    public static C6363a f31959w;
    public static C6363a f31960x;
    public static i f31961y = new i(10);
    public static i f31962z = new i(10);
    public final Paint f31963a = new Paint();
    public final Paint f31964b;
    public final Paint f31965c;
    public final Paint f31966d;
    public final RectF f31967e;
    public final Paint f31968f;
    public final Paint f31969g;
    public final int f31970h;
    public final int f31971i;
    public final Paint f31972j;
    public boolean f31973k;
    public final Rect f31974l;
    public final Rect f31975m;
    public final int f31976n;
    public final int f31977o;
    public final int f31978p;
    public final int f31979q;
    public final float f31980r;
    public final float f31981s;
    public final boolean f31982t;
    public final boolean f31983u;

    public static synchronized C6363a m29190a(Resources resources) {
        C6363a c6363a;
        synchronized (C6363a.class) {
            C6363a.m29193a(resources.getConfiguration());
            if (f31959w == null) {
                f31959w = new C6363a(resources, true, resources.getColor(d.play_white), false, false);
            }
            c6363a = f31959w;
        }
        return c6363a;
    }

    public static synchronized C6363a m29197b(Resources resources) {
        C6363a c6363a;
        synchronized (C6363a.class) {
            C6363a.m29193a(resources.getConfiguration());
            if (f31960x == null) {
                f31960x = new C6363a(resources, false, resources.getColor(d.play_white), false, false);
            }
            c6363a = f31960x;
        }
        return c6363a;
    }

    public static synchronized C6363a m29191a(Resources resources, int i) {
        C6363a c6363a;
        synchronized (C6363a.class) {
            C6363a.m29193a(resources.getConfiguration());
            c6363a = (C6363a) f31961y.a(Integer.valueOf(i));
            if (c6363a == null) {
                c6363a = new C6363a(resources, true, i, true, false);
                f31961y.a(Integer.valueOf(i), c6363a);
            }
        }
        return c6363a;
    }

    public static synchronized C6363a m29198b(Resources resources, int i) {
        C6363a c6363a;
        synchronized (C6363a.class) {
            C6363a.m29193a(resources.getConfiguration());
            c6363a = (C6363a) f31962z.a(Integer.valueOf(i));
            if (c6363a == null) {
                c6363a = new C6363a(resources, false, i, true, false);
                f31962z.a(Integer.valueOf(i), c6363a);
            }
        }
        return c6363a;
    }

    public static synchronized C6363a m29200c(Resources resources, int i) {
        C6363a c6363a;
        synchronized (C6363a.class) {
            C6363a.m29193a(resources.getConfiguration());
            c6363a = (C6363a) f31957A.a(Integer.valueOf(i));
            if (c6363a == null) {
                c6363a = new C6363a(resources, false, i, true, true);
                f31957A.a(Integer.valueOf(i), c6363a);
            }
        }
        return c6363a;
    }

    private static synchronized void m29193a(Configuration configuration) {
        synchronized (C6363a.class) {
            int hashCode = configuration.hashCode();
            if (f31958v != hashCode) {
                C6363a.m29192a();
                f31958v = hashCode;
            }
        }
    }

    private static synchronized void m29192a() {
        synchronized (C6363a.class) {
            f31959w = null;
            f31960x = null;
            f31961y.a(-1);
            f31962z.a(-1);
            f31957A.a(-1);
        }
    }

    private C6363a(Resources resources, boolean z, int i, boolean z2, boolean z3) {
        this.f31976n = resources.getDimensionPixelSize(e.play_avatar_decoration_threshold_min);
        this.f31977o = resources.getDimensionPixelSize(e.play_avatar_decoration_threshold_max);
        this.f31978p = resources.getDimensionPixelSize(e.play_avatar_ring_size_min);
        this.f31979q = resources.getDimensionPixelSize(e.play_avatar_ring_size_max);
        this.f31980r = ((float) resources.getDimensionPixelSize(e.play_avatar_drop_shadow_min)) * 0.5f;
        this.f31981s = ((float) resources.getDimensionPixelSize(e.play_avatar_drop_shadow_max)) * 0.5f;
        int color = resources.getColor(d.play_avatar_outline);
        int color2 = resources.getColor(d.play_avatar_ring_color);
        float dimensionPixelSize = ((float) resources.getDimensionPixelSize(e.play_avatar_noring_outline)) * 0.5f;
        this.f31963a.setColor(color);
        this.f31963a.setStrokeWidth(dimensionPixelSize);
        this.f31963a.setStyle(Style.STROKE);
        this.f31963a.setAntiAlias(true);
        this.f31964b = new Paint();
        this.f31964b.setColor(color2);
        this.f31964b.setStyle(Style.STROKE);
        this.f31964b.setAntiAlias(true);
        this.f31965c = new Paint(2);
        this.f31965c.setAntiAlias(true);
        this.f31966d = new Paint(2);
        this.f31967e = new RectF();
        this.f31968f = new Paint();
        this.f31968f.setColor(resources.getColor(d.play_avatar_pressed_fill));
        this.f31968f.setAntiAlias(true);
        this.f31968f.setStyle(Style.FILL);
        this.f31970h = resources.getColor(d.play_avatar_pressed_outline);
        this.f31971i = resources.getColor(d.play_avatar_focused_outline);
        this.f31969g = new Paint();
        this.f31969g.setAntiAlias(true);
        this.f31969g.setStrokeWidth(dimensionPixelSize);
        this.f31969g.setStyle(Style.STROKE);
        this.f31972j = new Paint();
        this.f31972j.setColor(i);
        this.f31972j.setStyle(Style.FILL);
        this.f31973k = z2;
        this.f31974l = new Rect();
        this.f31975m = new Rect();
        this.f31982t = z;
        this.f31983u = z3;
    }

    private final float m29196b(int i, int i2) {
        int max = Math.max(i, i2);
        if (max < this.f31976n) {
            return 0.0f;
        }
        return C6363a.m29189a((float) this.f31976n, (float) this.f31977o, this.f31980r, this.f31981s, (float) max);
    }

    private final float m29199c(int i, int i2) {
        return C6363a.m29189a((float) this.f31976n, (float) this.f31977o, (float) this.f31978p, (float) this.f31979q, (float) Math.max(i, i2));
    }

    public final int m29201a(int i, int i2) {
        if (Math.max(i, i2) < this.f31976n) {
            return 0;
        }
        return (int) ((2.0f * m29199c(i, i2)) + m29196b(i, i2));
    }

    public final Bitmap m29202a(Bitmap bitmap, int i, int i2) {
        if (!this.f31973k && bitmap == null) {
            return null;
        }
        int max = Math.max(i, i2);
        Object obj = max >= this.f31976n ? 1 : null;
        float c = this.f31982t ? m29199c(i, i2) : 0.0f;
        float b = m29196b(i, i2);
        int a = (int) C6363a.m29189a((float) this.f31976n, (float) this.f31977o, 48.0f, 64.0f, (float) max);
        int a2 = m29201a(i, i2);
        int i3 = a << 24;
        int width = bitmap == null ? i : bitmap.getWidth();
        if (bitmap != null) {
            i2 = bitmap.getHeight();
        }
        a = Math.max(width, i2);
        int min = Math.min(width, i2);
        if (Math.abs(width - i2) > 1 || a < max - a2 || min > max || this.f31973k) {
            Bitmap createBitmap = Bitmap.createBitmap(max, max, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawRect(0.0f, 0.0f, (float) max, (float) max, this.f31972j);
            if (bitmap != null) {
                this.f31974l.set(0, 0, width, i2);
                float max2 = ((float) max) / ((float) Math.max(width, i2));
                min = (int) (((float) width) * max2);
                a2 = (int) (max2 * ((float) i2));
                int i4 = (max - min) / 2;
                int i5 = (max - a2) / 2;
                this.f31975m.set(i4, i5, min + i4, a2 + i5);
                canvas.drawBitmap(bitmap, this.f31974l, this.f31975m, this.f31966d);
            }
            min = createBitmap == null ? i : createBitmap.getWidth();
            bitmap = createBitmap;
        } else {
            min = width;
        }
        this.f31965c.setShader(new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP));
        Bitmap createBitmap2 = Bitmap.createBitmap(max, max, Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap2);
        float f = ((float) max) / 2.0f;
        float f2 = 1.0f;
        if (obj != null) {
            f2 = 1.0f + b;
            canvas2.translate(b / 2.0f, 0.0f);
        }
        this.f31967e.set(0.0f, 0.0f, ((float) i) - f2, ((float) i) - f2);
        if (obj != null) {
            if (!this.f31983u) {
                m29194a(canvas2, b, i3);
            }
            m29195a(canvas2, min, f, c, ((((float) max) - b) - Math.max(1.0f, 2.0f * c)) / ((float) min));
            if (this.f31982t) {
                f2 = this.f31967e.left;
                float f3 = this.f31967e.right;
                f = this.f31967e.top;
                float f4 = this.f31967e.bottom;
                this.f31964b.setStrokeWidth(c);
                float f5 = c / 2.0f;
                RectF rectF = this.f31967e;
                rectF.left += f5;
                rectF = this.f31967e;
                rectF.top += f5;
                rectF = this.f31967e;
                rectF.right -= f5;
                rectF = this.f31967e;
                rectF.bottom -= f5;
                canvas2.drawOval(this.f31967e, this.f31964b);
                this.f31967e.left = f2;
                this.f31967e.right = f3;
                this.f31967e.top = f;
                this.f31967e.bottom = f4;
            }
        } else {
            m29195a(canvas2, min, f, 0.0f, 1.0f);
            m29194a(canvas2, 0.0f, 0);
        }
        this.f31965c.setShader(null);
        return createBitmap2;
    }

    private static float m29189a(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f) {
            return f3;
        }
        if (f5 >= f2) {
            return f4;
        }
        return f != f2 ? f3 + (((f5 - f) * (f4 - f3)) / (f2 - f)) : f3;
    }

    private final void m29195a(Canvas canvas, int i, float f, float f2, float f3) {
        float f4 = this.f31967e.left;
        float f5 = this.f31967e.right;
        float f6 = this.f31967e.top;
        float f7 = this.f31967e.bottom;
        this.f31967e.left = 0.0f;
        this.f31967e.top = 0.0f;
        this.f31967e.right = (float) i;
        this.f31967e.bottom = (float) i;
        canvas.save();
        canvas.scale(f3, f3);
        canvas.translate(f2, f2);
        canvas.drawRoundRect(this.f31967e, f, f, this.f31965c);
        canvas.restore();
        this.f31967e.left = f4;
        this.f31967e.right = f5;
        this.f31967e.top = f6;
        this.f31967e.bottom = f7;
    }

    private final void m29194a(Canvas canvas, float f, int i) {
        float f2 = this.f31967e.left;
        float f3 = this.f31967e.right;
        float f4 = this.f31967e.top;
        float f5 = this.f31967e.bottom;
        this.f31963a.setStrokeWidth(2.0f * f);
        float strokeWidth = this.f31963a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f31967e;
        rectF.left += strokeWidth - (f / 3.0f);
        rectF = this.f31967e;
        rectF.top += strokeWidth + f;
        rectF = this.f31967e;
        rectF.right -= strokeWidth - (f / 3.0f);
        rectF = this.f31967e;
        rectF.bottom -= strokeWidth - f;
        this.f31963a.setColor(i);
        canvas.drawOval(this.f31967e, this.f31963a);
        this.f31967e.left = f2;
        this.f31967e.right = f3;
        this.f31967e.top = f4;
        this.f31967e.bottom = f5;
    }

    public final void m29203a(Canvas canvas, int i, int i2) {
        float b = m29196b(i, i2);
        int i3 = (int) (((float) i) - b);
        int i4 = (int) (((float) i2) - b);
        canvas.save();
        canvas.translate(b / 2.0f, 0.0f);
        b = Math.min(((float) i3) / 2.0f, ((float) i4) / 2.0f);
        float strokeWidth = this.f31969g.getStrokeWidth();
        this.f31969g.setColor(this.f31971i);
        canvas.drawCircle(b, b, b - (strokeWidth / 2.0f), this.f31969g);
        canvas.restore();
    }

    public final void m29204b(Canvas canvas, int i, int i2) {
        float b = m29196b(i, i2);
        int i3 = (int) (((float) i) - b);
        int i4 = (int) (((float) i2) - b);
        canvas.save();
        canvas.translate(b / 2.0f, 0.0f);
        b = Math.min(((float) i3) / 2.0f, ((float) i4) / 2.0f);
        canvas.drawCircle(b, b, b, this.f31968f);
        float strokeWidth = this.f31969g.getStrokeWidth();
        this.f31969g.setColor(this.f31970h);
        canvas.drawCircle(b, b, b - (strokeWidth / 2.0f), this.f31969g);
        canvas.restore();
    }
}
