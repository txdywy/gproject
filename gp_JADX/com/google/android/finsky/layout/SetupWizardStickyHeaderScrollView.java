package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ScrollView;

public class SetupWizardStickyHeaderScrollView extends ScrollView {
    public View f18379a;
    public View f18380b;
    public int f18381c = 0;
    public RectF f18382d = new RectF();

    public SetupWizardStickyHeaderScrollView(Context context) {
        super(context);
    }

    public SetupWizardStickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SetupWizardStickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f18379a == null) {
            this.f18379a = findViewWithTag("sticky");
            this.f18380b = findViewWithTag("stickyContainer");
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f18382d.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-this.f18382d.left, -this.f18382d.top);
        return this.f18380b.dispatchTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        setVerticalScrollBarEnabled(false);
        super.draw(canvas);
        if (this.f18379a != null) {
            int top;
            int save = canvas.save();
            View view = this.f18380b != null ? this.f18380b : this.f18379a;
            if (this.f18380b != null) {
                top = this.f18379a.getTop();
            } else {
                top = 0;
            }
            int top2 = view.getTop() - getScrollY();
            if (top2 + top < this.f18381c || !view.isShown()) {
                this.f18382d.set(0.0f, (float) ((-top) + this.f18381c), (float) view.getWidth(), (float) ((view.getHeight() - top) + this.f18381c));
                canvas.translate(0.0f, ((float) (-top2)) + this.f18382d.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.f18382d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
        setVerticalScrollBarEnabled(true);
        onDrawScrollBars(canvas);
    }

    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.f18381c = windowInsets.getSystemWindowInsetTop();
        }
        return windowInsets;
    }
}
