package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.C0134j;
import android.support.v7.widget.dh;
import android.util.AttributeSet;
import android.view.Gravity;

public class C0128a extends dh {
    public Drawable f467a;
    public final Rect f468b;
    public final Rect f469c;
    public int f470d;
    public boolean f471e;
    public boolean f472f;

    public C0128a(Context context) {
        this(context, null);
    }

    public C0128a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0128a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f468b = new Rect();
        this.f469c = new Rect();
        this.f470d = 119;
        this.f471e = true;
        this.f472f = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.ForegroundLinearLayout, i, 0);
        this.f470d = obtainStyledAttributes.getInt(C0134j.ForegroundLinearLayout_android_foregroundGravity, this.f470d);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0134j.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f471e = obtainStyledAttributes.getBoolean(C0134j.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }

    public int getForegroundGravity() {
        return this.f470d;
    }

    public void setForegroundGravity(int i) {
        if (this.f470d != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f470d = i2;
            if (this.f470d == 119 && this.f467a != null) {
                this.f467a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f467a;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f467a != null) {
            this.f467a.jumpToCurrentState();
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f467a != null && this.f467a.isStateful()) {
            this.f467a.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        if (this.f467a != drawable) {
            if (this.f467a != null) {
                this.f467a.setCallback(null);
                unscheduleDrawable(this.f467a);
            }
            this.f467a = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f470d == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f467a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f472f |= z;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f472f = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f467a != null) {
            Drawable drawable = this.f467a;
            if (this.f472f) {
                this.f472f = false;
                Rect rect = this.f468b;
                Rect rect2 = this.f469c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f471e) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f470d, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f467a != null) {
            this.f467a.setHotspot(f, f2);
        }
    }
}
