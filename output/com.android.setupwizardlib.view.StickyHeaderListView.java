package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;
import com.android.setupwizardlib.f;

protected class StickyHeaderListView extends ListView
{

    public View a;
    public View b;
    public int c;
    public RectF d;

    StickyHeaderListView(Context p0) {
        ListView(p0);
        this.c = 0;
        this.d = new RectF();
        this.a(0, 16842868);
    }

    StickyHeaderListView(Context p0, AttributeSet p1) {
        ListView(p0, p1);
        this.c = 0;
        this.d = new RectF();
        this.a(p1, 16842868);
    }

    StickyHeaderListView(Context p0, AttributeSet p1, int p2) {
        ListView(p0, p1, p2);
        this.c = 0;
        this.d = new RectF();
        this.a(p1, p2);
    }

    private final void a(AttributeSet p0, int p1) {
        v0 = this.getContext().obtainStyledAttributes(p0, com.android.setupwizardlib.f.SuwStickyHeaderListView, p1, 0);
        v1 = v0.getResourceId(com.android.setupwizardlib.f.SuwStickyHeaderListView_suwHeader, 0);
        if (v1 != 0)
            this.addHeaderView(LayoutInflater.from(this.getContext()).inflate(v1, this, 0), 0, 0);
        v0.recycle();
    }

    public boolean dispatchTouchEvent(MotionEvent p0) {
        if (this.d.contains(p0.getX(), p0.getY())) {
            p0.offsetLocation(-this.d.left, -this.d.top);
            v0 = this.b.dispatchTouchEvent(p0);
        }
        else
            v0 = super.dispatchTouchEvent(p0);
        return v0;
    }

    public void draw(Canvas p0) {
        super.draw(p0);
        if (this.a != 0) {
            if (this.b != 0)
                v0 = this.b;
            else
                v0 = this.a;
            if (this.b != 0)
                v1 = this.a.getTop();
            else
                v1 = 0;
            if (v0.getTop() + v1 < this.c || !v0.isShown()) {
                this.d.set(0, (float)(-v1 + this.c), (float)v0.getWidth(), (float)(v0.getHeight() - v1 + this.c));
                p0.translate(0, this.d.top);
                p0.clipRect(0, 0, v0.getWidth(), v0.getHeight());
                v0.draw(p0);
            }
            else
                this.d.setEmpty();
            p0.restoreToCount(p0.save());
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets p0) {
        if (this.getFitsSystemWindows()) {
            this.c = p0.getSystemWindowInsetTop();
            p0.replaceSystemWindowInsets(p0.getSystemWindowInsetLeft(), 0, p0.getSystemWindowInsetRight(), p0.getSystemWindowInsetBottom());
        }
        return p0;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent p0) {
        super.onInitializeAccessibilityEvent(p0);
        if (this.a != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.setItemCount(p0.getItemCount() - v0);
        p0.setFromIndex(Math.max(p0.getFromIndex() - v0, 0));
        if (Build$VERSION.SDK_INT >= 14)
            p0.setToIndex(Math.max(p0.getToIndex() - v0, 0));
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        super.onLayout(p0, p1, p2, p3, p4);
        if (this.a == 0) {
            this.a = this.findViewWithTag("sticky");
            this.b = this.findViewWithTag("stickyContainer");
        }
    }

}
