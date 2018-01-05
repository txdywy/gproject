package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.squareup.leakcanary.C7582R;

public class BylinesModuleLayout extends LinearLayout {
    public LayoutInflater f13939a;
    public LinearLayout f13940b;
    public DecoratedTextView f13941c;
    public boolean f13942d;

    public BylinesModuleLayout(Context context) {
        this(context, null);
    }

    public BylinesModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13939a = LayoutInflater.from(context);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13940b = (LinearLayout) findViewById(C7582R.id.listing_layout);
        this.f13941c = (DecoratedTextView) findViewById(C7582R.id.section_header);
    }
}
