package android.support.v4.widget;

import android.content.res.Resources;
import android.support.v4.view.ai;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class C0368a implements OnTouchListener {
    public static final int f2041r = ViewConfiguration.getTapTimeout();
    public final C0371b f2042a = new C0371b();
    public final Interpolator f2043b = new AccelerateInterpolator();
    public final View f2044c;
    public Runnable f2045d;
    public float[] f2046e = new float[]{0.0f, 0.0f};
    public float[] f2047f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    public int f2048g;
    public int f2049h;
    public float[] f2050i = new float[]{0.0f, 0.0f};
    public float[] f2051j = new float[]{0.0f, 0.0f};
    public float[] f2052k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean f2053l;
    public boolean f2054m;
    public boolean f2055n;
    public boolean f2056o;
    public boolean f2057p;
    public boolean f2058q;

    public C0368a(View view) {
        this.f2044c = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        float f = (float) i;
        this.f2052k[0] = f / 1000.0f;
        this.f2052k[1] = f / 1000.0f;
        float f2 = (float) i2;
        this.f2051j[0] = f2 / 1000.0f;
        this.f2051j[1] = f2 / 1000.0f;
        this.f2048g = 1;
        this.f2047f[0] = Float.MAX_VALUE;
        this.f2047f[1] = Float.MAX_VALUE;
        this.f2046e[0] = 0.2f;
        this.f2046e[1] = 0.2f;
        this.f2050i[0] = 0.001f;
        this.f2050i[1] = 0.001f;
        this.f2049h = f2041r;
        this.f2042a.f2098a = 500;
        this.f2042a.f2099b = 500;
    }

    public abstract void mo464a(int i);

    public abstract boolean mo465b();

    public abstract boolean mo466b(int i);

    public final C0368a m2148a(boolean z) {
        if (this.f2057p && !z) {
            m2147c();
        }
        this.f2057p = z;
        return this;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f2057p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f2055n = true;
                this.f2053l = false;
                break;
            case 1:
            case 3:
                m2147c();
                break;
            case 2:
                break;
        }
        float a = m2146a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f2044c.getWidth());
        float a2 = m2146a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f2044c.getHeight());
        C0371b c0371b = this.f2042a;
        c0371b.f2100c = a;
        c0371b.f2101d = a2;
        if (!this.f2056o && m2150a()) {
            if (this.f2045d == null) {
                this.f2045d = new C0372c(this);
            }
            this.f2056o = true;
            this.f2054m = true;
            if (this.f2053l || this.f2049h <= 0) {
                this.f2045d.run();
            } else {
                ai.m1831a(this.f2044c, this.f2045d, (long) this.f2049h);
            }
            this.f2053l = true;
        }
        if (this.f2058q && this.f2056o) {
            return true;
        }
        return false;
    }

    final boolean m2150a() {
        C0371b c0371b = this.f2042a;
        int abs = (int) (c0371b.f2101d / Math.abs(c0371b.f2101d));
        int abs2 = (int) (c0371b.f2100c / Math.abs(c0371b.f2100c));
        if (abs != 0 && mo466b(abs)) {
            return true;
        }
        if (abs2 != 0) {
            mo465b();
        }
        return false;
    }

    private final void m2147c() {
        if (this.f2054m) {
            this.f2056o = false;
            return;
        }
        C0371b c0371b = this.f2042a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (currentAnimationTimeMillis - c0371b.f2102e);
        int i2 = c0371b.f2099b;
        if (i <= i2) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
        }
        c0371b.f2107j = i2;
        c0371b.f2106i = c0371b.m2218a(currentAnimationTimeMillis);
        c0371b.f2105h = currentAnimationTimeMillis;
    }

    private final float m2146a(int i, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float a = C0368a.m2145a(this.f2046e[i] * f2, 0.0f, this.f2047f[i]);
        a = m2144a(f2 - f, a) - m2144a(f, a);
        if (a < 0.0f) {
            a = -this.f2043b.getInterpolation(-a);
        } else if (a > 0.0f) {
            a = this.f2043b.getInterpolation(a);
        } else {
            a = 0.0f;
            if (a == 0.0f) {
                return 0.0f;
            }
            f4 = this.f2050i[i];
            f5 = this.f2051j[i];
            f6 = this.f2052k[i];
            f4 *= f3;
            if (a <= 0.0f) {
                return C0368a.m2145a(a * f4, f5, f6);
            }
            return -C0368a.m2145a((-a) * f4, f5, f6);
        }
        a = C0368a.m2145a(a, -1.0f, 1.0f);
        if (a == 0.0f) {
            return 0.0f;
        }
        f4 = this.f2050i[i];
        f5 = this.f2051j[i];
        f6 = this.f2052k[i];
        f4 *= f3;
        if (a <= 0.0f) {
            return -C0368a.m2145a((-a) * f4, f5, f6);
        }
        return C0368a.m2145a(a * f4, f5, f6);
    }

    private final float m2144a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f2048g) {
            case 0:
            case 1:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f2056o && this.f2048g == 1) {
                    return 1.0f;
                }
                return 0.0f;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    static float m2145a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }
}
