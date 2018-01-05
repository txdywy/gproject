package com.android.setupwizardlib.view;

import android.content.Context;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

protected class StickyHeaderScrollView extends BottomScrollView
{

    public View e;
    public View f;
    public int g;

    StickyHeaderScrollView(Context p0) {
        BottomScrollView(p0);
        this.g = 0;
    }

    StickyHeaderScrollView(Context p0, AttributeSet p1) {
        BottomScrollView(p0, p1);
        this.g = 0;
    }

    StickyHeaderScrollView(Context p0, AttributeSet p1, int p2) {
        BottomScrollView(p0, p1, p2);
        this.g = 0;
    }

    private final void b() {
        if (Build$VERSION.SDK_INT >= 11 && this.e != 0) {
            if (this.f != 0)
                v0 = this.f;
            else
                v0 = this.e;
            if (this.f != 0)
                v1 = this.e.getTop();
            else
                v1 = 0;
            if (v0.getTop() - this.getScrollY() + v1 < this.g || !v0.isShown())
                v0.setTranslationY((float)(this.getScrollY() - v1));
            else
                v0.setTranslationY(0);
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets p0) {
        if (this.getFitsSystemWindows()) {
            this.g = p0.getSystemWindowInsetTop();
            p0 = p0.replaceSystemWindowInsets(p0.getSystemWindowInsetLeft(), 0, p0.getSystemWindowInsetRight(), p0.getSystemWindowInsetBottom());
        }
        return p0;
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        super.onLayout(p0, p1, p2, p3, p4);
        if (this.e == 0) {
            this.e = this.findViewWithTag("sticky");
            this.f = this.findViewWithTag("stickyContainer");
        }
        this.b();
    }

    protected void onScrollChanged(int p0, int p1, int p2, int p3) {
        super.onScrollChanged(p0, p1, p2, p3);
        this.b();
    }

}
