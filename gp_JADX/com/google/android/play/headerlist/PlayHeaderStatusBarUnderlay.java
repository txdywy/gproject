package com.google.android.play.headerlist;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

@TargetApi(21)
class PlayHeaderStatusBarUnderlay extends View implements AnimatorListener {
    public static Interpolator f31883a;
    public final Paint f31884b;
    public int f31885c;
    public int f31886d;
    public int f31887e;
    public int f31888f;
    public ObjectAnimator f31889g;
    public int f31890h;
    public boolean f31891i;

    public PlayHeaderStatusBarUnderlay(Context context) {
        this(context, null);
    }

    public PlayHeaderStatusBarUnderlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (PlayHeaderListLayout.f31823t) {
            this.f31884b = new Paint();
            this.f31884b.setAntiAlias(false);
            setAlpha(0.0f);
            return;
        }
        this.f31884b = null;
    }

    public final void m29114a(int i, int i2) {
        this.f31885c = i;
        this.f31886d = i2;
    }

    protected void onDraw(Canvas canvas) {
        if (PlayHeaderListLayout.f31823t) {
            int width = getWidth();
            this.f31884b.setColor(this.f31886d);
            canvas.drawRect(0.0f, 0.0f, (float) width, (float) this.f31888f, this.f31884b);
            if (this.f31888f > this.f31887e) {
                this.f31884b.setColor(this.f31885c);
                canvas.drawRect(0.0f, (float) this.f31887e, (float) width, (float) this.f31888f, this.f31884b);
            }
        }
    }

    final void m29113a(int i) {
        if (this.f31888f != i) {
            this.f31888f = i;
            invalidate();
        }
    }

    final void m29115a(int i, boolean z) {
        float alpha = getAlpha();
        if (this.f31889g != null && this.f31889g.isStarted()) {
            alpha = ((Float) this.f31889g.getAnimatedValue()).floatValue();
            this.f31889g.cancel();
        }
        float f = alpha;
        alpha = i == 1 ? 1.0f : 0.0f;
        if (!z || f == alpha) {
            setAlpha(alpha);
            return;
        }
        if (f31883a == null) {
            f31883a = new LinearInterpolator();
        }
        this.f31890h = i;
        this.f31889g = ObjectAnimator.ofFloat(this, ALPHA, new float[]{f, alpha});
        this.f31889g.setDuration((long) (Math.abs(alpha - f) * 300.0f));
        this.f31889g.setInterpolator(f31883a);
        this.f31889g.addListener(this);
        this.f31889g.start();
    }

    public void onAnimationStart(Animator animator) {
        setLayerType(2, null);
    }

    public void onAnimationEnd(Animator animator) {
        if (animator == this.f31889g) {
            int i = this.f31890h == 2 ? 1 : 0;
            this.f31890h = 0;
            this.f31889g = null;
            if (i != 0) {
                setMinimumHeight(0);
            }
            setLayerType(0, null);
        }
    }

    public void onAnimationCancel(Animator animator) {
        if (animator == this.f31889g) {
            this.f31890h = 0;
            this.f31889g = null;
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
