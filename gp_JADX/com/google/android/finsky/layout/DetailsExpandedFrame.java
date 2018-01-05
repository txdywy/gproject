package com.google.android.finsky.layout;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class DetailsExpandedFrame extends ViewGroup {
    public View f18119a;
    public View f18120b;
    public View f18121c;
    public int f18122d;

    public DetailsExpandedFrame(Context context) {
        this(context, null);
    }

    public DetailsExpandedFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18119a = findViewById(C7582R.id.left_bar);
        this.f18120b = findViewById(C7582R.id.right_bar);
        this.f18121c = findViewById(C7582R.id.details_expanded_scroller);
    }

    public void setScrollerWidth(int i) {
        this.f18122d = i;
    }

    public void setSideBarProportion(float f) {
        int width = (getWidth() - this.f18122d) / 2;
        width -= (int) (((float) width) * f);
        ai.m1823a(this, width, 0, width, 0);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int min = Math.min(this.f18122d, size);
        this.f18121c.measure(MeasureSpec.makeMeasureSpec(min, MemoryMappedFileBuffer.DEFAULT_SIZE), i2);
        min = (size - min) / 2;
        if (min == 0) {
            this.f18119a.setVisibility(8);
            this.f18120b.setVisibility(8);
        } else {
            this.f18119a.setVisibility(0);
            this.f18120b.setVisibility(0);
            this.f18119a.measure(MeasureSpec.makeMeasureSpec(min - getPaddingLeft(), MemoryMappedFileBuffer.DEFAULT_SIZE), i2);
            this.f18120b.measure(MeasureSpec.makeMeasureSpec(min - getPaddingRight(), MemoryMappedFileBuffer.DEFAULT_SIZE), i2);
        }
        setMeasuredDimension(size, MeasureSpec.getSize(i2));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = this.f18121c.getMeasuredWidth();
        width = (width - measuredWidth) / 2;
        this.f18121c.layout(width, 0, width + measuredWidth, height);
        if (this.f18119a.getVisibility() == 0) {
            this.f18119a.layout(width - this.f18119a.getMeasuredWidth(), 0, width, height);
        }
        if (this.f18120b.getVisibility() == 0) {
            this.f18120b.layout(width + measuredWidth, 0, (width + measuredWidth) + this.f18120b.getMeasuredWidth(), height);
        }
    }
}
