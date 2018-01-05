package com.google.android.libraries.play.entertainment.media;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import com.google.android.libraries.play.entertainment.C6114l;
import com.google.android.libraries.play.entertainment.p351m.C6122h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class FixedAspectRatioRelativeLayout extends RelativeLayout {
    public float f30292a;

    public FixedAspectRatioRelativeLayout(Context context) {
        this(context, null, 0);
    }

    public FixedAspectRatioRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedAspectRatioRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6114l.FixedAspectRatioRelativeLayout, i, 0);
        this.f30292a = obtainStyledAttributes.getFloat(C6114l.FixedAspectRatioRelativeLayout_widthRatio, 0.0f) / obtainStyledAttributes.getFloat(C6114l.FixedAspectRatioRelativeLayout_heightRatio, 0.0f);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        int[] a = C6122h.m28134a(i, i2, this.f30292a);
        if (a == null) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(MeasureSpec.makeMeasureSpec(a[0], MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(a[1], MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }
}
