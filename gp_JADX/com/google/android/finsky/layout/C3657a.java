package com.google.android.finsky.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.widget.ab;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.squareup.haha.perflib.HprofParser;

public abstract class C3657a extends ViewGroup {
    public VelocityTracker f18221a;
    public float f18222b;
    public float f18223c;
    public float f18224d = 0.0f;
    public boolean f18225e;
    public int f18226f;
    public int f18227g;
    public final int f18228h;
    public C3673b f18229i;
    public float f18230j;
    public final float f18231k;
    public Context f18232l;
    public ab f18233m;
    public ab f18234n;

    public C3657a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f18232l = context;
        this.f18228h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f18231k = ((context.getResources().getDisplayMetrics().density * 160.0f) * 1158.2634f) * ViewConfiguration.getScrollFriction();
        this.f18233m = new ab(context);
        this.f18234n = new ab(context);
        setWillNotDraw(false);
    }

    abstract float mo3563a(int i);

    abstract float mo3565b(float f);

    abstract float mo3566c(float f);

    private final float m17309d(float f) {
        if (this.f18223c == 0.0f) {
            return f;
        }
        float f2 = f;
        while (f2 < 0.0f) {
            f2 += this.f18223c;
        }
        while (f2 >= this.f18223c) {
            f2 -= this.f18223c;
        }
        return f2;
    }

    private final void mo3564a() {
        if (this.f18221a == null) {
            this.f18221a = VelocityTracker.obtain();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getY();
        float x = motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 2 && this.f18225e) {
            return true;
        }
        switch (action & HprofParser.ROOT_UNKNOWN) {
            case 0:
                if (this.f18221a == null) {
                    this.f18221a = VelocityTracker.obtain();
                } else {
                    this.f18221a.clear();
                }
                this.f18221a.addMovement(motionEvent);
                this.f18225e = false;
                this.f18222b = x;
                this.f18230j = 0.0f;
                break;
            case 2:
                float f = this.f18222b - x;
                this.f18222b = x;
                this.f18230j += Math.abs(f);
                if (this.f18230j > ((float) this.f18228h)) {
                    mo3564a();
                    this.f18221a.addMovement(motionEvent);
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    this.f18225e = true;
                    break;
                }
                break;
        }
        return this.f18225e;
    }

    public synchronized boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        synchronized (this) {
            motionEvent.getY();
            float x = motionEvent.getX();
            mo3564a();
            this.f18221a.addMovement(motionEvent);
            int action = motionEvent.getAction();
            float abs;
            int i2;
            boolean a;
            switch (action & HprofParser.ROOT_UNKNOWN) {
                case 1:
                case 3:
                    this.f18221a.computeCurrentVelocity(1000, 1250.0f);
                    float xVelocity = this.f18221a.getXVelocity();
                    boolean z = action == 3;
                    abs = Math.abs(xVelocity);
                    float b;
                    if (z || abs <= ((float) ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity()) || this.f18223c <= ((float) getWidth())) {
                        if (this.f18230j <= ((float) this.f18228h) && !z && !this.f18225e) {
                            this.f18224d = 0.0f;
                            if (this.f18221a != null) {
                                this.f18221a.recycle();
                                this.f18221a = null;
                                break;
                            }
                        } else if (this.f18223c > ((float) getWidth())) {
                            abs = m17309d(this.f18223c - getScrollPosition());
                            i2 = 0;
                            while (i < getChildCount()) {
                                int width = getChildAt(i).getWidth() + i2;
                                if (((float) width) >= abs) {
                                    if (((float) width) - abs > abs - ((float) i2)) {
                                        b = mo3565b(abs);
                                    } else {
                                        b = mo3566c(abs);
                                    }
                                    x = abs - m17309d(b);
                                    b = (float) Math.sqrt((double) Math.abs((this.f18231k * 2.0f) * x));
                                    abs = b / this.f18231k;
                                    if (x < 0.0f) {
                                        b = -b;
                                    }
                                    m17312a(b, abs);
                                } else {
                                    i2 = this.f18227g + width;
                                    i++;
                                }
                            }
                            x = 0.0f;
                            b = (float) Math.sqrt((double) Math.abs((this.f18231k * 2.0f) * x));
                            abs = b / this.f18231k;
                            if (x < 0.0f) {
                                b = -b;
                            }
                            m17312a(b, abs);
                        }
                    } else {
                        boolean z2;
                        x = abs / this.f18231k;
                        x = (abs * x) - ((x * (this.f18231k * x)) / 2.0f);
                        if (xVelocity < 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        abs = getScrollPosition();
                        if (z2) {
                            b = -x;
                        } else {
                            b = x;
                        }
                        b = m17309d(b + abs);
                        if (z2) {
                            b = -((float) Math.sqrt((double) (((mo3566c(m17309d(this.f18223c - b)) - m17309d(this.f18223c - b)) + x) * (this.f18231k * 2.0f))));
                        } else {
                            b = (float) Math.sqrt((double) (((m17309d(this.f18223c - b) - mo3565b(m17309d(this.f18223c - b))) + x) * (this.f18231k * 2.0f)));
                        }
                        m17312a(b, Math.abs(b) / this.f18231k);
                    }
                    if (this.f18225e) {
                        a = this.f18233m.m2155a();
                        z = this.f18234n.m2155a();
                        if (a || z) {
                            invalidate();
                        }
                    }
                    this.f18225e = false;
                    if (this.f18221a != null) {
                        this.f18221a.recycle();
                        this.f18221a = null;
                    }
                    break;
                case 2:
                    abs = this.f18222b - x;
                    this.f18222b = x;
                    i2 = getWidth();
                    if (this.f18223c > ((float) i2)) {
                        m17311a(getScrollPosition() - abs);
                    }
                    if (getScrollPosition() != 0.0f || abs >= 0.0f) {
                        if (((float) i2) - getScrollPosition() == this.f18223c) {
                            a = this.f18234n.m2156a(abs / ((float) i2));
                        }
                    } else {
                        a = this.f18233m.m2156a((-abs) / ((float) i2));
                    }
                    if (a) {
                        invalidate();
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    final void m17311a(float f) {
        if (f > 0.0f) {
            f = 0.0f;
        }
        int width = (int) (this.f18223c - ((float) getWidth()));
        if ((-f) > ((float) width)) {
            f = (float) (-width);
        }
        scrollTo(-((int) f), 0);
        invalidate();
    }

    protected final void m17312a(float f, float f2) {
        long abs = (long) Math.abs(1000.0f * f2);
        this.f18224d = getScrollPosition();
        this.f18229i = new C3673b(this, f, abs);
        this.f18229i.m17427a();
    }

    protected float getScrollPosition() {
        return (float) (-getScrollX());
    }

    public final void m17313a(int i, int i2) {
        this.f18226f = i;
        this.f18227g = i2;
        requestLayout();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        if (!this.f18233m.f2061a.isFinished()) {
            int save = canvas.save();
            i = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-i) + getPaddingTop()), 0.0f);
            this.f18233m.m2154a(i, (int) this.f18223c);
            i = this.f18233m.m2157a(canvas) | 0;
            canvas.restoreToCount(save);
        }
        if (!this.f18234n.f2061a.isFinished()) {
            save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), -this.f18223c);
            this.f18234n.m2154a(height, (int) this.f18223c);
            i |= this.f18234n.m2157a(canvas);
            canvas.restoreToCount(save);
        }
        if (i != 0) {
            invalidate();
        }
    }
}
