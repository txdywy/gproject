package com.google.android.finsky.setup;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.android.vending.C0629a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class ProportionalOuterFrame extends ViewGroup {
    public float f20564a;
    public int f20565b;

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.ProportionalOuterFrame);
        this.f20564a = obtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        obtainStyledAttributes.recycle();
    }

    public ProportionalOuterFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProportionalOuterFrame(Context context) {
        this(context, null);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int width = (getWidth() - childAt.getMeasuredWidth()) / 2;
            childAt.layout(width, 0, childAt.getMeasuredWidth() + width, getHeight());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20565b = 0;
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        this.f20565b = Math.max(this.f20565b, (int) (getContext().getResources().getFraction(C7582R.fraction.setup_wizard_title_height_fraction, 1, 1) * ((float) size2)));
        if (getChildCount() > 0) {
            measureChild(getChildAt(0), MeasureSpec.makeMeasureSpec((int) (((float) size) * this.f20564a), MemoryMappedFileBuffer.DEFAULT_SIZE), i2);
        }
        View findViewById = findViewById(C7582R.id.title);
        if (findViewById != null) {
            findViewById.setMinimumHeight(this.f20565b);
        }
        setMeasuredDimension(size, size2);
    }
}
