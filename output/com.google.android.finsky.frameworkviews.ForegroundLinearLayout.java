package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.support.v4.view.n;
import android.util.AttributeSet;
import android.widget.LinearLayout;

protected class ForegroundLinearLayout extends LinearLayout implements com.google.android.play.layout.q
{

    public static final boolean n;
    public Drawable o;
    public int p;
    public int q;
    public int r;
    public int s;
    public final Rect t;
    public final Rect u;
    public boolean v;

    static {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = 1;
        else
            v0 = 0;
        ForegroundLinearLayout.n = v0;
    }

    ForegroundLinearLayout(Context p0) {
        ForegroundLinearLayout(p0, 0);
    }

    ForegroundLinearLayout(Context p0, AttributeSet p1) {
        LinearLayout(p0, p1);
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new Rect();
        this.u = new Rect();
        this.v = 0;
        this.a(p0, p1);
    }

    ForegroundLinearLayout(Context p0, AttributeSet p1, int p2) {
        LinearLayout(p0, p1, p2);
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new Rect();
        this.u = new Rect();
        this.v = 0;
        this.a(p0, p1);
    }

    private final void a(Context p0, AttributeSet p1) {
        v0 = new int[1];
        v0[0] = 16843017;
        v0 = p0.obtainStyledAttributes(p1, v0);
        v1 = v0.getDrawable(0);
        if (v1 != 0)
            this.setForeground(v1);
        v0.recycle();
    }

    public void draw(Canvas p0) {
        super.draw(p0);
        if (this.o != 0) {
            if (this.v != 0) {
                this.v = 0;
                this.t.set(this.p, this.q, this.getWidth() - this.r, this.getHeight() - this.s);
                if (ForegroundLinearLayout.n != 0)
                    android.support.v4.view.n.a(119, this.o.getIntrinsicWidth(), this.o.getIntrinsicHeight(), this.t, this.u, this.getLayoutDirection());
                else
                    this.u.set(this.t);
                this.o.setBounds(this.u);
            }
            this.o.draw(p0);
        }
    }

    public void drawableHotspotChanged(float p0, float p1) {
        super.drawableHotspotChanged(p0, p1);
        if (this.o != 0)
            this.o.setHotspot(p0, p1);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.o != 0 && this.o.isStateful())
            this.o.setState(this.getDrawableState());
    }

    public Drawable getForeground() {
        return this.o;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.o != 0)
            this.o.jumpToCurrentState();
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        super.onLayout(p0, p1, p2, p3, p4);
        this.v = 1;
    }

    public void onSizeChanged(int p0, int p1, int p2, int p3) {
        super.onSizeChanged(p0, p1, p2, p3);
        this.v = 1;
    }

    public void setForeground(Drawable p0) {
        if (this.o != p0) {
            if (this.o != 0) {
                this.o.setCallback(0);
                this.unscheduleDrawable(this.o);
            }
            this.o = p0;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            if (p0 != 0) {
                this.setWillNotDraw(0);
                p0.setCallback(this);
                if (p0.isStateful())
                    p0.setState(this.getDrawableState());
                v0 = new Rect();
                if (p0.getPadding(v0)) {
                    this.p = v0.left;
                    this.q = v0.top;
                    this.r = v0.right;
                    this.s = v0.bottom;
                }
            }
            else
                this.setWillNotDraw(1);
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setVisibility(int p0) {
        super.setVisibility(p0);
        if (this.o != 0) {
            if (p0 == 0)
                v0 = 1;
            else
                v0 = 0;
            this.o.setVisible(v0, 0);
        }
    }

    protected boolean verifyDrawable(Drawable p0) {
        if ((super.verifyDrawable(p0)) || p0 == this.o)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
