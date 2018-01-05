package android.support.v4.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.p037h.C0324t;
import android.support.v4.view.p039b.C0344b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.squareup.haha.perflib.HprofParser;

public final class C0376g extends Drawable implements Animatable {
    public static final Interpolator f2148a = new LinearInterpolator();
    public static final Interpolator f2149b = new C0344b();
    public static final int[] f2150c = new int[]{-16777216};
    public final C0379j f2151d = new C0379j();
    public float f2152e;
    public Resources f2153f;
    public Animator f2154g;
    public float f2155h;
    public boolean f2156i;

    public C0376g(Context context) {
        this.f2153f = ((Context) C0324t.m1705a(context)).getResources();
        this.f2151d.m2279a(f2150c);
        this.f2151d.m2276a(2.5f);
        invalidateSelf();
        C0379j c0379j = this.f2151d;
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0377h(this, c0379j));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f2148a);
        ofFloat.addListener(new C0378i(this, c0379j));
        this.f2154g = ofFloat;
    }

    private final void m2269a(float f, float f2, float f3, float f4) {
        C0379j c0379j = this.f2151d;
        float f5 = this.f2153f.getDisplayMetrics().density;
        c0379j.m2276a(f2 * f5);
        c0379j.f2177q = f * f5;
        c0379j.m2277a(0);
        float f6 = f3 * f5;
        f5 *= f4;
        c0379j.f2178r = (int) f6;
        c0379j.f2179s = (int) f5;
    }

    public final void m2272a(int i) {
        if (i == 0) {
            m2269a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m2269a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m2273a(boolean z) {
        this.f2151d.m2278a(z);
        invalidateSelf();
    }

    public final void m2271a(float f) {
        C0379j c0379j = this.f2151d;
        if (f != c0379j.f2176p) {
            c0379j.f2176p = f;
        }
        invalidateSelf();
    }

    public final void m2274b(float f) {
        this.f2151d.f2165e = 0.0f;
        this.f2151d.f2166f = f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f2152e, bounds.exactCenterX(), bounds.exactCenterY());
        C0379j c0379j = this.f2151d;
        RectF rectF = c0379j.f2161a;
        float f = c0379j.f2177q + (c0379j.f2168h / 2.0f);
        if (c0379j.f2177q <= 0.0f) {
            f = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) c0379j.f2178r) * c0379j.f2176p) / 2.0f, c0379j.f2168h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f, ((float) bounds.centerY()) - f, ((float) bounds.centerX()) + f, f + ((float) bounds.centerY()));
        float f2 = (c0379j.f2165e + c0379j.f2167g) * 360.0f;
        float f3 = ((c0379j.f2166f + c0379j.f2167g) * 360.0f) - f2;
        c0379j.f2162b.setColor(c0379j.f2181u);
        c0379j.f2162b.setAlpha(c0379j.f2180t);
        f = c0379j.f2168h / 2.0f;
        rectF.inset(f, f);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c0379j.f2164d);
        rectF.inset(-f, -f);
        canvas.drawArc(rectF, f2, f3, false, c0379j.f2162b);
        if (c0379j.f2174n) {
            if (c0379j.f2175o == null) {
                c0379j.f2175o = new Path();
                c0379j.f2175o.setFillType(FillType.EVEN_ODD);
            } else {
                c0379j.f2175o.reset();
            }
            f = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f4 = (((float) c0379j.f2178r) * c0379j.f2176p) / 2.0f;
            c0379j.f2175o.moveTo(0.0f, 0.0f);
            c0379j.f2175o.lineTo(((float) c0379j.f2178r) * c0379j.f2176p, 0.0f);
            c0379j.f2175o.lineTo((((float) c0379j.f2178r) * c0379j.f2176p) / 2.0f, ((float) c0379j.f2179s) * c0379j.f2176p);
            c0379j.f2175o.offset((f + rectF.centerX()) - f4, rectF.centerY() + (c0379j.f2168h / 2.0f));
            c0379j.f2175o.close();
            c0379j.f2163c.setColor(c0379j.f2181u);
            c0379j.f2163c.setAlpha(c0379j.f2180t);
            canvas.save();
            canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
            canvas.drawPath(c0379j.f2175o, c0379j.f2163c);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.f2151d.f2180t = i;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f2151d.f2180t;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2151d.f2162b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f2154g.isRunning();
    }

    public final void start() {
        this.f2154g.cancel();
        this.f2151d.m2281c();
        if (this.f2151d.f2166f != this.f2151d.f2165e) {
            this.f2156i = true;
            this.f2154g.setDuration(666);
            this.f2154g.start();
            return;
        }
        this.f2151d.m2277a(0);
        this.f2151d.m2282d();
        this.f2154g.setDuration(1332);
        this.f2154g.start();
    }

    public final void stop() {
        this.f2154g.cancel();
        this.f2152e = 0.0f;
        this.f2151d.m2278a(false);
        this.f2151d.m2277a(0);
        this.f2151d.m2282d();
        invalidateSelf();
    }

    static void m2270a(float f, C0379j c0379j) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int b = c0379j.m2280b();
            int i = c0379j.f2169i[c0379j.m2275a()];
            int i2 = (b >> 24) & HprofParser.ROOT_UNKNOWN;
            int i3 = (b >> 16) & HprofParser.ROOT_UNKNOWN;
            int i4 = (b >> 8) & HprofParser.ROOT_UNKNOWN;
            b &= HprofParser.ROOT_UNKNOWN;
            c0379j.f2181u = (((int) (f2 * ((float) ((i & HprofParser.ROOT_UNKNOWN) - b)))) + b) | ((((i2 + ((int) (((float) (((i >> 24) & HprofParser.ROOT_UNKNOWN) - i2)) * f2))) << 24) | ((i3 + ((int) (((float) (((i >> 16) & HprofParser.ROOT_UNKNOWN) - i3)) * f2))) << 16)) | ((((int) (((float) (((i >> 8) & HprofParser.ROOT_UNKNOWN) - i4)) * f2)) + i4) << 8));
            return;
        }
        c0379j.f2181u = c0379j.m2280b();
    }
}
