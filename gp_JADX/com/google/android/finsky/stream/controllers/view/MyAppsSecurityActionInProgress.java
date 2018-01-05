package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.finsky.frameworkviews.C2625e;
import com.squareup.leakcanary.C7582R;

public class MyAppsSecurityActionInProgress extends LinearLayout implements C2625e {
    public MyAppsSecurityActionInProgress(Context context) {
        this(context, null);
    }

    public MyAppsSecurityActionInProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyAppsSecurityActionInProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
    }
}
