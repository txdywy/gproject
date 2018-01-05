package com.google.android.play.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.n;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class C6387b extends RelativeLayout implements C6386q {
    public static boolean f32173F;
    public static boolean f32174G;
    public Drawable f32175H;
    public int f32176I;
    public int f32177J;
    public int f32178K;
    public int f32179L;
    public final Rect f32180M;
    public final Rect f32181N;
    public boolean f32182O;

    public C6387b(Context context) {
        this(context, null, 0);
    }

    public C6387b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6387b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32176I = 0;
        this.f32177J = 0;
        this.f32178K = 0;
        this.f32179L = 0;
        this.f32180M = new Rect();
        this.f32181N = new Rect();
        this.f32182O = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843017});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    public void setForeground(Drawable drawable) {
        if (this.f32175H != drawable) {
            if (this.f32175H != null) {
                this.f32175H.setCallback(null);
                unscheduleDrawable(this.f32175H);
            }
            this.f32175H = drawable;
            this.f32176I = 0;
            this.f32177J = 0;
            this.f32178K = 0;
            this.f32179L = 0;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                Rect rect = new Rect();
                if (drawable.getPadding(rect)) {
                    this.f32176I = rect.left;
                    this.f32177J = rect.top;
                    this.f32178K = rect.right;
                    this.f32179L = rect.bottom;
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void m29305a(int i, int i2, int i3, int i4) {
        this.f32176I = i;
        this.f32177J = i2;
        this.f32178K = i3;
        this.f32179L = i4;
        requestLayout();
        invalidate();
    }

    public Drawable getForeground() {
        return this.f32175H;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32175H;
    }

    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (f32173F && this.f32175H != null) {
            this.f32175H.jumpToCurrentState();
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f32175H != null && this.f32175H.isStateful()) {
            this.f32175H.setState(getDrawableState());
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f32175H != null) {
            this.f32175H.setHotspot(f, f2);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f32175H != null) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f32175H.setVisible(z, false);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f32182O = true;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f32182O = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f32175H != null) {
            Drawable drawable = this.f32175H;
            if (this.f32182O) {
                this.f32182O = false;
                Rect rect = this.f32180M;
                Rect rect2 = this.f32181N;
                rect.set(this.f32176I, this.f32177J, getWidth() - this.f32178K, getHeight() - this.f32179L);
                if (f32174G) {
                    n.a(119, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2, getLayoutDirection());
                } else {
                    this.f32181N.set(rect);
                }
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        } else {
            z = false;
        }
        f32173F = z;
        if (VERSION.SDK_INT < 17) {
            z2 = false;
        }
        f32174G = z2;
    }
}
