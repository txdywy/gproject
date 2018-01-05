package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.AccessibleLinearLayout;
import com.squareup.leakcanary.C7582R;

public class BylinesModuleCellLayout extends AccessibleLinearLayout {
    public ImageView f13937a;
    public TextView f13938b;

    public BylinesModuleCellLayout(Context context) {
        this(context, null);
    }

    public BylinesModuleCellLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13937a = (ImageView) findViewById(C7582R.id.byline_thumbnail);
        this.f13938b = (TextView) findViewById(C7582R.id.byline_title);
    }
}
