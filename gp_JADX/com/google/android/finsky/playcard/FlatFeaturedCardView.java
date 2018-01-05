package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.providers.C3947d;

public class FlatFeaturedCardView extends C3895x {
    public FlatFeaturedCardView(Context context) {
        this(context, null);
    }

    public FlatFeaturedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1881a(this);
        super.onFinishInflate();
    }

    public int getCardType() {
        return 33;
    }
}
