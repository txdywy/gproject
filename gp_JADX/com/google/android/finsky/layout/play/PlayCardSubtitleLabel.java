package com.google.android.finsky.layout.play;

import android.content.Context;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardSubtitleLabel extends RelativeLayout {
    public View f18698a;
    public View f18699b;

    public PlayCardSubtitleLabel(Context context) {
        this(context, null);
    }

    public PlayCardSubtitleLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18698a = findViewById(C7582R.id.li_subtitle);
        this.f18699b = findViewById(C7582R.id.li_label);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        this.f18699b.measure(MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), Integer.MIN_VALUE), 0);
        this.f18698a.measure(0, 0);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f18698a.getLayoutParams();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.f18699b.getLayoutParams();
        this.f18698a.measure(MeasureSpec.makeMeasureSpec(Math.min(this.f18698a.getMeasuredWidth(), ((((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - this.f18699b.getMeasuredWidth()) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin), MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        setMeasuredDimension(size, this.f18698a.getMeasuredHeight());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f18698a.getLayoutParams();
        int measuredWidth = this.f18698a.getMeasuredWidth();
        int a = k.a(width, measuredWidth, z2, C0361r.m2049a(marginLayoutParams));
        this.f18698a.layout(a, 0, measuredWidth + a, this.f18698a.getMeasuredHeight());
        marginLayoutParams = (MarginLayoutParams) this.f18699b.getLayoutParams();
        int baseline = this.f18698a.getBaseline() - this.f18699b.getBaseline();
        measuredWidth = this.f18699b.getMeasuredWidth();
        a = k.b(width, measuredWidth, z2, C0361r.m2051b(marginLayoutParams));
        this.f18699b.layout(a, baseline, a + measuredWidth, this.f18699b.getMeasuredHeight() + baseline);
    }
}
