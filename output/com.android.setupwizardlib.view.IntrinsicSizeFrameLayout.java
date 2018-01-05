package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.widget.FrameLayout;
import com.android.setupwizardlib.f;

protected class IntrinsicSizeFrameLayout extends FrameLayout
{

    public int a;
    public int b;

    IntrinsicSizeFrameLayout(Context p0) {
        FrameLayout(p0);
        this.a = 0;
        this.b = 0;
        this.a(p0, 0, 0);
    }

    IntrinsicSizeFrameLayout(Context p0, AttributeSet p1) {
        FrameLayout(p0, p1);
        this.a = 0;
        this.b = 0;
        this.a(p0, p1, 0);
    }

    IntrinsicSizeFrameLayout(Context p0, AttributeSet p1, int p2) {
        FrameLayout(p0, p1, p2);
        this.a = 0;
        this.b = 0;
        this.a(p0, p1, p2);
    }

    private final int a(int p0, int p1) {
        if (p1 > 0) {
            v0 = View$MeasureSpec.getMode(p0);
            if (v0 == 0)
                p0 = View$MeasureSpec.makeMeasureSpec(this.a, 1073741824);
            else if (v0 == -2147483648)
                p0 = View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(p0), this.a), 1073741824);
        }
        return p0;
    }

    private final void a(Context p0, AttributeSet p1, int p2) {
        v0 = p0.obtainStyledAttributes(p1, com.android.setupwizardlib.f.SuwIntrinsicSizeFrameLayout, p2, 0);
        this.a = v0.getDimensionPixelSize(com.android.setupwizardlib.f.SuwIntrinsicSizeFrameLayout_android_height, 0);
        this.b = v0.getDimensionPixelSize(com.android.setupwizardlib.f.SuwIntrinsicSizeFrameLayout_android_width, 0);
        v0.recycle();
    }

    protected void onMeasure(int p0, int p1) {
        super.onMeasure(this.a(p0, this.b), this.a(p1, this.a));
    }

}
