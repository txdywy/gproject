package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.google.android.finsky.C1473m;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class ExpandedDescriptionMarginBox extends FrameLayout {
    public final boolean f18188a;
    public DetailsExpandedFrame f18189b;

    public ExpandedDescriptionMarginBox(Context context) {
        this(context, null);
    }

    public ExpandedDescriptionMarginBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18188a = context.getResources().getBoolean(C7582R.bool.use_wide_layout);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18189b = (DetailsExpandedFrame) findViewById(C7582R.id.details_expanded_frame);
        this.f18189b.setVisibility(0);
    }

    protected void onMeasure(int i, int i2) {
        int f;
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (this.f18188a) {
            f = C1473m.f7980a.av().m9281f(getResources());
        } else {
            f = size;
        }
        this.f18189b.setScrollerWidth(Math.min(size, f));
        this.f18189b.measure(i, MeasureSpec.makeMeasureSpec(size2, MemoryMappedFileBuffer.DEFAULT_SIZE));
        setMeasuredDimension(size, size2);
    }
}
