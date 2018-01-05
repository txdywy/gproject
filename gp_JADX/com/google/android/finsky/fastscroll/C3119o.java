package com.google.android.finsky.fastscroll;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.fe;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.finsky.ba.C1461c;
import com.squareup.leakcanary.C7582R;

final class C3119o implements OnPreDrawListener {
    public static final int[] f16080a = new int[]{16842919};
    public static final int[] f16081b = new int[]{16843623};
    public static final int[] f16082c = new int[0];
    public final C1461c f16083d;
    public final ValueAnimator f16084e = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public final Runnable f16085f = new C3121q(this);
    public final Drawable f16086g;
    public int f16087h;
    public int f16088i;
    public final int f16089j;
    public final int f16090k;
    public final int f16091l;
    public final int f16092m;
    public float f16093n;
    public float f16094o;
    public int f16095p;
    public int f16096q;
    public int f16097r = 0;
    public final Resources f16098s;
    public final ScrubberView f16099t;
    public final C3124v f16100u = new C3124v();
    public C3114j f16101v;
    public C3103b f16102w;
    public final fe f16103x = new C3122r(this);

    public C3119o(ScrubberView scrubberView, C1461c c1461c) {
        this.f16098s = scrubberView.getResources();
        this.f16099t = scrubberView;
        this.f16083d = c1461c;
        this.f16086g = this.f16098s.getDrawable(C7582R.drawable.ic_scrubber);
        this.f16088i = this.f16098s.getDimensionPixelSize(C7582R.dimen.fast_scroll_scrubber_width_idle);
        this.f16087h = this.f16098s.getDimensionPixelSize(C7582R.dimen.fast_scroll_scrubber_height);
        this.f16089j = this.f16098s.getDimensionPixelSize(C7582R.dimen.fast_scroll_scrubber_hover_zone_width);
        this.f16090k = this.f16098s.getDimensionPixelSize(C7582R.dimen.fast_scroll_scrubber_finger_drag_zone_width);
        this.f16091l = this.f16098s.getDimensionPixelSize(C7582R.dimen.fast_scroll_distance_threshold);
        TypedValue typedValue = new TypedValue();
        this.f16098s.getValue(C7582R.dimen.fast_scroll_drag_jitter_threshold, typedValue, true);
        this.f16092m = (int) TypedValue.applyDimension(1, typedValue.getFloat(), this.f16098s.getDisplayMetrics());
        this.f16084e.addUpdateListener(new C3120p(this));
        this.f16084e.addListener(new C3123s(this));
    }

    final void m15973a(C3110t c3110t) {
        C3124v c3124v = this.f16100u;
        if (!c3124v.f16108a.contains(c3110t)) {
            c3124v.f16108a.add(c3110t);
        }
    }

    public final void m15971a() {
        int[] iArr;
        switch (this.f16097r) {
            case 2:
                iArr = f16080a;
                this.f16088i = this.f16098s.getDimensionPixelSize(C7582R.dimen.fast_scroll_scrubber_width_dragging);
                break;
            case 3:
                iArr = f16081b;
                this.f16088i = this.f16098s.getDimensionPixelSize(C7582R.dimen.fast_scroll_scrubber_width_hover);
                break;
            default:
                iArr = f16082c;
                this.f16088i = this.f16098s.getDimensionPixelSize(C7582R.dimen.fast_scroll_scrubber_width_idle);
                break;
        }
        this.f16086g.setState(iArr);
    }

    public final boolean m15975a(MotionEvent motionEvent) {
        return m15977b(motionEvent) || this.f16097r == 2;
    }

    public final boolean onPreDraw() {
        m15976b();
        return true;
    }

    final void m15976b() {
        if (this.f16102w != null && this.f16101v != null) {
            if (this.f16102w.mo3316a()) {
                if (this.f16097r != 2) {
                    float b = this.f16102w.mo3317b();
                    if (b > 0.0f) {
                        this.f16093n = (this.f16102w.mo3319c() / b) * ((float) (this.f16101v.mo3327a() - this.f16087h));
                        if (m15980e() != this.f16095p && this.f16097r != 0) {
                            this.f16099t.invalidate();
                        }
                    } else if (this.f16097r != 0) {
                        m15972a(0);
                    }
                }
            } else if (this.f16097r != 0) {
                m15972a(0);
            }
        }
    }

    final void m15972a(int i) {
        switch (i) {
            case 0:
                this.f16099t.removeCallbacks(this.f16085f);
                this.f16099t.invalidate();
                break;
            case 1:
                if (this.f16097r != 1) {
                    m15969a(true);
                }
                this.f16099t.removeCallbacks(this.f16085f);
                this.f16099t.postDelayed(this.f16085f, 1000);
                break;
            case 2:
                if (this.f16097r != 2) {
                    m15969a(true);
                }
                this.f16099t.removeCallbacks(this.f16085f);
                break;
            case 3:
                if (this.f16097r != 3) {
                    m15969a(true);
                }
                this.f16099t.removeCallbacks(this.f16085f);
                break;
            case 4:
                m15969a(false);
                this.f16099t.invalidate();
                break;
        }
        this.f16097r = i;
        m15971a();
    }

    private final void m15969a(boolean z) {
        ValueAnimator valueAnimator = this.f16084e;
        float[] fArr = new float[2];
        fArr[0] = ((Float) this.f16084e.getAnimatedValue()).floatValue();
        fArr[1] = z ? 1.0f : 0.0f;
        valueAnimator.setFloatValues(fArr);
        this.f16084e.setDuration(z ? 0 : 200);
        this.f16084e.start();
    }

    private final int m15970f() {
        return this.f16101v == null ? 0 : this.f16101v.mo3328b();
    }

    final float m15978c() {
        return ((1.0f - ((Float) this.f16084e.getAnimatedValue()).floatValue()) * ((float) this.f16088i)) + ((float) this.f16099t.getWidth());
    }

    final float m15979d() {
        return m15978c() - ((float) this.f16088i);
    }

    final int m15980e() {
        return ((int) this.f16093n) + m15970f();
    }

    final boolean m15977b(MotionEvent motionEvent) {
        if (motionEvent.isFromSource(8194)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x <= m15979d() || x >= m15978c() || y <= ((float) m15980e()) || y >= ((float) (this.f16087h + m15980e()))) {
                return false;
            }
            return true;
        }
        x = motionEvent.getX();
        y = motionEvent.getY();
        if (this.f16101v == null || x <= ((float) (this.f16099t.getWidth() - this.f16090k)) || x >= ((float) this.f16099t.getWidth()) || y <= ((float) m15970f()) || y >= ((float) (m15970f() + this.f16101v.mo3327a()))) {
            return false;
        }
        return true;
    }

    final boolean m15974a(float f, float f2) {
        return this.f16101v != null && f > ((float) (this.f16099t.getWidth() - this.f16089j)) && f < ((float) this.f16099t.getWidth()) && f2 > ((float) m15970f()) && f2 < ((float) (m15970f() + this.f16101v.mo3327a()));
    }
}
