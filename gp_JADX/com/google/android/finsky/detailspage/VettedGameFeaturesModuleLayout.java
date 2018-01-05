package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.finsky.frameworkviews.C2572y;
import com.google.android.finsky.frameworkviews.C2573z;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.C2625e;
import com.squareup.leakcanary.C7582R;

public class VettedGameFeaturesModuleLayout extends LinearLayout implements C2625e, C2621k, C2622l, C2572y, C2573z {
    public LinearLayout f14209a;

    public VettedGameFeaturesModuleLayout(Context context) {
        super(context);
    }

    public VettedGameFeaturesModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14209a = (LinearLayout) findViewById(C7582R.id.features_container);
    }

    public String getTitle() {
        return null;
    }
}
