package com.google.android.wallet.ui.common;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.wallet.p383e.C6626j;

public class FocusedViewToTopScrollView extends ScrollView implements AnimatorListener, OnGlobalLayoutListener, Runnable {
    public static final Interpolator f33353a = new AccelerateDecelerateInterpolator();
    public DisplayMetrics f33354b;
    public boolean f33355c;
    public boolean f33356d;
    public View f33357e;
    public int f33358f = 0;
    public int f33359g;
    public int f33360h;
    public boolean f33361i = true;
    public boolean f33362j = true;
    public AnimatorListener f33363k;
    public boolean f33364l = false;
    public boolean f33365m = false;
    public int f33366n = -1;
    public ValueAnimator f33367o = null;
    public int f33368p = -1;
    public Interpolator f33369q = f33353a;
    public float f33370r;
    public long f33371s = 500;
    public ah f33372t;
    public ag f33373u;
    public ag f33374v;

    public FocusedViewToTopScrollView(Context context) {
        super(context);
        m30611a(context, null);
    }

    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30611a(context, attributeSet);
    }

    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30611a(context, attributeSet);
    }

    @TargetApi(21)
    public FocusedViewToTopScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m30611a(context, attributeSet);
    }

    public void setAverageSpeed(float f) {
        this.f33370r = ((float) ((int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics()))) / 1000.0f;
    }

    public void setMaxDuration(long j) {
        this.f33371s = j;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f33369q = interpolator;
    }

    public void setAnimateScroll(boolean z) {
        if (this.f33362j != z) {
            this.f33362j = z;
            if (!z) {
                if (this.f33374v != null && (this.f33374v.f33519b || this.f33373u == null)) {
                    m30609a(this.f33374v.f33521d);
                } else if (this.f33373u != null) {
                    m30609a(this.f33373u.f33521d);
                }
                m30614b();
                m30608a();
            }
        }
    }

    public void setScrollToTop(boolean z) {
        m30618a(z, false, 0);
    }

    public final void m30618a(boolean z, boolean z2, int i) {
        this.f33361i = z;
        this.f33356d = z2;
        this.f33358f = i;
        if (this.f33357e != null) {
            removeView(this.f33357e);
            this.f33357e = null;
        }
        if (m30616d()) {
            View childAt = getChildAt(0);
            if (childAt != null && !m30612a(childAt)) {
                removeView(childAt);
                addView(m30613b(childAt));
            }
        }
    }

    public void setThresholdToScrollInPixels(int i) {
        this.f33360h = i;
    }

    public void setFocusedViewOffsetInPixels(int i) {
        this.f33359g = i;
    }

    public void setScrollViewListener(ah ahVar) {
        this.f33372t = ahVar;
    }

    public boolean getScrollToTop() {
        return this.f33361i;
    }

    public boolean getAnimateScroll() {
        return this.f33362j;
    }

    public boolean getInjectPaddingForScrollToTopWithAdjustPan() {
        return this.f33356d;
    }

    public void setPriorityScrollingAnimationListener(AnimatorListener animatorListener) {
        this.f33363k = animatorListener;
    }

    public void scrollTo(int i, int i2) {
        if (this.f33362j && this.f33365m) {
            m30610a(i2, true);
        } else {
            m30609a(i2);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (!this.f33362j) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return z2;
        }
        if (z) {
            m30610a(computeScrollDeltaToGetChildRectOnScreen + getScrollY(), false);
            return z2;
        }
        scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        return z2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f33374v != null && this.f33374v.f33518a) {
            return true;
        }
        m30608a();
        return super.onTouchEvent(motionEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f33364l = true;
        super.onLayout(z, i, i2, i3, i4);
        this.f33364l = false;
        this.f33365m = true;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putInt("thresholdToScroll", this.f33360h);
        bundle.putBoolean("scrollToTop", this.f33361i);
        bundle.putInt("focusedViewOffset", this.f33359g);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
            this.f33360h = bundle.getInt("thresholdToScroll");
            this.f33361i = bundle.getBoolean("scrollToTop");
            this.f33359g = bundle.getInt("focusedViewOffset");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m30615c();
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (!this.f33361i) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        int scrollY = getScrollY();
        int height = scrollY + getHeight();
        int max = Math.max((rect.top - scrollY) - this.f33359g, -getScrollY());
        if (rect.bottom > height + max) {
            if (rect.height() > getHeight()) {
                max = rect.top - scrollY;
            } else {
                max = rect.bottom - height;
            }
        }
        return Math.abs(max) <= this.f33360h ? 0 : max;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (m30616d() && !m30612a(view)) {
            view = m30613b(view);
        }
        super.addView(view, i, layoutParams);
    }

    public void run() {
        float f = 0.001f;
        if (this.f33374v == null || !this.f33374v.f33519b) {
            if (this.f33373u.f33520c) {
                TimeInterpolator timeInterpolator;
                int abs = Math.abs(this.f33373u.f33521d - getScrollY());
                if (this.f33367o == null || !this.f33367o.isRunning()) {
                    f = 0.0f;
                } else {
                    ValueAnimator valueAnimator = this.f33367o;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    TimeInterpolator interpolator = valueAnimator.getInterpolator();
                    if (animatedFraction + 0.001f > 1.0f) {
                        f = -0.001f;
                    }
                    f = (((interpolator.getInterpolation(animatedFraction + f) - interpolator.getInterpolation(animatedFraction)) / f) * ((float) this.f33368p)) / ((float) this.f33367o.getDuration());
                    this.f33367o.cancel();
                    this.f33367o.removeAllUpdateListeners();
                }
                this.f33367o = ValueAnimator.ofInt(new int[]{getScrollY(), this.f33373u.f33521d});
                this.f33367o.addListener(this);
                this.f33367o.addUpdateListener(new ae(this));
                long min = Math.min((long) (((float) Math.abs(this.f33373u.f33521d - getScrollY())) / this.f33370r), this.f33371s);
                this.f33367o.setDuration(min);
                float f2 = (f * ((float) min)) / ((float) abs);
                ValueAnimator valueAnimator2 = this.f33367o;
                if (Float.compare(f2, 0.0f) == 0) {
                    timeInterpolator = this.f33369q;
                } else {
                    timeInterpolator = new af(this.f33369q, f2);
                }
                valueAnimator2.setInterpolator(timeInterpolator);
                this.f33374v = this.f33373u;
                this.f33366n = getScrollY();
                this.f33368p = abs;
                if (this.f33374v.f33518a && this.f33363k != null) {
                    this.f33367o.addListener(this.f33363k);
                }
                this.f33367o.start();
            } else {
                m30608a();
                m30609a(this.f33373u.f33521d);
            }
        }
        this.f33373u = null;
    }

    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f33374v = null;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    private final void m30611a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicFocusedViewToTopScrollView);
        this.f33359g = obtainStyledAttributes.getDimensionPixelOffset(C6626j.WalletUicFocusedViewToTopScrollView_internalUicFocusedViewOffset, 0);
        this.f33360h = obtainStyledAttributes.getDimensionPixelOffset(C6626j.WalletUicFocusedViewToTopScrollView_internalUicThresholdToScroll, 0);
        setMaxDuration((long) obtainStyledAttributes.getInteger(C6626j.WalletUicFocusedViewToTopScrollView_internalUicMaxDuration, 500));
        setAverageSpeed(obtainStyledAttributes.getDimension(C6626j.WalletUicFocusedViewToTopScrollView_internalUicAverageSpeed, 250.0f));
        obtainStyledAttributes.recycle();
        setSmoothScrollingEnabled(false);
        this.f33354b = getContext().getResources().getDisplayMetrics();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private final void m30610a(int i, boolean z) {
        if (this.f33364l && getScrollY() == i) {
            m30609a(i);
            return;
        }
        if (this.f33373u != null) {
            if (!this.f33373u.f33519b) {
                m30614b();
            } else {
                return;
            }
        }
        if (this.f33374v == null || Math.abs(this.f33374v.f33521d - i) > this.f33360h || this.f33366n != getScrollY()) {
            this.f33373u = new ag(i, z);
            post(this);
        }
    }

    private final void m30609a(int i) {
        super.scrollTo(getScrollX(), i);
    }

    private final void m30608a() {
        if (this.f33367o != null) {
            this.f33367o.cancel();
        }
    }

    private final void m30614b() {
        removeCallbacks(this);
        this.f33373u = null;
    }

    private final void m30615c() {
        if (this.f33372t != null && getChildCount() != 0 && this.f33357e == null && getHeight() + getScrollY() >= getChildAt(0).getHeight()) {
            this.f33372t.m30725a();
        }
    }

    private final boolean m30616d() {
        return this.f33361i && this.f33356d && (this.f33358f & 32) != 0;
    }

    private static boolean m30612a(View view) {
        if ((view instanceof LinearLayout) && ((LinearLayout) view).getOrientation() == 1) {
            return true;
        }
        return false;
    }

    private final ViewGroup m30613b(View view) {
        ViewGroup linearLayout = new LinearLayout(getContext());
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(view);
        return linearLayout;
    }

    public void onGlobalLayout() {
        m30615c();
        if (m30616d()) {
            Rect rect = new Rect();
            boolean a = ci.m30870a(rect, (View) this, this.f33354b);
            if ((a && this.f33357e == null) || a != this.f33355c) {
                this.f33355c = a;
                View view = (ViewGroup) getChildAt(0);
                if (this.f33357e != null) {
                    view.removeView(this.f33357e);
                    this.f33357e = null;
                }
                if (a) {
                    int i = rect.bottom - rect.top;
                    View findViewById = getRootView().findViewById(16908290);
                    int height = findViewById.getHeight();
                    int[] iArr = new int[2];
                    ci.m30867a(iArr, (View) this, findViewById);
                    int height2 = height - (iArr[1] + getHeight());
                    i = ((this.f33354b.heightPixels - i) - height2) - ((this.f33354b.heightPixels - height) / 2);
                    if (i < 0) {
                        Log.i("FocusedViewToTopScr", "paddingToInsert=" + i + " < 0. Aborting.");
                        return;
                    }
                    if (ci.m30840a(view) == getHeight()) {
                        i += ((int) (((float) this.f33354b.heightPixels) * 0.98f)) - height;
                    }
                    this.f33357e = new View(getContext());
                    view.addView(this.f33357e, 0, i);
                }
            }
        }
    }

    final /* synthetic */ void m30617a(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f33366n = intValue;
        m30609a(intValue);
    }
}
