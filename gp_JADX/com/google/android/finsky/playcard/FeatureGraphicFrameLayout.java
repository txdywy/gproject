package com.google.android.finsky.playcard;

import android.content.Context;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FeatureGraphicFrameLayout extends FrameLayout {
    public float f19353a;

    public FeatureGraphicFrameLayout(Context context) {
        this(context, null);
    }

    public FeatureGraphicFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void m18406a(float f) {
        setBackgroundColor(C0216d.m1116c(getContext(), C7582R.color.placeholder_grey));
        this.f19353a = f;
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        measureChildren(i, MeasureSpec.makeMeasureSpec((int) (((float) size) * this.f19353a), MemoryMappedFileBuffer.DEFAULT_SIZE));
        setMeasuredDimension(size, (int) (((float) size) * this.f19353a));
    }
}
