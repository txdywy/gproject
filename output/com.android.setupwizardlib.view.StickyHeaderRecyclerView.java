package com.android.setupwizardlib.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

protected class StickyHeaderRecyclerView extends HeaderRecyclerView
{

    public View aI;
    public int aJ;
    public RectF aK;

    StickyHeaderRecyclerView(Context p0) {
        HeaderRecyclerView(p0);
        this.aJ = 0;
        this.aK = new RectF();
    }

    StickyHeaderRecyclerView(Context p0, AttributeSet p1) {
        HeaderRecyclerView(p0, p1);
        this.aJ = 0;
        this.aK = new RectF();
    }

    StickyHeaderRecyclerView(Context p0, AttributeSet p1, int p2) {
        HeaderRecyclerView(p0, p1, p2);
        this.aJ = 0;
        this.aK = new RectF();
    }

    public boolean dispatchTouchEvent(MotionEvent p0) {
        if (this.aK.contains(p0.getX(), p0.getY())) {
            p0.offsetLocation(-this.aK.left, -this.aK.top);
            v0 = this.getHeader().dispatchTouchEvent(p0);
        }
        else
            v0 = super.dispatchTouchEvent(p0);
        return v0;
    }

    public void draw(Canvas p0) {
        super.draw(p0);
        if (this.aI != 0) {
            v0 = this.getHeader();
            if (v0 != 0)
                v2 = v0;
            else
                v2 = this.aI;
            if (v0 != 0)
                v0 = this.aI.getTop();
            else
                v0 = 0;
            if (v2.getTop() + v0 < this.aJ || !v2.isShown()) {
                this.aK.set(0, (float)(-v0 + this.aJ), (float)v2.getWidth(), (float)(v2.getHeight() - v0 + this.aJ));
                p0.translate(0, this.aK.top);
                p0.clipRect(0, 0, v2.getWidth(), v2.getHeight());
                v2.draw(p0);
            }
            else
                this.aK.setEmpty();
            p0.restoreToCount(p0.save());
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets p0) {
        if (this.getFitsSystemWindows()) {
            this.aJ = p0.getSystemWindowInsetTop();
            p0.replaceSystemWindowInsets(p0.getSystemWindowInsetLeft(), 0, p0.getSystemWindowInsetRight(), p0.getSystemWindowInsetBottom());
        }
        return p0;
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        super.onLayout(p0, p1, p2, p3, p4);
        if (this.aI == 0) {
            v0 = this.getHeader();
            if (v0 != 0)
                this.aI = v0.findViewWithTag("sticky");
        }
        if (this.aI != 0) {
            v0 = this.getHeader();
            if (v0 != 0 && v0.getHeight() == 0)
                v0.layout(0, -v0.getMeasuredHeight(), v0.getMeasuredWidth(), 0);
        }
    }

    protected void onMeasure(int p0, int p1) {
        super.onMeasure(p0, p1);
        if (this.aI != 0)
            this.measureChild(this.getHeader(), p0, p1);
    }

}
