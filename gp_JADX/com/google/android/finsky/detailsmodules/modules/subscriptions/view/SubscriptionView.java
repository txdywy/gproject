package com.google.android.finsky.detailsmodules.modules.subscriptions.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.squareup.leakcanary.C7582R;

public class SubscriptionView extends RelativeLayout {
    public TextView f13895a;
    public TextView f13896b;
    public TextView f13897c;
    public PlayActionButtonV2 f13898d;

    public SubscriptionView(Context context) {
        this(context, null);
    }

    public SubscriptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13895a = (TextView) findViewById(C7582R.id.subscription_title);
        this.f13896b = (TextView) findViewById(C7582R.id.subscription_price);
        this.f13897c = (TextView) findViewById(C7582R.id.subscription_renewal);
        this.f13898d = (PlayActionButtonV2) findViewById(C7582R.id.account_button);
    }
}
