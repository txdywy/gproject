package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public class PromotionCampaignDescriptionRowView extends RelativeLayout {
    public FifeImageView f18280a;
    public TextView f18281b;

    public PromotionCampaignDescriptionRowView(Context context) {
        this(context, null);
    }

    public PromotionCampaignDescriptionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18280a = (FifeImageView) findViewById(C7582R.id.row_icon);
        this.f18281b = (TextView) findViewById(C7582R.id.row_message);
    }
}
