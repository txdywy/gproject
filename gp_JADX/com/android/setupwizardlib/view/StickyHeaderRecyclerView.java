package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

public class StickyHeaderRecyclerView extends HeaderRecyclerView {
    public View aI;
    public int aJ = 0;
    public RectF aK = new RectF();

    public StickyHeaderRecyclerView(Context context) {
        super(context);
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View header;
        super.onLayout(z, i, i2, i3, i4);
        if (this.aI == null) {
            header = getHeader();
            if (header != null) {
                this.aI = header.findViewWithTag("sticky");
            }
        }
        if (this.aI != null) {
            header = getHeader();
            if (header != null && header.getHeight() == 0) {
                header.layout(0, -header.getMeasuredHeight(), header.getMeasuredWidth(), 0);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.aI != null) {
            measureChild(getHeader(), i, i2);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.aI != null) {
            int top;
            View header = getHeader();
            int save = canvas.save();
            View view = header != null ? header : this.aI;
            if (header != null) {
                top = this.aI.getTop();
            } else {
                top = 0;
            }
            if (view.getTop() + top < this.aJ || !view.isShown()) {
                this.aK.set(0.0f, (float) ((-top) + this.aJ), (float) view.getWidth(), (float) ((view.getHeight() - top) + this.aJ));
                canvas.translate(0.0f, this.aK.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.aK.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.aJ = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.aK.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.aK.left, -this.aK.top);
        return getHeader().dispatchTouchEvent(motionEvent);
    }
}
