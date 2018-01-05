package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class DetailsExpandedExtraCreditsView extends LinearLayout {
    public TextView f18112a;
    public TextView f18113b;

    public DetailsExpandedExtraCreditsView(Context context) {
        this(context, null);
    }

    public DetailsExpandedExtraCreditsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18112a = (TextView) findViewById(C7582R.id.extra_credit);
        this.f18113b = (TextView) findViewById(C7582R.id.extra_names);
    }
}
