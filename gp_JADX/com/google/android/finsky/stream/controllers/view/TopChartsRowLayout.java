package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.stream.base.view.C4298h;
import com.squareup.leakcanary.C7582R;

public class TopChartsRowLayout extends C4298h {
    public int f23066g;
    public int f23067h;
    public int f23068i;
    public int f23069j;

    public TopChartsRowLayout(Context context) {
        this(context, null);
    }

    public TopChartsRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f23068i = 0;
    }
}
