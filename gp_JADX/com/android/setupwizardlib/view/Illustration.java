package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View.MeasureSpec;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.android.setupwizardlib.C0612f;

public class Illustration extends FrameLayout {
    public float f3970a;
    public Drawable f3971b;
    public Drawable f3972c;
    public final Rect f3973d = new Rect();
    public final Rect f3974e = new Rect();
    public float f3975f = 1.0f;
    public float f3976g = 0.0f;

    public Illustration(Context context) {
        super(context);
        m4256a(null, 0);
    }

    public Illustration(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4256a(attributeSet, 0);
    }

    @TargetApi(11)
    public Illustration(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4256a(attributeSet, i);
    }

    private final void m4256a(AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0612f.SuwIllustration, i, 0);
            this.f3976g = obtainStyledAttributes.getFloat(C0612f.SuwIllustration_suwAspectRatio, 0.0f);
            obtainStyledAttributes.recycle();
        }
        this.f3970a = getResources().getDisplayMetrics().density * 8.0f;
        setWillNotDraw(false);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != this.f3971b) {
            this.f3971b = drawable;
            invalidate();
            requestLayout();
        }
    }

    public void setIllustration(Drawable drawable) {
        if (drawable != this.f3972c) {
            this.f3972c = drawable;
            invalidate();
            requestLayout();
        }
    }

    public void setAspectRatio(float f) {
        this.f3976g = f;
        invalidate();
        requestLayout();
    }

    @Deprecated
    public void setForeground(Drawable drawable) {
        setIllustration(drawable);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f3976g != 0.0f) {
            int size = (int) (((float) MeasureSpec.getSize(i)) / this.f3976g);
            setPadding(0, (int) (((float) size) - (((float) size) % this.f3970a)), 0, 0);
        }
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        super.onMeasure(i, i2);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.f3972c != null) {
            int intrinsicWidth = this.f3972c.getIntrinsicWidth();
            int intrinsicHeight = this.f3972c.getIntrinsicHeight();
            this.f3973d.set(0, 0, i5, i6);
            if (this.f3976g != 0.0f) {
                this.f3975f = ((float) i5) / ((float) intrinsicWidth);
                intrinsicHeight = (int) (((float) intrinsicHeight) * this.f3975f);
                intrinsicWidth = i5;
            }
            Gravity.apply(55, intrinsicWidth, intrinsicHeight, this.f3973d, this.f3974e);
            this.f3972c.setBounds(this.f3974e);
        }
        if (this.f3971b != null) {
            this.f3971b.setBounds(0, 0, (int) Math.ceil((double) (((float) i5) / this.f3975f)), (int) Math.ceil((double) (((float) (i6 - this.f3974e.height())) / this.f3975f)));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onDraw(Canvas canvas) {
        if (this.f3971b != null) {
            canvas.save();
            canvas.translate(0.0f, (float) this.f3974e.height());
            canvas.scale(this.f3975f, this.f3975f, 0.0f, 0.0f);
            if (VERSION.SDK_INT > 17 && m4257a(this.f3971b, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f3971b.getBounds().width()), 0.0f);
            }
            this.f3971b.draw(canvas);
            canvas.restore();
        }
        if (this.f3972c != null) {
            canvas.save();
            if (VERSION.SDK_INT > 17 && m4257a(this.f3972c, getLayoutDirection())) {
                canvas.scale(-1.0f, 1.0f);
                canvas.translate((float) (-this.f3974e.width()), 0.0f);
            }
            this.f3972c.draw(canvas);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    private final boolean m4257a(Drawable drawable, int i) {
        if (i == 1) {
            if (VERSION.SDK_INT >= 19) {
                return drawable.isAutoMirrored();
            }
            if (VERSION.SDK_INT >= 17) {
                if ((getContext().getApplicationInfo().flags & 4194304) == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
