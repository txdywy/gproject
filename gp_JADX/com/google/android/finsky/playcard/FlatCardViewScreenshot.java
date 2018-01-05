package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.bb;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewScreenshot extends C3893r implements ae {
    public C3903c f19408a;
    public FeatureGraphicFrameLayout f19409b;
    public AutoTransitionImageView f19410c;

    public FlatCardViewScreenshot(Context context) {
        this(context, null);
    }

    public FlatCardViewScreenshot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getCardType() {
        return 41;
    }

    protected void onFinishInflate() {
        ((ae) C3947d.m18649a(ae.class)).mo1880a(this);
        super.onFinishInflate();
        this.f19409b = (FeatureGraphicFrameLayout) findViewById(C7582R.id.feature_graphic_view);
        this.f19410c = (AutoTransitionImageView) findViewById(C7582R.id.auto_transition_image_view);
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

    public final void Z_() {
        C3903c c3903c = this.f19408a;
        AutoTransitionImageView autoTransitionImageView = this.f19410c;
        bb.m21791a();
        c3903c.f19710g.remove(autoTransitionImageView);
        if (c3903c.f19710g.size() == 0) {
            c3903c.f19704a.removeCallbacks(c3903c.f19705b);
        }
    }
}
