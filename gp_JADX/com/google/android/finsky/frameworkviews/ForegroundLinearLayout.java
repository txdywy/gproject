package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0357n;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.play.layout.q;

public class ForegroundLinearLayout extends LinearLayout implements q {
    public static final boolean f11465n = (VERSION.SDK_INT >= 17);
    public Drawable f11466o;
    public int f11467p;
    public int f11468q;
    public int f11469r;
    public int f11470s;
    public final Rect f11471t;
    public final Rect f11472u;
    public boolean f11473v;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11467p = 0;
        this.f11468q = 0;
        this.f11469r = 0;
        this.f11470s = 0;
        this.f11471t = new Rect();
        this.f11472u = new Rect();
        this.f11473v = false;
        m11898a(context, attributeSet);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11467p = 0;
        this.f11468q = 0;
        this.f11469r = 0;
        this.f11470s = 0;
        this.f11471t = new Rect();
        this.f11472u = new Rect();
        this.f11473v = false;
        m11898a(context, attributeSet);
    }

    private final void m11898a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    public void setForeground(Drawable drawable) {
        if (this.f11466o != drawable) {
            if (this.f11466o != null) {
                this.f11466o.setCallback(null);
                unscheduleDrawable(this.f11466o);
            }
            this.f11466o = drawable;
            this.f11467p = 0;
            this.f11468q = 0;
            this.f11469r = 0;
            this.f11470s = 0;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                Rect rect = new Rect();
                if (drawable.getPadding(rect)) {
                    this.f11467p = rect.left;
                    this.f11468q = rect.top;
                    this.f11469r = rect.right;
                    this.f11470s = rect.bottom;
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f11466o;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11466o;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f11466o != null) {
            this.f11466o.jumpToCurrentState();
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f11466o != null && this.f11466o.isStateful()) {
            this.f11466o.setState(getDrawableState());
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f11466o != null) {
            this.f11466o.setHotspot(f, f2);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f11466o != null) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f11466o.setVisible(z, false);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11473v = true;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11473v = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f11466o != null) {
            Drawable drawable = this.f11466o;
            if (this.f11473v) {
                this.f11473v = false;
                Rect rect = this.f11471t;
                Rect rect2 = this.f11472u;
                rect.set(this.f11467p, this.f11468q, getWidth() - this.f11469r, getHeight() - this.f11470s);
                if (f11465n) {
                    C0357n.m2044a(119, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2, getLayoutDirection());
                } else {
                    this.f11472u.set(rect);
                }
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }
}
