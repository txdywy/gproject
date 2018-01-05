package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.squareup.leakcanary.C7582R;

public class IAPListModuleLayout extends LinearLayout implements C2621k, C2622l {
    public TextView f14022a;
    public LinearLayout f14023b;

    public IAPListModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f14022a = (TextView) findViewById(C7582R.id.iap_section_title);
        this.f14023b = (LinearLayout) findViewById(C7582R.id.iaps);
    }
}
