package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.squareup.leakcanary.C7582R;

public abstract class C3895x extends C3893r {
    public C1611k f19420a;
    public HeroGraphicView f19421b;
    public float f19422c;

    public C3895x(Context context) {
        super(context, null);
        ((ae) C3947d.m18649a(ae.class)).mo1890a(this);
    }

    public C3895x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19421b = (HeroGraphicView) findViewById(C7582R.id.li_featured_hero);
        this.af.setImageDrawable(m18405c(false));
    }

    protected void onMeasure(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.f19421b.getLayoutParams();
        layoutParams.width = mo3846b(MeasureSpec.getSize(i));
        layoutParams.height = (int) (((float) layoutParams.width) * this.f19422c);
        super.onMeasure(i, i2);
    }

    protected int mo3846b(int i) {
        return i;
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public HeroGraphicView getFeaturedHeroImage() {
        return this.f19421b;
    }
}
