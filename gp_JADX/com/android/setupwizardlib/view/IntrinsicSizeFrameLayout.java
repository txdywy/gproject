package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.android.setupwizardlib.C0612f;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class IntrinsicSizeFrameLayout extends FrameLayout {
    public int f3977a = 0;
    public int f3978b = 0;

    public IntrinsicSizeFrameLayout(Context context) {
        super(context);
        m4259a(context, null, 0);
    }

    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4259a(context, attributeSet, 0);
    }

    @TargetApi(11)
    public IntrinsicSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4259a(context, attributeSet, i);
    }

    private final void m4259a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0612f.SuwIntrinsicSizeFrameLayout, i, 0);
        this.f3977a = obtainStyledAttributes.getDimensionPixelSize(C0612f.SuwIntrinsicSizeFrameLayout_android_height, 0);
        this.f3978b = obtainStyledAttributes.getDimensionPixelSize(C0612f.SuwIntrinsicSizeFrameLayout_android_width, 0);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(m4258a(i, this.f3978b), m4258a(i2, this.f3977a));
    }

    private final int m4258a(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 0) {
            return MeasureSpec.makeMeasureSpec(this.f3977a, MemoryMappedFileBuffer.DEFAULT_SIZE);
        }
        if (mode == Integer.MIN_VALUE) {
            return MeasureSpec.makeMeasureSpec(Math.min(size, this.f3977a), MemoryMappedFileBuffer.DEFAULT_SIZE);
        }
        return i;
    }
}
