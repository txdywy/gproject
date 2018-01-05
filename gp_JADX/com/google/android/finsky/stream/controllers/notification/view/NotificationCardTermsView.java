package com.google.android.finsky.stream.controllers.notification.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.frameworkviews.C2625e;
import com.squareup.leakcanary.C7582R;

public class NotificationCardTermsView extends ConstraintLayout implements C2625e {
    public NotificationCardTermsView(Context context) {
        this(context, null);
    }

    public NotificationCardTermsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NotificationCardTermsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((TextView) findViewById(C1592a.aw.intValue())).setText(getResources().getString(C7582R.string.notification_center_terms, new Object[]{C0955b.jE.m28964b()}));
    }
}
