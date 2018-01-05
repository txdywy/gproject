package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class ReviewsControlContainer extends LinearLayout {
    public TextView f18330a;
    public TextView f18331b;

    public ReviewsControlContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18330a = (TextView) findViewById(C7582R.id.reviews_sort_box);
        this.f18331b = (TextView) findViewById(C7582R.id.reviews_filter_box);
    }
}
