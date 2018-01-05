package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.providers.C3947d;

public class FlatFeaturedWideCardView extends C3895x {
    public FlatFeaturedWideCardView(Context context) {
        this(context, null);
    }

    public FlatFeaturedWideCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1882a(this);
        super.onFinishInflate();
    }

    protected final int mo3846b(int i) {
        return i / 2;
    }

    public int getCardType() {
        return 34;
    }
}
