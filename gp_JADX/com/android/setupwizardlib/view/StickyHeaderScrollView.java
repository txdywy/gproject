package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

public class StickyHeaderScrollView extends BottomScrollView {
    public View f3991e;
    public View f3992f;
    public int f3993g = 0;

    public StickyHeaderScrollView(Context context) {
        super(context);
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f3991e == null) {
            this.f3991e = findViewWithTag("sticky");
            this.f3992f = findViewWithTag("stickyContainer");
        }
        m4268b();
    }

    private final void m4268b() {
        if (VERSION.SDK_INT >= 11 && this.f3991e != null) {
            View view = this.f3992f != null ? this.f3992f : this.f3991e;
            int top = this.f3992f != null ? this.f3991e.getTop() : 0;
            if ((view.getTop() - getScrollY()) + top < this.f3993g || !view.isShown()) {
                view.setTranslationY((float) (getScrollY() - top));
            } else {
                view.setTranslationY(0.0f);
            }
        }
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m4268b();
    }

    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (!getFitsSystemWindows()) {
            return windowInsets;
        }
        this.f3993g = windowInsets.getSystemWindowInsetTop();
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }
}
