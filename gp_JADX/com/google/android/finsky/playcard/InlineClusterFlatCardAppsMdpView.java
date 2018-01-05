package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.frameworkviews.C2625e;
import com.squareup.leakcanary.C7582R;

public class InlineClusterFlatCardAppsMdpView extends FlatCardAppsMdpView implements C2625e {
    public View f19423r;

    public InlineClusterFlatCardAppsMdpView(Context context) {
        this(context, null);
    }

    public InlineClusterFlatCardAppsMdpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f19423r = findViewById(C7582R.id.bottom_separator);
    }

    public void setBottomSeparatorVisibility(int i) {
        this.f19423r.setVisibility(i);
    }
}
