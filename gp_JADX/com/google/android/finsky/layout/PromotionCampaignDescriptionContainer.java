package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.finsky.p106a.C0952e;
import com.squareup.leakcanary.C7582R;

public class PromotionCampaignDescriptionContainer extends LinearLayout implements C0952e {
    public LinearLayout f18279a;

    public PromotionCampaignDescriptionContainer(Context context) {
        this(context, null);
    }

    public PromotionCampaignDescriptionContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18279a = (LinearLayout) findViewById(C7582R.id.details);
    }

    public final boolean mo3553a() {
        return false;
    }

    public final boolean mo3554b() {
        return false;
    }

    public final void mo3555c() {
    }
}
