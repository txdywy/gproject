package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;
import com.android.setupwizardlib.C0612f;

public class StickyHeaderListView extends ListView {
    public View f3987a;
    public View f3988b;
    public int f3989c = 0;
    public RectF f3990d = new RectF();

    public StickyHeaderListView(Context context) {
        super(context);
        m4267a(null, 16842868);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4267a(attributeSet, 16842868);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4267a(attributeSet, i);
    }

    private final void m4267a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0612f.SuwStickyHeaderListView, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0612f.SuwStickyHeaderListView_suwHeader, 0);
        if (resourceId != 0) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(resourceId, this, false), null, false);
        }
        obtainStyledAttributes.recycle();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3987a == null) {
            this.f3987a = findViewWithTag("sticky");
            this.f3988b = findViewWithTag("stickyContainer");
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f3990d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.f3990d.left, -this.f3990d.top);
        return this.f3988b.dispatchTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3987a != null) {
            int top;
            int save = canvas.save();
            View view = this.f3988b != null ? this.f3988b : this.f3987a;
            if (this.f3988b != null) {
                top = this.f3987a.getTop();
            } else {
                top = 0;
            }
            if (view.getTop() + top < this.f3989c || !view.isShown()) {
                this.f3990d.set(0.0f, (float) ((-top) + this.f3989c), (float) view.getWidth(), (float) ((view.getHeight() - top) + this.f3989c));
                canvas.translate(0.0f, this.f3990d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.f3990d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.f3989c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.f3987a != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        if (VERSION.SDK_INT >= 14) {
            accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
        }
    }
}
