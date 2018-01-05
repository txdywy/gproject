package com.google.android.finsky.detailsmodules.modules.subscriptions.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.google.android.finsky.frameworkviews.HorizontalSeparatorContainer;

public class SubscriptionsModuleView extends HorizontalSeparatorContainer {
    public final LayoutInflater f13903a;

    public SubscriptionsModuleView(Context context) {
        this(context, null);
    }

    public SubscriptionsModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13903a = LayoutInflater.from(context);
    }
}
