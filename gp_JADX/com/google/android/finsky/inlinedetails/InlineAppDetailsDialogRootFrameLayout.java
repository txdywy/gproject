package com.google.android.finsky.inlinedetails;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.finsky.frameworkviews.ag;

public class InlineAppDetailsDialogRootFrameLayout extends ag implements OnPreDrawListener {
    public final Rect f16741b = new Rect();
    public final Rect f16742c = new Rect();
    public boolean f16743d;
    public boolean f16744e;
    public boolean f16745f;
    public boolean f16746g;
    public Runnable f16747h;

    public InlineAppDetailsDialogRootFrameLayout(Context context) {
        super(context);
    }

    public InlineAppDetailsDialogRootFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InlineAppDetailsDialogRootFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InlineAppDetailsDialogRootFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f16743d = true;
        }
    }

    public void requestLayout() {
        if (this.f16745f) {
            this.f16746g = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onPreDraw() {
        if (!this.f16743d) {
            return true;
        }
        this.f16743d = false;
        getDrawingRect(this.f16742c);
        boolean z = !this.f16742c.equals(this.f16741b) && ((int) (((float) this.f16741b.width()) * getScaleX())) > 0 && ((int) (((float) this.f16741b.height()) * getScaleY())) > 0 && this.f16742c.width() > 0 && this.f16742c.height() > 0;
        this.f16741b.set(this.f16742c);
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            r7 = new Animator[2];
            r7[0] = ObjectAnimator.ofFloat(this, "scaleX", new float[]{((float) r3) / ((float) r5), 1.0f});
            r7[1] = ObjectAnimator.ofFloat(this, "scaleY", new float[]{((float) r4) / ((float) r6), 1.0f});
            animatorSet.playTogether(r7);
            animatorSet.start();
            return false;
        } else if (this.f16744e) {
            return true;
        } else {
            this.f16744e = true;
            this.f16745f = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.setDuration(500);
            ofFloat.addListener(new C3246a(this));
            ofFloat.start();
            return true;
        }
    }
}
