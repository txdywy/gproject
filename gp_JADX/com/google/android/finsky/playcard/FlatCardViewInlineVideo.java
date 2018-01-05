package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewInlineVideo extends C3893r {
    public HeroGraphicView f19372a;

    public FlatCardViewInlineVideo(Context context) {
        this(context, null);
    }

    public FlatCardViewInlineVideo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getCardType() {
        return 35;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19372a = (HeroGraphicView) findViewById(C7582R.id.feature_graphic_view);
        this.af.setImageDrawable(m18405c(false));
    }
}
