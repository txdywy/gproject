package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View$MeasureSpec;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.android.setupwizardlib.f;

public class Illustration extends FrameLayout
{

    public float a;
    public Drawable b;
    public Drawable c;
    public final Rect d;
    public final Rect e;
    public float f;
    public float g;

    Illustration(Context p0) {
        FrameLayout(p0);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1065353216;
        this.g = 0;
        this.a(0, 0);
    }

    Illustration(Context p0, AttributeSet p1) {
        FrameLayout(p0, p1);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1065353216;
        this.g = 0;
        this.a(p1, 0);
    }

    Illustration(Context p0, AttributeSet p1, int p2) {
        FrameLayout(p0, p1, p2);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 1065353216;
        this.g = 0;
        this.a(p1, p2);
    }

    private final void a(AttributeSet p0, int p1) {
        if (p0 != 0) {
            v0 = this.getContext().obtainStyledAttributes(p0, com.android.setupwizardlib.f.SuwIllustration, p1, 0);
            this.g = v0.getFloat(com.android.setupwizardlib.f.SuwIllustration_suwAspectRatio, 0);
            v0.recycle();
        }
        this.a = this.getResources().getDisplayMetrics().density * 1090519040;
        this.setWillNotDraw(0);
    }

    private final boolean a(Drawable p0, int p1) {
        v0 = 1;
        if (p1 == 1) {
            if (Build$VERSION.SDK_INT >= 19)
                v0 = p0.isAutoMirrored();
            else if (Build$VERSION.SDK_INT >= 17) {
                if (!(this.getContext().getApplicationInfo().flags & 4194304))
                    v0 = 0;
            }
            else
                v0 = 0;
        }
        else
            v0 = 0;
        return v0;
    }

    public void onDraw(Canvas p0) {
        if (this.b != 0) {
            p0.save();
            p0.translate(0, (float)this.e.height());
            p0.scale(this.f, this.f, 0, 0);
            if (Build$VERSION.SDK_INT > 17 && this.a(this.b, this.getLayoutDirection())) {
                p0.scale(-1082130432, 1065353216);
                p0.translate((float)-this.b.getBounds().width(), 0);
            }
            this.b.draw(p0);
            p0.restore();
        }
        if (this.c != 0) {
            p0.save();
            if (Build$VERSION.SDK_INT > 17 && this.a(this.c, this.getLayoutDirection())) {
                p0.scale(-1082130432, 1065353216);
                p0.translate((float)-this.e.width(), 0);
            }
            this.c.draw(p0);
            p0.restore();
        }
        super.onDraw(p0);
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        if (this.c != 0) {
            v1 = this.c.getIntrinsicWidth();
            v0 = this.c.getIntrinsicHeight();
            this.d.set(0, 0, p3 - p1, p4 - p2);
            if (this.g != 0) {
                this.f = (float)(p3 - p1) / (float)v1;
                v0 = (int)((float)v0 * this.f);
                v1 = p3 - p1;
            }
            Gravity.apply(55, v1, v0, this.d, this.e);
            this.c.setBounds(this.e);
        }
        if (this.b != 0)
            this.b.setBounds(0, 0, (int)Math.ceil((double)((float)(p3 - p1) / this.f)), (int)Math.ceil((double)((float)(p4 - p2 - this.e.height()) / this.f)));
        super.onLayout(p0, p1, p2, p3, p4);
    }

    protected void onMeasure(int p0, int p1) {
        if (this.g != 0) {
            v0 = (int)((float)View$MeasureSpec.getSize(p0) / this.g);
            this.setPadding(0, (int)((float)v0 - (float)v0 % this.a), 0, 0);
        }
        if (Build$VERSION.SDK_INT >= 21)
            this.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        super.onMeasure(p0, p1);
    }

    public void setAspectRatio(float p0) {
        this.g = p0;
        this.invalidate();
        this.requestLayout();
    }

    public void setBackgroundDrawable(Drawable p0) {
        if (p0 != this.b) {
            this.b = p0;
            this.invalidate();
            this.requestLayout();
        }
    }

    public void setForeground(Drawable p0) {
        this.setIllustration(p0);
    }

    public void setIllustration(Drawable p0) {
        if (p0 != this.c) {
            this.c = p0;
            this.invalidate();
            this.requestLayout();
        }
    }

}
