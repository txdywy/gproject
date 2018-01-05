package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.p037h.C0320p;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public abstract class C3894u extends C3893r {
    public TextView f19373a;
    public FadingEdgeTextView f19374b;

    public C3894u(Context context) {
        this(context, null);
    }

    protected abstract void mo3840a(int i, int i2, int i3, int i4, boolean z, int i5, int i6);

    protected abstract C0320p mo3841b(int i, int i2, int i3, int i4);

    public C3894u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.af.setImageDrawable(m18405c(false));
        this.f19373a = (TextView) findViewById(C7582R.id.li_ranking);
        Resources resources = getResources();
        if (this.q.dj().mo2294a(12630160) && resources.getBoolean(C7582R.bool.flat_use_extended_margin_listing)) {
            int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_extended_inner_margin);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            this.U.setLayoutParams(marginLayoutParams);
        }
        if (this.q.dj().mo2294a(12631771)) {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_inner_margin_large);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_thumbnail_size_large);
            marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
            marginLayoutParams.topMargin = dimensionPixelSize;
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            C0361r.m2050a(marginLayoutParams, dimensionPixelSize);
            C0361r.m2052b(marginLayoutParams, dimensionPixelSize);
            marginLayoutParams.width = dimensionPixelSize2;
            marginLayoutParams.height = dimensionPixelSize2;
            this.U.setLayoutParams(marginLayoutParams);
            LayoutParams layoutParams = this.af.getLayoutParams();
            layoutParams.width = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_overflow_icon_width_large);
            layoutParams.height = resources.getDimensionPixelSize(C7582R.dimen.flat_listing_overflow_icon_height_large);
            this.af.setLayoutParams(layoutParams);
            if (this.f19373a != null) {
                this.f19373a.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_listing_ranking_size_large));
            }
        }
        if (this.q.dj().mo2294a(12632790)) {
            this.f19374b = (FadingEdgeTextView) findViewById(C7582R.id.li_fading_edge_title);
        }
    }

    public void setTitleVisibility(int i) {
        if (this.f19374b != null) {
            this.f19374b.setVisibility(i);
        } else {
            super.setTitleVisibility(i);
        }
    }

    public void setTitleText(CharSequence charSequence) {
        if (this.f19374b != null) {
            this.f19374b.setText(charSequence);
        } else {
            super.setTitleText(charSequence);
        }
    }

    public void setTitleContentDescription(String str) {
        if (this.f19374b != null) {
            this.f19374b.setContentDescription(str);
        } else {
            super.setTitleContentDescription(str);
        }
    }

    public TextView getRanking() {
        return this.f19373a;
    }

    protected void onMeasure(int i, int i2) {
        float f;
        int i3;
        View view;
        float aspectRatio = ((DocImageView) this.U.getImageView()).getAspectRatio();
        if (Float.isNaN(aspectRatio)) {
            f = this.am;
        } else {
            f = aspectRatio;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f19373a == null || this.f19373a.getVisibility() == 8) {
            i3 = 0;
        } else {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f19373a.getLayoutParams();
            this.f19373a.measure(C3894u.getChildMeasureSpec(i, paddingLeft + paddingRight, layoutParams.width), C3894u.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
            i3 = this.f19373a.getMeasuredWidth();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        int i4 = marginLayoutParams.width;
        int i5 = (int) (f * ((float) i4));
        this.U.measure(MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i5, MemoryMappedFileBuffer.DEFAULT_SIZE));
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.af.getLayoutParams();
        this.af.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams2.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams2.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        i4 = (((i3 + paddingLeft) + marginLayoutParams.leftMargin) + i4) + marginLayoutParams.rightMargin;
        paddingRight += marginLayoutParams2.rightMargin + (marginLayoutParams2.leftMargin + marginLayoutParams2.width);
        int size = (MeasureSpec.getSize(i) - i4) - paddingRight;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        if (this.f19374b != null) {
            view = this.f19374b;
        } else {
            view = this.V;
        }
        i3 = MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, i3);
        if (this.W == null || this.W.getVisibility() == 8) {
            this.ab.measure(makeMeasureSpec, i3);
            paddingLeft = this.ab.getMeasuredWidth();
            i3 = this.ab.getMeasuredHeight();
        } else {
            this.W.measure(makeMeasureSpec, i3);
            paddingLeft = this.W.getMeasuredWidth();
            this.ab.measure(MeasureSpec.makeMeasureSpec(size - paddingLeft, Integer.MIN_VALUE), i3);
            paddingLeft += this.ab.getMeasuredWidth();
            i3 = Math.max(this.W.getMeasuredHeight(), this.ab.getMeasuredHeight());
        }
        C0320p b = mo3841b(makeMeasureSpec, size, Math.max(view.getMeasuredWidth(), paddingLeft), view.getMeasuredHeight() + i3);
        paddingLeft = getPaddingTop() + marginLayoutParams.topMargin;
        setMeasuredDimension(View.getDefaultSize((((Integer) b.f1762a).intValue() + i4) + paddingRight, i), View.resolveSize((Math.max(((Integer) b.f1763b).intValue(), i5) + paddingLeft) + (getPaddingBottom() + marginLayoutParams.bottomMargin), i2));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        View view;
        int i8;
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (z2) {
            i5 = 0;
        } else {
            i5 = i9;
        }
        if (z2) {
            i6 = i9;
        } else {
            i6 = 0;
        }
        i9 = ai.f1848a.mo401l(this);
        int paddingTop = getPaddingTop();
        int m = ai.f1848a.mo402m(this);
        int i_ = i5 + i_(i9);
        if (this.f19373a == null || this.f19373a.getVisibility() == 8) {
            i7 = i_;
        } else {
            i9 = this.f19373a.getMeasuredWidth();
            i5 = this.f19373a.getMeasuredHeight();
            i10 = (i10 - i5) / 2;
            i7 = i_ + i_(i9);
            m18416a(this.f19373a, i10, i10 + i5, i_, i7);
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        i10 = paddingTop + marginLayoutParams.topMargin;
        i_ = i7 + i_(i_ == i7 ? C0361r.m2049a(marginLayoutParams) : 0);
        i7 = i_ + i_(this.U.getMeasuredWidth());
        m18416a(this.U, i10, i10 + this.U.getMeasuredHeight(), i_, i7);
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.af.getLayoutParams();
        int i11 = paddingTop + marginLayoutParams2.topMargin;
        int i_2 = i6 - i_(C0361r.m2051b(marginLayoutParams2) + m);
        m18416a(this.af, i11, i11 + this.af.getMeasuredHeight(), i_2 - i_(this.af.getMeasuredWidth()), i_2);
        i_ = i7 + i_(C0361r.m2051b(marginLayoutParams));
        if (this.f19374b != null) {
            view = this.f19374b;
        } else {
            view = this.V;
        }
        int measuredHeight = i10 + view.getMeasuredHeight();
        m18416a(view, i10, measuredHeight, i_, i_ + i_(view.getMeasuredWidth()));
        if (this.W == null || this.W.getVisibility() == 8) {
            i11 = measuredHeight + this.ab.getMeasuredHeight();
            m18416a(this.ab, measuredHeight, i11, i_, i_ + i_(this.ab.getMeasuredWidth()));
            i8 = i11;
        } else {
            i9 = this.W.getBaseline();
            i6 = this.ab.getBaseline();
            paddingTop = (getResources().getDimensionPixelSize(C7582R.dimen.flat_listing_title_ad_badge_vpadding) + measuredHeight) + Math.max(i9, i6);
            i10 = paddingTop - i9;
            measuredHeight = i10 + this.W.getMeasuredHeight();
            i7 = i_ + i_(this.W.getMeasuredWidth());
            m18416a(this.W, i10, measuredHeight, i_, i7);
            paddingTop -= i6;
            i11 = paddingTop + this.ab.getMeasuredHeight();
            int i_3 = i7 + i_(C0361r.m2051b((MarginLayoutParams) this.W.getLayoutParams()));
            m18416a(this.ab, paddingTop, i11, i_3, i_3 + i_(this.ab.getMeasuredWidth()));
            i8 = Math.max(measuredHeight, i11);
        }
        mo3840a(i, i2, i3, i4, z2, i_, i8);
        e();
    }

    protected final int i_(int i) {
        return ai.f1848a.mo400k(this) == 0 ? i : -i;
    }

    protected final void m18416a(View view, int i, int i2, int i3, int i4) {
        if (ai.f1848a.mo400k(this) == 0) {
            view.layout(i3, i, i4, i2);
        } else {
            view.layout(i4, i, i3, i2);
        }
    }
}
