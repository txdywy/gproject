package com.google.android.finsky.headerlistlayout;

import android.content.Context;
import android.support.v7.widget.bg;
import android.util.AttributeSet;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;

public class FinskyTabTextView extends bg {
    public C1461c f16358b;
    public int f16359c;
    public int f16360d;

    public FinskyTabTextView(Context context) {
        this(context, null, 0);
    }

    public FinskyTabTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FinskyTabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((C1389j) C3947d.m18649a(C1389j.class)).mo1849a(this);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        if (this.f16358b.dj().mo2294a(12632714)) {
            setTextSize(0, (float) getResources().getDimensionPixelSize(C7582R.dimen.finsky_fixed_tab_text_size_large_tablet));
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f16360d == 0) {
            this.f16360d = getMeasuredWidth();
        }
        setMeasuredDimension(getMeasuredWidth() + this.f16359c, getMeasuredHeight());
    }

    public void setAdditionalWidth(int i) {
        this.f16359c = i;
    }

    public final void m16086a() {
        setMeasuredDimension(this.f16360d, getMeasuredHeight());
        this.f16359c = 0;
    }
}
