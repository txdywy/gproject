package android.support.v7.widget;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ai;
import android.view.MotionEvent;
import com.squareup.haha.perflib.HprofParser;

final class cl extends ev implements fd {
    public static final int[] f3293a = new int[]{16842919};
    public static final int[] f3294b = new int[0];
    public final int[] f3295A = new int[2];
    public final ValueAnimator f3296B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    public int f3297C = 0;
    public final Runnable f3298D = new cm(this);
    public final fe f3299E = new cn(this);
    public final int f3300c;
    public final int f3301d;
    public final StateListDrawable f3302e;
    public final Drawable f3303f;
    public final int f3304g;
    public final int f3305h;
    public final StateListDrawable f3306i;
    public final Drawable f3307j;
    public final int f3308k;
    public final int f3309l;
    public int f3310m;
    public int f3311n;
    public float f3312o;
    public int f3313p;
    public int f3314q;
    public float f3315r;
    public int f3316s = 0;
    public int f3317t = 0;
    public RecyclerView f3318u;
    public boolean f3319v = false;
    public boolean f3320w = false;
    public int f3321x = 0;
    public int f3322y = 0;
    public final int[] f3323z = new int[2];

    cl(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f3302e = stateListDrawable;
        this.f3303f = drawable;
        this.f3306i = stateListDrawable2;
        this.f3307j = drawable2;
        this.f3304g = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3305h = Math.max(i, drawable.getIntrinsicWidth());
        this.f3308k = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3309l = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3300c = i2;
        this.f3301d = i3;
        this.f3302e.setAlpha(HprofParser.ROOT_UNKNOWN);
        this.f3303f.setAlpha(HprofParser.ROOT_UNKNOWN);
        this.f3296B.addListener(new co(this));
        this.f3296B.addUpdateListener(new cp(this));
        if (this.f3318u != recyclerView) {
            RecyclerView recyclerView2;
            if (this.f3318u != null) {
                RecyclerView recyclerView3 = this.f3318u;
                if (recyclerView3.f528v != null) {
                    recyclerView3.f528v.mo733a("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView3.f530x.remove(this);
                if (recyclerView3.f530x.isEmpty()) {
                    recyclerView3.setWillNotDraw(recyclerView3.getOverScrollMode() == 2);
                }
                recyclerView3.m315o();
                recyclerView3.requestLayout();
                recyclerView2 = this.f3318u;
                recyclerView2.f531y.remove(this);
                if (recyclerView2.f532z == this) {
                    recyclerView2.f532z = null;
                }
                this.f3318u.mo2952b(this.f3299E);
                m3416d();
            }
            this.f3318u = recyclerView;
            if (this.f3318u != null) {
                recyclerView2 = this.f3318u;
                if (recyclerView2.f528v != null) {
                    recyclerView2.f528v.mo733a("Cannot add item decoration during a scroll  or layout");
                }
                if (recyclerView2.f530x.isEmpty()) {
                    recyclerView2.setWillNotDraw(false);
                }
                recyclerView2.f530x.add(this);
                recyclerView2.m315o();
                recyclerView2.requestLayout();
                this.f3318u.f531y.add(this);
                this.f3318u.mo2951a(this.f3299E);
            }
        }
    }

    final void m3418a(int i) {
        if (i == 2 && this.f3321x != 2) {
            this.f3302e.setState(f3293a);
            m3416d();
        }
        if (i == 0) {
            this.f3318u.invalidate();
        } else {
            m3415c();
        }
        if (this.f3321x == 2 && i != 2) {
            this.f3302e.setState(f3294b);
            m3412b(1200);
        } else if (i == 1) {
            m3412b(1500);
        }
        this.f3321x = i;
    }

    private final boolean m3413b() {
        if (ai.f1848a.mo400k(this.f3318u) == 1) {
            return true;
        }
        return false;
    }

    private final void m3415c() {
        switch (this.f3297C) {
            case 0:
                break;
            case 3:
                this.f3296B.cancel();
                break;
            default:
                return;
        }
        this.f3297C = 1;
        this.f3296B.setFloatValues(new float[]{((Float) this.f3296B.getAnimatedValue()).floatValue(), 1.0f});
        this.f3296B.setDuration(500);
        this.f3296B.setStartDelay(0);
        this.f3296B.start();
    }

    private final void m3416d() {
        this.f3318u.removeCallbacks(this.f3298D);
    }

    private final void m3412b(int i) {
        m3416d();
        this.f3318u.postDelayed(this.f3298D, (long) i);
    }

    public final void mo789b(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        if (this.f3316s != this.f3318u.getWidth() || this.f3317t != this.f3318u.getHeight()) {
            this.f3316s = this.f3318u.getWidth();
            this.f3317t = this.f3318u.getHeight();
            m3418a(0);
        } else if (this.f3297C != 0) {
            int i;
            int i2;
            if (this.f3319v) {
                i = this.f3316s - this.f3304g;
                i2 = this.f3311n - (this.f3310m / 2);
                this.f3302e.setBounds(0, 0, this.f3304g, this.f3310m);
                this.f3303f.setBounds(0, 0, this.f3305h, this.f3317t);
                if (m3413b()) {
                    this.f3303f.draw(canvas);
                    canvas.translate((float) this.f3304g, (float) i2);
                    canvas.scale(-1.0f, 1.0f);
                    this.f3302e.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.f3304g), (float) (-i2));
                } else {
                    canvas.translate((float) i, 0.0f);
                    this.f3303f.draw(canvas);
                    canvas.translate(0.0f, (float) i2);
                    this.f3302e.draw(canvas);
                    canvas.translate((float) (-i), (float) (-i2));
                }
            }
            if (this.f3320w) {
                i = this.f3317t - this.f3308k;
                i2 = this.f3314q - (this.f3313p / 2);
                this.f3306i.setBounds(0, 0, this.f3313p, this.f3308k);
                this.f3307j.setBounds(0, 0, this.f3316s, this.f3309l);
                canvas.translate(0.0f, (float) i);
                this.f3307j.draw(canvas);
                canvas.translate((float) i2, 0.0f);
                this.f3306i.draw(canvas);
                canvas.translate((float) (-i2), (float) (-i));
            }
        }
    }

