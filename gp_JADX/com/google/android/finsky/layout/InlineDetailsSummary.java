package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class InlineDetailsSummary extends LinearLayout {
    public View f18245a;
    public View f18246b;
    public View f18247c;
    public final int f18248d;
    public final int f18249e;

    public InlineDetailsSummary(Context context) {
        this(context, null);
    }

    public InlineDetailsSummary(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f18248d = resources.getDimensionPixelSize(C7582R.dimen.inline_details_new_content_margin);
        this.f18249e = resources.getDimensionPixelSize(C7582R.dimen.inline_content_bottom_padding);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18245a = findViewById(C7582R.id.app_info_panel);
        this.f18246b = findViewById(C7582R.id.title_extra_labels);
        this.f18247c = findViewById(C7582R.id.title_details_summary_dynamic);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int i3 = size - (this.f18248d * 2);
        int i4 = this.f18248d;
        this.f18245a.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        i4 += this.f18245a.getMeasuredHeight() + this.f18249e;
        if (this.f18246b.getVisibility() == 0) {
            this.f18246b.measure(MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), 0);
            i4 += this.f18246b.getMeasuredHeight();
        }
        if (this.f18247c.getVisibility() != 8) {
            this.f18247c.measure(MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
            i4 = Math.max(i4, 0) + this.f18247c.getMeasuredHeight();
        }
        setMeasuredDimension(size, i4 + ((this.f18248d + getPaddingTop()) + getPaddingBottom()));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int i5 = this.f18248d;
        int paddingTop = getPaddingTop() + this.f18248d;
        int measuredWidth = this.f18245a.getMeasuredWidth();
        i5 = k.a(width, measuredWidth, z2, i5);
        this.f18245a.layout(i5, paddingTop, measuredWidth + i5, this.f18245a.getMeasuredHeight() + paddingTop);
        i5 = (this.f18245a.getMeasuredHeight() + this.f18249e) + paddingTop;
        if (this.f18246b.getVisibility() != 8) {
            paddingTop = this.f18246b.getMeasuredWidth();
            measuredWidth = k.b(width, paddingTop, z2, this.f18248d);
            this.f18246b.layout(measuredWidth, i5, paddingTop + measuredWidth, this.f18246b.getMeasuredHeight() + i5);
            i5 += this.f18246b.getMeasuredHeight();
        }
        if (this.f18247c.getVisibility() != 8) {
            paddingTop = this.f18247c.getMeasuredHeight();
            measuredWidth = this.f18247c.getMeasuredWidth();
            int b = k.b(width, measuredWidth, z2, this.f18248d);
            this.f18247c.layout(b, i5, measuredWidth + b, paddingTop + i5);
        }
    }
}
