package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewDoubleWideAd extends C3893r {
    public C2581g E_;
    public FeatureGraphicFrameLayout f19369a;
    public FifeImageView f19370b;
    public C1612l f19371d;

    public FlatCardViewDoubleWideAd(Context context) {
        this(context, null);
    }

    public FlatCardViewDoubleWideAd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getCardType() {
        return 40;
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1877a(this);
        super.onFinishInflate();
        this.f19369a = (FeatureGraphicFrameLayout) findViewById(C7582R.id.feature_graphic_view);
        this.f19370b = (FifeImageView) findViewById(C7582R.id.cover_image);
        this.af.setImageDrawable(m18405c(false));
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = getPaddingLeft();
        paddingLeft = (((MeasureSpec.getSize(i) - paddingLeft) - getPaddingRight()) - (this.ah.getMeasuredWidth() + k.a(this.ah))) - (this.U.getMeasuredWidth() + k.a(this.U));
        if (this.ad.getVisibility() != 8) {
            this.ad.measure(0, 0);
            if (this.ad.getMeasuredWidth() + k.a(this.ad) > paddingLeft) {
                this.ad.setVisibility(4);
            }
        }
    }
}