    public final boolean mo788a(MotionEvent motionEvent) {
        if (this.f3321x == 1) {
            boolean a = m3411a(motionEvent.getX(), motionEvent.getY());
            boolean b = m3414b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0 || (!a && !b)) {
                return false;
            }
            if (b) {
                this.f3322y = 1;
                this.f3315r = (float) ((int) motionEvent.getX());
            } else if (a) {
                this.f3322y = 2;
                this.f3312o = (float) ((int) motionEvent.getY());
            }
            m3418a(2);
            return true;
        } else if (this.f3321x != 2) {
            return false;
        } else {
            return true;
        }
    }

    public final void mo790b(MotionEvent motionEvent) {
        if (this.f3321x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean a = m3411a(motionEvent.getX(), motionEvent.getY());
                boolean b = m3414b(motionEvent.getX(), motionEvent.getY());
                if (a || b) {
                    if (b) {
                        this.f3322y = 1;
                        this.f3315r = (float) ((int) motionEvent.getX());
                    } else if (a) {
                        this.f3322y = 2;
                        this.f3312o = (float) ((int) motionEvent.getY());
                    }
                    m3418a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3321x == 2) {
                this.f3312o = 0.0f;
                this.f3315r = 0.0f;
                m3418a(1);
                this.f3322y = 0;
            } else if (motionEvent.getAction() == 2 && this.f3321x == 2) {
                float x;
                int[] iArr;
                float max;
                int a2;
                m3415c();
                if (this.f3322y == 1) {
                    x = motionEvent.getX();
                    this.f3295A[0] = this.f3301d;
                    this.f3295A[1] = this.f3316s - this.f3301d;
                    iArr = this.f3295A;
                    max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f3314q) - max) >= 2.0f) {
                        a2 = m3410a(this.f3315r, max, iArr, this.f3318u.computeHorizontalScrollRange(), this.f3318u.computeHorizontalScrollOffset(), this.f3316s);
                        if (a2 != 0) {
                            this.f3318u.scrollBy(a2, 0);
                        }
                        this.f3315r = max;
                    }
                }
                if (this.f3322y == 2) {
                    x = motionEvent.getY();
                    this.f3323z[0] = this.f3301d;
                    this.f3323z[1] = this.f3317t - this.f3301d;
                    iArr = this.f3323z;
                    max = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.f3311n) - max) >= 2.0f) {
                        a2 = m3410a(this.f3312o, max, iArr, this.f3318u.computeVerticalScrollRange(), this.f3318u.computeVerticalScrollOffset(), this.f3317t);
                        if (a2 != 0) {
                            this.f3318u.scrollBy(0, a2);
                        }
                        this.f3312o = max;
                    }
                }
            }
        }
    }

    public final void mo787a() {
    }

    private static int m3410a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        i4 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i6 = i2 + i4;
        if (i6 >= i5 || i6 < 0) {
            return 0;
        }
        return i4;
    }

    private final boolean m3411a(float f, float f2) {
        if (m3413b() ? f <= ((float) (this.f3304g / 2)) : f >= ((float) (this.f3316s - this.f3304g))) {
            if (f2 >= ((float) (this.f3311n - (this.f3310m / 2))) && f2 <= ((float) (this.f3311n + (this.f3310m / 2)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean m3414b(float f, float f2) {
        return f2 >= ((float) (this.f3317t - this.f3308k)) && f >= ((float) (this.f3314q - (this.f3313p / 2))) && f <= ((float) (this.f3314q + (this.f3313p / 2)));
    }
}
